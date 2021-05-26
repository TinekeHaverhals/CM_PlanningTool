package CM.Data;

import CM.Model.*;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Tineke Haverhals
 * 26/03/21.
 */
@Repository
public class FunctionDAO {

    public List<Function> getAllfunction() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Department, Namefunction FROM Functions ORDER BY Department ASC");
        List<Function> functions = new ArrayList<>();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setDepartment(rs.getString("department"));
                function.setNamefunction(rs.getString("namefunction"));
                functions.add(function);
            }
        }
        return functions;
    }

    public List<Function> getAllfunctionVCM() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT NameFunction FROM Functions WHERE Department = 'VCM';");
        List<Function> functionVCMs = new ArrayList<>();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));
                functionVCMs.add(function);
            }
        }
        return functionVCMs;
    }

    public List<Function> getAllfunctionMCFG() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT NameFunction FROM Functions WHERE Department = 'MCFG';");
        List<Function> functionMCFGs = new ArrayList<>();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));
                functionMCFGs.add(function);
            }
        }
        return functionMCFGs;
    }
    public Function getAddFunction(String department, String namefunction) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO Functions (Id, Department, NameFunction) VALUES (null, ?, ?)");
        statement.setString(1, department);
        statement.setString(2, namefunction);
        int rs = statement.executeUpdate();
        Function function = null;
        return function;
    }

    public Function getdeleteFunction (String department, String namefunction) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM Functions Where Department = ? AND Namefunction = ?");
        statement.setString(1, department);
        statement.setString(2, namefunction);
        int rs = statement.executeUpdate();
        Function function = null;
        return function;
    }

    public Function getAllfunctionLCMMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.MonAmFunction AND Week = ? AND Department='LCM') " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));
            }
        }
        return function;
    }


    public List<Function> getAllfunctionLCMMonPm() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.MonPmFunction AND Week = ? AND Department='LCM') " +
                "ORDER BY Namefunction ASC");
        List<Function> functionVCMs = new ArrayList<>();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));
                functionVCMs.add(function);
            }
        }
        return functionVCMs;
    }

    public List<Function> getAllfunctionLCMTueAm() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.TueAmFunction AND Week = ? AND Department='LCM') " +
                "ORDER BY Namefunction ASC");
        List<Function> functionVCMs = new ArrayList<>();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));
                functionVCMs.add(function);
            }
        }
        return functionVCMs;
    }

    public List<Function> getAllfunctionLCMTuePm() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.TuePmFunction AND Week = ? AND Department='LCM') " +
                "ORDER BY Namefunction ASC");
        List<Function> functionVCMs = new ArrayList<>();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));
                functionVCMs.add(function);
            }
        }
        return functionVCMs;
    }

    public List<Function> getAllfunctionLCMWedAm() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.wedAmFunction AND Week = ? AND Department='LCM') " +
                "ORDER BY Namefunction ASC");
        List<Function> functionVCMs = new ArrayList<>();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));
                functionVCMs.add(function);
            }
        }
        return functionVCMs;
    }

    public List<Function> getAllfunctionLCMWedPm() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.WedPmFunction AND Week = ? AND Department='LCM') " +
                "ORDER BY Namefunction ASC");
        List<Function> functionVCMs = new ArrayList<>();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));
                functionVCMs.add(function);
            }
        }
        return functionVCMs;
    }

    public List<Function> getAllfunctionLCMThuAm() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.ThuAmFunction AND Week = ? AND Department='LCM') " +
                "ORDER BY Namefunction ASC");
        List<Function> functionVCMs = new ArrayList<>();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));
                functionVCMs.add(function);
            }
        }
        return functionVCMs;
    }

    public List<Function> getAllfunctionLCMThuPm() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.ThuPmFunction AND Week = ? AND Department='LCM') " +
                "ORDER BY Namefunction ASC");
        List<Function> functionVCMs = new ArrayList<>();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));
                functionVCMs.add(function);
            }
        }
        return functionVCMs;
    }

    public List<Function> getAllfunctionLCMFriAm() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.FriAmFunction AND Week = ? AND Department='LCM') " +
                "ORDER BY Namefunction ASC");
        List<Function> functionVCMs = new ArrayList<>();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));
                functionVCMs.add(function);
            }
        }
        return functionVCMs;
    }

    public List<Function> getAllfunctionLCMFriPm() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.FriPmFunction AND Week = ? AND Department='LCM') " +
                "ORDER BY Namefunction ASC");
        List<Function> functionVCMs = new ArrayList<>();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));
                functionVCMs.add(function);
            }
        }
        return functionVCMs;
    }

    public Function getAllfunctionMCFGMonAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.MonAmFunction AND Week = ? AND Department='MCFG') " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));

            }
        }
        return function;
    }

    public Function getAllfunctionMCFGMonPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.MonPmFunction AND Week = ? AND Department='MCFG') " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));

            }
        }
        return function;
    }

    public Function getAllfunctionMCFGTueAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.TueAmFunction AND Week = ? AND Department='MCFG') " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));

            }
        }
        return function;
    }


    public Function getAllfunctionMCFGTuePm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.TuePmFunction AND Week = ? AND Department='MCFG') " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));

            }
        }
        return function;
    }

    public Function getAllfunctionMCFGWedAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.wedAmFunction AND Week = ? AND Department='MCFG') " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));

            }
        }
        return function;
    }

    public Function getAllfunctionMCFGWedPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.WedPmFunction AND Week = ? AND Department='MCFG') " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));

            }
        }
        return function;
    }

    public Function getAllfunctionMCFGThuAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.ThuAmFunction AND Week = ? AND Department='MCFG') " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));

            }
        }
        return function;
    }

    public Function getAllfunctionMCFGThuPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.ThuPmFunction AND Week = ? AND Department='MCFG') " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));

            }
        }
        return function;
    }

    public Function getAllfunctionMCFGFriAm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.FriAmFunction AND Week = ? AND Department='MCFG') " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));

            }
        }
        return function;
    }

    public Function getAllfunctionMCFGFriPm(String week) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Department, Namefunction FROM Functions WHERE NOT EXISTS " +
                "(SELECT MonAmFunction FROM Fillin " +
                "WHERE Functions.Namefunction = Fillin.FriPmFunction AND Week = ? AND Department='MCFG') " +
                "ORDER BY Namefunction ASC");
        statement.setString(1, week);
        ResultSet rs = statement.executeQuery();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setNamefunction(rs.getString("namefunction"));

            }
        }
        return function;
    }
}
