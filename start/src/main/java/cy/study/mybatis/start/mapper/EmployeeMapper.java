package cy.study.mybatis.start.mapper;

import cy.study.mybatis.start.bean.Employee;

public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
