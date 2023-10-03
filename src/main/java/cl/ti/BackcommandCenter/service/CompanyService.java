package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.model.Company;

import java.util.List;

public interface CompanyService {
    Company saveCompany(Company company);
    Company getCompanyById(Long id);
    List<Company> getAllCompanies();
    void deleteCompany(Long id);
}

