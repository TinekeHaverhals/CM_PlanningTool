package CM.Services;

import CM.Data.Fillin2DAO;
import CM.Data.FillinDAO;
import CM.Model.Fillin;
import CM.Model.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Tineke Haverhals
 * 6/04/21.
 */
@Service
public class FillinServices {
    @Autowired
    private FillinDAO fillinDAO;


    public Fillin getAddFillin(int IdStaffMember, String week, String department, String monAmFunction, String monAmTask, String monAmLocation,String monAmAbsent,String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent , String tueAmFunction, String tueAmTask, String tueAmLocation,String tueAmAbsent,String tuePmFunction, String tuePmTask, String tuePmLocation, String tuePmAbsent, String wedAmFunction, String wedAmTask, String wedAmLocation,String wedAmAbsent,String wedPmFunction, String wedPmTask, String wedPmLocation, String wedPmAbsent, String thuAmFunction, String thuAmTask, String thuAmLocation,String thuAmAbsent,String thuPmFunction, String thuPmTask, String thuPmLocation, String thuPmAbsent, String friAmFunction, String friAmTask, String friAmLocation,String friAmAbsent,String friPmFunction, String friPmTask, String friPmLocation, String friPmAbsent ) throws Exception {
        return fillinDAO.getAddFillin( IdStaffMember, week, department, monAmFunction, monAmTask, monAmLocation, monAmAbsent, monPmFunction, monPmTask, monPmLocation, monPmAbsent , tueAmFunction, tueAmTask, tueAmLocation, tueAmAbsent, tuePmFunction, tuePmTask, tuePmLocation, tuePmAbsent, wedAmFunction, wedAmTask, wedAmLocation, wedAmAbsent, wedPmFunction, wedPmTask, wedPmLocation, wedPmAbsent, thuAmFunction, thuAmTask, thuAmLocation, thuAmAbsent, thuPmFunction, thuPmTask, thuPmLocation, thuPmAbsent, friAmFunction, friAmTask, friAmLocation, friAmAbsent, friPmFunction, friPmTask, friPmLocation, friPmAbsent);
    }

    public Fillin getFillinFillinIDLCM( String nameMember, String week,  String monAmFunction, String monAmTask, String monAmLocation,String monAmAbsent,String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent , String tueAmFunction, String tueAmTask, String tueAmLocation,String tueAmAbsent,String tuePmFunction, String tuePmTask, String tuePmLocation, String tuePmAbsent, String wedAmFunction, String wedAmTask, String wedAmLocation,String wedAmAbsent,String wedPmFunction, String wedPmTask, String wedPmLocation, String wedPmAbsent, String thuAmFunction, String thuAmTask, String thuAmLocation,String thuAmAbsent,String thuPmFunction, String thuPmTask, String thuPmLocation, String thuPmAbsent, String friAmFunction, String friAmTask, String friAmLocation,String friAmAbsent,String friPmFunction, String friPmTask, String friPmLocation, String friPmAbsent ) throws Exception {
        return fillinDAO.getFillinFillinIDLCM( nameMember, week ,monAmFunction, monAmTask, monAmLocation, monAmAbsent, monPmFunction, monPmTask, monPmLocation, monPmAbsent , tueAmFunction, tueAmTask, tueAmLocation, tueAmAbsent, tuePmFunction, tuePmTask, tuePmLocation, tuePmAbsent, wedAmFunction, wedAmTask, wedAmLocation, wedAmAbsent, wedPmFunction, wedPmTask, wedPmLocation, wedPmAbsent, thuAmFunction, thuAmTask, thuAmLocation, thuAmAbsent, thuPmFunction, thuPmTask, thuPmLocation, thuPmAbsent, friAmFunction, friAmTask, friAmLocation, friAmAbsent, friPmFunction, friPmTask, friPmLocation, friPmAbsent);
    }

