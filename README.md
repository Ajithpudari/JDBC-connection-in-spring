# JDBC-connection-in-spring

Here In this Example we create jdbc connection.
Here We use MySql As database
Spring JDBC Framework takes care of all the low-level details starting from opening the connection, preparing and executing the SQL statement, processing exceptions, handling transactions, and finally closing the connection. This tutorial will take you through simple and practical approaches while learning JDBC framework provided by Spring.

### Data Access Object (DAO)
DAO stands for Data Access Object which is commonly used for database interaction. DAOs exist to provide a means to read and write data to the database and they should expose this functionality through an interface by which the rest of the application will access them.

```
    public interface EmployeeDao {
    public Employee findEmployeeById(int empId);
    }
```

     And in DaoImplimentaion class we implimented the EmployeeDao.
     And in ApplicationContext.xml file we define our DB credentiols and URL's:


```
       <bean id="dataSource"
          class="org.springframework.jdbc.datasource.DriverManagerDataSource"/>

        <property name="driverClassName" value="com.mysql.jdbc.Driver" />
        <property name="url" value="jdbc:mysql://localhost:3306/ajith" />
        <property name="username" value="root" />
        <property name="password" value="root" />
       </bean>
 ```
    
    
