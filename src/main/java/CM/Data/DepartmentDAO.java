package CM.Data;

import CM.Model.Department;
import CM.Model.StaffMember;
import CM.Model.Task;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 26/03/21.
 */
@Repository
public class DepartmentDAO {
    public List<Department> getAllDepartment() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT NameDepartment FROM Department");
        List<Department> departments = new ArrayList<>();
        Department department = null;
        if (rs!= null){
            while (rs.next()){
                department = new Department();
                department.setNameDepartment(rs.getString("nameDepartment"));
                departments.add(department);
            }
        }
        return departments;
    }
}