    public Fillin getFillinFillinIDVCM( String nameMember, String week,  String monAmFunction, String monAmTask, String monAmLocation,String monAmAbsent,String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent , String tueAmFunction, String tueAmTask, String tueAmLocation,String tueAmAbsent,String tuePmFunction, String tuePmTask, String tuePmLocation, String tuePmAbsent, String wedAmFunction, String wedAmTask, String wedAmLocation,String wedAmAbsent,String wedPmFunction, String wedPmTask, String wedPmLocation, String wedPmAbsent, String thuAmFunction, String thuAmTask, String thuAmLocation,String thuAmAbsent,String thuPmFunction, String thuPmTask, String thuPmLocation, String thuPmAbsent, String friAmFunction, String friAmTask, String friAmLocation,String friAmAbsent,String friPmFunction, String friPmTask, String friPmLocation, String friPmAbsent ) throws Exception {
        return fillinDAO.getFillinFillinIDVCM( nameMember, week, monAmFunction, monAmTask, monAmLocation, monAmAbsent, monPmFunction, monPmTask, monPmLocation, monPmAbsent , tueAmFunction, tueAmTask, tueAmLocation, tueAmAbsent, tuePmFunction, tuePmTask, tuePmLocation, tuePmAbsent, wedAmFunction, wedAmTask, wedAmLocation, wedAmAbsent, wedPmFunction, wedPmTask, wedPmLocation, wedPmAbsent, thuAmFunction, thuAmTask, thuAmLocation, thuAmAbsent, thuPmFunction, thuPmTask, thuPmLocation, thuPmAbsent, friAmFunction, friAmTask, friAmLocation, friAmAbsent, friPmFunction, friPmTask, friPmLocation, friPmAbsent);
    }

    public Fillin getFillinFillinIDMCFG( String nameMember, String week,  String monAmFunction, String monAmTask, String monAmLocation,String monAmAbsent,String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent , String tueAmFunction, String tueAmTask, String tueAmLocation,String tueAmAbsent,String tuePmFunction, String tuePmTask, String tuePmLocation, String tuePmAbsent, String wedAmFunction, String wedAmTask, String wedAmLocation,String wedAmAbsent,String wedPmFunction, String wedPmTask, String wedPmLocation, String wedPmAbsent, String thuAmFunction, String thuAmTask, String thuAmLocation,String thuAmAbsent,String thuPmFunction, String thuPmTask, String thuPmLocation, String thuPmAbsent, String friAmFunction, String friAmTask, String friAmLocation,String friAmAbsent,String friPmFunction, String friPmTask, String friPmLocation, String friPmAbsent ) throws Exception {
        return fillinDAO.getFillinFillinIDMCFG( nameMember, week,monAmFunction, monAmTask, monAmLocation, monAmAbsent, monPmFunction, monPmTask, monPmLocation, monPmAbsent , tueAmFunction, tueAmTask, tueAmLocation, tueAmAbsent, tuePmFunction, tuePmTask, tuePmLocation, tuePmAbsent, wedAmFunction, wedAmTask, wedAmLocation, wedAmAbsent, wedPmFunction, wedPmTask, wedPmLocation, wedPmAbsent, thuAmFunction, thuAmTask, thuAmLocation, thuAmAbsent, thuPmFunction, thuPmTask, thuPmLocation, thuPmAbsent, friAmFunction, friAmTask, friAmLocation, friAmAbsent, friPmFunction, friPmTask, friPmLocation, friPmAbsent);
    }

