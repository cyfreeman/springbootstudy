package cy.study.mybatis.start.bean;



public class Department {

    private Integer id;
    private String departmentName;

    public Department(Integer id, String department) {
        this.id = id;
        this.departmentName = department;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }


    public String getDepartment() {
        return departmentName;
    }

}
