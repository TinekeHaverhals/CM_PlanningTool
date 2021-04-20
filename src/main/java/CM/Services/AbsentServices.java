package CM.Services;

import CM.Data.AbsentDAO;
import CM.Data.DepartmentDAO;
import CM.Model.Absent;
import CM.Model.Department;
import CM.Model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * Tineke Haverhals
 * 26/03/21.
 */
@Service
public class AbsentServices {
    @Autowired
    private AbsentDAO absentDAO;

    public  List<Absent> getAllAbsent() throws SQLException {
        return absentDAO.getAllAbsent();
    }

    public Absent getAddAbsent(Date beginDate, Date endDate) throws Exception {
        return absentDAO.getAddAbsent(beginDate,endDate);
    }

    public Absent getNewAbsent(Date beginDate, Date endDate) throws Exception {
        return absentDAO.getAddAbsent(beginDate,endDate);
    }
}
