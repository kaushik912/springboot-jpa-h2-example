package com.example.demo.repository;

import com.example.demo.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Interface extending CrudRepository
public interface DepartmentRepository
    extends CrudRepository<Department, Long> {
}
