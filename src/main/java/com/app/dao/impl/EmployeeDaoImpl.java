package com.app.dao.impl;

import com.app.config.AppConfig;
import com.app.dao.EmployeeDao;
import com.app.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 * @author saurabh vaish
 * @version 1.0
 * @since 27/01/20
 ***/

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private HibernateTemplate ht;

    public EmployeeDaoImpl()
    {
//        ht = new AnnotationConfigApplicationContext(AppConfig.class).getBean("hibernateTemplate",HibernateTemplate.class);
        ht = new AppConfig().hibernateTemplate();
    }



    @Override
    public Employee saveEmployee(Employee emp) {
        return (Employee) ht.save(emp);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return ht.loadAll(Employee.class);
    }
}
