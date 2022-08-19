package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FinderFacadeTest
{
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void findCompanyTxtFragmentTest()
    {
        //Given
        String fragment = "Kat";

        //When
        List<Company> foundCompanies = companyDao.retrieveCompanyTxtFragment(fragment);

        //Then
        assertEquals(1, foundCompanies.size());
    }

    @Test
    public void findEmployeeTxtFragmentTest()
    {
        //Given
        String fragment = "tyl";

        //When
        List<Employee> foundEmployees = employeeDao.retrieveEmployeeTxtFragment(fragment);

        //Then
        assertEquals(1, foundEmployees.size());
    }

}