    public Fillin getChangeFillin(int IdStaffMember, String week,  String monAmFunction, String monAmTask, String monAmLocation,String monAmAbsent,String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent , String tueAmFunction, String tueAmTask, String tueAmLocation,String tueAmAbsent,String tuePmFunction, String tuePmTask, String tuePmLocation, String tuePmAbsent, String wedAmFunction, String wedAmTask, String wedAmLocation,String wedAmAbsent,String wedPmFunction, String wedPmTask, String wedPmLocation, String wedPmAbsent, String thuAmFunction, String thuAmTask, String thuAmLocation,String thuAmAbsent,String thuPmFunction, String thuPmTask, String thuPmLocation, String thuPmAbsent, String friAmFunction, String friAmTask, String friAmLocation,String friAmAbsent,String friPmFunction, String friPmTask, String friPmLocation, String friPmAbsent ) throws Exception {
        return fillinDAO.getChangeFillin( IdStaffMember, week,monAmFunction, monAmTask, monAmLocation, monAmAbsent, monPmFunction, monPmTask, monPmLocation, monPmAbsent , tueAmFunction, tueAmTask, tueAmLocation, tueAmAbsent, tuePmFunction, tuePmTask, tuePmLocation, tuePmAbsent, wedAmFunction, wedAmTask, wedAmLocation, wedAmAbsent, wedPmFunction, wedPmTask, wedPmLocation, wedPmAbsent, thuAmFunction, thuAmTask, thuAmLocation, thuAmAbsent, thuPmFunction, thuPmTask, thuPmLocation, thuPmAbsent, friAmFunction, friAmTask, friAmLocation, friAmAbsent, friPmFunction, friPmTask, friPmLocation, friPmAbsent);
    }

    public Fillin getChangeFillinID( String nameMember, String week,  String monAmFunction, String monAmTask, String monAmLocation,String monAmAbsent,String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent , String tueAmFunction, String tueAmTask, String tueAmLocation,String tueAmAbsent,String tuePmFunction, String tuePmTask, String tuePmLocation, String tuePmAbsent, String wedAmFunction, String wedAmTask, String wedAmLocation,String wedAmAbsent,String wedPmFunction, String wedPmTask, String wedPmLocation, String wedPmAbsent, String thuAmFunction, String thuAmTask, String thuAmLocation,String thuAmAbsent,String thuPmFunction, String thuPmTask, String thuPmLocation, String thuPmAbsent, String friAmFunction, String friAmTask, String friAmLocation,String friAmAbsent,String friPmFunction, String friPmTask, String friPmLocation, String friPmAbsent ) throws Exception {
        return fillinDAO.getChangeFillinId( nameMember, week,monAmFunction, monAmTask, monAmLocation, monAmAbsent, monPmFunction, monPmTask, monPmLocation, monPmAbsent , tueAmFunction, tueAmTask, tueAmLocation, tueAmAbsent, tuePmFunction, tuePmTask, tuePmLocation, tuePmAbsent, wedAmFunction, wedAmTask, wedAmLocation, wedAmAbsent, wedPmFunction, wedPmTask, wedPmLocation, wedPmAbsent, thuAmFunction, thuAmTask, thuAmLocation, thuAmAbsent, thuPmFunction, thuPmTask, thuPmLocation, thuPmAbsent, friAmFunction, friAmTask, friAmLocation, friAmAbsent, friPmFunction, friPmTask, friPmLocation, friPmAbsent);
    }

    public List<Fillin> getTableFillinLCMMonAm(String week) throws SQLException {
        return fillinDAO.getTableFillinLCMMonAm(week);
    }

