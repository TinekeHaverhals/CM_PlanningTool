package CM.Data;

import CM.Model.Fillin;
import CM.Model.StaffMember;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 23/05/21.
 */
@Repository
public class Fillin4DAO {

    public List<Fillin> getTableFillinLCMMonAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonAMFunction ='1L 7u30 (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonAmLocation(rs.getString("monAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMMonPmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonPMFunction ='1L 7u30 (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonPmLocation(rs.getString("monPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        } else {
            fillin = new Fillin();
            staffMember = new StaffMember();
            fillin.setName(rs.getString("name"));
            fillin.setAbbreviationName(rs.getString("abbreviationName"));
            fillin.setMonPmLocation(rs.getString("monPmlocation"));
            fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
            fillins.add(fillin);
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTueAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TueAMFunction ='1L 7u30 (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTueAmLocation(rs.getString("tueAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTuePmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TuePMFunction ='1L 7u30 (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTuePmLocation(rs.getString("tuePmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedAMFunction ='1L 7u30 (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedAmLocation(rs.getString("wedAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedPmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedPMFunction ='1L 7u30 (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedPmLocation(rs.getString("wedPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuAMFunction ='1L 7u30 (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuAmLocation(rs.getString("thuAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuPmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuPMFunction ='1L 7u30 (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuPmLocation(rs.getString("thuPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriAMFunction ='1L 7u30 (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriAmLocation(rs.getString("friAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriPmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriPMFunction ='1L 7u30 (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriPmLocation(rs.getString("friPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMMonAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonAMFunction ='1L 7u30 (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonAmLocation(rs.getString("monAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMMonPmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonPMFunction ='1L 7u30 (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonPmLocation(rs.getString("monPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTueAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TueAMFunction ='1L 7u30 (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTueAmLocation(rs.getString("tueAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTuePmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TuePMFunction ='1L 7u30 (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTuePmLocation(rs.getString("tuePmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedAMFunction ='1L 7u30 (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedAmLocation(rs.getString("wedAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedPmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedPMFunction ='1L 7u30 (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedPmLocation(rs.getString("wedPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuAMFunction ='1L 7u30 (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuAmLocation(rs.getString("thuAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuPmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuPMFunction ='1L 7u30 (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuPmLocation(rs.getString("thuPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriAMFunction ='1L 7u30 (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriAmLocation(rs.getString("friAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriPmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriPMFunction ='1L 7u30 (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriPmLocation(rs.getString("friPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMMonAmTel2Per(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonAMFunction ='1L 17u30'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonAmLocation(rs.getString("monAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMMonPmTel2Per(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonPMFunction ='1L 17u30'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonPmLocation(rs.getString("monPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTueAmTel2Per(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TueAMFunction ='1L 17u30'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTueAmLocation(rs.getString("tueAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTuePmTel2Per(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TuePMFunction ='1L 17u30'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTuePmLocation(rs.getString("tuePmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedAmTel2Per(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedAMFunction ='1L 17u30'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedAmLocation(rs.getString("wedAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedPmTel2Per(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedPMFunction ='1L 17u30'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedPmLocation(rs.getString("wedPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuAmTel2Per(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuAMFunction ='1L 17u30'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuAmLocation(rs.getString("thuAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuPmTel2Per(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuPMFunction ='1L 17u30'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuPmLocation(rs.getString("thuPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriAmTel2Per(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriAMFunction ='1L 17u30'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriAmLocation(rs.getString("friAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }
    public List<Fillin> getTableFillinLCMFriPmTel2Per(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriPMFunction ='1L 17u30'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriPmLocation(rs.getString("friPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }
    public List<Fillin> getTableFillinLCMMonAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonAMFunction ='2L INC (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonAmLocation(rs.getString("monAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMMonPmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonPMFunction ='2L INC (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonPmLocation(rs.getString("monPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTueAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TueAMFunction ='2L INC (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTueAmLocation(rs.getString("tueAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTuePmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TuePMFunction ='2L INC (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTuePmLocation(rs.getString("tuePmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedAMFunction ='2L INC (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedAmLocation(rs.getString("wedAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedPmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedPMFunction ='2L INC (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedPmLocation(rs.getString("wedPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuAMFunction ='2L INC (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuAmLocation(rs.getString("thuAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuPmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuPMFunction ='2L INC (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuPmLocation(rs.getString("thuPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriAMFunction ='2L INC (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriAmLocation(rs.getString("friAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriPmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriPMFunction ='2L INC (1)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriPmLocation(rs.getString("friPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMMonAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonAMFunction ='2L INC (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonAmLocation(rs.getString("monAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMMonPmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonPMFunction ='2L INC (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonPmLocation(rs.getString("monPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTueAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TueAMFunction ='2L INC (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTueAmLocation(rs.getString("tueAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTuePmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TuePMFunction ='2L INC (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTuePmLocation(rs.getString("tuePmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedAMFunction ='2L INC (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedAmLocation(rs.getString("wedAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedPmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedPMFunction ='2L INC (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedPmLocation(rs.getString("wedPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuAMFunction ='2L INC (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuAmLocation(rs.getString("thuAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuPmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuPMFunction ='2L INC (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuPmLocation(rs.getString("thuPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriAMFunction ='2L INC (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriAmLocation(rs.getString("friAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriPmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriPMFunction ='2L INC (2)'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriPmLocation(rs.getString("friPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }


    public List<Fillin> getTableFillinLCMMonAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonAMFunction ='2L SR'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonAmLocation(rs.getString("monAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMMonPmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonPMFunction ='2L SR'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonPmLocation(rs.getString("monPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTueAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TueAMFunction ='2L SR'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTueAmLocation(rs.getString("tueAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTuePmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TuePMFunction ='2L SR'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTuePmLocation(rs.getString("tuePmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedAMFunction ='2L SR'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedAmLocation(rs.getString("wedAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedPmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedPMFunction ='2L SR'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedPmLocation(rs.getString("wedPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuAMFunction ='2L SR'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuAmLocation(rs.getString("thuAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuPmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuPMFunction ='2L SR'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuPmLocation(rs.getString("thuPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriAMFunction ='2L SR'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriAmLocation(rs.getString("friAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriPmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriP" +
                "mLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriPMFunction ='2L SR'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriPmLocation(rs.getString("friPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMMonAmBalie(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonAMFunction ='Balie'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonAmLocation(rs.getString("monAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMMonPmBalie(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonPMFunction ='Balie'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonPmLocation(rs.getString("monPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTueAmBalie(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TueAMFunction ='Balie'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTueAmLocation(rs.getString("tueAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTuePmBalie(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TuePMFunction ='Balie'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTuePmLocation(rs.getString("tuePmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedAmBalie(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedAMFunction ='Balie'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedAmLocation(rs.getString("wedAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMWedPmBalie(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedPMFunction ='Balie'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedPmLocation(rs.getString("wedPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuAmBalie(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuAMFunction ='Balie'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuAmLocation(rs.getString("thuAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMThuPmBalie(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuPMFunction ='Balie'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuPmLocation(rs.getString("thuPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriAmBalie(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriAMFunction ='Balie'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriAmLocation(rs.getString("friAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMFriPmBalie(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriP" +
                "mLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriPMFunction ='Balie'");
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
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriPmLocation(rs.getString("friPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonAmFunction = 'Tasks' AND MonAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonAmTask(rs.getString("monAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND MonPmFunction = 'Tasks' AND MonPmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setMonPmTask(rs.getString("monPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TueAmFunction = 'Tasks' AND TueAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTueAmTask(rs.getString("tueAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND TuePmFunction = 'Tasks' AND TuePmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTuePmTask(rs.getString("tuePmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedAmFunction = 'Tasks' AND WedAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedAmTask(rs.getString("wedAmTask"));

                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND WedPmFunction = 'Tasks' AND WedPmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedPmTask(rs.getString("wedPmTask"));

                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuAmFunction = 'Tasks' AND ThuAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuAmTask(rs.getString("thuAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND ThuPmFunction = 'Tasks' AND ThuPmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setThuPmTask(rs.getString("thuPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriAmFunction = 'Tasks' AND FriAmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriAmTask(rs.getString("friAmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMTaskFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='LCM' AND FriPmFunction = 'Tasks' AND FriPmAbsent IS Null");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setFriPmTask(rs.getString("friPmTask"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMAbsentMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='LCM' AND Fillin.MonAmAbsent = 'Absent'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }
    public List<Fillin> getTableFillinLCMAbsentMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='LCM' AND Fillin.MonPmAbsent = 'Absent'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMAbsentTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='LCM' AND Fillin.TueAmAbsent = 'Absent'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMAbsentTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='LCM' AND Fillin.TuePmAbsent = 'Absent'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMAbsentWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='LCM' AND Fillin.WedAmAbsent = 'Absent'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMAbsentWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName " +
                "FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='LCM' AND Fillin.WedPmAbsent = 'Absent'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMAbsentThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='LCM' AND Fillin.ThuAmAbsent = 'Absent'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMAbsentThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='LCM' AND Fillin.ThuPmAbsent = 'Absent'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMAbsentFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='LCM' AND Fillin.FriAmAbsent = 'Absent'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinLCMAbsentFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='LCM' AND Fillin.FriPmAbsent = 'Absent'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

}
