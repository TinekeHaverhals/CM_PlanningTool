package CM.Services;

import CM.Data.AbsentDAO;
import CM.Data.LocationDAO;
import CM.Model.Fillin;
import CM.Model.Location;
import CM.Model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 * Tineke Haverhals
 * 7/04/21.
 */
@Service
public class LocationServices {
    @Autowired
    private LocationDAO locationDAO;

    public List<Location> getTableLocation() throws SQLException {
        return locationDAO.getTableLocation();
    }

    public Location getdeleteLocation (String locationName) throws Exception {
        return locationDAO.getdeleteLocation(locationName);
    }

    public Location getAddLocation (String locationName) throws Exception {
        return locationDAO.getAddLocation(locationName);
    }

}
