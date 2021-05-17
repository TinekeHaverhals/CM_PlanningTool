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
        ResultSet rs = statement.executeQuery("SELECT Department, Namefunction, Total FROM Functions ORDER BY Department ASC");
        List<Function> functions = new ArrayList<>();
        Function function = null;
        if (rs!= null){
            while (rs.next()){
                function = new Function();
                function.setDepartment(rs.getString("department"));
                function.setNamefunction(rs.getString("namefunction"));
                function.setTotal(rs.getInt("total"));
                functions.add(function);
            }
        }
        return functions;
    }

    public List<Function> getAllfunctionLCM() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT NameFunction FROM Functions WHERE Department = 'LCM';");
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
    public Function getAddFunction(String department, String namefunction, int total) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO Functions (Id, Department, NameFunction, Total) VALUES (null, ?, ?, ?)");
        statement.setString(1, department);
        statement.setString(2, namefunction);
        statement.setInt(3,total);
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

    public Function getChangeFunction (String department, String namefunction, int total) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("UPDATE Functions SET total = ? WHERE Department = ? AND Namefunction = ?;");
        statement.setInt(1, total);
        statement.setString(2, department);
        statement.setString(3, namefunction);
        int rs = statement.executeUpdate();
        Function function = null;
        return function;
    }
}
