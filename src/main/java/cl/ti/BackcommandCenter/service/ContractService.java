package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.model.Contract;

import java.util.List;

public interface ContractService {
    Contract saveContract(Contract contract);
    Contract getContractById(Long id);
    List<Contract> getAllContracts();
    void deleteContract(Long id);
}
