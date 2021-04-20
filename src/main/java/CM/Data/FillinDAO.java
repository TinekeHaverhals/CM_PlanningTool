package CM.Data;

import CM.Model.Fillin;
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



    public List<Fillin> getTableFillin() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT MonAmFunction,MonAmTask, MonAmLocation, MonPmFunction,MonPmTask, MonPmLocation, TueAmFunction, TueAmTask, TueAmLocation, TuePmFunction, TuePmTask, TuePmLocation, WedAmFunction, WedAmTask, WedAmLocation, WedPmFunction, WedPmTask, WedPmLocation, ThuAmFunction, ThuAmTask, ThuAmLocation, ThuPmFunction, ThuPmTask, ThuPmLocation, FriAmFunction, FriAmTask, FriAmLocation, FriPmFunction, FriPmTask, FriPmLocation FROM Fillin");
        List<Fillin> fillins= new ArrayList<>();
        Fillin fillin = null;
        if (rs!= null){
            while (rs.next()){
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
        List<Fillin> fillins= new ArrayList<>();
        List<StaffMember> staffMembers = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs!= null){
            while (rs.next()){
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
        List<Fillin> fillins= new ArrayList<>();
        Fillin fillin = null;
        if (rs!= null){
            while (rs.next()){
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
        List<Fillin> fillins= new ArrayList<>();
        Fillin fillin = null;
        if (rs!= null){
            while (rs.next()){
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

    public Fillin getSearchOwnDate(String week, int idStaffMember ) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT MonAmFunction,MonAmTask, MonAmLocation, MonAmAbsent, MonPmFunction,MonPmTask, MonPmLocation,MonPmAbsent, TueAmFunction, TueAmTask, TueAmLocation, TueAmAbsent, TuePmFunction, TuePmTask, TuePmLocation,TuePmAbsent, WedAmFunction, WedAmTask, WedAmLocation, WedAmAbsent,WedPmFunction, WedPmTask, WedPmLocation, WedPmAbsent,ThuAmFunction, ThuAmTask, ThuAmLocation, ThuAmAbsent,ThuPmFunction, ThuPmTask, ThuPmLocation , ThuPmAbsent,FriAmFunction, FriAmTask, FriAmLocation,FriAmAbsent, FriPmFunction, FriPmTask, FriPmLocation, FriPmAbsent FROM Fillin WHERE Week = ? AND IdStaffMember= ?;");
        statement.setString(1, week);
        statement.setInt(2, idStaffMember);
        ResultSet rs = statement.executeQuery();
        Fillin fillin= null;
        if (rs!= null) {
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
        Fillin fillin= null;
        StaffMember staffMember= null;
        if (rs!= null) {
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
        PreparedStatement statement = connection.prepareStatement("SELECT  Fillin.Week, IdStaffMember,MonAmAbsent,MonPmAbsent, TueAmAbsent,TuePmAbsent, WedAmAbsent, WedPmAbsent,ThuAmAbsent , ThuPmAbsent,FriAmAbsent, FriPmAbsent FROM Fillin INNER JOIN  Date ON Fillin.Week= Date.Date WHERE  MonthBegin = ? AND IdStaffMember = ? AND( MonAmAbsent = 'Absent' OR  MonPmAbsent = 'Absent' OR TueAmAbsent = 'Absent' OR TuePmAbsent = 'Absent' OR WedAmAbsent = 'Absent' OR WedPmAbsent = 'Absent' OR ThuAmAbsent= 'Absent' OR ThuPmAbsent = 'Absent' OR FriAmAbsent= 'Absent' OR FriPmAbsent= 'Absent')");
        statement.setString(1, month);
        statement.setInt(2, idStaffMember);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        if (rs!= null) {
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
        if (rs!= null) {
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
        PreparedStatement statement = connection.prepareStatement("SELECT  Fillin.Week,Fillin.IdStaffMember,StaffMembers.Name, Fillin.Department, MonAmAbsent,MonPmAbsent, TueAmAbsent,TuePmAbsent, WedAmAbsent, WedPmAbsent,ThuAmAbsent , ThuPmAbsent,FriAmAbsent, FriPmAbsent FROM Fillin INNER JOIN  Date ON Fillin.Week= Date.Date INNER JOIN StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE  MonthBegin = ?  AND( MonAmAbsent = 'Absent' OR  MonPmAbsent = 'Absent' OR TueAmAbsent = 'Absent' OR TuePmAbsent = 'Absent' OR WedAmAbsent = 'Absent' OR WedPmAbsent = 'Absent' OR ThuAmAbsent= 'Absent' OR ThuPmAbsent = 'Absent' OR FriAmAbsent= 'Absent' OR FriPmAbsent= 'Absent') ");
        statement.setString(1, month);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        List<StaffMember> staffMembers = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember = null;
        if (rs!= null) {
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
    public  List<Fillin> getSearchAllDataAbsentDepartment(String week, String department) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Fillin.Week,Fillin.IdStaffMember, Name,Fillin.Department, MonAmAbsent,MonPmAbsent, TueAmAbsent,TuePmAbsent, WedAmAbsent, WedPmAbsent, ThuAmAbsent, ThuPmAbsent,FriAmAbsent,  FriPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  WHERE Week =? AND Fillin.Department= ? AND( MonAmAbsent = 'Absent' OR  MonPmAbsent = 'Absent' OR TueAmAbsent = 'Absent' OR TuePmAbsent = 'Absent' OR WedAmAbsent = 'Absent' OR WedPmAbsent = 'Absent' OR ThuAmAbsent= 'Absent' OR ThuPmAbsent = 'Absent' OR FriAmAbsent= 'Absent' OR FriPmAbsent= 'Absent')");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        List<StaffMember> staffMembers = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs!= null) {
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
        PreparedStatement statement = connection.prepareStatement("SELECT Fillin.Week,Fillin.IdStaffMember,StaffMembers.Name, Fillin.Department, MonAmAbsent,MonPmAbsent, TueAmAbsent,TuePmAbsent, WedAmAbsent, WedPmAbsent,ThuAmAbsent , ThuPmAbsent,FriAmAbsent, FriPmAbsent FROM Fillin INNER JOIN  Date ON Fillin.Week= Date.Date INNER JOIN StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE  MonthBegin = ? AND Fillin.Department= ? AND( MonAmAbsent = 'Absent' OR  MonPmAbsent = 'Absent' OR TueAmAbsent = 'Absent' OR TuePmAbsent = 'Absent' OR WedAmAbsent = 'Absent' OR WedPmAbsent = 'Absent' OR ThuAmAbsent= 'Absent' OR ThuPmAbsent = 'Absent' OR FriAmAbsent= 'Absent' OR FriPmAbsent= 'Absent');");
        statement.setString(1, month);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        List<StaffMember> staffMembers = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember = null;
        if (rs!= null) {
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, MonAmFunction,MonAmTask, MonAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ? ORDER BY MonAmFunction ASC;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        if (rs!= null) {
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, MonPmFunction,MonPmTask, MonPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ? ORDER BY MonPmFunction ASC;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        if (rs!= null) {
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, TueAmFunction,TueAmTask, TueAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ? ORDER BY TueAmFunction ASC;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        if (rs!= null) {
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, TuePmFunction,TuePmTask, TuePmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ? ORDER BY TuePmFunction ASC;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        if (rs!= null) {
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, WedAmFunction,WedAmTask, WedAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ?  ORDER BY WedAmFunction ASC;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        if (rs!= null) {
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, WedPmFunction,WedPmTask, WedPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ? ORDER BY WedPmFunction ASC;;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        if (rs!= null) {
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, ThuAmFunction,ThuAmTask, ThuAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ? ORDER BY ThuAmFunction ASC;;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        if (rs!= null) {
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, ThuPmFunction,ThuPmTask, ThuPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ? ORDER BY ThuPmFunction ASC;;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        if (rs!= null) {
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, FriAmFunction,FriAmTask, FriAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ? ORDER BY FriAmFunction ASC;;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        if (rs!= null) {
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, FriPmFunction,FriPmTask, FriPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?  AND Fillin.Department = ? ORDER BY FriPmFunction ASC;;");
        statement.setString(1, week);
        statement.setString(2, department);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        if (rs!= null) {
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

    public List<Fillin> getTableFillinLCMMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmFunction, Fillin.MonAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' ORDER BY MonAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonPmFunction,  Fillin.MonPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' ORDER BY MonPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.TueAmFunction, Fillin.TueAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' ORDER BY TueAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TuePmFunction,  Fillin.TuePmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' ORDER BY TuePmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.WedAmFunction, Fillin.WedAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' ORDER BY WedAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedPmFunction,  Fillin.WedPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' ORDER BY WedPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuAmFunction, Fillin.ThuAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' ORDER BY ThuAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember, Fillin.ThuPmFunction,  Fillin.ThuPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' ORDER BY ThuPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.FriAmFunction, Fillin.FriAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' ORDER BY FriAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.FriPmFunction,  Fillin.FriPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM' ORDER BY FriPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        if (rs!= null){
            while (rs.next()){
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
        if (rs!= null){
            while (rs.next()){
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
        if (rs!= null){
            while (rs.next()){
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
        if (rs!= null){
            while (rs.next()){
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
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinLCMTaskMon(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmTask, Fillin.MonPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonAmTask(rs.getString("monAmTask"));
                fillin.setMonPmTask(rs.getString("monPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskTue(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TueAmTask, Fillin.TuePmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTueAmTask(rs.getString("tueAmTask"));
                fillin.setTuePmTask(rs.getString("tuePmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskWed(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedAmTask,  Fillin.WedPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedAmTask(rs.getString("wedAmTask"));
                fillin.setWedPmTask(rs.getString("wedPmTask"));

                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskThu(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuAmTask, Fillin.ThuPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuAmTask(rs.getString("thuAmTask"));
                fillin.setThuPmTask(rs.getString("thuPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskFri(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.FriAmTask,Fillin.FriPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='LCM'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriAmTask(rs.getString("friAmTask"));
                fillin.setFriPmTask(rs.getString("friPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinVCMTaskMon(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmTask, Fillin.MonPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonAmTask(rs.getString("monAmTask"));
                fillin.setMonPmTask(rs.getString("monPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinVCMTaskTue(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TueAmTask, Fillin.TuePmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTueAmTask(rs.getString("tueAmTask"));
                fillin.setTuePmTask(rs.getString("tuePmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinVCMTaskWed(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedAmTask,  Fillin.WedPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedAmTask(rs.getString("wedAmTask"));
                fillin.setWedPmTask(rs.getString("wedPmTask"));

                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinVCMTaskThu(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuAmTask, Fillin.ThuPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuAmTask(rs.getString("thuAmTask"));
                fillin.setThuPmTask(rs.getString("thuPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinVCMTaskFri(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.FriAmTask,Fillin.FriPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriAmTask(rs.getString("friAmTask"));
                fillin.setFriPmTask(rs.getString("friPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }
    public List<Fillin> getTableFillinVCMAbsentMon(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.MonAmAbsent, Fillin.MonPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' AND ( Fillin.MonAmAbsent = 'Absent' OR Fillin.MonPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinVCMAbsentTue(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.TueAmAbsent, Fillin.TuePmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' AND ( Fillin.TueAmAbsent = 'Absent' OR Fillin.TuePmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinVCMAbsentWed(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.WedAmAbsent, Fillin.WedPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' AND ( Fillin.WedAmAbsent = 'Absent' OR Fillin.WedPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinVCMAbsentThu(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.ThuAmAbsent, Fillin.ThuPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' AND ( Fillin.ThuAmAbsent = 'Absent' OR Fillin.ThuPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinVCMAbsentFri(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.Department,Fillin.FriAmAbsent, Fillin.FriPmAbsent FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' AND ( Fillin.FriAmAbsent = 'Absent' OR Fillin.FriPmAbsent = 'Absent')");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinVCMMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmFunction, Fillin.MonAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' ORDER BY MonAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinVCMMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonPmFunction,  Fillin.MonPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' ORDER BY MonPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinVCMTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.TueAmFunction, Fillin.TueAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' ORDER BY TueAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinVCMTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TuePmFunction,  Fillin.TuePmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' ORDER BY TuePmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinVCMWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.WedAmFunction, Fillin.WedAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' ORDER BY WedAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinVCMWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedPmFunction,  Fillin.WedPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' ORDER BY WedPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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

    public List<Fillin> getTableFillinVCMThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuAmFunction, Fillin.ThuAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' ORDER BY ThuAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinVCMThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember, Fillin.ThuPmFunction,  Fillin.ThuPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' ORDER BY ThuPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinVCMFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.FriAmFunction, Fillin.FriAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' ORDER BY FriAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinVCMFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.FriPmFunction,  Fillin.FriPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='VCM' ORDER BY FriPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinMCFGTaskMon(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmTask, Fillin.MonPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                staffMember.setAbbreviationName(rs.getString("Name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonAmTask(rs.getString("monAmTask"));
                fillin.setMonPmTask(rs.getString("monPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTaskTue(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TueAmTask, Fillin.TuePmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTueAmTask(rs.getString("tueAmTask"));
                fillin.setTuePmTask(rs.getString("tuePmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTaskWed(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedAmTask,  Fillin.WedPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedAmTask(rs.getString("wedAmTask"));
                fillin.setWedPmTask(rs.getString("wedPmTask"));

                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTaskThu(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuAmTask, Fillin.ThuPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuAmTask(rs.getString("thuAmTask"));
                fillin.setThuPmTask(rs.getString("thuPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinMCFGTaskFri(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.FriAmTask,Fillin.FriPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriAmTask(rs.getString("friAmTask"));
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
        if (rs!= null){
            while (rs.next()){
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
        if (rs!= null){
            while (rs.next()){
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
        if (rs!= null){
            while (rs.next()){
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
        if (rs!= null){
            while (rs.next()){
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
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinMCFGMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmFunction, Fillin.MonAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' ORDER BY MonAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonPmFunction,  Fillin.MonPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' ORDER BY MonPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TueAmFunction,  Fillin.TueAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' ORDER BY TueAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TuePmFunction,  Fillin.TuePmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' ORDER BY TuePmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.WedAmFunction, Fillin.WedAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' ORDER BY WedAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedPmFunction,  Fillin.WedPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' ORDER BY WedPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuAmFunction, Fillin.ThuAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' ORDER BY ThuAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember, Fillin.ThuPmFunction,  Fillin.ThuPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' ORDER BY ThuPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.FriAmFunction, Fillin.FriAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' ORDER BY FriAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.FriPmFunction,  Fillin.FriPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? AND Fillin.Department='MCFG' ORDER BY FriPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmFunction, Fillin.MonAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? ORDER BY MonAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonPmFunction,  Fillin.MonPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? ORDER BY MonPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.TueAmFunction, Fillin.TueAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? ORDER BY TueAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TuePmFunction,  Fillin.TuePmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? ORDER BY TuePmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.WedAmFunction, Fillin.WedAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? ORDER BY WedAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedPmFunction,  Fillin.WedPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? ORDER BY WedPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuAmFunction, Fillin.ThuAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? ORDER BY ThuAmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember, Fillin.ThuPmFunction,  Fillin.ThuPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? ORDER BY ThuPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.FriAmFunction, Fillin.FriAmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? ORDER BY FriAmFunction ASC; ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, Fillin.IdStaffMember,Fillin.FriPmFunction,  Fillin.FriPmLocation FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? ORDER BY FriPmFunction ASC;");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
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
        if (rs!= null){
            while (rs.next()){
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
        if (rs!= null){
            while (rs.next()){
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
        if (rs!= null){
            while (rs.next()){
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
        if (rs!= null){
            while (rs.next()){
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
        if (rs!= null){
            while (rs.next()){
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
    public List<Fillin> getTableFillinTaskMon(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.MonAmTask, Fillin.MonPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setMonAmTask(rs.getString("monAmTask"));
                fillin.setMonPmTask(rs.getString("monPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTaskTue(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.TueAmTask, Fillin.TuePmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ?");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setTueAmTask(rs.getString("tueAmTask"));
                fillin.setTuePmTask(rs.getString("tuePmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTaskWed(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.WedAmTask,  Fillin.WedPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setWedAmTask(rs.getString("wedAmTask"));
                fillin.setWedPmTask(rs.getString("wedPmTask"));

                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTaskThu(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.ThuAmTask, Fillin.ThuPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setThuAmTask(rs.getString("thuAmTask"));
                fillin.setThuPmTask(rs.getString("thuPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinTaskFri(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name,Fillin.IdStaffMember, Fillin.FriAmTask,Fillin.FriPmTask FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id WHERE Week = ? ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setIdStaffMember(rs.getInt("IdStaffMember"));
                fillin.setFriAmTask(rs.getString("friAmTask"));
                fillin.setFriPmTask(rs.getString("friPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getCheck(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Id, StaffMembers.Name, StaffMembers.Department FROM Fillin INNER JOIN   StaffMembers ON Fillin.IdStaffMember != StaffMembers.Id WHERE Week = ? ");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin= null;
        StaffMember staffMember;
        if (rs!= null){
            while (rs.next()){
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setName(rs.getString("name"));
                fillin.setDepartment(rs.getString("department"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

}
