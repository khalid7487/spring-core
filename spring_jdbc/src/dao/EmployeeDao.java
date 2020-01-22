
package dao;

import javax.sql.DataSource;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

//@Component
public class EmployeeDao {
    DataSource dataSource;
    JdbcTemplate jdbcTemplate;
    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate=new JdbcTemplate(dataSource);
    }
    
    public int saveEmployee(Employee employee){
        String sql="insert into employee(name,salary) values('"+employee.getName()+"','"+employee.getSalary()+"')";
        return jdbcTemplate.update(sql);
    }
    
}
