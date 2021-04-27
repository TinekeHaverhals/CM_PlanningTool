package CM.Services;

import CM.Data.DateNameDAO;
import CM.Data.DepartmentDAO;
import CM.Model.DateName;
import CM.Model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Tineke Haverhals
 * 8/04/21.
 */
@Service
public class DateNameServices {
    @Autowired
    private DateNameDAO dateNameDAO;

    public List<DateName> getAllDateName() throws SQLException {
            return dateNameDAO.getAllDateName();
        }

}
