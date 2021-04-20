package CM.Services;

import CM.Data.ConnectionFactory;
import CM.Data.DepartmentDAO;
import CM.Data.StaffMemberDAO;
import CM.Model.Department;
import CM.Model.StaffMember;
import CM.Model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Tineke Haverhals
 * 26/03/21.
 */
@Service
public class DepartmentServices {

    @Autowired
    private DepartmentDAO departmentDAO;

    public List<Department> getAllDepartment() throws SQLException {
        return departmentDAO.getAllDepartment();
    }


}
