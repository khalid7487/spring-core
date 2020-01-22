package dao;

import jdbcmodel.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class EmployeeDao {
    DataSource dataSource;
    JdbcTemplate jdbcTemplate;
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
    }

    public int saveEmployee(Employee employee){
        String sql="insert into employee(emp_name,salary) values('"+employee.getName()+"','"+employee.getSalary()+"')";
        return jdbcTemplate.update(sql);
    }
    public int saveEmployeePS(Employee employee){
        String sql="insert into employee(emp_name,salary) values(?,?)";
        return jdbcTemplate.update(sql, new Object[]{employee.getName(),employee.getSalary()});
    }
    public int saveEmployeeNPS(Employee employee){
        String sql="insert into employee(emp_name,salary) values(:name,:salary)";
        SqlParameterSource namSqlParameterSource=new MapSqlParameterSource("name",employee.getName()).addValue("salary",employee.getSalary());
        return namedParameterJdbcTemplate.update(sql, namSqlParameterSource);
    }
    public String getEmployeebyId(int id){
        String sql="select emp_name from employee where emp_id=?";
        return jdbcTemplate.queryForObject(sql,new Object[]{id},String.class);
    }

    public Employee getAllEmployee(int id){
        String sql="select * from employee where emp_id=?";
        return jdbcTemplate.queryForObject(sql,new Object[]{id},new EmployeeMapper());
    }

    public List<Employee> getAllEmployeeList(int id){
        String sql="select * from employee";
        return jdbcTemplate.query(sql,new EmployeeMapper());
    }

    private static class EmployeeMapper implements RowMapper<Employee>{
       @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee employee=new Employee();
            employee.setId(rs.getInt("emp_id"));
            employee.setName(rs.getString("emp_name"));
            employee.setSalary(rs.getDouble("salary"));
            return employee;
        }
    }

}
