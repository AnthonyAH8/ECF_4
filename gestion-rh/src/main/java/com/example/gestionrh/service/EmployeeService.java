package com.example.gestionrh.service;

import com.example.gestionrh.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;

public class EmployeeService {

    @PersistenceContext
    private EntityManager em;

    public List<Employee> getAllEmployees() {
        Query query = em.createQuery("SELECT employee FROM Employee employee", Employee.class);
        return query.getResultList();
    }

    public Employee getEmployeeById(int id) {
        return em.find(Employee.class, id);
    }

    public Employee createEmployee(Employee employee) {
        em.persist(employee);
        return employee;
    }

    public Employee updateEmployee(int id, Employee employee) {
        Employee existingEmployee = em.find(Employee.class, id);
        if (existingEmployee != null) {
            existingEmployee.setName(employee.getName());
            existingEmployee.setSurname(employee.getSurname());
            existingEmployee.setEmail(employee.getEmail());
            existingEmployee.setPhone(employee.getPhone());
            existingEmployee.setDepartment(employee.getDepartment());
            existingEmployee.setFunction(employee.getFunction());
            em.merge(existingEmployee);
            return existingEmployee;
        } else {
            return null;
        }
    }

    public void deleteEmployee(int id) {
        Employee employee = em.find(Employee.class, id);
        if (employee != null) {
            em.remove(employee);
        }
    }
}
