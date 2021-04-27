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
}

