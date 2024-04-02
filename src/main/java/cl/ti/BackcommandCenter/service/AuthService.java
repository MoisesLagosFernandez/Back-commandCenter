package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.auth.AuthResponse;
import cl.ti.BackcommandCenter.auth.LoginRequest;
import cl.ti.BackcommandCenter.auth.RegisterRequest;
import cl.ti.BackcommandCenter.repository.UserRepository;
import cl.ti.BackcommandCenter.auth.jwt.JwtService;
import cl.ti.BackcommandCenter.model.Role;
import cl.ti.BackcommandCenter.model.User;

import lombok.RequiredArgsConstructor;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthResponse login(LoginRequest request){

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails user = userRepository.findByUsername(request.getUsername()).orElseThrow();
        String token = jwtService.getToken(user);
        return AuthResponse.builder()
                .token(token)
                .build();
    }
    public AuthResponse register(RegisterRequest request){
        assert User.builder() != null;
        User user = User.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .company(request.getCompany())
                .role(Role.USER)
                .department(request.getDepartment())
                .build();
        userRepository.save(user);

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();

    }
}
