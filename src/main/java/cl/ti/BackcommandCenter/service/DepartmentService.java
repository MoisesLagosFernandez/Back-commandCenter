package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.model.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department getDepartmentById(Long id);
    List<Department> getAllDepartments();
    void deleteDepartment(Long id);
}

