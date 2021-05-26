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

    public Function getAllfunctionLCMMonAm(String week) throws SQLException {
        return functionDAO.getAllfunctionLCMMonAm( week);
    }

    public List<Function> getAllfunctionLCMMonPm() throws SQLException {
        return functionDAO.getAllfunctionLCMMonPm();
    }

    public List<Function> getAllfunctionLCMTueAm() throws SQLException {
        return functionDAO.getAllfunctionLCMTueAm();
    }

    public List<Function> getAllfunctionLCMTuePm() throws SQLException {
        return functionDAO.getAllfunctionLCMTuePm();
    }

    public List<Function> getAllfunctionLCMWedAm() throws SQLException {
        return functionDAO.getAllfunctionLCMWedAm();
    }

    public List<Function> getAllfunctionLCMWedPm() throws SQLException {
        return functionDAO.getAllfunctionLCMWedPm();
    }

    public List<Function> getAllfunctionLCMThuAm() throws SQLException {
        return functionDAO.getAllfunctionLCMThuAm();
    }

    public List<Function> getAllfunctionLCMThuPm() throws SQLException {
        return functionDAO.getAllfunctionLCMThuPm();
    }

    public List<Function> getAllfunctionLCMFriAm() throws SQLException {
        return functionDAO.getAllfunctionLCMFriAm();
    }

    public List<Function> getAllfunctionLCMFriPm() throws SQLException {
        return functionDAO.getAllfunctionLCMFriPm();
    }

    public Function getAllfunctionMCFGMonAm(String week) throws SQLException {
        return functionDAO.getAllfunctionMCFGMonAm(week);
    }

    public Function getAllfunctionMCFGMonPm(String week) throws SQLException {
        return functionDAO.getAllfunctionMCFGMonPm( week);
    }

    public Function getAllfunctionMCFGTueAm(String week) throws SQLException {
        return functionDAO.getAllfunctionMCFGTueAm( week);
    }

    public Function getAllfunctionMCFGTuePm(String week) throws SQLException {
        return functionDAO.getAllfunctionMCFGTuePm( week);
    }

    public Function getAllfunctionMCFGWedAm(String week) throws SQLException {
        return functionDAO.getAllfunctionMCFGWedAm( week);
    }

    public Function getAllfunctionMCFGWedPm(String week) throws SQLException {
        return functionDAO.getAllfunctionMCFGWedPm( week);
    }

    public Function getAllfunctionMCFGThuAm(String week) throws SQLException {
        return functionDAO.getAllfunctionMCFGThuAm( week);
    }

    public Function getAllfunctionMCFGThuPm(String week) throws SQLException {
        return functionDAO.getAllfunctionMCFGThuPm( week);
    }

    public Function getAllfunctionMCFGFriAm(String week) throws SQLException {
        return functionDAO.getAllfunctionMCFGFriAm( week);
    }

    public Function getAllfunctionMCFGFriPm(String week) throws SQLException {
        return functionDAO.getAllfunctionMCFGFriPm( week);
    }

    public Function getAddFunction (String department, String namefunction) throws Exception {
        return functionDAO.getAddFunction(department,namefunction);
    }

    public Function getdeleteFunction (String department, String namefunction) throws Exception {
        return functionDAO.getdeleteFunction(department, namefunction);
    }

    public List<Function> getAllfunctionVCM() throws SQLException {
        return functionDAO.getAllfunctionVCM();
    }


}
