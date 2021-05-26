package CM.Data;

import CM.Model.Fillin;
import CM.Model.Function;
import CM.Model.StaffMember;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 6/04/21.
 */
@Repository
public class FillinDAO {

    public Fillin getAddFillin(int IdStaffMember, String week, String department, String monAmFunction, String monAmTask, String monAmLocation, String monAmAbsent, String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent, String tueAmFunction, String tueAmTask, String tueAmLocation, String tueAmAbsent, String tuePmFunction, String tuePmTask, String tuePmLocation, String tuePmAbsent, String wedAmFunction, String wedAmTask, String wedAmLocation, String wedAmAbsent, String wedPmFunction, String wedPmTask, String wedPmLocation, String wedPmAbsent, String thuAmFunction, String thuAmTask, String thuAmLocation, String thuAmAbsent, String thuPmFunction, String thuPmTask, String thuPmLocation, String thuPmAbsent, String friAmFunction, String friAmTask, String friAmLocation, String friAmAbsent, String friPmFunction, String friPmTask, String friPmLocation, String friPmAbsent) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO Fillin (Id,IdStaffMember,Week, Department, MonAmFunction,MonAmTask, MonAmLocation, MonAmAbsent, MonPmFunction, MonPmTask, MonPmLocation, MonPmAbsent, TueAmFunction,TueAmTask, TueAmLocation, TueAmAbsent, TuePmFunction, TuePmTask, TuePmLocation, TuePmAbsent , WedAmFunction, WedAmTask, WedAmLocation, WedAmAbsent, WedPmFunction, WedPmTask, WedPmLocation, WedPmAbsent, ThuAmFunction,ThuAmTask, ThuAmLocation, ThuAmAbsent, ThuPmFunction, ThuPmTask, ThuPmLocation, ThuPmAbsent, FriAmFunction,FriAmTask, FriAmLocation, FriAmAbsent, FriPmFunction, FriPmTask, FriPmLocation, FriPmAbsent)VALUES (Null ,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?);");
        statement.setInt(1, IdStaffMember);
        statement.setString(2, week);
        statement.setString(3, department);
        statement.setString(4, monAmFunction);
        statement.setString(5, monAmTask);
        statement.setString(6, monAmLocation);
        statement.setString(7, monAmAbsent);
        statement.setString(8, monPmFunction);
        statement.setString(9, monPmTask);
        statement.setString(10, monPmLocation);
        statement.setString(11, monPmAbsent);
        statement.setString(12, tueAmFunction);
        statement.setString(13, tueAmTask);
        statement.setString(14, tueAmLocation);
        statement.setString(15, tueAmAbsent);
        statement.setString(16, tuePmFunction);
        statement.setString(17, tuePmTask);
        statement.setString(18, tuePmLocation);
        statement.setString(19, tuePmAbsent);
        statement.setString(20, wedAmFunction);
        statement.setString(21, wedAmTask);
        statement.setString(22, wedAmLocation);
        statement.setString(23, wedAmAbsent);
        statement.setString(24, wedPmFunction);
        statement.setString(25, wedPmTask);
        statement.setString(26, wedPmLocation);
        statement.setString(27, wedPmAbsent);
        statement.setString(28, thuAmFunction);
        statement.setString(29, thuAmTask);
        statement.setString(30, thuAmLocation);
        statement.setString(31, thuAmAbsent);
        statement.setString(32, thuPmFunction);
        statement.setString(33, thuPmTask);
        statement.setString(34, thuPmLocation);
        statement.setString(35, thuPmAbsent);
        statement.setString(36, friAmFunction);
        statement.setString(37, friAmTask);
        statement.setString(38, friAmLocation);
        statement.setString(39, friAmAbsent);
        statement.setString(40, friPmFunction);
        statement.setString(41, friPmTask);
        statement.setString(42, friPmLocation);
        statement.setString(43, friPmAbsent);
        int rs = statement.executeUpdate();
        Fillin fillin = null;
        return fillin;
    }

    public Fillin getChangeFillin(int IdStaffMember, String week, String monAmFunction, String monAmTask, String monAmLocation, String monAmAbsent, String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent, String tueAmFunction, String tueAmTask, String tueAmLocation, String tueAmAbsent, String tuePmFunction, String tuePmTask, String tuePmLocation, String tuePmAbsent, String wedAmFunction, String wedAmTask, String wedAmLocation, String wedAmAbsent, String wedPmFunction, String wedPmTask, String wedPmLocation, String wedPmAbsent, String thuAmFunction, String thuAmTask, String thuAmLocation, String thuAmAbsent, String thuPmFunction, String thuPmTask, String thuPmLocation, String thuPmAbsent, String friAmFunction, String friAmTask, String friAmLocation, String friAmAbsent, String friPmFunction, String friPmTask, String friPmLocation, String friPmAbsent) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("UPDATE Fillin SET MonAmFunction = ?, MonAmTask = ?,MonAmLocation = ? ,MonAmAbsent = ?,MonPmFunction =  ?,MonPmTask = ?,MonPmLocation = ? ,MonPmAbsent =  ?, TueAmFunction =  ?,TueAmTask = ?,TueAmLocation = ?,TueAmAbsent = ?,TuePmFunction = ?,TuePmTask =?,TuePmLocation = ?,TuePmAbsent = ?, WedAmFunction = ?,WedAmTask =?,WedAmLocation =?,WedAmAbsent =?,WedPmFunction = ?,WedPmTask =?,WedPmLocation = ?,WedPmAbsent =?, ThuAmFunction = ?,ThuAmTask =?,ThuAmLocation =?,ThuAmAbsent =?,ThuPmFunction = ?,ThuPmTask =?,ThuPmLocation = ?,ThuPmAbsent =?, FriAmFunction = ?,FriAmTask =?,FriAmLocation =?,FriAmAbsent =?,FriPmFunction = ?,FriPmTask =?,FriPmLocation = ?,FriPmAbsent =?   WHERE IdStaffMember = ? AND Week =?");
        statement.setString(1, monAmFunction);
        statement.setString(2, monAmTask);
        statement.setString(3, monAmLocation);
        statement.setString(4, monAmAbsent);
        statement.setString(5, monPmFunction);
        statement.setString(6, monPmTask);
        statement.setString(7, monPmLocation);
        statement.setString(8, monPmAbsent);
        statement.setString(9, tueAmFunction);
        statement.setString(10, tueAmTask);
        statement.setString(11, tueAmLocation);
        statement.setString(12, tueAmAbsent);
        statement.setString(13, tuePmFunction);
        statement.setString(14, tuePmTask);
        statement.setString(15, tuePmLocation);
        statement.setString(16, tuePmAbsent);
        statement.setString(17, wedAmFunction);
        statement.setString(18, wedAmTask);
        statement.setString(19, wedAmLocation);
        statement.setString(20, wedAmAbsent);
        statement.setString(21, wedPmFunction);
        statement.setString(22, wedPmTask);
        statement.setString(23, wedPmLocation);
        statement.setString(24, wedPmAbsent);
        statement.setString(25, thuAmFunction);
        statement.setString(26, thuAmTask);
        statement.setString(27, thuAmLocation);
        statement.setString(28, thuAmAbsent);
        statement.setString(29, thuPmFunction);
        statement.setString(30, thuPmTask);
        statement.setString(31, thuPmLocation);
        statement.setString(32, thuPmAbsent);
        statement.setString(33, friAmFunction);
        statement.setString(34, friAmTask);
        statement.setString(35, friAmLocation);
        statement.setString(36, friAmAbsent);
        statement.setString(37, friPmFunction);
        statement.setString(38, friPmTask);
        statement.setString(39, friPmLocation);
        statement.setString(40, friPmAbsent);
        statement.setInt(41, IdStaffMember);
        statement.setString(42, week);
        int rs = statement.executeUpdate();
        Fillin fillin = null;
        return fillin;
    }

    public List<Fillin> getTableFillin() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT MonAmFunction,MonAmTask, MonAmLocation, MonPmFunction,MonPmTask, MonPmLocation, TueAmFunction, TueAmTask, TueAmLocation, TuePmFunction, TuePmTask, TuePmLocation, WedAmFunction, WedAmTask, WedAmLocation, WedPmFunction, WedPmTask, WedPmLocation, ThuAmFunction, ThuAmTask, ThuAmLocation, ThuPmFunction, ThuPmTask, ThuPmLocation, FriAmFunction, FriAmTask, FriAmLocation, FriPmFunction, FriPmTask, FriPmLocation FROM Fillin");
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setMonAmFunction(rs.getString("monAmFunction"));
                fillin.setMonAmTask(rs.getString("monAmTask"));
                fillin.setMonAmLocation(rs.getString("monAmLocation"));
                fillin.setMonPmFunction(rs.getString("monPmFunction"));
                fillin.setMonPmTask(rs.getString("monPmTask"));
                fillin.setMonPmLocation(rs.getString("monPmLocation"));
                fillin.setTueAmFunction(rs.getString("tueAmFunction"));
                fillin.setTueAmTask(rs.getString("tueAmTask"));
                fillin.setTueAmLocation(rs.getString("tueAmLocation"));
                fillin.setTuePmFunction(rs.getString("tuePmFunction"));
                fillin.setTuePmTask(rs.getString("tuePmTask"));
                fillin.setTuePmLocation(rs.getString("tuePmLocation"));
                fillin.setWedAmFunction(rs.getString("wedAmFunction"));
                fillin.setWedAmTask(rs.getString("wedAmTask"));
                fillin.setWedAmLocation(rs.getString("wedAmLocation"));
                fillin.setWedPmFunction(rs.getString("wedPmFunction"));
                fillin.setWedPmTask(rs.getString("wedPmTask"));
                fillin.setWedPmLocation(rs.getString("wedPmLocation"));
                fillin.setThuAmFunction(rs.getString("thuAmFunction"));
                fillin.setThuAmTask(rs.getString("thuAmTask"));
                fillin.setThuAmLocation(rs.getString("thuAmLocation"));
                fillin.setThuPmFunction(rs.getString("thuPmFunction"));
                fillin.setThuPmTask(rs.getString("thuPmTask"));
                fillin.setThuPmLocation(rs.getString("thuPmLocation"));
                fillin.setFriAmFunction(rs.getString("friAmFunction"));
                fillin.setFriAmTask(rs.getString("friAmTask"));
                fillin.setFriAmLocation(rs.getString("friAmLocation"));
                fillin.setFriPmFunction(rs.getString("friPmFunction"));
                fillin.setFriPmTask(rs.getString("friPmTask"));
                fillin.setFriPmLocation(rs.getString("friPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCM() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT StaffMembers.AbbreviationName, Fillin.MonAmFunction, Fillin.MonAmTask, Fillin.MonAmLocation, Fillin.MonPmFunction, Fillin.MonPmTask, Fillin.MonPmLocation, Fillin.TueAmFunction, Fillin.tueAmTask, Fillin.TueAmLocation, Fillin.TuePmFunction, Fillin.tuePmTask, Fillin.TuePmLocation , Fillin.WedAmFunction, Fillin.WedAmTask, Fillin.WedAmLocation, Fillin.WedPmFunction, Fillin.WedPmTask, Fillin.WedPmLocation, Fillin.ThuAmFunction, Fillin.thuAmTask, Fillin.ThuAmLocation, Fillin.ThuPmFunction, Fillin.thuPmTask, Fillin.ThuPmLocation , Fillin.FriAmFunction, Fillin.FriAmTask, Fillin.FriAMLocation, Fillin.FriPmFunction, Fillin.FriPmTask, Fillin.FriPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Fillin.Department='LCM'");
        List<Fillin> fillins = new ArrayList<>();
        List<StaffMember> staffMembers = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                staffMember.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonAmFunction(rs.getString("monAmFunction"));
                fillin.setMonAmTask(rs.getString("monAmTask"));
                fillin.setMonAmLocation(rs.getString("monAmLocation"));
                fillin.setMonPmFunction(rs.getString("monPmFunction"));
                fillin.setMonPmLocation(rs.getString("monPmLocation"));
                fillin.setTueAmFunction(rs.getString("tueAmFunction"));
                fillin.setTueAmLocation(rs.getString("tueAmLocation"));
                fillin.setTuePmFunction(rs.getString("tuePmFunction"));
                fillin.setTuePmLocation(rs.getString("tuePmLocation"));
                fillin.setWedAmFunction(rs.getString("wedAmFunction"));
                fillin.setWedAmLocation(rs.getString("wedAmLocation"));
                fillin.setWedPmFunction(rs.getString("wedPmFunction"));
                fillin.setWedPmLocation(rs.getString("wedPmLocation"));
                fillin.setThuAmFunction(rs.getString("thuAmFunction"));
                fillin.setThuAmLocation(rs.getString("thuAmLocation"));
                fillin.setThuPmFunction(rs.getString("thuPmFunction"));
                fillin.setThuPmLocation(rs.getString("thuPmLocation"));
                fillin.setFriAmFunction(rs.getString("friAmFunction"));
                fillin.setFriAmLocation(rs.getString("friAmLocation"));
                fillin.setFriPmFunction(rs.getString("friPmFunction"));
                fillin.setFriPmLocation(rs.getString("friPmLocation"));
                fillins.add(fillin);
                staffMembers.add(staffMember);
            }
        }
        return fillins;
    }


    public List<Fillin> getTableFillinVCM() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT StaffMembers.AbbreviationName, Fillin.MonAmFunction, Fillin.MonAmTask, Fillin.MonAmLocation, Fillin.MonPmFunction, Fillin.MonPmTask, Fillin.MonPmLocation, Fillin.TueAmFunction, Fillin.tueAmTask, Fillin.TueAMLocation, Fillin.TuePmFunction, Fillin.tuePmTask, Fillin.TuePmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Fillin.Department='VCM'");
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setMonAmFunction(rs.getString("monAmFunction"));
                fillin.setMonAmTask(rs.getString("monAmTask"));
                fillin.setMonAmLocation(rs.getString("monAmLocation"));
                fillin.setMonPmFunction(rs.getString("monPmFunction"));
                fillin.setMonPmTask(rs.getString("monPmTask"));
                fillin.setMonPmLocation(rs.getString("monPmLocation"));
                fillin.setTueAmFunction(rs.getString("tueAmFunction"));
                fillin.setTueAmTask(rs.getString("tueAmTask"));
                fillin.setTueAmLocation(rs.getString("tueAmLocation"));
                fillin.setTuePmFunction(rs.getString("tuePmFunction"));
                fillin.setTuePmTask(rs.getString("tuePmTask"));
                fillin.setTuePmLocation(rs.getString("tuePmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFG() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT StaffMembers.AbbreviationName, Fillin.MonAmFunction, Fillin.MonAmTask, Fillin.MonAmLocation, Fillin.MonPmFunction, Fillin.MonPmTask, Fillin.MonPmLocation, Fillin.TueAmFunction, Fillin.tueAmTask, Fillin.TueAMLocation, Fillin.TuePmFunction, Fillin.tuePmTask, Fillin.TuePmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Fillin.Department='MCFG'");
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setMonAmFunction(rs.getString("monAmFunction"));
                fillin.setMonAmTask(rs.getString("monAmTask"));
                fillin.setMonAmLocation(rs.getString("monAmLocation"));
                fillin.setMonPmFunction(rs.getString("monPmFunction"));
                fillin.setMonPmTask(rs.getString("monPmTask"));
                fillin.setMonPmLocation(rs.getString("monPmLocation"));
                fillin.setTueAmFunction(rs.getString("tueAmFunction"));
                fillin.setTueAmTask(rs.getString("tueAmTask"));
                fillin.setTueAmLocation(rs.getString("tueAmLocation"));
                fillin.setTuePmFunction(rs.getString("tuePmFunction"));
                fillin.setTuePmTask(rs.getString("tuePmTask"));
                fillin.setTuePmLocation(rs.getString("tuePmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public Fillin getSearchOwnDate(String week, int idStaffMember) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT MonAmFunction,MonAmTask, MonAmLocation, MonAmAbsent, MonPmFunction,MonPmTask, MonPmLocation,MonPmAbsent, TueAmFunction, TueAmTask, TueAmLocation, TueAmAbsent, TuePmFunction, TuePmTask, TuePmLocation,TuePmAbsent, WedAmFunction, WedAmTask, WedAmLocation, WedAmAbsent,WedPmFunction, WedPmTask, WedPmLocation, WedPmAbsent,ThuAmFunction, ThuAmTask, ThuAmLocation, ThuAmAbsent,ThuPmFunction, ThuPmTask, ThuPmLocation , ThuPmAbsent,FriAmFunction, FriAmTask, FriAmLocation,FriAmAbsent, FriPmFunction, FriPmTask, FriPmLocation, FriPmAbsent FROM Fillin WHERE Week = ? AND IdStaffMember= ?;");
        statement.setString(1, week);
        statement.setInt(2, idStaffMember);
        ResultSet rs = statement.executeQuery();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setMonAmFunction(rs.getString("monAmFunction"));
                fillin.setMonAmTask(rs.getString("monAmTask"));
                fillin.setMonAmLocation(rs.getString("monAmLocation"));
                fillin.setMonAmAbsent(rs.getString("monAmAbsent"));
                fillin.setMonPmFunction(rs.getString("monPmFunction"));
                fillin.setMonPmTask(rs.getString("monPmTask"));
                fillin.setMonPmLocation(rs.getString("monPmLocation"));
                fillin.setMonPmAbsent(rs.getString("monPmAbsent"));
                fillin.setTueAmFunction(rs.getString("tueAmFunction"));
                fillin.setTueAmTask(rs.getString("tueAmTask"));
                fillin.setTueAmLocation(rs.getString("tueAmLocation"));
                fillin.setTueAmAbsent(rs.getString("tueAmAbsent"));
                fillin.setTuePmFunction(rs.getString("tuePmFunction"));
                fillin.setTuePmTask(rs.getString("tuePmTask"));
                fillin.setTuePmLocation(rs.getString("tuePmLocation"));
                fillin.setTuePmAbsent(rs.getString("tuePmAbsent"));
                fillin.setWedAmFunction(rs.getString("wedAmFunction"));
                fillin.setWedAmTask(rs.getString("wedAmTask"));
                fillin.setWedAmLocation(rs.getString("wedAmLocation"));
                fillin.setWedAmAbsent(rs.getString("wedAmAbsent"));
                fillin.setWedPmFunction(rs.getString("wedPmFunction"));
                fillin.setWedPmTask(rs.getString("wedPmTask"));
                fillin.setWedPmLocation(rs.getString("wedPmLocation"));
                fillin.setWedPmAbsent(rs.getString("wedPmAbsent"));
                fillin.setThuAmFunction(rs.getString("thuAmFunction"));
                fillin.setThuAmTask(rs.getString("thuAmTask"));
                fillin.setThuAmLocation(rs.getString("thuAmLocation"));
                fillin.setThuAmAbsent(rs.getString("thuAmAbsent"));
                fillin.setThuPmFunction(rs.getString("thuPmFunction"));
                fillin.setThuPmTask(rs.getString("thuPmTask"));
                fillin.setThuPmLocation(rs.getString("thuPmLocation"));
                fillin.setThuPmAbsent(rs.getString("thuPmAbsent"));
                fillin.setFriAmFunction(rs.getString("friAmFunction"));
                fillin.setFriAmTask(rs.getString("friAmTask"));
                fillin.setFriAmLocation(rs.getString("friAmLocation"));
                fillin.setFriAmAbsent(rs.getString("friAmAbsent"));
                fillin.setFriPmFunction(rs.getString("friPmFunction"));
                fillin.setFriPmTask(rs.getString("friPmTask"));
                fillin.setFriPmLocation(rs.getString("friPmLocation"));
                fillin.setFriPmAbsent(rs.getString("friPmAbsent"));
            }
        }
        return fillin;
    }

    public Fillin getSearchAllAbsent(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Name, Fillin.Department, MonAmAbsent,MonPmAbsent, TueAmAbsent,TuePmAbsent, WedAmAbsent, WedPmAbsent, ThuAmAbsent, ThuPmAbsent,FriAmAbsent,  FriPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  WHERE Week = ?;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                staffMember.setName(rs.getString("name"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setMonAmAbsent(rs.getString("monAmAbsent"));
                fillin.setMonPmAbsent(rs.getString("monPmAbsent"));
                fillin.setTueAmAbsent(rs.getString("tueAmAbsent"));
                fillin.setTuePmAbsent(rs.getString("tuePmAbsent"));
                fillin.setWedAmAbsent(rs.getString("wedAmAbsent"));
                fillin.setWedPmAbsent(rs.getString("wedPmAbsent"));
                fillin.setThuAmAbsent(rs.getString("thuAmAbsent"));
                fillin.setThuPmAbsent(rs.getString("thuPmAbsent"));
                fillin.setFriAmAbsent(rs.getString("friAmAbsent"));
                fillin.setFriPmAbsent(rs.getString("friPmAbsent"));
            }
        }
        return fillin;
    }

    public List<Fillin> getSearchOwnDataAbsent(String month, int idStaffMember) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT  Fillin.Week, IdStaffMember,MonAmAbsent,MonPmAbsent, TueAmAbsent,TuePmAbsent, WedAmAbsent, WedPmAbsent,ThuAmAbsent , ThuPmAbsent,FriAmAbsent, FriPmAbsent FROM Fillin INNER JOIN  Date ON Fillin.Week= Date.Date WHERE  MonthBegin = ? AND IdStaffMember = ? AND( MonAmAbsent = 'Absent' OR  MonPmAbsent = 'Absent' OR TueAmAbsent = 'Absent' OR TuePmAbsent = 'Absent' OR WedAmAbsent = 'Absent' OR WedPmAbsent = 'Absent' OR ThuAmAbsent= 'Absent' OR ThuPmAbsent = 'Absent' OR FriAmAbsent= 'Absent' OR FriPmAbsent= 'Absent') ORDER BY Date.Date ASC");
        statement.setString(1, month);
        statement.setInt(2, idStaffMember);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setWeek(rs.getString("week"));
                fillin.setMonAmAbsent(rs.getString("monAmAbsent"));
                fillin.setMonPmAbsent(rs.getString("monPmAbsent"));
                fillin.setTueAmAbsent(rs.getString("tueAmAbsent"));
                fillin.setTuePmAbsent(rs.getString("tuePmAbsent"));
                fillin.setWedAmAbsent(rs.getString("wedAmAbsent"));
                fillin.setWedPmAbsent(rs.getString("wedPmAbsent"));
                fillin.setThuAmAbsent(rs.getString("thuAmAbsent"));
                fillin.setThuPmAbsent(rs.getString("thuPmAbsent"));
                fillin.setFriAmAbsent(rs.getString("friAmAbsent"));
                fillin.setFriPmAbsent(rs.getString("friPmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }


    public List<Fillin> getSearchAllDataAbsent(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Week, Fillin.IdStaffMember, StaffMembers.Name, Fillin.Department, MonAmAbsent,MonPmAbsent, TueAmAbsent,TuePmAbsent, WedAmAbsent, WedPmAbsent, ThuAmAbsent, ThuPmAbsent,FriAmAbsent,  FriPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND( MonAmAbsent = 'Absent' OR  MonPmAbsent = 'Absent' OR TueAmAbsent = 'Absent' OR TuePmAbsent = 'Absent' OR WedAmAbsent = 'Absent' OR WedPmAbsent = 'Absent' OR ThuAmAbsent= 'Absent' OR ThuPmAbsent = 'Absent' OR FriAmAbsent= 'Absent' OR FriPmAbsent= 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                Fillin staffMember = new Fillin();
                fillin.setWeek(rs.getString("week"));
                fillin.setId(rs.getInt("IdStaffMember"));
                fillin.setName(rs.getString("name"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setMonAmAbsent(rs.getString("monAmAbsent"));
                fillin.setMonPmAbsent(rs.getString("monPmAbsent"));
                fillin.setTueAmAbsent(rs.getString("tueAmAbsent"));
                fillin.setTuePmAbsent(rs.getString("tuePmAbsent"));
                fillin.setWedAmAbsent(rs.getString("wedAmAbsent"));
                fillin.setWedPmAbsent(rs.getString("wedPmAbsent"));
                fillin.setThuAmAbsent(rs.getString("thuAmAbsent"));
                fillin.setThuPmAbsent(rs.getString("thuPmAbsent"));
                fillin.setFriAmAbsent(rs.getString("friAmAbsent"));
                fillin.setFriPmAbsent(rs.getString("friPmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getSearchAllDataAbsentMonth(String month) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT  Fillin.Week,Fillin.IdStaffMember,StaffMembers.Name, Fillin.Department, MonAmAbsent,MonPmAbsent, TueAmAbsent,TuePmAbsent, WedAmAbsent, WedPmAbsent,ThuAmAbsent , ThuPmAbsent,FriAmAbsent, FriPmAbsent FROM Fillin INNER JOIN  Date ON Fillin.Week= Date.Date INNER JOIN StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE  MonthBegin = ?  AND( MonAmAbsent = 'Absent' OR  MonPmAbsent = 'Absent' OR TueAmAbsent = 'Absent' OR TuePmAbsent = 'Absent' OR WedAmAbsent = 'Absent' OR WedPmAbsent = 'Absent' OR ThuAmAbsent= 'Absent' OR ThuPmAbsent = 'Absent' OR FriAmAbsent= 'Absent' OR FriPmAbsent= 'Absent') ORDER BY Date.Date ASC");
        statement.setString(1, month);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        List<StaffMember> staffMembers = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setWeek(rs.getString("week"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setName(rs.getString("name"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setMonAmAbsent(rs.getString("monAmAbsent"));
                fillin.setMonPmAbsent(rs.getString("monPmAbsent"));
                fillin.setTueAmAbsent(rs.getString("tueAmAbsent"));
                fillin.setTuePmAbsent(rs.getString("tuePmAbsent"));
                fillin.setWedAmAbsent(rs.getString("wedAmAbsent"));
                fillin.setWedPmAbsent(rs.getString("wedPmAbsent"));
                fillin.setThuAmAbsent(rs.getString("thuAmAbsent"));
                fillin.setThuPmAbsent(rs.getString("thuPmAbsent"));
                fillin.setFriAmAbsent(rs.getString("friAmAbsent"));
                fillin.setFriPmAbsent(rs.getString("friPmAbsent"));
                fillins.add(fillin);
                staffMembers.add(staffMember);
            }
        }
        return fillins;
    }

    public List<Fillin> getSearchAllDataAbsentDepartment(String week, String department) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Fillin.Week,Fillin.IdStaffMember, Name,Fillin.Department, MonAmAbsent,MonPmAbsent, TueAmAbsent,TuePmAbsent, WedAmAbsent, WedPmAbsent, ThuAmAbsent, ThuPmAbsent,FriAmAbsent,  FriPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  WHERE Week =? AND Fillin.Department= ? AND( MonAmAbsent = 'Absent' OR  MonPmAbsent = 'Absent' OR TueAmAbsent = 'Absent' OR TuePmAbsent = 'Absent' OR WedAmAbsent = 'Absent' OR WedPmAbsent = 'Absent' OR ThuAmAbsent= 'Absent' OR ThuPmAbsent = 'Absent' OR FriAmAbsent= 'Absent' OR FriPmAbsent= 'Absent')");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        List<StaffMember> staffMembers = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setWeek(rs.getString("week"));
                fillin.setName(rs.getString("name"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setMonAmAbsent(rs.getString("monAmAbsent"));
                fillin.setMonPmAbsent(rs.getString("monPmAbsent"));
                fillin.setTueAmAbsent(rs.getString("tueAmAbsent"));
                fillin.setTuePmAbsent(rs.getString("tuePmAbsent"));
                fillin.setWedAmAbsent(rs.getString("wedAmAbsent"));
                fillin.setWedPmAbsent(rs.getString("wedPmAbsent"));
                fillin.setThuAmAbsent(rs.getString("thuAmAbsent"));
                fillin.setThuPmAbsent(rs.getString("thuPmAbsent"));
                fillin.setFriAmAbsent(rs.getString("friAmAbsent"));
                fillin.setFriPmAbsent(rs.getString("friPmAbsent"));
                fillins.add(fillin);
                staffMembers.add(staffMember);
            }
        }
        return fillins;
    }

    public List<Fillin> getSearchAllDataAbsentDepartmentMonth(String month, String department) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Fillin.Week,Fillin.IdStaffMember,StaffMembers.Name, Fillin.Department, MonAmAbsent,MonPmAbsent, TueAmAbsent,TuePmAbsent, WedAmAbsent, WedPmAbsent,ThuAmAbsent , ThuPmAbsent,FriAmAbsent, FriPmAbsent FROM Fillin INNER JOIN  Date ON Fillin.Week= Date.Date INNER JOIN StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE  MonthBegin = ? AND Fillin.Department= ? AND( MonAmAbsent = 'Absent' OR  MonPmAbsent = 'Absent' OR TueAmAbsent = 'Absent' OR TuePmAbsent = 'Absent' OR WedAmAbsent = 'Absent' OR WedPmAbsent = 'Absent' OR ThuAmAbsent= 'Absent' OR ThuPmAbsent = 'Absent' OR FriAmAbsent= 'Absent' OR FriPmAbsent= 'Absent') ORDER BY Date.Date ASC;");
        statement.setString(1, month);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        List<StaffMember> staffMembers = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setWeek(rs.getString("week"));
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setMonAmAbsent(rs.getString("monAmAbsent"));
                fillin.setMonPmAbsent(rs.getString("monPmAbsent"));
                fillin.setTueAmAbsent(rs.getString("tueAmAbsent"));
                fillin.setTuePmAbsent(rs.getString("tuePmAbsent"));
                fillin.setWedAmAbsent(rs.getString("wedAmAbsent"));
                fillin.setWedPmAbsent(rs.getString("wedPmAbsent"));
                fillin.setThuAmAbsent(rs.getString("thuAmAbsent"));
                fillin.setThuPmAbsent(rs.getString("thuPmAbsent"));
                fillin.setFriAmAbsent(rs.getString("friAmAbsent"));
                fillin.setFriPmAbsent(rs.getString("friPmAbsent"));
                fillins.add(fillin);
                staffMembers.add(staffMember);
            }
        }
        return fillins;
    }


    public List<Fillin> getsearchTasksMemberMonAm(String week, String department) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, MonAmFunction,MonAmTask, MonAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ? AND MonAmFunction = 'Tasks' AND MonAmAbsent IS Null ORDER BY MonAmFunction ASC;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setName(rs.getString("name"));
                fillin.setMonAmFunction(rs.getString("monAmFunction"));
                fillin.setMonAmTask(rs.getString("monAmTask"));
                fillin.setMonAmLocation(rs.getString("monAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getsearchTasksMemberMonPm(String week, String department) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, MonPmFunction,MonPmTask, MonPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ?  AND MonPmFunction = 'Tasks' AND MonPmAbsent IS Null ORDER BY MonPmFunction ASC;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setName(rs.getString("name"));
                fillin.setMonPmFunction(rs.getString("monPmFunction"));
                fillin.setMonPmTask(rs.getString("monPmTask"));
                fillin.setMonPmLocation(rs.getString("monPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getsearchTasksMemberTueAm(String week, String department) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, TueAmFunction,TueAmTask, TueAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ?  AND TueAmFunction = 'Tasks' AND TueAmAbsent IS Null ORDER BY TueAmFunction ASC;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setName(rs.getString("name"));
                fillin.setTueAmFunction(rs.getString("tueAmFunction"));
                fillin.setTueAmTask(rs.getString("tueAmTask"));
                fillin.setTueAmLocation(rs.getString("tueAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getsearchTasksMemberTuePm(String week, String department) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, TuePmFunction,TuePmTask, TuePmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ?  AND TuePmFunction = 'Tasks' AND TuePmAbsent IS Null ORDER BY TuePmFunction ASC;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setName(rs.getString("name"));
                fillin.setTuePmFunction(rs.getString("tuePmFunction"));
                fillin.setTuePmTask(rs.getString("tuePmTask"));
                fillin.setTuePmLocation(rs.getString("tuePmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getsearchTasksMemberWedAm(String week, String department) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, WedAmFunction,WedAmTask, WedAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ?  AND WedAmFunction = 'Tasks' AND WedAmAbsent IS Null ORDER BY WedAmFunction ASC;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setName(rs.getString("name"));
                fillin.setWedAmFunction(rs.getString("wedAmFunction"));
                fillin.setWedAmTask(rs.getString("wedAmTask"));
                fillin.setWedAmLocation(rs.getString("wedAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getsearchTasksMemberWedPm(String week, String department) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, WedPmFunction,WedPmTask, WedPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ?  AND WedPmFunction = 'Tasks' AND WedPmAbsent IS Null ORDER BY WedPmFunction ASC;;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setName(rs.getString("name"));
                fillin.setWedPmFunction(rs.getString("WedPmFunction"));
                fillin.setWedPmTask(rs.getString("WedPmTask"));
                fillin.setWedPmLocation(rs.getString("WedPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getsearchTasksMemberThuAm(String week, String department) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, ThuAmFunction,ThuAmTask, ThuAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ?  AND ThuAmFunction = 'Tasks' AND ThuAmAbsent IS Null ORDER BY ThuAmFunction ASC;;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setName(rs.getString("name"));
                fillin.setThuAmFunction(rs.getString("thuAmFunction"));
                fillin.setThuAmTask(rs.getString("thuAmTask"));
                fillin.setThuAmLocation(rs.getString("thuAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getsearchTasksMemberThuPm(String week, String department) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, ThuPmFunction,ThuPmTask, ThuPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ?  AND ThuPmFunction = 'Tasks' AND ThuPmAbsent IS Null ORDER BY ThuPmFunction ASC;;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setName(rs.getString("name"));
                fillin.setThuPmFunction(rs.getString("thuPmFunction"));
                fillin.setThuPmTask(rs.getString("thuPmTask"));
                fillin.setThuPmLocation(rs.getString("thuPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getsearchTasksMemberFriAm(String week, String department) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, FriAmFunction,FriAmTask, FriAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ?   AND FriAmFunction = 'Tasks' AND FriAmAbsent IS Null ORDER BY FriAmFunction ASC;;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setName(rs.getString("name"));
                fillin.setFriAmFunction(rs.getString("friAmFunction"));
                fillin.setFriAmTask(rs.getString("friAmTask"));
                fillin.setFriAmLocation(rs.getString("friAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getsearchTasksMemberFriPm(String week, String department) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, FriPmFunction,FriPmTask, FriPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ?  AND FriPmFunction = 'Tasks' AND FriPmAbsent IS Null ORDER BY FriPmFunction ASC;;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setName(rs.getString("name"));
                fillin.setFriPmFunction(rs.getString("friPmFunction"));
                fillin.setFriPmTask(rs.getString("friPmTask"));
                fillin.setFriPmLocation(rs.getString("friPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWeek(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Date FROM Date WHERE Date = ?;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setWeek(rs.getString("date"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmFunction, Fillin.MonAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND MonAmAbsent IS Null AND NOT MonAmFunction = 'Tasks' ORDER BY MonAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonAmFunction(rs.getString("monAmFunction"));
                fillin.setMonAmLocation(rs.getString("monAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }


    public List<Fillin> getTableFillinLCMMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonPmFunction,  Fillin.MonPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND MonPmAbsent IS Null AND NOT MonPmFunction = 'Tasks'ORDER BY MonPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonPmFunction(rs.getString("monPmFunction"));
                fillin.setMonPmLocation(rs.getString("monPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.TueAmFunction, Fillin.TueAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND TueAmAbsent IS Null AND NOT TueAmFunction = 'Tasks'  ORDER BY TueAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTueAmFunction(rs.getString("tueAmFunction"));
                fillin.setTueAmLocation(rs.getString("tueAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TuePmFunction,  Fillin.TuePmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND TuePmAbsent IS Null AND NOT TuePmFunction = 'Tasks' ORDER BY TuePmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTuePmFunction(rs.getString("tuePmFunction"));
                fillin.setTuePmLocation(rs.getString("tuePmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.WedAmFunction, Fillin.WedAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND WedAmAbsent IS Null AND NOT WedAmFunction = 'Tasks'  ORDER BY WedAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedAmFunction(rs.getString("wedAmFunction"));
                fillin.setWedAmLocation(rs.getString("wedAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedPmFunction,  Fillin.WedPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND WedPmAbsent IS Null AND NOT WedPmFunction = 'Tasks' ORDER BY WedPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedPmFunction(rs.getString("wedPmFunction"));
                fillin.setWedPmLocation(rs.getString("wedPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuAmFunction, Fillin.ThuAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND ThuAmAbsent IS Null AND NOT ThuAmFunction = 'Tasks' ORDER BY ThuAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuAmFunction(rs.getString("thuAmFunction"));
                fillin.setThuAmLocation(rs.getString("thuAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember, Fillin.ThuPmFunction,  Fillin.ThuPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND ThuPmAbsent IS Null AND NOT ThuPmFunction = 'Tasks' ORDER BY ThuPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuPmFunction(rs.getString("thuPmFunction"));
                fillin.setThuPmLocation(rs.getString("thuPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.FriAmFunction, Fillin.FriAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND FriAmAbsent IS Null AND NOT FriAmFunction = 'Tasks' ORDER BY FriAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriAmFunction(rs.getString("friAmFunction"));
                fillin.setFriAmLocation(rs.getString("friAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.FriPmFunction,  Fillin.FriPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND FriPmAbsent IS Null AND NOT FriPmFunction = 'Tasks' ORDER BY FriPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriPmFunction(rs.getString("friPmFunction"));
                fillin.setFriPmLocation(rs.getString("friPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMAbsentMon(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.MonAmAbsent, Fillin.MonPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND ( Fillin.MonAmAbsent = 'Absent' OR Fillin.MonPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setMonAmAbsent(rs.getString("monAmAbsent"));
                fillin.setMonPmAbsent(rs.getString("monPmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMAbsentTue(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.TueAmAbsent, Fillin.TuePmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND ( Fillin.TueAmAbsent = 'Absent' OR Fillin.TuePmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setTueAmAbsent(rs.getString("tueAmAbsent"));
                fillin.setTuePmAbsent(rs.getString("tuePmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMAbsentWed(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.WedAmAbsent, Fillin.WedPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND ( Fillin.WedAmAbsent = 'Absent' OR Fillin.WedPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setWedAmAbsent(rs.getString("wedAmAbsent"));
                fillin.setWedPmAbsent(rs.getString("wedPmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMAbsentThu(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.ThuAmAbsent, Fillin.ThuPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND ( Fillin.ThuAmAbsent = 'Absent' OR Fillin.ThuPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setThuAmAbsent(rs.getString("thuAmAbsent"));
                fillin.setThuPmAbsent(rs.getString("thuPmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMAbsentFri(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.FriAmAbsent, Fillin.FriPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND ( Fillin.FriAmAbsent = 'Absent' OR Fillin.FriPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setFriAmAbsent(rs.getString("friAmAbsent"));
                fillin.setFriPmAbsent(rs.getString("friPmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND MonAmFunction = 'Tasks' AND MonAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonAmTask(rs.getString("monAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND MonPmFunction = 'Tasks' AND MonPmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonPmTask(rs.getString("monPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TueAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND TueAmFunction = 'Tasks' AND TueAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTueAmTask(rs.getString("tueAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember,Fillin.TuePmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND TuePmFunction = 'Tasks' AND TuePmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTuePmTask(rs.getString("tuePmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND WedAmFunction = 'Tasks' AND WedAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedAmTask(rs.getString("wedAmTask"));

                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND WedPmFunction = 'Tasks' AND WedPmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedPmTask(rs.getString("wedPmTask"));

                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND ThuAmFunction = 'Tasks' AND ThuAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuAmTask(rs.getString("thuAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND ThuPmFunction = 'Tasks' AND ThuPmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuPmTask(rs.getString("thuPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.FriAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND FriAmFunction = 'Tasks' AND FriAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriAmTask(rs.getString("friAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.FriPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND FriPmFunction = 'Tasks' AND FriPmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriPmTask(rs.getString("friPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }


    public List<Fillin> getTableFillinVCMWeek(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Date FROM Date WHERE Date = ?;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setWeek(rs.getString("date"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTaskMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND MonAmFunction = 'Tasks' AND MonAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonAmTask(rs.getString("monAmTask"));

                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTaskMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember,  Fillin.MonPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND MonPmFunction = 'Tasks' AND MonPmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonPmTask(rs.getString("monPmTask"));

                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTaskTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TueAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND TueAmFunction = 'Tasks' AND TueAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTueAmTask(rs.getString("tueAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTaskTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember,  Fillin.TuePmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND TuePmFunction = 'Tasks' AND TuePmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTuePmTask(rs.getString("tuePmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTaskWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND  WedAmFunction = 'Tasks' AND WedAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedAmTask(rs.getString("wedAmTask"));

                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTaskWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND  WedPmFunction = 'Tasks' AND WedPmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedPmTask(rs.getString("wedPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTaskThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND ThuAmFunction = 'Tasks' AND ThuAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuAmTask(rs.getString("thuAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTaskThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember,  Fillin.ThuPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND ThuPmFunction = 'Tasks' AND ThuPmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuPmTask(rs.getString("thuPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTaskFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.FriAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND FriAmFunction = 'Tasks' AND FriAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriAmTask(rs.getString("friAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTaskFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.FriPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND FriPmFunction = 'Tasks' AND FriPmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriPmTask(rs.getString("friPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGAbsentMon(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.MonAmAbsent, Fillin.MonPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND ( Fillin.MonAmAbsent = 'Absent' OR Fillin.MonPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setMonAmAbsent(rs.getString("monAmAbsent"));
                fillin.setMonPmAbsent(rs.getString("monPmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGAbsentTue(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.TueAmAbsent, Fillin.TuePmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND ( Fillin.TueAmAbsent = 'Absent' OR Fillin.TuePmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setTueAmAbsent(rs.getString("tueAmAbsent"));
                fillin.setTuePmAbsent(rs.getString("tuePmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGAbsentWed(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.WedAmAbsent, Fillin.WedPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND ( Fillin.WedAmAbsent = 'Absent' OR Fillin.WedPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setWedAmAbsent(rs.getString("wedAmAbsent"));
                fillin.setWedPmAbsent(rs.getString("wedPmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGAbsentThu(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.ThuAmAbsent, Fillin.ThuPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND ( Fillin.ThuAmAbsent = 'Absent' OR Fillin.ThuPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setThuAmAbsent(rs.getString("thuAmAbsent"));
                fillin.setThuPmAbsent(rs.getString("thuPmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGAbsentFri(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.FriAmAbsent, Fillin.FriPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND ( Fillin.FriAmAbsent = 'Absent' OR Fillin.FriPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setFriAmAbsent(rs.getString("friAmAbsent"));
                fillin.setFriPmAbsent(rs.getString("friPmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGWeek(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Date FROM Date WHERE Date = ?;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setWeek(rs.getString("date"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinWeek(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT DISTINCT Week FROM Fillin WHERE Week = ? ; ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setWeek(rs.getString("week"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }



    public List<Fillin> getTableFillinMCFGMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmFunction,  Fillin.MonAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND MonAmAbsent IS Null AND NOT MonAmFunction = 'Tasks' ORDER BY MonAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonAmFunction(rs.getString("monAmFunction"));
                fillin.setMonAmLocation(rs.getString("monAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonPmFunction,  Fillin.MonPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND MonPmAbsent IS Null AND NOT MonPmFunction = 'Tasks' ORDER BY MonPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonPmFunction(rs.getString("monPmFunction"));
                fillin.setMonPmLocation(rs.getString("monPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TueAmFunction,  Fillin.TueAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND TueAmAbsent IS Null AND NOT TueAmFunction = 'Tasks' ORDER BY TueAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTueAmFunction(rs.getString("tueAmFunction"));
                fillin.setTueAmLocation(rs.getString("tueAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TuePmFunction,  Fillin.TuePmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND TuePmAbsent IS Null AND NOT TuePmFunction = 'Tasks' ORDER BY TuePmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTuePmFunction(rs.getString("tuePmFunction"));
                fillin.setTuePmLocation(rs.getString("tuePmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.WedAmFunction, Fillin.WedAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND WedAmAbsent IS Null AND NOT WedAmFunction = 'Tasks' ORDER BY WedAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedAmFunction(rs.getString("wedAmFunction"));
                fillin.setWedAmLocation(rs.getString("wedAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedPmFunction,  Fillin.WedPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND WedPmAbsent IS Null AND NOT WedPmFunction = 'Tasks' ORDER BY WedPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedPmFunction(rs.getString("wedPmFunction"));
                fillin.setWedPmLocation(rs.getString("wedPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuAmFunction, Fillin.ThuAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND ThuAmAbsent IS Null AND NOT ThuAmFunction = 'Tasks'ORDER BY ThuAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuAmFunction(rs.getString("thuAmFunction"));
                fillin.setThuAmLocation(rs.getString("thuAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember, Fillin.ThuPmFunction,  Fillin.ThuPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND ThuPmAbsent IS Null AND NOT ThuPmFunction = 'Tasks' ORDER BY ThuPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuPmFunction(rs.getString("thuPmFunction"));
                fillin.setThuPmLocation(rs.getString("thuPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.FriAmFunction, Fillin.FriAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND FriAmAbsent IS Null AND NOT FriAmFunction = 'Tasks' ORDER BY FriAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriAmFunction(rs.getString("friAmFunction"));
                fillin.setFriAmLocation(rs.getString("friAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.FriPmFunction,  Fillin.FriPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' AND FriPmAbsent IS Null AND NOT FriPmFunction = 'Tasks' ORDER BY FriPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriPmFunction(rs.getString("friPmFunction"));
                fillin.setFriPmLocation(rs.getString("friPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmFunction, Fillin.MonAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND MonAmAbsent IS Null AND NOT MonAmFunction = 'Tasks' ORDER BY MonAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonAmFunction(rs.getString("monAmFunction"));
                fillin.setMonAmLocation(rs.getString("monAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonPmFunction,  Fillin.MonPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND MonPmAbsent IS Null AND NOT MonPmFunction = 'Tasks' ORDER BY MonPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonPmFunction(rs.getString("monPmFunction"));
                fillin.setMonPmLocation(rs.getString("monPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.TueAmFunction, Fillin.TueAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND TueAmAbsent IS Null AND NOT TueAmFunction = 'Tasks' ORDER BY TueAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTueAmFunction(rs.getString("tueAmFunction"));
                fillin.setTueAmLocation(rs.getString("tueAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TuePmFunction,  Fillin.TuePmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND TuePmAbsent IS Null AND NOT TuePmFunction = 'Tasks' ORDER BY TuePmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTuePmFunction(rs.getString("tuePmFunction"));
                fillin.setTuePmLocation(rs.getString("tuePmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.WedAmFunction, Fillin.WedAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND WedAmAbsent IS Null AND NOT WedAmFunction = 'Tasks'ORDER BY WedAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedAmFunction(rs.getString("wedAmFunction"));
                fillin.setWedAmLocation(rs.getString("wedAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedPmFunction,  Fillin.WedPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND WedPmAbsent IS Null AND NOT WedPmFunction = 'Tasks' ORDER BY WedPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedPmFunction(rs.getString("wedPmFunction"));
                fillin.setWedPmLocation(rs.getString("wedPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuAmFunction, Fillin.ThuAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND ThuAmAbsent IS Null AND NOT ThuAmFunction = 'Tasks' ORDER BY ThuAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuAmFunction(rs.getString("thuAmFunction"));
                fillin.setThuAmLocation(rs.getString("thuAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember, Fillin.ThuPmFunction,  Fillin.ThuPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND ThuPmAbsent IS Null AND NOT ThuPmFunction = 'Tasks' ORDER BY ThuPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuPmFunction(rs.getString("thuPmFunction"));
                fillin.setThuPmLocation(rs.getString("thuPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.FriAmFunction, Fillin.FriAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND FriAmAbsent IS Null AND NOT FriAmFunction = 'Tasks' ORDER BY FriAmFunction ASC; ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriAmFunction(rs.getString("friAmFunction"));
                fillin.setFriAmLocation(rs.getString("friAmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.FriPmFunction,  Fillin.FriPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND FriPmAbsent IS Null AND NOT FriPmFunction = 'Tasks' ORDER BY FriPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriPmFunction(rs.getString("friPmFunction"));
                fillin.setFriPmLocation(rs.getString("friPmLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinAbsentMon(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.MonAmAbsent, Fillin.MonPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND ( Fillin.MonAmAbsent = 'Absent' OR Fillin.MonPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setMonAmAbsent(rs.getString("monAmAbsent"));
                fillin.setMonPmAbsent(rs.getString("monPmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinAbsentTue(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.TueAmAbsent, Fillin.TuePmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND ( Fillin.TueAmAbsent = 'Absent' OR Fillin.TuePmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setTueAmAbsent(rs.getString("tueAmAbsent"));
                fillin.setTuePmAbsent(rs.getString("tuePmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinAbsentWed(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.WedAmAbsent, Fillin.WedPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND ( Fillin.WedAmAbsent = 'Absent' OR Fillin.WedPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setWedAmAbsent(rs.getString("wedAmAbsent"));
                fillin.setWedPmAbsent(rs.getString("wedPmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinAbsentThu(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.ThuAmAbsent, Fillin.ThuPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND ( Fillin.ThuAmAbsent = 'Absent' OR Fillin.ThuPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setThuAmAbsent(rs.getString("thuAmAbsent"));
                fillin.setThuPmAbsent(rs.getString("thuPmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinAbsentFri(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.FriAmAbsent, Fillin.FriPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND ( Fillin.FriAmAbsent = 'Absent' OR Fillin.FriPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setDepartment(rs.getString("department"));
                fillin.setFriAmAbsent(rs.getString("friAmAbsent"));
                fillin.setFriPmAbsent(rs.getString("friPmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTaskMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND  MonAmFunction = 'Tasks' AND MonAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonAmTask(rs.getString("monAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTaskMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember,  Fillin.MonPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND MonPmFunction = 'Tasks' AND MonPmAbsent IS Null ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonPmTask(rs.getString("monPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTaskTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TueAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND TueAmFunction = 'Tasks' AND TueAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTueAmTask(rs.getString("tueAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTaskTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TuePmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND TuePmFunction = 'Tasks' AND TuePmAbsent IS Null ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTuePmTask(rs.getString("tuePmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTaskWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND WedAmFunction = 'Tasks' AND WedAmAbsent IS Null ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedAmTask(rs.getString("wedAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTaskWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember,  Fillin.WedPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND WedPmFunction = 'Tasks' AND WedPmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedPmTask(rs.getString("wedPmTask"));

                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTaskThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND ThuAmFunction = 'Tasks' AND ThuAmAbsent IS Null ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuAmTask(rs.getString("thuAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTaskThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND ThuPmFunction = 'Tasks' AND ThuPmAbsent IS Null  ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuPmTask(rs.getString("thuPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTaskFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.FriAmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND FriAmFunction = 'Tasks' AND FriAmAbsent IS Null ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriAmTask(rs.getString("friAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTaskFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.FriPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND FriPmFunction = 'Tasks' AND FriPmAbsent IS Null ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriPmTask(rs.getString("friPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getCheck(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Name , Department FROM StaffMembers WHERE NOT EXISTS ( SELECT IdStaffMember FROM Fillin WHERE StaffMembers.Id = Fillin.IdStaffMember AND Week = ?)");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setDepartment(rs.getString("department"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getCheckFunction(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS \n" +
                "(SELECT MonAmFunction,MonPmFunction, TueAmFunction,TuePmFunction, WedAmFunction,WedPmFunction, ThuAmFunction,ThuPmFunction, FriAmFunction,FriPmFunction \n" +
                "FROM Fillin WHERE \n" +
                "Functions.Namefunction = Fillin.MonAmFunction AND Functions.Namefunction  = Fillin.MonPmFunction AND \n" +
                "Functions.Namefunction  = Fillin.TueAmFunction AND Functions.Namefunction  = Fillin.TuePmFunction AND  \n" +
                "Functions.Namefunction  = Fillin.WedAmFunction AND Functions.Namefunction  = Fillin.WedPmFunction AND \n" +
                "Functions.Namefunction  = Fillin.ThuAmFunction AND Functions.Namefunction = Fillin.ThuPmFunction AND \n" +
                "Functions.Namefunction  = Fillin.FriAmFunction AND Functions.Namefunction  = Fillin.FriPmFunction AND \n" +
                "Week = ? ) ORDER BY Department ASC ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        Function function = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("nameFunction"));
                fillin.setDepartment(rs.getString("department"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getCheckFunctionMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS (SELECT MonAmFunction FROM Fillin WHERE Functions.Namefunction = Fillin.MonAmFunction AND Week = ?) ORDER BY Department ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        Function function = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("nameFunction"));
                fillin.setDepartment(rs.getString("department"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getCheckFunctionMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS (SELECT MonPmFunction FROM Fillin WHERE Functions.Namefunction = Fillin.MonPmFunction AND Week = ?  ) ORDER BY Department ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        Function function = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("nameFunction"));
                fillin.setDepartment(rs.getString("department"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getCheckFunctionTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS (SELECT TueAmFunction FROM Fillin WHERE Functions.Namefunction = Fillin.TueAmFunction AND Week = ?  ) ORDER BY Department ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        Function function = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("nameFunction"));
                fillin.setDepartment(rs.getString("department"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getCheckFunctionTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS (SELECT TuePmFunction FROM Fillin WHERE Functions.Namefunction = Fillin.TuePmFunction AND Week = ?  ) ORDER BY Department ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        Function function = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("nameFunction"));
                fillin.setDepartment(rs.getString("department"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getCheckFunctionWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS (SELECT WedAmFunction FROM Fillin WHERE Functions.Namefunction = Fillin.WedAmFunction AND Week = ?  ) ORDER BY Department ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        Function function = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("nameFunction"));
                fillin.setDepartment(rs.getString("department"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getCheckFunctionWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS (SELECT WedPmFunction FROM Fillin WHERE Functions.Namefunction = Fillin.WedPmFunction AND Week = ?  ) ORDER BY Department ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        Function function = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("nameFunction"));
                fillin.setDepartment(rs.getString("department"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getCheckFunctionThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS (SELECT ThuAmFunction FROM Fillin WHERE Functions.Namefunction = Fillin.ThuAmFunction AND Week = ?  ) ORDER BY Department ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        Function function = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("nameFunction"));
                fillin.setDepartment(rs.getString("department"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getCheckFunctionThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS (SELECT ThuPmFunction FROM Fillin WHERE Functions.Namefunction = Fillin.ThuPmFunction AND Week = ?  ) ORDER BY Department ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        Function function = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("nameFunction"));
                fillin.setDepartment(rs.getString("department"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getCheckFunctionFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS (SELECT FriAmFunction FROM Fillin WHERE Functions.Namefunction = Fillin.FriAmFunction AND Week = ?  ) ORDER BY Department ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        Function function = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("nameFunction"));
                fillin.setDepartment(rs.getString("department"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getCheckFunctionFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS (SELECT FriPmFunction FROM Fillin WHERE Functions.Namefunction = Fillin.FriPmFunction AND Week = ?  ) ORDER BY Department ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        Function function = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("nameFunction"));
                fillin.setDepartment(rs.getString("department"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }


    public List<Fillin> getAllDateName() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Date FROM Date");
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setNameDate(rs.getString("date"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getDateName() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Date FROM Date WHERE NOT EXISTS " +
                "( SELECT Week FROM Fillin WHERE Date.Date = Fillin.Week AND IdStaffMember = 1) ");
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setNameDate(rs.getString("date"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getDateNameId(int IdStaffMember) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Date FROM Date WHERE NOT EXISTS " +
                "( SELECT Week FROM Fillin WHERE Date.Date = Fillin.Week AND IdStaffMember = ?) ");
        statement.setInt(1, IdStaffMember);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setNameDate(rs.getString("date"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }


    public List<Fillin> getTableFillinLCMMonAmTask(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmFunction, Fillin.MonAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' AND MonAmAbsent IS Null ORDER BY MonAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonAmFunction(rs.getString("monAmFunction"));
                fillin.setMonAmLocation(rs.getString("monAmLgetAllfunctionLCMocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public Fillin getChangeMonday(int idStaffMember, String week, String monAmFunction, String monAmTask, String monAmLocation, String monAmAbsent, String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("UPDATE Fillin SET MonAmFunction = ?, MonAmTask = ?,MonAmLocation = ? ,MonAmAbsent = ?,MonPmFunction =  ?,MonPmTask = ?,MonPmLocation = ? ,MonPmAbsent =  ? WHERE IdStaffMember = ? AND Week =?");
        statement.setString(1, monAmFunction);
        statement.setString(2, monAmTask);
        statement.setString(3, monAmLocation);
        statement.setString(4, monAmAbsent);
        statement.setString(5, monPmFunction);
        statement.setString(6, monPmTask);
        statement.setString(7, monPmLocation);
        statement.setString(8, monPmAbsent);
        statement.setInt(9, idStaffMember);
        statement.setString(10, week);
        int rs = statement.executeUpdate();
        Fillin fillin = null;
        return fillin;
    }


    public Fillin getChangeTuesday(int idStaffMember, String week, String tueAmFunction, String tueAmTask, String tueAmLocation, String tueAmAbsent, String tuePmFunction, String tuePmTask, String tuePmLocation, String tuePmAbsent) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("UPDATE Fillin SET TueAmFunction = ?, TueAmTask = ?,TueAmLocation = ? ,TueAmAbsent = ?,TuePmFunction =  ?,TuePmTask = ?,TuePmLocation = ? ,TuePmAbsent =  ? WHERE IdStaffMember = ? AND Week =?");
        statement.setString(1, tueAmFunction);
        statement.setString(2, tueAmTask);
        statement.setString(3, tueAmLocation);
        statement.setString(4, tueAmAbsent);
        statement.setString(5, tuePmFunction);
        statement.setString(6, tuePmTask);
        statement.setString(7, tuePmLocation);
        statement.setString(8, tuePmAbsent);
        statement.setInt(9, idStaffMember);
        statement.setString(10, week);
        int rs = statement.executeUpdate();
        Fillin fillin = null;
        return fillin;
    }

    public Fillin getChangeWednesday(int idStaffMember, String week, String wedAmFunction, String wedAmTask, String wedAmLocation, String wedAmAbsent, String wedPmFunction, String wedPmTask, String wedPmLocation, String wedPmAbsent) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("UPDATE Fillin SET WedAmFunction = ?, WedAmTask = ?,WedAmLocation = ? ,WedAmAbsent = ?,WedPmFunction =  ?,WedPmTask = ?,WedPmLocation = ? ,WedPmAbsent =  ? WHERE IdStaffMember = ? AND Week =?");
        statement.setString(1, wedAmFunction);
        statement.setString(2, wedAmTask);
        statement.setString(3, wedAmLocation);
        statement.setString(4, wedAmAbsent);
        statement.setString(5, wedPmFunction);
        statement.setString(6, wedPmTask);
        statement.setString(7, wedPmLocation);
        statement.setString(8, wedPmAbsent);
        statement.setInt(9, idStaffMember);
        statement.setString(10, week);
        int rs = statement.executeUpdate();
        Fillin fillin = null;
        return fillin;
    }

    public Fillin getChangeThursday(int idStaffMember, String week, String thuAmFunction, String thuAmTask, String thuAmLocation, String thuAmAbsent, String thuPmFunction, String thuPmTask, String thuPmLocation, String thuPmAbsent) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("UPDATE Fillin SET ThuAmFunction = ?, ThuAmTask = ?,ThuAmLocation = ? ,ThuAmAbsent = ?,ThuPmFunction =  ?,ThuPmTask = ?,ThuPmLocation = ? ,ThuPmAbsent =  ? WHERE IdStaffMember = ? AND Week =?");
        statement.setString(1, thuAmFunction);
        statement.setString(2, thuAmTask);
        statement.setString(3, thuAmLocation);
        statement.setString(4, thuAmAbsent);
        statement.setString(5, thuPmFunction);
        statement.setString(6, thuPmTask);
        statement.setString(7, thuPmLocation);
        statement.setString(8, thuPmAbsent);
        statement.setInt(9, idStaffMember);
        statement.setString(10, week);
        int rs = statement.executeUpdate();
        Fillin fillin = null;
        return fillin;
    }

    public Fillin getChangeFriday(int idStaffMember, String week, String friAmFunction, String friAmTask, String friAmLocation, String friAmAbsent, String friPmFunction, String friPmTask, String friPmLocation, String friPmAbsent) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("UPDATE Fillin SET FriAmFunction = ?, FriAmTask = ?,FriAmLocation = ? ,FriAmAbsent = ?,FriPmFunction =  ?,FriPmTask = ?,FriPmLocation = ? ,FriPmAbsent =  ? WHERE IdStaffMember = ? AND Week =?");
        statement.setString(1, friAmFunction);
        statement.setString(2, friAmTask);
        statement.setString(3, friAmLocation);
        statement.setString(4, friAmAbsent);
        statement.setString(5, friPmFunction);
        statement.setString(6, friPmTask);
        statement.setString(7, friPmLocation);
        statement.setString(8, friPmAbsent);
        statement.setInt(9, idStaffMember);
        statement.setString(10, week);
        int rs = statement.executeUpdate();
        Fillin fillin = null;
        return fillin;
    }

    public Fillin getChangeFillinId(String nameMember, String week, String monAmFunction, String monAmTask, String monAmLocation, String monAmAbsent, String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent, String tueAmFunction, String tueAmTask, String tueAmLocation, String tueAmAbsent, String tuePmFunction, String tuePmTask, String tuePmLocation, String tuePmAbsent, String wedAmFunction, String wedAmTask, String wedAmLocation, String wedAmAbsent, String wedPmFunction, String wedPmTask, String wedPmLocation, String wedPmAbsent, String thuAmFunction, String thuAmTask, String thuAmLocation, String thuAmAbsent, String thuPmFunction, String thuPmTask, String thuPmLocation, String thuPmAbsent, String friAmFunction, String friAmTask, String friAmLocation, String friAmAbsent, String friPmFunction, String friPmTask, String friPmLocation, String friPmAbsent) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("UPDATE Fillin INNER JOIN StaffMembers ON Fillin.IdStaffMember = StaffMembers.Id SET MonAmFunction = ?, MonAmTask = ?,MonAmLocation = ? ,MonAmAbsent = ?,MonPmFunction =  ?,MonPmTask = ?,MonPmLocation = ? ,MonPmAbsent =  ?, TueAmFunction =  ?,TueAmTask = ?,TueAmLocation = ?,TueAmAbsent = ?,TuePmFunction = ?,TuePmTask =?,TuePmLocation = ?,TuePmAbsent = ?, WedAmFunction = ?,WedAmTask =?,WedAmLocation =?,WedAmAbsent =?,WedPmFunction = ?,WedPmTask =?,WedPmLocation = ?,WedPmAbsent =?, ThuAmFunction = ?,ThuAmTask =?,ThuAmLocation =?,ThuAmAbsent =?,ThuPmFunction = ?,ThuPmTask =?,ThuPmLocation = ?,ThuPmAbsent =?, FriAmFunction = ?,FriAmTask =?,FriAmLocation =?,FriAmAbsent =?,FriPmFunction = ?,FriPmTask =?,FriPmLocation = ?,FriPmAbsent =?   WHERE StaffMembers.Name = ? AND Week = ?;");
        statement.setString(1, monAmFunction);
        statement.setString(2, monAmTask);
        statement.setString(3, monAmLocation);
        statement.setString(4, monAmAbsent);
        statement.setString(5, monPmFunction);
        statement.setString(6, monPmTask);
        statement.setString(7, monPmLocation);
        statement.setString(8, monPmAbsent);
        statement.setString(9, tueAmFunction);
        statement.setString(10, tueAmTask);
        statement.setString(11, tueAmLocation);
        statement.setString(12, tueAmAbsent);
        statement.setString(13, tuePmFunction);
        statement.setString(14, tuePmTask);
        statement.setString(15, tuePmLocation);
        statement.setString(16, tuePmAbsent);
        statement.setString(17, wedAmFunction);
        statement.setString(18, wedAmTask);
        statement.setString(19, wedAmLocation);
        statement.setString(20, wedAmAbsent);
        statement.setString(21, wedPmFunction);
        statement.setString(22, wedPmTask);
        statement.setString(23, wedPmLocation);
        statement.setString(24, wedPmAbsent);
        statement.setString(25, thuAmFunction);
        statement.setString(26, thuAmTask);
        statement.setString(27, thuAmLocation);
        statement.setString(28, thuAmAbsent);
        statement.setString(29, thuPmFunction);
        statement.setString(30, thuPmTask);
        statement.setString(31, thuPmLocation);
        statement.setString(32, thuPmAbsent);
        statement.setString(33, friAmFunction);
        statement.setString(34, friAmTask);
        statement.setString(35, friAmLocation);
        statement.setString(36, friAmAbsent);
        statement.setString(37, friPmFunction);
        statement.setString(38, friPmTask);
        statement.setString(39, friPmLocation);
        statement.setString(40, friPmAbsent);
        statement.setString(41, nameMember);
        statement.setString(42, week);
        int rs = statement.executeUpdate();
        Fillin fillin = null;
        return fillin;
    }

    public Fillin getFillinFillinIDVCM(String nameMember, String week, String monAmFunction, String monAmTask, String monAmLocation, String monAmAbsent, String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent, String tueAmFunction, String tueAmTask, String tueAmLocation, String tueAmAbsent, String tuePmFunction, String tuePmTask, String tuePmLocation, String tuePmAbsent, String wedAmFunction, String wedAmTask, String wedAmLocation, String wedAmAbsent, String wedPmFunction, String wedPmTask, String wedPmLocation, String wedPmAbsent, String thuAmFunction, String thuAmTask, String thuAmLocation, String thuAmAbsent, String thuPmFunction, String thuPmTask, String thuPmLocation, String thuPmAbsent, String friAmFunction, String friAmTask, String friAmLocation, String friAmAbsent, String friPmFunction, String friPmTask, String friPmLocation, String friPmAbsent) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO Fillin (Id,IdStaffMember,Week, Department, MonAmFunction,MonAmTask, MonAmLocation, MonAmAbsent, MonPmFunction, MonPmTask, MonPmLocation, MonPmAbsent, TueAmFunction,TueAmTask, TueAmLocation, TueAmAbsent, TuePmFunction, TuePmTask, TuePmLocation, TuePmAbsent , WedAmFunction, WedAmTask, WedAmLocation, WedAmAbsent, WedPmFunction, WedPmTask, WedPmLocation, WedPmAbsent, ThuAmFunction,ThuAmTask, ThuAmLocation, ThuAmAbsent, ThuPmFunction, ThuPmTask, ThuPmLocation, ThuPmAbsent, FriAmFunction,FriAmTask, FriAmLocation, FriAmAbsent, FriPmFunction, FriPmTask, FriPmLocation, FriPmAbsent)VALUES (Null ,(SELECT Id FROM StaffMembers WHERE Name = ?),?, 'VCM',?, ?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?);");
        statement.setString(1, nameMember);
        statement.setString(2, week);
        statement.setString(3, monAmFunction);
        statement.setString(4, monAmTask);
        statement.setString(5, monAmLocation);
        statement.setString(6, monAmAbsent);
        statement.setString(7, monPmFunction);
        statement.setString(8, monPmTask);
        statement.setString(9, monPmLocation);
        statement.setString(10, monPmAbsent);
        statement.setString(11, tueAmFunction);
        statement.setString(12, tueAmTask);
        statement.setString(13, tueAmLocation);
        statement.setString(14, tueAmAbsent);
        statement.setString(15, tuePmFunction);
        statement.setString(16, tuePmTask);
        statement.setString(17, tuePmLocation);
        statement.setString(18, tuePmAbsent);
        statement.setString(19, wedAmFunction);
        statement.setString(20, wedAmTask);
        statement.setString(21, wedAmLocation);
        statement.setString(22, wedAmAbsent);
        statement.setString(23, wedPmFunction);
        statement.setString(24, wedPmTask);
        statement.setString(25, wedPmLocation);
        statement.setString(26, wedPmAbsent);
        statement.setString(27, thuAmFunction);
        statement.setString(28, thuAmTask);
        statement.setString(29, thuAmLocation);
        statement.setString(30, thuAmAbsent);
        statement.setString(31, thuPmFunction);
        statement.setString(32, thuPmTask);
        statement.setString(33, thuPmLocation);
        statement.setString(34, thuPmAbsent);
        statement.setString(35, friAmFunction);
        statement.setString(36, friAmTask);
        statement.setString(37, friAmLocation);
        statement.setString(38, friAmAbsent);
        statement.setString(39, friPmFunction);
        statement.setString(40, friPmTask);
        statement.setString(41, friPmLocation);
        statement.setString(42, friPmAbsent);
        int rs = statement.executeUpdate();
        Fillin fillin = null;
        return fillin;
    }

    public Fillin getFillinFillinIDLCM(String nameMember, String week, String monAmFunction, String monAmTask, String monAmLocation, String monAmAbsent, String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent, String tueAmFunction, String tueAmTask, String tueAmLocation, String tueAmAbsent, String tuePmFunction, String tuePmTask, String tuePmLocation, String tuePmAbsent, String wedAmFunction, String wedAmTask, String wedAmLocation, String wedAmAbsent, String wedPmFunction, String wedPmTask, String wedPmLocation, String wedPmAbsent, String thuAmFunction, String thuAmTask, String thuAmLocation, String thuAmAbsent, String thuPmFunction, String thuPmTask, String thuPmLocation, String thuPmAbsent, String friAmFunction, String friAmTask, String friAmLocation, String friAmAbsent, String friPmFunction, String friPmTask, String friPmLocation, String friPmAbsent) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO Fillin (Id,IdStaffMember,Week, Department, MonAmFunction,MonAmTask, MonAmLocation, MonAmAbsent, MonPmFunction, MonPmTask, MonPmLocation, MonPmAbsent, TueAmFunction,TueAmTask, TueAmLocation, TueAmAbsent, TuePmFunction, TuePmTask, TuePmLocation, TuePmAbsent , WedAmFunction, WedAmTask, WedAmLocation, WedAmAbsent, WedPmFunction, WedPmTask, WedPmLocation, WedPmAbsent, ThuAmFunction,ThuAmTask, ThuAmLocation, ThuAmAbsent, ThuPmFunction, ThuPmTask, ThuPmLocation, ThuPmAbsent, FriAmFunction,FriAmTask, FriAmLocation, FriAmAbsent, FriPmFunction, FriPmTask, FriPmLocation, FriPmAbsent) VALUES (Null ,(SELECT Id FROM StaffMembers WHERE Name = ?),?, 'LCM',?, ?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?)");
        statement.setString(1, nameMember);
        statement.setString(2, week);
        statement.setString(3, monAmFunction);
        statement.setString(4, monAmTask);
        statement.setString(5, monAmLocation);
        statement.setString(6, monAmAbsent);
        statement.setString(7, monPmFunction);
        statement.setString(8, monPmTask);
        statement.setString(9, monPmLocation);
        statement.setString(10, monPmAbsent);
        statement.setString(11, tueAmFunction);
        statement.setString(12, tueAmTask);
        statement.setString(13, tueAmLocation);
        statement.setString(14, tueAmAbsent);
        statement.setString(15, tuePmFunction);
        statement.setString(16, tuePmTask);
        statement.setString(17, tuePmLocation);
        statement.setString(18, tuePmAbsent);
        statement.setString(19, wedAmFunction);
        statement.setString(20, wedAmTask);
        statement.setString(21, wedAmLocation);
        statement.setString(22, wedAmAbsent);
        statement.setString(23, wedPmFunction);
        statement.setString(24, wedPmTask);
        statement.setString(25, wedPmLocation);
        statement.setString(26, wedPmAbsent);
        statement.setString(27, thuAmFunction);
        statement.setString(28, thuAmTask);
        statement.setString(29, thuAmLocation);
        statement.setString(30, thuAmAbsent);
        statement.setString(31, thuPmFunction);
        statement.setString(32, thuPmTask);
        statement.setString(33, thuPmLocation);
        statement.setString(34, thuPmAbsent);
        statement.setString(35, friAmFunction);
        statement.setString(36, friAmTask);
        statement.setString(37, friAmLocation);
        statement.setString(38, friAmAbsent);
        statement.setString(39, friPmFunction);
        statement.setString(40, friPmTask);
        statement.setString(41, friPmLocation);
        statement.setString(42, friPmAbsent);
        int rs = statement.executeUpdate();
        Fillin fillin = null;
        return fillin;
    }

    public Fillin getFillinFillinIDMCFG(String nameMember, String week, String monAmFunction, String monAmTask, String monAmLocation, String monAmAbsent, String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent, String tueAmFunction, String tueAmTask, String tueAmLocation, String tueAmAbsent, String tuePmFunction, String tuePmTask, String tuePmLocation, String tuePmAbsent, String wedAmFunction, String wedAmTask, String wedAmLocation, String wedAmAbsent, String wedPmFunction, String wedPmTask, String wedPmLocation, String wedPmAbsent, String thuAmFunction, String thuAmTask, String thuAmLocation, String thuAmAbsent, String thuPmFunction, String thuPmTask, String thuPmLocation, String thuPmAbsent, String friAmFunction, String friAmTask, String friAmLocation, String friAmAbsent, String friPmFunction, String friPmTask, String friPmLocation, String friPmAbsent) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO Fillin (Id,IdStaffMember,Week, Department, MonAmFunction,MonAmTask, MonAmLocation, MonAmAbsent, MonPmFunction, MonPmTask, MonPmLocation, MonPmAbsent, TueAmFunction,TueAmTask, TueAmLocation, TueAmAbsent, TuePmFunction, TuePmTask, TuePmLocation, TuePmAbsent , WedAmFunction, WedAmTask, WedAmLocation, WedAmAbsent, WedPmFunction, WedPmTask, WedPmLocation, WedPmAbsent, ThuAmFunction,ThuAmTask, ThuAmLocation, ThuAmAbsent, ThuPmFunction, ThuPmTask, ThuPmLocation, ThuPmAbsent, FriAmFunction,FriAmTask, FriAmLocation, FriAmAbsent, FriPmFunction, FriPmTask, FriPmLocation, FriPmAbsent)VALUES (Null ,(SELECT Id FROM StaffMembers WHERE Name = ?),?, 'MCFG',?, ?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?);");
        statement.setString(1, nameMember);
        statement.setString(2, week);
        statement.setString(3, monAmFunction);
        statement.setString(4, monAmTask);
        statement.setString(5, monAmLocation);
        statement.setString(6, monAmAbsent);
        statement.setString(7, monPmFunction);
        statement.setString(8, monPmTask);
        statement.setString(9, monPmLocation);
        statement.setString(10, monPmAbsent);
        statement.setString(11, tueAmFunction);
        statement.setString(12, tueAmTask);
        statement.setString(13, tueAmLocation);
        statement.setString(14, tueAmAbsent);
        statement.setString(15, tuePmFunction);
        statement.setString(16, tuePmTask);
        statement.setString(17, tuePmLocation);
        statement.setString(18, tuePmAbsent);
        statement.setString(19, wedAmFunction);
        statement.setString(20, wedAmTask);
        statement.setString(21, wedAmLocation);
        statement.setString(22, wedAmAbsent);
        statement.setString(23, wedPmFunction);
        statement.setString(24, wedPmTask);
        statement.setString(25, wedPmLocation);
        statement.setString(26, wedPmAbsent);
        statement.setString(27, thuAmFunction);
        statement.setString(28, thuAmTask);
        statement.setString(29, thuAmLocation);
        statement.setString(30, thuAmAbsent);
        statement.setString(31, thuPmFunction);
        statement.setString(32, thuPmTask);
        statement.setString(33, thuPmLocation);
        statement.setString(34, thuPmAbsent);
        statement.setString(35, friAmFunction);
        statement.setString(36, friAmTask);
        statement.setString(37, friAmLocation);
        statement.setString(38, friAmAbsent);
        statement.setString(39, friPmFunction);
        statement.setString(40, friPmTask);
        statement.setString(41, friPmLocation);
        statement.setString(42, friPmAbsent);
        int rs = statement.executeUpdate();
        Fillin fillin = null;
        return fillin;
    }

    public List<Fillin> getAllfunctionVCMMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.MonAmFunction AND Week = ? AND Department='VCM') " +
                "AND Department='VCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionVCMMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonPmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.MonPmFunction AND Week = ? AND Department='VCM') " +
                "AND Department='VCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionVCMTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT TueAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.TueAmFunction AND Week = ? AND Department='VCM') " +
                "AND Department='VCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionVCMTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT TuePmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.TuePmFunction AND Week = ? AND Department='VCM') " +
                "AND Department='VCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionVCMWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT WedAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.WedAmFunction AND Week = ? AND Department='VCM') " +
                "AND Department='VCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionVCMWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT WedPmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.WedPmFunction AND Week = ? AND Department='VCM') " +
                "AND Department='VCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionVCMThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT ThuAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.ThuAmFunction AND Week = ? AND Department='VCM') " +
                "AND Department='VCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionVCMThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT ThuPmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.ThuPmFunction AND Week = ? AND Department='VCM') " +
                "AND Department='VCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionVCMFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT FriAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.FriAmFunction AND Week = ? AND Department='VCM') " +
                "AND Department='VCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionVCMFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT FriPmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.FriPmFunction AND Week = ? AND Department='VCM') " +
                "AND Department='VCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionLCMMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.MonAmFunction AND Week = ? AND Department='LCM') " +
                "AND Department='LCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionLCMMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonPmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.MonPmFunction AND Week = ? AND Department='LCM') " +
                "AND Department='LCM' " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionLCMTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT TueAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.TueAmFunction AND Week = ? AND Department='LCM') " +
                "AND Department='LCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionLCMTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT TuePmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.TuePmFunction AND Week = ? AND Department='LCM')" +
                "AND Department='LCM' " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionLCMWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT WedAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.WedAmFunction AND Week = ? AND Department='LCM')" +
                "AND Department='LCM' " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionLCMWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT WedPmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.WedPmFunction AND Week = ? AND Department='LCM') " +
                "AND Department='LCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionLCMThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT ThuAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.ThuAmFunction AND Week = ? AND Department='LCM') " +
                "AND Department='LCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionLCMThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT ThuPmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.ThuPmFunction AND Week = ? AND Department='LCM')" +
                "AND Department='LCM' " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionLCMFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT FriAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.FriAmFunction AND Week = ? AND Department='LCM') " +
                "AND Department='LCM'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionLCMFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT FriPmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.FriPmFunction AND Week = ? AND Department='LCM')" +
                "AND Department='LCM' " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionMCFGMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.MonAmFunction AND Week = ? AND Department='MCFG') " +
                "AND Department='MCFG'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionMCFGMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonPmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.MonPmFunction AND Week = ? AND Department='MCFG') " +
                "AND Department='MCFG'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionMCFGTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT TueAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.TueAmFunction AND Week = ? AND Department='MCFG') " +
                "AND Department='MCFG'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionMCFGTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT TuePmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.TuePmFunction AND Week = ? AND Department='MCFG') " +
                "AND Department='MCFG'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionMCFGWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT WedAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.WedAmFunction AND Week = ? AND Department='MCFG') " +
                "AND Department='MCFG'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionMCFGWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT WedPmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.WedPmFunction AND Week = ? AND Department='MCFG') " +
                "AND Department='MCFG'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionMCFGThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT ThuAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.ThuAmFunction AND Week = ? AND Department='MCFG') " +
                "AND Department='MCFG'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionMCFGThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT ThuPmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.ThuPmFunction AND Week = ? AND Department='MCFG') " +
                "AND Department='MCFG'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionMCFGFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT FriAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.FriAmFunction AND Week = ? AND Department='MCFG') " +
                "AND Department='MCFG'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getAllfunctionMCFGFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT FriPmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.FriPmFunction AND Week = ? AND Department='MCFG') " +
                "AND Department='MCFG'" +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                fillin.setNamefunction(rs.getString("namefunction"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }
}
