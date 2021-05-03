package CM.Services;

import CM.Data.StaffMemberDAO;
import CM.Model.StaffMember;
import CM.Model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Stream;

/**
 * Tineke Haverhals
 * 21/03/21.
 */
@Service
public class StaffMemberServices {

    @Autowired
    private StaffMemberDAO staffMemberDAO;

    public  StaffMember getUserByEmployeeId(String employeeId) throws SQLException {
        return staffMemberDAO.getUserByEmployeeId(employeeId);
    }

    public  List<StaffMember>
    getPageByEmployeeId() throws SQLException {
        return staffMemberDAO.getPageByEmployeeId();
    }

    public StaffMember getAddStaffMember (String name,String abbreviationName, String employeeId,String department, String mobileNumber, String prive, String codePhoneNumber, String phoneNumber, String agentNumber, String responsible) throws Exception {
        return staffMemberDAO.getAddStaffMember(name, abbreviationName, employeeId, department, mobileNumber, prive, codePhoneNumber, phoneNumber, agentNumber,  responsible);
    }

    public List<StaffMember> getAllStaffMember() throws SQLException {
        return staffMemberDAO.getAllStaffMember();
    }

    public StaffMember getDeleteMember (String employeeID) throws Exception {
        return staffMemberDAO.getDeleteMember(employeeID);
    }

    public  StaffMember getSearch(String employeeId) throws SQLException {
        return staffMemberDAO.getSearch(employeeId);
    }
}
