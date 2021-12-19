package com.swapnil.full.service;

import com.swapnil.full.entity.Department;
import com.swapnil.full.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);
   public List<Department> fetchDepartmentList();
   public  Department fetchDepartmentById(Long id) throws DepartmentNotFoundException;
   public void deleteDepartment(Long departmentId);

   Department udpateDepartment(Long departmentId , Department department);

   Department fetchDepartmentByName(String departmentName);
}
