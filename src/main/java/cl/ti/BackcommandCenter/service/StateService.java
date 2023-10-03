package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.model.State;

import java.util.List;

public interface StateService {
    State saveState(State state);
    State getStateById(Long id);
    List<State> getAllStates();
    void deleteState(Long id);
}

