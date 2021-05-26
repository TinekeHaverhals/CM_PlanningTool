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
public class Fillin2DAO {

    public List<Fillin> getTableFillinVCMMonAmMail(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id " +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonAMFunction ='1L mail'");
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

    public List<Fillin> getTableFillinVCMMonPmMail(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonPMFunction ='1L mail'");
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

    public List<Fillin> getTableFillinVCMTueAmMail(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TueAMFunction ='1L mail'");
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

    public List<Fillin> getTableFillinVCMTuePmMail(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TuePMFunction ='1L mail'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setName(rs.getString("name"));
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setTuePmLocation(rs.getString("tuePmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinVCMWedAmMail(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedAMFunction ='1L mail'");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                fillin.setName(rs.getString("name"));
                fillin.setAbbreviationName(rs.getString("abbreviationName"));
                fillin.setWedAmLocation(rs.getString("wedAmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinVCMWedPmMail(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedPMFunction ='1L mail'");
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
                fillin.setWedPmLocation(rs.getString("WedPmlocation"));
                fillin.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }

    public List<Fillin> getTableFillinVCMThuAmMail(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuAMFunction ='1L mail'");
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

    public List<Fillin> getTableFillinVCMThuPmMail(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuPMFunction ='1L mail'");
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

    public List<Fillin> getTableFillinVCMFriAmMail(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriAMFunction ='1L mail'");
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

    public List<Fillin> getTableFillinVCMFriPmMail(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriPMFunction ='1L mail'");
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

    public List<Fillin> getTableFillinVCMMonAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonAMFunction ='1L Tel1 (1)'");
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

    public List<Fillin> getTableFillinVCMMonPmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonPMFunction ='1L Tel1 (1)'");
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

    public List<Fillin> getTableFillinVCMTueAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TueAMFunction ='1L Tel1 (1)'");
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

    public List<Fillin> getTableFillinVCMTuePmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TuePMFunction ='1L Tel1 (1)' ");
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

    public List<Fillin> getTableFillinVCMWedAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedAMFunction ='1L Tel1 (1)'");
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

    public List<Fillin> getTableFillinVCMWedPmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedPMFunction ='1L Tel1 (1)' ");
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

    public List<Fillin> getTableFillinVCMThuAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuAMFunction ='1L Tel1 (1)' ");
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

    public List<Fillin> getTableFillinVCMThuPmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuPMFunction ='1L Tel1 (1)' ");
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

    public List<Fillin> getTableFillinVCMFriAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriAMFunction ='1L Tel1 (1)' ");
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

    public List<Fillin> getTableFillinVCMFriPmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriPMFunction ='1L Tel1 (1)' ");
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

    public List<Fillin> getTableFillinVCMMonAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonAMFunction ='1L Tel1 (2)'");
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

    public List<Fillin> getTableFillinVCMMonPmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonPMFunction ='1L Tel1 (2)'");
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

    public List<Fillin> getTableFillinVCMTueAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.TueAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TueAMFunction ='1L Tel1 (2)'");
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

    public List<Fillin> getTableFillinVCMTuePmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TuePMFunction ='1L Tel1 (2)' ");
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

    public List<Fillin> getTableFillinVCMWedAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedAMFunction ='1L Tel1 (2)'");
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

    public List<Fillin> getTableFillinVCMWedPmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedPMFunction ='1L Tel1 (2)' ");
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

    public List<Fillin> getTableFillinVCMThuAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuAMFunction ='1L Tel1 (2)' ");
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

    public List<Fillin> getTableFillinVCMThuPmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuPMFunction ='1L Tel1 (2)' ");
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

    public List<Fillin> getTableFillinVCMFriAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriAMFunction ='1L Tel1 (2)' ");
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

    public List<Fillin> getTableFillinVCMFriPmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriPMFunction ='1L Tel1 (2)' ");
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

    public List<Fillin> getTableFillinVCMMonAmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonAMFunction ='1L Tel1 (3)'");
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

    public List<Fillin> getTableFillinVCMMonPmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonPMFunction ='1L Tel1 (3)'");
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

    public List<Fillin> getTableFillinVCMTueAmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TueAMFunction ='1L Tel1 (3)'");
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

    public List<Fillin> getTableFillinVCMTuePmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TuePMFunction ='1L Tel1 (3)' ");
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

    public List<Fillin> getTableFillinVCMWedAmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedAMFunction ='1L Tel1 (3)'");
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

    public List<Fillin> getTableFillinVCMWedPmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedPMFunction ='1L Tel1 (3)' ");
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

    public List<Fillin> getTableFillinVCMThuAmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuAMFunction ='1L Tel1 (3)' ");
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

    public List<Fillin> getTableFillinVCMThuPmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuPMFunction ='1L Tel1 (3)' ");
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

    public List<Fillin> getTableFillinVCMFriAmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriAMFunction ='1L Tel1 (3)' ");
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

    public List<Fillin> getTableFillinVCMFriPmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriPMFunction ='1L Tel1 (3)' ");
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

    public List<Fillin> getTableFillinVCMMonAmTel2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonAMFunction ='1L Tel2 (1)'");
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

    public List<Fillin> getTableFillinVCMMonPmTel2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonPMFunction ='1L Tel2 (1)'");
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

    public List<Fillin> getTableFillinVCMTueAmTel2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TueAMFunction ='1L Tel2 (1)'");
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

    public List<Fillin> getTableFillinVCMTuePmTel2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TuePMFunction ='1L Tel2 (1)'");
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

    public List<Fillin> getTableFillinVCMWedAmTel2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedAMFunction ='1L Tel2 (1)'");
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

    public List<Fillin> getTableFillinVCMWedPmTel2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedPMFunction ='1L Tel2 (1)'");
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

    public List<Fillin> getTableFillinVCMThuAmTel2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuAMFunction ='1L Tel2 (1)'");
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

    public List<Fillin> getTableFillinVCMThuPmTel2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuPMFunction ='1L Tel2 (1)'");
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

    public List<Fillin> getTableFillinVCMFriAmTel2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriAMFunction ='1L Tel2 (1)'");
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

    public List<Fillin> getTableFillinVCMFriPmTel2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriPMFunction ='1L Tel2 (1)'");
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

    public List<Fillin> getTableFillinVCMMonAmTel2Per2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonAMFunction ='1L Tel2 (2)'");
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

    public List<Fillin> getTableFillinVCMMonPmTel2Per2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonPMFunction ='1L Tel2 (2)'");
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

    public List<Fillin> getTableFillinVCMTueAmTel2Per2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TueAMFunction ='1L Tel2 (2)'");
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

    public List<Fillin> getTableFillinVCMTuePmTel2Per2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TuePMFunction ='1L Tel2 (2)'");
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

    public List<Fillin> getTableFillinVCMWedAmTel2Per2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedAMFunction ='1L Tel2 (2)'");
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

    public List<Fillin> getTableFillinVCMWedPmTel2Per2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedPMFunction ='1L Tel2 (2)'");
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

    public List<Fillin> getTableFillinVCMThuAmTel2Per2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuAMFunction ='1L Tel2 (2)'");
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

    public List<Fillin> getTableFillinVCMThuPmTel2Per2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuPMFunction ='1L Tel2 (2)'");
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

    public List<Fillin> getTableFillinVCMFriAmTel2Per2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriAMFunction ='1L Tel2 (2)'");
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

    public List<Fillin> getTableFillinVCMFriPmTel2Per2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriPMFunction ='1L Tel2 (2)'");
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

    public List<Fillin> getTableFillinVCMMonAmZabbix(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonAMFunction ='2L INC Zabbix'");
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

    public List<Fillin> getTableFillinVCMMonPmZabbix(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonPMFunction ='2L INC Zabbix'");
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

    public List<Fillin> getTableFillinVCMTueAmZabbix(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TueAMFunction ='2L INC Zabbix'");
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

    public List<Fillin> getTableFillinVCMTuePmZabbix(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TuePMFunction ='2L INC Zabbix'");
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

    public List<Fillin> getTableFillinVCMWedAmZabbix(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedAMFunction ='2L INC Zabbix'");
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

    public List<Fillin> getTableFillinVCMWedPmZabbix(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedPMFunction ='2L INC Zabbix'");
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

    public List<Fillin> getTableFillinVCMThuAmZabbix(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuAMFunction ='2L INC Zabbix'");
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

    public List<Fillin> getTableFillinVCMThuPmZabbix(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuPMFunction ='2L INC Zabbix'");
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

    public List<Fillin> getTableFillinVCMFriAmZabbix(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriAMFunction ='2L INC Zabbix'");
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

    public List<Fillin> getTableFillinVCMFriPmZabbix(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriPMFunction ='2L INC Zabbix'");
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

    public List<Fillin> getTableFillinVCMMonAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonAMFunction ='2L INC (1)'");
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

    public List<Fillin> getTableFillinVCMMonPmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonPMFunction ='2L INC (1)'");
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

    public List<Fillin> getTableFillinVCMTueAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TueAMFunction ='2L INC (1)'");
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

    public List<Fillin> getTableFillinVCMTuePmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TuePMFunction ='2L INC (1)'");
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

    public List<Fillin> getTableFillinVCMWedAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedAMFunction ='2L INC (1)'");
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

    public List<Fillin> getTableFillinVCMWedPmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedPMFunction ='2L INC (1)'");
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

    public List<Fillin> getTableFillinVCMThuAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuAMFunction ='2L INC (1)'");
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

    public List<Fillin> getTableFillinVCMThuPmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuPMFunction ='2L INC (1)'");
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

    public List<Fillin> getTableFillinVCMFriAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriAMFunction ='2L INC (1)'");
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

    public List<Fillin> getTableFillinVCMFriPmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriPMFunction ='2L INC (1)'");
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

    public List<Fillin> getTableFillinVCMMonAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonAMFunction ='2L INC (2)'");
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

    public List<Fillin> getTableFillinVCMMonPmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonPMFunction ='2L INC (2)'");
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

    public List<Fillin> getTableFillinVCMTueAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TueAMFunction ='2L INC (2)'");
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

    public List<Fillin> getTableFillinVCMTuePmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TuePMFunction ='2L INC (2)'");
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

    public List<Fillin> getTableFillinVCMWedAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedAMFunction ='2L INC (2)'");
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

    public List<Fillin> getTableFillinVCMWedPmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedPMFunction ='2L INC (2)'");
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

    public List<Fillin> getTableFillinVCMThuAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuAMFunction ='2L INC (2)'");
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

    public List<Fillin> getTableFillinVCMThuPmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuPMFunction ='2L INC (2)'");
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

    public List<Fillin> getTableFillinVCMFriAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriAMFunction ='2L INC (2)'");
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

    public List<Fillin> getTableFillinVCMFriPmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriPMFunction ='2L INC (2)'");
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

    public List<Fillin> getTableFillinVCMMonAmINCPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonAMFunction ='2L INC (3)'");
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

    public List<Fillin> getTableFillinVCMMonPmINCPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonPMFunction ='2L INC (3)'");
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

    public List<Fillin> getTableFillinVCMTueAmINCPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TueAMFunction ='2L INC (3)'");
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

    public List<Fillin> getTableFillinVCMTuePmINCPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TuePMFunction ='2L INC (3)'");
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

    public List<Fillin> getTableFillinVCMWedAmINCPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedAMFunction ='2L INC (3)'");
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

    public List<Fillin> getTableFillinVCMWedPmINCPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedPMFunction ='2L INC (3)'");
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

    public List<Fillin> getTableFillinVCMThuAmINCPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuAMFunction ='2L INC (3)'");
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

    public List<Fillin> getTableFillinVCMThuPmINCPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuPMFunction ='2L INC (3)'");
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

    public List<Fillin> getTableFillinVCMFriAmINCPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriAMFunction ='2L INC (3)'");
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

    public List<Fillin> getTableFillinVCMFriPmINCPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriPMFunction ='2L INC (3)'");
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

    public List<Fillin> getTableFillinVCMMonAmINCPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonAMFunction ='2L INC (4)'");
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

    public List<Fillin> getTableFillinVCMMonPmINCPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonPMFunction ='2L INC (4)'");
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

    public List<Fillin> getTableFillinVCMTueAmINCPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TueAMFunction ='2L INC (4)'");
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

    public List<Fillin> getTableFillinVCMTuePmINCPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TuePMFunction ='2L INC (4)'");
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

    public List<Fillin> getTableFillinVCMWedAmINCPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedAMFunction ='2L INC (4)'");
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

    public List<Fillin> getTableFillinVCMWedPmINCPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedPMFunction ='2L INC (4)'");
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

    public List<Fillin> getTableFillinVCMThuAmINCPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuAMFunction ='2L INC (4)'");
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

    public List<Fillin> getTableFillinVCMThuPmINCPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuPMFunction ='2L INC (4)'");
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

    public List<Fillin> getTableFillinVCMFriAmINCPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriAMFunction ='2L INC (4)'");
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

    public List<Fillin> getTableFillinVCMFriPmINCPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriPMFunction ='2L INC (4)'");
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

    public List<Fillin> getTableFillinVCMMonAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonAMFunction ='2L SR (1)'");
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

    public List<Fillin> getTableFillinVCMMonPmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonPMFunction ='2L SR (1)'");
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

    public List<Fillin> getTableFillinVCMTueAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TueAMFunction ='2L SR (1)'");
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

    public List<Fillin> getTableFillinVCMTuePmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TuePMFunction ='2L SR (1)'");
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

    public List<Fillin> getTableFillinVCMWedAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedAMFunction ='2L SR (1)'");
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

    public List<Fillin> getTableFillinVCMWedPmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedPMFunction ='2L SR (1)'");
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

    public List<Fillin> getTableFillinVCMThuAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuAMFunction ='2L SR (1)'");
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

    public List<Fillin> getTableFillinVCMThuPmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuPMFunction ='2L SR (1)'");
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

    public List<Fillin> getTableFillinVCMFriAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriAMFunction ='2L SR (1)'");
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

    public List<Fillin> getTableFillinVCMFriPmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriP" +
                "mLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriPMFunction ='2L SR (1)'");
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

    public List<Fillin> getTableFillinVCMMonAmSRPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonAMFunction ='2L SR (2)'");
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

    public List<Fillin> getTableFillinVCMMonPmSRPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonPMFunction ='2L SR (2)'");
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

    public List<Fillin> getTableFillinVCMTueAmSRPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TueAMFunction ='2L SR (2)'");
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

    public List<Fillin> getTableFillinVCMTuePmSRPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TuePMFunction ='2L SR (2)'");
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

    public List<Fillin> getTableFillinVCMWedAmSRPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedAMFunction ='2L SR (2)'");
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

    public List<Fillin> getTableFillinVCMWedPmSRPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedPMFunction ='2L SR (2)'");
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

    public List<Fillin> getTableFillinVCMThuAmSRPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuAMFunction ='2L SR (2)'");
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

    public List<Fillin> getTableFillinVCMThuPmSRPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuPMFunction ='2L SR (2)'");
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

    public List<Fillin> getTableFillinVCMFriAmSRPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriAMFunction ='2L SR (2)'");
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

    public List<Fillin> getTableFillinVCMFriPmSRPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriP" +
                "mLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriPMFunction ='2L SR (2)'");
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

    public List<Fillin> getTableFillinVCMTaskMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonAmFunction = 'Tasks' AND MonAmAbsent IS Null");
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

    public List<Fillin> getTableFillinVCMTaskMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND MonPmFunction = 'Tasks' AND MonPmAbsent IS Null");
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

    public List<Fillin> getTableFillinVCMTaskTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TueAmFunction = 'Tasks' AND TueAmAbsent IS Null");
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

    public List<Fillin> getTableFillinVCMTaskTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND TuePmFunction = 'Tasks' AND TuePmAbsent IS Null");
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

    public List<Fillin> getTableFillinVCMTaskWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedAmFunction = 'Tasks' AND WedAmAbsent IS Null");
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

    public List<Fillin> getTableFillinVCMTaskWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND WedPmFunction = 'Tasks' AND WedPmAbsent IS Null");
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

    public List<Fillin> getTableFillinVCMTaskThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuAmFunction = 'Tasks' AND ThuAmAbsent IS Null");
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

    public List<Fillin> getTableFillinVCMTaskThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND ThuPmFunction = 'Tasks' AND ThuPmAbsent IS Null");
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

    public List<Fillin> getTableFillinVCMTaskFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriAmFunction = 'Tasks' AND FriAmAbsent IS Null");
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

    public List<Fillin> getTableFillinVCMTaskFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND FriPmFunction = 'Tasks' AND FriPmAbsent IS Null");
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

    public List<Fillin> getTableFillinVCMAbsent(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName, MonAmAbsent, MonPmAbsent, TueAmAbsent, TuePmAbsent, WedAmAbsent,WedPmAbsent, ThuAmAbsent, ThuPmAbsent,FriAmAbsent, FriPmAbsent\n" +
                "FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "WHERE Week = ? AND Fillin.Department='VCM' AND Fillin.MonAmAbsent = 'Absent' OR Fillin.MonPmAbsent = 'Absent'\n" +
                "OR Fillin.TueAmAbsent = 'Absent' OR Fillin.TuePmAbsent = 'Absent' OR Fillin.WedAmAbsent = 'Absent' OR Fillin.WedPmAbsent = 'Absent'\n" +
                "OR Fillin.ThuAmAbsent = 'Absent' OR Fillin.ThuPmAbsent = 'Absent' OR Fillin.FriAmAbsent = 'Absent' OR Fillin.FriPmAbsent = 'Absent'\n");
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

    public List<Fillin> getTableFillinVCMAbsentMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND Fillin.MonAmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinVCMAbsentMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND Fillin.MonPmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinVCMAbsentTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND Fillin.TueAmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinVCMAbsentTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND Fillin.TuePmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinVCMAbsentWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND Fillin.WedAmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinVCMAbsentWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName " +
                "FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND Fillin.WedPmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinVCMAbsentThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND Fillin.ThuAmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinVCMAbsentThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND Fillin.ThuPmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinVCMAbsentFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND Fillin.FriAmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinVCMAbsentFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='VCM' AND Fillin.FriPmAbsent = 'Absent'");
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