    public List<Fillin> getTableFillinLCMMonPm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMMonPm(week);
    }
    public List<Fillin> getTableFillinLCMTueAm(String week) throws SQLException {
        return fillinDAO.getTableFillinLCMTueAm(week);
    }

    public List<Fillin> getTableFillinLCMTuePm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMTuePm(week);
    }
    public List<Fillin> getTableFillinLCMWedAm(String week) throws SQLException {
        return fillinDAO.getTableFillinLCMWedAm(week);
    }

    public List<Fillin> getTableFillinLCMWedPm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMWedPm(week);
    }
    public List<Fillin> getTableFillinLCMThuAm(String week) throws SQLException {
        return fillinDAO.getTableFillinLCMThuAm(week);
    }

    public List<Fillin> getTableFillinLCMThuPm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMThuPm(week);
    }
    public List<Fillin> getTableFillinLCMFriAm(String week) throws SQLException {
        return fillinDAO.getTableFillinLCMFriAm(week);
    }

    public List<Fillin> getTableFillinLCMFriPm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMFriPm(week);
    }

    public List<Fillin> getTableFillinVCMWeek(String week) throws SQLException {
        return fillinDAO.getTableFillinVCMWeek(week);
    }

    public List<Fillin> getTableFillinLCMWeek(String week) throws SQLException {
        return fillinDAO.getTableFillinLCMWeek(week);
    }

    public List<Fillin> getTableFillinMCFGWeek(String week) throws SQLException {
        return fillinDAO.getTableFillinMCFGWeek(week);
    }

    public List<Fillin> getTableFillinWeek(String week) throws SQLException {
        return fillinDAO.getTableFillinWeek(week);
    }

    public List<Fillin> getTableFillinMCFGMonAm(String week) throws SQLException {
        return fillinDAO.getTableFillinMCFGMonAm(week);
    }

    public List<Fillin> getTableFillinMCFGMonPm(String week)throws SQLException {
        return fillinDAO.getTableFillinMCFGMonPm(week);
    }
    public List<Fillin> getTableFillinMCFGTueAm(String week) throws SQLException {
        return fillinDAO.getTableFillinMCFGTueAm(week);
    }

    public List<Fillin> getTableFillinMCFGTuePm(String week)throws SQLException {
        return fillinDAO.getTableFillinMCFGTuePm(week);
    }
    public List<Fillin> getTableFillinMCFGWedAm(String week) throws SQLException {
        return fillinDAO.getTableFillinMCFGWedAm(week);
    }

    public List<Fillin> getTableFillinMCFGWedPm(String week)throws SQLException {
        return fillinDAO.getTableFillinMCFGWedPm(week);
    }
    public List<Fillin> getTableFillinMCFGThuAm(String week) throws SQLException {
        return fillinDAO.getTableFillinMCFGThuAm(week);
    }

    public List<Fillin> getTableFillinMCFGThuPm(String week)throws SQLException {
        return fillinDAO.getTableFillinMCFGThuPm(week);
    }
    public List<Fillin> getTableFillinMCFGFriAm(String week) throws SQLException {
        return fillinDAO.getTableFillinMCFGFriAm(week);
    }

    public List<Fillin> getTableFillinMCFGFriPm(String week)throws SQLException {
        return fillinDAO.getTableFillinMCFGFriPm(week);
    }

    public List<Fillin>  getTableFillinLCMAbsentMon(String week)throws SQLException {
        return fillinDAO. getTableFillinLCMAbsentMon(week);
    }

    public List<Fillin>  getTableFillinLCMAbsentTue(String week)throws SQLException {
        return fillinDAO. getTableFillinLCMAbsentTue(week);
    }

    public List<Fillin>  getTableFillinLCMAbsentWed(String week)throws SQLException {
        return fillinDAO. getTableFillinLCMAbsentWed(week);
    }

    public List<Fillin>  getTableFillinLCMAbsentThu(String week)throws SQLException {
        return fillinDAO. getTableFillinLCMAbsentThu(week);
    }
    public List<Fillin>  getTableFillinLCMAbsentFri(String week)throws SQLException {
        return fillinDAO. getTableFillinLCMAbsentFri(week);
    }


    public List<Fillin>  getTableFillinMCFGAbsentMon(String week)throws SQLException {
        return fillinDAO. getTableFillinMCFGAbsentMon(week);
    }

    public List<Fillin>  getTableFillinMCFGAbsentTue(String week)throws SQLException {
        return fillinDAO. getTableFillinMCFGAbsentTue(week);
    }

    public List<Fillin>  getTableFillinMCFGAbsentWed(String week)throws SQLException {
        return fillinDAO. getTableFillinMCFGAbsentWed(week);
    }

    public List<Fillin>  getTableFillinMCFGAbsentThu(String week)throws SQLException {
        return fillinDAO. getTableFillinMCFGAbsentThu(week);
    }
    public List<Fillin>  getTableFillinMCFGAbsentFri(String week)throws SQLException {
        return fillinDAO. getTableFillinMCFGAbsentFri(week);
    }

    public List<Fillin> getTableFillinVCM() throws SQLException {
        return fillinDAO.getTableFillinVCM();
    }

    public List<Fillin> getTableFillinMCFG() throws SQLException {
        return fillinDAO.getTableFillinMCFG();
    }

    public Fillin getSearchOwnDate(String week,  int idStaffMember) throws SQLException {
        return fillinDAO.getSearchOwnDate(week, idStaffMember);
    }

    public List<Fillin> getSearchOwnDataAbsent(String month, int idStaffMember)throws SQLException {
        return fillinDAO.getSearchOwnDataAbsent(month, idStaffMember);
    }

    public List<Fillin> getSearchAllDataAbsent(String week) throws SQLException {
        return fillinDAO.getSearchAllDataAbsent(week);
    }

    public List<Fillin> getSearchAllDataAbsentMonth(String month)throws SQLException {
        return fillinDAO.getSearchAllDataAbsentMonth(month);
    }

    public List<Fillin> getSearchAllDataAbsentDepartment(String week, String department)throws SQLException {
        return fillinDAO.getSearchAllDataAbsentDepartment(week, department);
    }

    public List<Fillin> getSearchAllDataAbsentDepartmentMonth(String month, String department)throws SQLException {
        return fillinDAO.getSearchAllDataAbsentDepartmentMonth(month, department);
    }

    public List<Fillin> getsearchTasksMemberMonAm(String week, String department)throws SQLException {
        return fillinDAO.getsearchTasksMemberMonAm(week, department);
    }

    public List<Fillin> getsearchTasksMemberMonPm(String week, String department)throws SQLException {
        return fillinDAO.getsearchTasksMemberMonPm(week, department);
    }

    public List<Fillin> getsearchTasksMemberTueAm(String week, String department)throws SQLException {
        return fillinDAO.getsearchTasksMemberTueAm(week, department);
    }

    public List<Fillin> getsearchTasksMemberTuePm(String week, String department)throws SQLException {
        return fillinDAO.getsearchTasksMemberTuePm(week, department);
    }

    public List<Fillin> getsearchTasksMemberWedAm(String week, String department)throws SQLException {
        return fillinDAO.getsearchTasksMemberWedAm(week, department);
    }

    public List<Fillin> getsearchTasksMemberWedPm(String week, String department)throws SQLException {
        return fillinDAO.getsearchTasksMemberWedPm(week, department);
    }

    public List<Fillin> getsearchTasksMemberThuAm(String week, String department)throws SQLException {
        return fillinDAO.getsearchTasksMemberThuAm(week, department);
    }

    public List<Fillin> getsearchTasksMemberThuPm(String week, String department)throws SQLException {
        return fillinDAO.getsearchTasksMemberThuPm(week, department);
    }

    public List<Fillin> getsearchTasksMemberFriAm(String week, String department)throws SQLException {
        return fillinDAO.getsearchTasksMemberFriAm(week, department);
    }

    public List<Fillin> getsearchTasksMemberFriPm(String week, String department)throws SQLException {
        return fillinDAO.getsearchTasksMemberFriPm(week, department);
    }

    public List<Fillin> getTableFillinLCMTaskMonAm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMTaskMonAm(week);
    }
    public List<Fillin> getTableFillinLCMTaskMonPm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMTaskMonPm(week);
    }

    public List<Fillin> getTableFillinLCMTaskTueAm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMTaskTueAm(week);
    }
    public List<Fillin> getTableFillinLCMTaskTuePm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMTaskTuePm(week);
    }

    public List<Fillin> getTableFillinLCMTaskWedAm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMTaskWedAm(week);
    }
    public List<Fillin> getTableFillinLCMTaskWedPm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMTaskWedPm(week);
    }

    public List<Fillin> getTableFillinLCMTaskThuAm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMTaskThuAm(week);
    }
    public List<Fillin> getTableFillinLCMTaskThuPm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMTaskThuPm(week);
    }

    public List<Fillin> getTableFillinLCMTaskFriAm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMTaskFriAm(week);
    }
    public List<Fillin> getTableFillinLCMTaskFriPm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMTaskFriPm(week);
    }

    public List<Fillin> getTableFillinMCFGTaskMonAm(String week)throws SQLException {
        return fillinDAO.getTableFillinMCFGTaskMonAm(week);
    }
    public List<Fillin> getTableFillinMCFGTaskMonPm(String week)throws SQLException {
        return fillinDAO.getTableFillinMCFGTaskMonPm(week);
    }

    public List<Fillin> getTableFillinMCFGTaskTueAm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMTaskTueAm(week);
    }
    public List<Fillin> getTableFillinMCFGTaskTuePm(String week)throws SQLException {
        return fillinDAO.getTableFillinLCMTaskTuePm(week);
    }

    public List<Fillin> getTableFillinMCFGTaskWedAm(String week)throws SQLException {
        return fillinDAO.getTableFillinMCFGTaskWedAm(week);
    }
    public List<Fillin> getTableFillinMCFGTaskWedPm(String week)throws SQLException {
        return fillinDAO.getTableFillinMCFGTaskWedPm(week);
    }

    public List<Fillin> getTableFillinMCFGTaskThuAm(String week)throws SQLException {
        return fillinDAO.getTableFillinMCFGTaskThuAm(week);
    }
    public List<Fillin> getTableFillinMCFGTaskThuPm(String week)throws SQLException {
        return fillinDAO.getTableFillinMCFGTaskThuPm(week);
    }

    public List<Fillin> getTableFillinMCFGTaskFriAm(String week)throws SQLException {
        return fillinDAO.getTableFillinMCFGTaskFriAm(week);
    }
    public List<Fillin> getTableFillinMCFGTaskFriPm(String week)throws SQLException {
        return fillinDAO.getTableFillinMCFGTaskFriPm(week);
    }

    public List<Fillin> getTableFillinMonAm(String week) throws SQLException {
        return fillinDAO.getTableFillinMonAm(week);
    }

    public List<Fillin> getTableFillinMonPm(String week)throws SQLException {
        return fillinDAO.getTableFillinMonPm(week);
    }
    public List<Fillin> getTableFillinTueAm(String week) throws SQLException {
        return fillinDAO.getTableFillinTueAm(week);
    }

    public List<Fillin> getTableFillinTuePm(String week)throws SQLException {
        return fillinDAO.getTableFillinTuePm(week);
    }
    public List<Fillin> getTableFillinWedAm(String week) throws SQLException {
        return fillinDAO.getTableFillinWedAm(week);
    }

    public List<Fillin> getTableFillinWedPm(String week)throws SQLException {
        return fillinDAO.getTableFillinWedPm(week);
    }
    public List<Fillin> getTableFillinThuAm(String week) throws SQLException {
        return fillinDAO.getTableFillinThuAm(week);
    }

    public List<Fillin> getTableFillinThuPm(String week)throws SQLException {
        return fillinDAO.getTableFillinThuPm(week);
    }
    public List<Fillin> getTableFillinFriAm(String week) throws SQLException {
        return fillinDAO.getTableFillinFriAm(week);
    }

    public List<Fillin> getTableFillinFriPm(String week)throws SQLException {
        return fillinDAO.getTableFillinFriPm(week);
    }
    public List<Fillin>  getTableFillinAbsentMon(String week)throws SQLException {
        return fillinDAO. getTableFillinAbsentMon(week);
    }

    public List<Fillin>  getTableFillinAbsentTue(String week)throws SQLException {
        return fillinDAO. getTableFillinAbsentTue(week);
    }

    public List<Fillin>  getTableFillinAbsentWed(String week)throws SQLException {
        return fillinDAO. getTableFillinAbsentWed(week);
    }

    public List<Fillin>  getTableFillinAbsentThu(String week)throws SQLException {
        return fillinDAO. getTableFillinAbsentThu(week);
    }
    public List<Fillin>  getTableFillinAbsentFri(String week)throws SQLException {
        return fillinDAO. getTableFillinAbsentFri(week);
    }
    public List<Fillin> getTableFillinTaskMonAm(String week)throws SQLException {
        return fillinDAO.getTableFillinTaskMonAm(week);
    }

    public List<Fillin> getTableFillinTaskTueAm(String week)throws SQLException {
        return fillinDAO.getTableFillinTaskTueAm(week);
    }

    public List<Fillin> getTableFillinTaskWedAm(String week)throws SQLException {
        return fillinDAO.getTableFillinTaskWedAm(week);
    }

    public List<Fillin> getTableFillinTaskThuAm(String week)throws SQLException {
        return fillinDAO.getTableFillinTaskThuAm(week);
    }

    public List<Fillin> getTableFillinTaskFriAm(String week)throws SQLException {
        return fillinDAO.getTableFillinTaskFriAm(week);
    }

    public List<Fillin> getTableFillinTaskMonPm(String week)throws SQLException {
        return fillinDAO.getTableFillinTaskMonPm(week);
    }

    public List<Fillin> getTableFillinTaskTuePm(String week)throws SQLException {
        return fillinDAO.getTableFillinTaskTuePm(week);
    }

    public List<Fillin> getTableFillinTaskWedPm(String week)throws SQLException {
        return fillinDAO.getTableFillinTaskWedPm(week);
    }

    public List<Fillin> getTableFillinTaskThuPm(String week)throws SQLException {
        return fillinDAO.getTableFillinTaskThuPm(week);
    }

    public List<Fillin> getTableFillinTaskFriPm(String week)throws SQLException {
        return fillinDAO.getTableFillinTaskFriPm(week);
    }
    public List<Fillin> getCheck(String week) throws SQLException {
        return fillinDAO.getCheck(week);
    }

    public List<Fillin> getCheckFunction(String week) throws SQLException{
        return fillinDAO.getCheckFunction(week);
    }

    public List<Fillin> getCheckFunctionMonAm(String week) throws SQLException{
        return fillinDAO.getCheckFunctionMonAm(week);
    }

    public List<Fillin> getCheckFunctionMonPm(String week) throws SQLException{
        return fillinDAO.getCheckFunctionMonPm(week);
    }

    public List<Fillin> getCheckFunctionTueAm(String week) throws SQLException{
        return fillinDAO.getCheckFunctionTueAm(week);
    }

    public List<Fillin> getCheckFunctionTuePm(String week) throws SQLException{
        return fillinDAO.getCheckFunctionTuePm(week);
    }

    public List<Fillin> getCheckFunctionWedAm(String week) throws SQLException{
        return fillinDAO.getCheckFunctionWedAm(week);
    }

    public List<Fillin> getCheckFunctionWedPm(String week) throws SQLException{
        return fillinDAO.getCheckFunctionWedPm(week);
    }

    public List<Fillin> getCheckFunctionThuAm(String week) throws SQLException{
        return fillinDAO.getCheckFunctionThuAm(week);
    }

    public List<Fillin> getCheckFunctionThuPm(String week) throws SQLException{
        return fillinDAO.getCheckFunctionThuPm(week);
    }

    public List<Fillin> getCheckFunctionFriAm(String week) throws SQLException{
        return fillinDAO.getCheckFunctionFriAm(week);
    }

    public List<Fillin> getCheckFunctionFriPm(String week) throws SQLException{
        return fillinDAO.getCheckFunctionFriPm(week);
    }

    public List<Fillin> getAllDateName() throws SQLException {
        return fillinDAO.getAllDateName();
    }

    public List<Fillin> getDateName() throws SQLException {
        return fillinDAO.getDateName();
    }

    public List<Fillin> getDateNameId(int IdStaffMember) throws SQLException {
        return fillinDAO.getDateNameId(IdStaffMember);
    }

    public List<Fillin> getAllfunctionVCMMonAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionVCMMonAm(week);
    }

    public List<Fillin> getAllfunctionVCMMonPm(String week) throws SQLException {
        return fillinDAO.getAllfunctionVCMMonPm( week);
    }

    public List<Fillin> getAllfunctionVCMTueAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionVCMTueAm( week);
    }

    public List<Fillin> getAllfunctionVCMTuePm(String week) throws SQLException {
        return fillinDAO.getAllfunctionVCMTuePm(week);
    }

    public List<Fillin> getAllfunctionVCMWedAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionVCMWedAm( week);
    }

    public List<Fillin> getAllfunctionVCMWedPm(String week) throws SQLException {
        return fillinDAO.getAllfunctionVCMWedPm(week);
    }

    public List<Fillin> getAllfunctionVCMThuAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionVCMThuAm(week);
    }

    public List<Fillin> getAllfunctionVCMThuPm(String week) throws SQLException {
        return fillinDAO.getAllfunctionVCMThuPm(week);
    }

    public List<Fillin> getAllfunctionVCMFriAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionVCMFriAm( week);
    }

    public List<Fillin> getAllfunctionVCMFriPm(String week) throws SQLException {
        return fillinDAO.getAllfunctionVCMFriPm( week);
    }

    public List<Fillin> getAllfunctionLCMMonAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionLCMMonAm(week);
    }

    public List<Fillin> getAllfunctionLCMMonPm(String week) throws SQLException {
        return fillinDAO.getAllfunctionLCMMonPm( week);
    }

    public List<Fillin> getAllfunctionLCMTueAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionLCMTueAm( week);
    }

    public List<Fillin> getAllfunctionLCMTuePm(String week) throws SQLException {
        return fillinDAO.getAllfunctionLCMTuePm(week);
    }

    public List<Fillin> getAllfunctionLCMWedAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionLCMWedAm( week);
    }

    public List<Fillin> getAllfunctionLCMWedPm(String week) throws SQLException {
        return fillinDAO.getAllfunctionLCMWedPm(week);
    }

    public List<Fillin> getAllfunctionLCMThuAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionLCMThuAm(week);
    }

    public List<Fillin> getAllfunctionLCMThuPm(String week) throws SQLException {
        return fillinDAO.getAllfunctionLCMThuPm(week);
    }

    public List<Fillin> getAllfunctionLCMFriAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionLCMFriAm( week);
    }

    public List<Fillin> getAllfunctionLCMFriPm(String week) throws SQLException {
        return fillinDAO.getAllfunctionLCMFriPm( week);
    }

    public List<Fillin> getAllfunctionMCFGMonAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionMCFGMonAm(week);
    }

    public List<Fillin> getAllfunctionMCFGMonPm(String week) throws SQLException {
        return fillinDAO.getAllfunctionMCFGMonPm( week);
    }

    public List<Fillin> getAllfunctionMCFGTueAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionMCFGTueAm( week);
    }

    public List<Fillin> getAllfunctionMCFGTuePm(String week) throws SQLException {
        return fillinDAO.getAllfunctionMCFGTuePm(week);
    }

    public List<Fillin> getAllfunctionMCFGWedAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionMCFGWedAm( week);
    }

    public List<Fillin> getAllfunctionMCFGWedPm(String week) throws SQLException {
        return fillinDAO.getAllfunctionMCFGWedPm(week);
    }

    public List<Fillin> getAllfunctionMCFGThuAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionMCFGThuAm(week);
    }

    public List<Fillin> getAllfunctionMCFGThuPm(String week) throws SQLException {
        return fillinDAO.getAllfunctionMCFGThuPm(week);
    }

    public List<Fillin> getAllfunctionMCFGFriAm(String week) throws SQLException {
        return fillinDAO.getAllfunctionMCFGFriAm( week);
    }

    public List<Fillin> getAllfunctionMCFGFriPm(String week) throws SQLException {
        return fillinDAO.getAllfunctionMCFGFriPm( week);
    }

    public Fillin  getSearchOwnDateId(String week,String nameMember) throws SQLException {
        return fillinDAO. getSearchOwnDateId(week, nameMember);
    }

    public List<Fillin> getStaffMemberchangeFillin(String nameMember) throws SQLException {
        return fillinDAO.getStaffMemberchangeFillin(nameMember);
    }
}