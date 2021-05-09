package CM.Services;

import CM.Data.FillinDAO;
import CM.Model.Fillin;
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
    public Fillin getChangeFillin(int IdStaffMember, String week,  String monAmFunction, String monAmTask, String monAmLocation,String monAmAbsent,String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent , String tueAmFunction, String tueAmTask, String tueAmLocation,String tueAmAbsent,String tuePmFunction, String tuePmTask, String tuePmLocation, String tuePmAbsent, String wedAmFunction, String wedAmTask, String wedAmLocation,String wedAmAbsent,String wedPmFunction, String wedPmTask, String wedPmLocation, String wedPmAbsent, String thuAmFunction, String thuAmTask, String thuAmLocation,String thuAmAbsent,String thuPmFunction, String thuPmTask, String thuPmLocation, String thuPmAbsent, String friAmFunction, String friAmTask, String friAmLocation,String friAmAbsent,String friPmFunction, String friPmTask, String friPmLocation, String friPmAbsent ) throws Exception {
        return fillinDAO.getChangeFillin( IdStaffMember, week,monAmFunction, monAmTask, monAmLocation, monAmAbsent, monPmFunction, monPmTask, monPmLocation, monPmAbsent , tueAmFunction, tueAmTask, tueAmLocation, tueAmAbsent, tuePmFunction, tuePmTask, tuePmLocation, tuePmAbsent, wedAmFunction, wedAmTask, wedAmLocation, wedAmAbsent, wedPmFunction, wedPmTask, wedPmLocation, wedPmAbsent, thuAmFunction, thuAmTask, thuAmLocation, thuAmAbsent, thuPmFunction, thuPmTask, thuPmLocation, thuPmAbsent, friAmFunction, friAmTask, friAmLocation, friAmAbsent, friPmFunction, friPmTask, friPmLocation, friPmAbsent);
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

    public List<Fillin> getTableFillinVCMMonAm(String week) throws SQLException {
        return fillinDAO.getTableFillinVCMMonAm(week);
    }

    public List<Fillin> getTableFillinVCMMonPm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMMonPm(week);
    }
    public List<Fillin> getTableFillinVCMTueAm(String week) throws SQLException {
        return fillinDAO.getTableFillinVCMTueAm(week);
    }

    public List<Fillin> getTableFillinVCMTuePm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMTuePm(week);
    }
    public List<Fillin> getTableFillinVCMWedAm(String week) throws SQLException {
        return fillinDAO.getTableFillinVCMWedAm(week);
    }

    public List<Fillin> getTableFillinVCMWedPm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMWedPm(week);
    }
    public List<Fillin> getTableFillinVCMThuAm(String week) throws SQLException {
        return fillinDAO.getTableFillinVCMThuAm(week);
    }

    public List<Fillin> getTableFillinVCMThuPm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMThuPm(week);
    }
    public List<Fillin> getTableFillinVCMFriAm(String week) throws SQLException {
        return fillinDAO.getTableFillinVCMFriAm(week);
    }

    public List<Fillin> getTableFillinVCMFriPm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMFriPm(week);
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

    public List<Fillin>  getTableFillinVCMAbsentMon(String week)throws SQLException {
        return fillinDAO. getTableFillinVCMAbsentMon(week);
    }

    public List<Fillin>  getTableFillinVCMAbsentTue(String week)throws SQLException {
        return fillinDAO. getTableFillinVCMAbsentTue(week);
    }

    public List<Fillin>  getTableFillinVCMAbsentWed(String week)throws SQLException {
        return fillinDAO. getTableFillinVCMAbsentWed(week);
    }

    public List<Fillin>  getTableFillinVCMAbsentThu(String week)throws SQLException {
        return fillinDAO. getTableFillinVCMAbsentThu(week);
    }
    public List<Fillin>  getTableFillinVCMAbsentFri(String week)throws SQLException {
        return fillinDAO. getTableFillinVCMAbsentFri(week);
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

    public List<Fillin> getTableFillinVCMTaskMonAm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMTaskMonAm(week);
    }
    public List<Fillin> getTableFillinVCMTaskMonPm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMTaskMonPm(week);
    }

    public List<Fillin> getTableFillinVCMTaskTueAm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMTaskTueAm(week);
    }
    public List<Fillin> getTableFillinVCMTaskTuePm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMTaskTuePm(week);
    }

    public List<Fillin> getTableFillinVCMTaskWedAm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMTaskWedAm(week);
    }
    public List<Fillin> getTableFillinVCMTaskWedPm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMTaskWedPm(week);
    }

    public List<Fillin> getTableFillinVCMTaskThuAm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMTaskThuAm(week);
    }
    public List<Fillin> getTableFillinVCMTaskThuPm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMTaskThuPm(week);
    }

    public List<Fillin> getTableFillinVCMTaskFriAm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMTaskFriAm(week);
    }
    public List<Fillin> getTableFillinVCMTaskFriPm(String week)throws SQLException {
        return fillinDAO.getTableFillinVCMTaskFriPm(week);
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

    public List<Fillin> getAllDateName() throws SQLException {
        return fillinDAO.getAllDateName();
    }

    public List<Fillin> getDateName() throws SQLException {
        return fillinDAO.getDateName();
    }

    public List<Fillin> getDateNameId(int IdStaffMember) throws SQLException {
        return fillinDAO.getDateNameId(IdStaffMember);
    }
}

