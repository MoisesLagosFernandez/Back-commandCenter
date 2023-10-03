package cl.ti.BackcommandCenter.service.impl;

import cl.ti.BackcommandCenter.model.State;
import cl.ti.BackcommandCenter.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.ti.BackcommandCenter.repository.StateRepository;

import java.util.List;

@Service
public class StateServiceImpl implements StateService {
    @Autowired
    private StateRepository stateRepository;

    @Override
    public State saveState(State state) {
        return stateRepository.save(state);
    }

    @Override
    public State getStateById(Long id) {
        return stateRepository.findById(id).orElse(null);
    }

    @Override
    public List<State> getAllStates() {
        return stateRepository.findAll();
    }

    @Override
    public void deleteState(Long id) {
        stateRepository.deleteById(id);
    }
}

