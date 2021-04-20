package CM.Data;

import CM.Model.StaffMember;
import CM.Model.Task;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 21/03/21.
 */
@Repository
public class StaffMemberDAO {

    public StaffMember getUserByEmployeeId(String employeeId) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM StaffMembers Where EmployeeId=?;");
        statement.setString(1, employeeId);

        ResultSet rs = statement.executeQuery();
        StaffMember staffMember= null;

        if (rs!= null) {
            while (rs.next()) {
                staffMember = new StaffMember();

                staffMember.setId(rs.getInt("Id"));
                staffMember.setName(rs.getString("Name"));
                staffMember.setAbbreviationName(rs.getString("Name"));
                staffMember.setEmployeeId(rs.getString("EmployeeId"));
                staffMember.setDepartment(rs.getString("Department"));
                staffMember.setMobileNumber(rs.getString("MobileNumber"));
                staffMember.setPrive(rs.getString("Prive"));
                staffMember.setCodePhoneNumber(rs.getString("CodePhoneNumber"));
                staffMember.setPhoneNumber(rs.getString("PhoneNumber"));
                staffMember.setAgentNumber(rs.getString("AgentNumber"));
            }
        }
        return staffMember;
    }

    public List<StaffMember> getPageByEmployeeId() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM StaffMembers;");
        List<StaffMember> staffMembers = new ArrayList<>();
        StaffMember staffMember = null;
        if (rs!= null) {
            while (rs.next()) {
                staffMember = new StaffMember();
                staffMember.setId(rs.getInt("Id"));
                staffMember.setName(rs.getString("Name"));
                staffMember.setAbbreviationName(rs.getString("Name"));
                staffMember.setEmployeeId(rs.getString("EmployeeId"));
                staffMember.setDepartment(rs.getString("Department"));
                staffMember.setMobileNumber(rs.getString("MobileNumber"));
                staffMember.setPrive(rs.getString("Prive"));
                staffMember.setCodePhoneNumber(rs.getString("CodePhoneNumber"));
                staffMember.setPhoneNumber(rs.getString("PhoneNumber"));
                staffMember.setAgentNumber(rs.getString("AgentNumber"));
                staffMembers.add(staffMember);
            }
        }
        return staffMembers;
    }

    public  StaffMember getAddStaffMember(String name, String abbreviationName, String employeeId,String department, String mobileNumber, String prive, String codePhoneNumber, String phoneNumber, String agentNumber) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO StaffMembers (Id, Name, AbbreviationName, EmployeeId, Department, MobileNumber,Prive, CodePhoneNumber, PhoneNumber, AgentNumber)VALUES (Null, ? , ?, ?, ? , ? ,?, ?,?,? )");
        statement.setString(1, name);
        statement.setString(2, abbreviationName);
        statement.setString(3, employeeId);
        statement.setString(4, department);
        statement.setString(5, mobileNumber);
        statement.setString(6, prive);
        statement.setString(7, codePhoneNumber);
        statement.setString(8, phoneNumber);
        statement.setString(9, agentNumber);

        int rs = statement.executeUpdate();
        StaffMember staffMember = null;
        return staffMember;
    }

    public List<StaffMember> getAllStaffMember() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Name, AbbreviationName, EmployeeId, Department, MobileNumber, Prive, CodePhoneNumber, PhoneNumber,AgentNumber FROM StaffMembers");
        List<StaffMember> staffMembers = new ArrayList<>();
        StaffMember staffMember = null;
        if (rs!= null){
            while (rs.next()){
                staffMember = new StaffMember();
                staffMember.setName(rs.getString("Name"));
                staffMember.setAbbreviationName(rs.getString("abbreviationName"));
                staffMember.setEmployeeId(rs.getString("employeeId"));
                staffMember.setDepartment(rs.getString("department"));
                staffMember.setMobileNumber(rs.getString("mobileNumber"));
                staffMember.setPrive(rs.getString("prive"));
                staffMember.setCodePhoneNumber(rs.getString("codePhoneNumber"));
                staffMember.setPhoneNumber(rs.getString("phoneNumber"));
                staffMember.setAgentNumber(rs.getString("agentNumber"));
                staffMembers.add(staffMember);
            }
        }
        return staffMembers;
    }

    public  StaffMember getDeleteMember(String employeeId) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM StaffMembers Where EmployeeId = ?");
        statement.setString(1, employeeId);
        int rs = statement.executeUpdate();
        StaffMember staffMember = null;
        return staffMember;
    }

    public StaffMember getSearch(String employeeId) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Name FROM StaffMembers Where EmployeeId=?;");
        statement.setString(1, employeeId);
        ResultSet rs = statement.executeQuery();
        StaffMember staffMember= null;
        if (rs!= null) {
            while (rs.next()) {
                staffMember = new StaffMember();
                staffMember.setName(rs.getString("Name"));
            }
        }
        return staffMember;
    }

}
