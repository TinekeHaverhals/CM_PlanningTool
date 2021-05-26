package CM.Services;

import CM.Data.DateNameDAO;
import CM.Data.DepartmentDAO;
import CM.Model.DateName;
import CM.Model.Department;
import CM.Model.Fillin;
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

    public DateName getAddDate(String nameDate, String monthBegin, String monthEnd) throws SQLException{
        return  dateNameDAO.getAddDate(nameDate, monthBegin, monthEnd);
    }

    public Object getDeleteDate(String nameDate) throws SQLException{
        return  dateNameDAO.getDeleteDate(nameDate);
    }

    public DateName getDateNames(String week) throws SQLException {
        return dateNameDAO.getDateNames(week);
    }

}
