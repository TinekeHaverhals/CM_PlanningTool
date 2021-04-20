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
public class AbsentDAO {
    public List<Absent> getAllAbsent() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT BeginDate, EndDate FROM Absent");
        List<Absent> absents= new ArrayList<>();
        Absent absent = null;
        if (rs!= null){
            while (rs.next()){
                absent = new Absent();
                absent.setBeginDate(rs.getDate("beginDate"));
                absent.setEndDate(rs.getDate("endDate"));
                absents.add(absent);
            }
        }
        return absents;
    }

    public Absent getAddAbsent(Date beginDate, Date endDate)  throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO Absent (Id, BeginDate, EndDate)VALUES (Null, ?, ?);");
        statement.setDate(1, (java.sql.Date) beginDate);
        statement.setDate(2, (java.sql.Date) endDate);
        int rs = statement.executeUpdate();
        Absent absent = null;
        return absent;
    }

    public Absent getNewAbsent(Date beginDate, Date endDate)  throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO Absent (Id, BeginDate, EndDate)VALUES (Null, ?, ?);");
        statement.setDate(1, (java.sql.Date) beginDate);
        statement.setDate(2, (java.sql.Date) endDate);
        int rs = statement.executeUpdate();
        Absent absent = null;
        return absent;
    }



}

