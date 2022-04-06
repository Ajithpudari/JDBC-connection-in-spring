package com.javaspr;

import com.javaspr.dao.EmployeeDao;
import com.javaspr.model.Employee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

    public class SpringDemo {

        public static void main(String a[]){

            String confFile = "applicationContext.xml";
            ConfigurableApplicationContext context =
                    new ClassPathXmlApplicationContext(confFile);
            EmployeeDao empDao = (EmployeeDao) context.getBean("employeeDAO");
            Employee emp = empDao.findEmployeeById(1);
            System.out.println(emp.getName()+" | "+emp.getSalary()+" | "+emp.getDept());
        }
    }

