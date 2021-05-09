package CM.Data;

import CM.Model.Absent;
import CM.Model.DateName;
import CM.Model.Fillin;
import CM.Model.StaffMember;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Tineke Haverhals
 * 8/04/21.
 */
@Repository
public class DateNameDAO {
    public List<DateName> getAllDateName() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Date FROM Date");
        List<DateName> dateNames = new ArrayList<>();
        DateName dateName = null;
        if (rs != null) {
            while (rs.next()) {
                dateName = new DateName();
                dateName.setNameDate(rs.getString("date"));
                dateNames.add(dateName);
            }
        }
        return dateNames;
    }

    public DateName getAddDate(String nameDate, String monthBegin, String monthEnd) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO Date (Id, Date, MonthBegin, MonthEnd)VALUES (Null, ? , ?, ?)");
        statement.setString(1, nameDate);
        statement.setString(2, monthBegin);
        statement.setString(3, monthEnd);
        int rs = statement.executeUpdate();
        DateName dateName = null;
        return dateName;
    }

    public DateName getDeleteDate(String nameDate) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM Date Where Date = ?");
        statement.setString(1, nameDate);
        int rs = statement.executeUpdate();
        DateName dateName = null;
        return dateName;
    }
}

