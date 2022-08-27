package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinderFacade {

    private CompanyDao companyDao;
    private EmployeeDao employeeDao;

    @Autowired
    public FinderFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> retrieveCompanyTxtFragment(String fragment)
    {
        return companyDao.retrieveCompanyTxtFragment("%" + fragment + "%");
    }

    public List<Employee> retrieveEmployeeTxtFragment(String fragment)
    {
        return employeeDao.retrieveEmployeeTxtFragment("%" + fragment + "%");
    }
}
