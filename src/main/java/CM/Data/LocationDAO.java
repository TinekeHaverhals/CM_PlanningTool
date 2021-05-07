package CM.Data;

import CM.Model.Absent;
import CM.Model.Function;
import CM.Model.Location;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 7/04/21.
 */
@Repository
public class LocationDAO {

    public List<Location> getTableLocation() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT LocationName, abbreviationLocation FROM Location");
        List<Location> locations= new ArrayList<>();
        Location location = null;
        if (rs!= null){
            while (rs.next()){
                location = new Location();
                location.setLocationName(rs.getString("locationName"));
                location.setAbbreviationLocation(rs.getString("abbreviationLocation"));
                locations.add(location);
            }
        }
        return locations;
    }

    public Location getAddLocation (String locationName, String abbreviationLocation) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO Location (Id, LocationName, AbbreviationLocation) VALUES (null, ?,?)");
        statement.setString(1, locationName);
        statement.setString(2, abbreviationLocation);
        int rs = statement.executeUpdate();
        Location location = null;
        return location;
    }

    public Location getdeleteLocation (String locationName) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM Location Where LocationName = ? ");
        statement.setString(1, locationName);
        int rs = statement.executeUpdate();
        Location location = null;
        return location;
    }
}
