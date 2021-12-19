package com.swapnil.full.service;

import com.swapnil.full.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);
   public List<Department> fetchDepartmentList();
   public  Department fetchDepartmentById(Long id);
   public void deleteDepartment(Long departmentId);

   Department udpateDepartment(Long departmentId , Department department);

   Department fetchDepartmentByName(String departmentName);
}
