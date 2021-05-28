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
public class Fillin3DAO {
    public List<Fillin> getTableFillinMCFGMonAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonAMFunction ='1L Tel (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGMonPmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonPMFunction ='1L Tel (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTueAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TueAMFunction ='1L Tel (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTuePmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TuePMFunction ='1L Tel (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGWedAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedAMFunction ='1L Tel (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGWedPmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedPMFunction ='1L Tel (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGThuAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuAMFunction ='1L Tel (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGThuPmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuPMFunction ='1L Tel (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGFriAmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriAMFunction ='1L Tel (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGFriPmTel(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriPMFunction ='1L Tel (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGMonAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonAMFunction ='1L Tel (2)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGMonPmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonPMFunction ='1L Tel (2)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTueAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TueAMFunction ='1L Tel (2)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTuePmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TuePMFunction ='1L Tel (2)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGWedAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedAMFunction ='1L Tel (2)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGWedPmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedPMFunction ='1L Tel (2)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGThuAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuAMFunction ='1L Tel (2)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGThuPmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuPMFunction ='1L Tel (2)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGFriAmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriAMFunction ='1L Tel (2)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGFriPmTelPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriPMFunction ='1L Tel (2)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGMonAmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonAMFunction ='1L Tel (3)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGMonPmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonPMFunction ='1L Tel (3)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTueAmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TueAMFunction ='1L Tel (3)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTuePmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TuePMFunction ='1L Tel (3)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGWedAmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedAMFunction ='1L Tel (3)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGWedPmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedPMFunction ='1L Tel (3)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGThuAmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuAMFunction ='1L Tel (3)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGThuPmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuPMFunction ='1L Tel (3)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGFriAmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriAMFunction ='1L Tel (3)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGFriPmTelPer3(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriPMFunction ='1L Tel (3)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGMonAmTelPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonAMFunction ='1L Tel (4)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGMonPmTelPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonPMFunction ='1L Tel (4)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTueAmTelPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TueAMFunction ='1L Tel (4)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTuePmTelPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TuePMFunction ='1L Tel (4)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGWedAmTelPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedAMFunction ='1L Tel (4)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGWedPmTelPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedPMFunction ='1L Tel (4)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGThuAmTelPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuAMFunction ='1L Tel (4)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGThuPmTelPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuPMFunction ='1L Tel (4)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGFriAmTelPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriAMFunction ='1L Tel (4)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGFriPmTelPer4(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName " +
                "INNER JOIN Functions ON Fillin.MonAmFunction = Functions.Namefunction\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriPMFunction ='1L Tel (4)' ");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGMonAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonAMFunction ='2L INC (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGMonPmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonPMFunction ='2L INC (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTueAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TueAMFunction ='2L INC (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTuePmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TuePMFunction ='2L INC (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGWedAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedAMFunction ='2L INC (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGWedPmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedPMFunction ='2L INC (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGThuAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuAMFunction ='2L INC (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGThuPmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuPMFunction ='2L INC (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGFriAmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriAMFunction ='2L INC (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGFriPmINCPer1(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriPMFunction ='2L INC (1)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGMonAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonAMFunction ='2L INC (2)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGMonPmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonPMFunction ='2L INC (2)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTueAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TueAMFunction ='2L INC (2)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTuePmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TuePMFunction ='2L INC (2)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGWedAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedAMFunction ='2L INC (2)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGWedPmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedPMFunction ='2L INC (2)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGThuAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuAMFunction ='2L INC (2)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGThuPmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuPMFunction ='2L INC (2)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGFriAmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriAMFunction ='2L INC (2)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGFriPmINCPer2(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriPMFunction ='2L INC (2)'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGMonAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonAMFunction ='2L SR'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGMonPmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonPMFunction ='2L SR'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTueAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TueAMFunction ='2L SR'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTuePmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TuePMFunction ='2L SR'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGWedAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedAMFunction ='2L SR'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGWedPmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedPMFunction ='2L SR'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGThuAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuAMFunction ='2L SR'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGThuPmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuPMFunction ='2L SR'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGFriAmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriAMFunction ='2L SR'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGFriPmSR(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriP" +
                "mLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriPMFunction ='2L SR'");
        statement.setString(1, week);
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

    public List<Fillin> getTableFillinMCFGTaskMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonAmFunction = 'Tasks' AND MonAmAbsent IS Null");
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

    public List<Fillin> getTableFillinMCFGTaskMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, MonPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.MonPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND MonPmFunction = 'Tasks' AND MonPmAbsent IS Null");
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

    public List<Fillin> getTableFillinMCFGTaskTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TueAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TueAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TueAmFunction = 'Tasks' AND TueAmAbsent IS Null");
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

    public List<Fillin> getTableFillinMCFGTaskTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, TuePmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.TuePmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND TuePmFunction = 'Tasks' AND TuePmAbsent IS Null");
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

    public List<Fillin> getTableFillinMCFGTaskWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedAmFunction = 'Tasks' AND WedAmAbsent IS Null");
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

    public List<Fillin> getTableFillinMCFGTaskWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, WedPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.WedPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND WedPmFunction = 'Tasks' AND WedPmAbsent IS Null");
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

    public List<Fillin> getTableFillinMCFGTaskThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuAmFunction = 'Tasks' AND ThuAmAbsent IS Null");
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

    public List<Fillin> getTableFillinMCFGTaskThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, ThuPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.ThuPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND ThuPmFunction = 'Tasks' AND ThuPmAbsent IS Null");
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

    public List<Fillin> getTableFillinMCFGTaskFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriAmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriAmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriAmFunction = 'Tasks' AND FriAmAbsent IS Null");
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

    public List<Fillin> getTableFillinMCFGTaskFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.Name, StaffMembers.AbbreviationName, FriPmLocation, Location.AbbreviationLocation FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id \n" +
                "INNER JOIN Location ON Fillin.FriPmLocation = Location.LocationName\n" +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND FriPmFunction = 'Tasks' AND FriPmAbsent IS Null");
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

    public List<Fillin> getTableFillinMCFGAbsentMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND Fillin.MonAmAbsent = 'Absent'");
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
    public List<Fillin> getTableFillinMCFGAbsentMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND Fillin.MonPmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinMCFGAbsentTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND Fillin.TueAmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinMCFGAbsentTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND Fillin.TuePmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinMCFGAbsentWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND Fillin.WedAmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinMCFGAbsentWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName " +
                "FROM Fillin INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND Fillin.WedPmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinMCFGAbsentThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND Fillin.ThuAmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinMCFGAbsentThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND Fillin.ThuPmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinMCFGAbsentFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND Fillin.FriAmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinMCFGAbsentFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT StaffMembers.AbbreviationName FROM Fillin " +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  " +
                "WHERE Week = ? AND Fillin.Department='MCFG' AND Fillin.FriPmAbsent = 'Absent'");
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

    public List<Fillin> getTableFillinMCFGAbsent(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT CONCAT (StaffMembers.AbbreviationName,'   ', MonAmAbsent) AS MonAmAbsent,   CONCAT (StaffMembers.AbbreviationName,'   ', MonPmAbsent) AS MonPmAbsent , \n" +
                "CONCAT (StaffMembers.AbbreviationName,'   ', TueAmAbsent) AS TueAmAbsent, CONCAT (StaffMembers.AbbreviationName,'   ', TuePmAbsent) AS TuePmAbsent,\n" +
                "CONCAT (StaffMembers.AbbreviationName,'   ', WedAmAbsent) AS WedAmAbsent, CONCAT (StaffMembers.AbbreviationName,'   ', WedPmAbsent) AS WedPmAbsent,\n" +
                "CONCAT (StaffMembers.AbbreviationName,'   ', ThuAmAbsent) AS ThuAmAbsent, CONCAT (StaffMembers.AbbreviationName,'   ', ThuPmAbsent) AS ThuPmAbsent ,\n" +
                "CONCAT (StaffMembers.AbbreviationName,'   ', FriAmAbsent) AS FriAmAbsent, CONCAT (StaffMembers.AbbreviationName,'   ', FriPmAbsent) AS FriPmAbsent\n" +
                "FROM Fillin \n" +
                "INNER JOIN  StaffMembers ON Fillin.IdStaffMember=StaffMembers.Id  \n" +
                "WHERE Week = ? AND Fillin.Department = 'MCFG' AND\n" +
                "(Fillin.MonAmAbsent = 'Absent' OR Fillin.MonPmAbsent = 'Absent' OR Fillin.TueAmAbsent = 'Absent' OR Fillin.TuePmAbsent = 'Absent'\n" +
                "OR Fillin.WedAmAbsent = 'Absent' OR Fillin.WedPmAbsent = 'Absent' OR Fillin.ThuAmAbsent = 'Absent' OR Fillin.ThuPmAbsent = 'Absent' \n" +
                "OR Fillin.FriAmAbsent = 'Absent' OR Fillin.FriPmAbsent = 'Absent' )\n");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        List<Fillin> fillins = new ArrayList<>();
        Fillin fillin = null;
        StaffMember staffMember = null;
        if (rs != null) {
            while (rs.next()) {
                fillin = new Fillin();
                staffMember = new StaffMember();
                fillin.setMonAmAbsent(rs.getString("MonAmAbsent"));
                fillin.setMonPmAbsent(rs.getString("MonPmAbsent"));
                fillin.setTueAmAbsent(rs.getString("TueAmAbsent"));
                fillin.setTuePmAbsent(rs.getString("TuePmAbsent"));
                fillin.setWedAmAbsent(rs.getString("WedAmAbsent"));
                fillin.setWedPmAbsent(rs.getString("WedPmAbsent"));
                fillin.setThuAmAbsent(rs.getString("ThuAmAbsent"));
                fillin.setThuPmAbsent(rs.getString("ThuAmAbsent"));
                fillin.setFriAmAbsent(rs.getString("FriAmAbsent"));
                fillin.setFriPmAbsent(rs.getString("FriAmAbsent"));
                fillins.add(fillin);
            }
        }
        return fillins;
    }


}
