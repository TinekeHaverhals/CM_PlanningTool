package CM.Services;

import CM.Data.FunctionDAO;
import CM.Data.StaffMemberDAO;
import CM.Model.Absent;
import CM.Model.Function;
import CM.Model.StaffMember;
import CM.Model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 * Tineke Haverhals
 * 26/03/21.
 */
@Service
public class FunctionServices {

    @Autowired
    private FunctionDAO functionDAO;

    public List<Function> getAllFunction() throws SQLException {
        return functionDAO.getAllfunction();
    }

    public List<Function> getAllfunctionLCM() throws SQLException {
        return functionDAO.getAllfunctionLCM();
    }
    public List<Function> getAllfunctionVCM() throws SQLException {
        return functionDAO.getAllfunctionVCM();
    }
    public List<Function> getAllfunctionMCFG() throws SQLException {
        return functionDAO.getAllfunctionMCFG();
    }

    public Function getAddFunction (String department, String namefunction, int total) throws Exception {
        return functionDAO.getAddFunction(department,namefunction, total);
    }

    public Function getdeleteFunction (String department, String namefunction) throws Exception {
        return functionDAO.getdeleteFunction(department, namefunction);
    }

    public Function getChangeFunction (String department, String namefunction, int total) throws Exception {
        return functionDAO.getChangeFunction(department, namefunction, total);
    }

}
