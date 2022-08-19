package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.stereotype.Service;

import javax.persistence.NamedQuery;


@NamedQuery(
        name = "Company.retrieveCompanyTxtFragment",
        query = "FROM Company WHERE company LIKE :%FRAGMENT%"
)

@NamedQuery(
        name = "Employee.retrieveEmployeeTxtFragment",
        query = "FROM Employee WHERE employee LIKE :%FRAGMENT%"
)

@Service
public class FinderFacade
{

}
