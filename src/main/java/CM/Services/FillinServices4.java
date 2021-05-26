package CM.Services;

import CM.Data.Fillin2DAO;
import CM.Data.Fillin3DAO;
import CM.Data.Fillin4DAO;
import CM.Model.Fillin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Tineke Haverhals
 * 23/05/21.
 */
@Service
public class FillinServices4 {
    @Autowired
    private Fillin4DAO fillin4DAO;

    public List<Fillin> getTableFillinLCMMonAmTel(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMMonAmTel(week);
    }

    public List<Fillin> getTableFillinLCMMonPmTel(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMMonPmTel(week);
    }
    public List<Fillin> getTableFillinLCMTueAmTel(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMTueAmTel(week);
    }

    public List<Fillin> getTableFillinLCMTuePmTel(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTuePmTel(week);
    }
    public List<Fillin> getTableFillinLCMWedAmTel(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMWedAmTel(week);
    }

    public List<Fillin> getTableFillinLCMWedPmTel(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMWedPmTel(week);
    }
    public List<Fillin> getTableFillinLCMThuAmTel(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMThuAmTel(week);
    }

    public List<Fillin> getTableFillinLCMThuPmTel(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMThuPmTel(week);
    }
    public List<Fillin> getTableFillinLCMFriAmTel(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMFriAmTel(week);
    }

    public List<Fillin> getTableFillinLCMFriPmTel(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMFriPmTel(week);
    }

    public List<Fillin> getTableFillinLCMMonAmTelPer2(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMMonAmTelPer2(week);
    }

    public List<Fillin> getTableFillinLCMMonPmTelPer2(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMMonPmTelPer2(week);
    }

    public List<Fillin> getTableFillinLCMTueAmTelPer2(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMTueAmTelPer2(week);
    }

    public List<Fillin> getTableFillinLCMTuePmTelPer2(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTuePmTelPer2(week);
    }

    public List<Fillin> getTableFillinLCMWedAmTelPer2(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMWedAmTelPer2(week);
    }

    public List<Fillin> getTableFillinLCMWedPmTelPer2(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMWedPmTelPer2(week);
    }
    public List<Fillin> getTableFillinLCMThuAmTelPer2(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMThuAmTelPer2(week);
    }

    public List<Fillin> getTableFillinLCMThuPmTelPer2(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMThuPmTelPer2(week);
    }
    public List<Fillin> getTableFillinLCMFriAmTelPer2(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMFriAmTelPer2(week);
    }

    public List<Fillin> getTableFillinLCMFriPmTelPer2(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMFriPmTelPer2(week);
    }

    public List<Fillin> getTableFillinLCMMonAmTel2Per(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMMonAmTel2Per(week);
    }

    public List<Fillin> getTableFillinLCMMonPmTel2Per(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMMonPmTel2Per(week);
    }
    public List<Fillin> getTableFillinLCMTueAmTel2Per(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMTueAmTel2Per(week);
    }

    public List<Fillin> getTableFillinLCMTuePmTel2Per(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTuePmTel2Per(week);
    }
    public List<Fillin> getTableFillinLCMWedAmTel2Per(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMWedAmTel2Per(week);
    }

    public List<Fillin> getTableFillinLCMWedPmTel2Per(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMWedPmTel2Per(week);
    }
    public List<Fillin> getTableFillinLCMThuAmTel2Per(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMThuAmTel2Per(week);
    }

    public List<Fillin> getTableFillinLCMThuPmTel2Per(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMThuPmTel2Per(week);
    }
    public List<Fillin> getTableFillinLCMFriAmTel2Per(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMFriAmTel2Per(week);
    }

    public List<Fillin> getTableFillinLCMFriPmTel2Per(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMFriPmTel2Per(week);
    }

    public List<Fillin> getTableFillinLCMMonAmINCPer1(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMMonAmINCPer1(week);
    }

    public List<Fillin> getTableFillinLCMMonPmINCPer1(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMMonPmINCPer1(week);
    }
    public List<Fillin> getTableFillinLCMTueAmINCPer1(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMTueAmINCPer1(week);
    }

    public List<Fillin> getTableFillinLCMTuePmINCPer1(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTuePmINCPer1(week);
    }
    public List<Fillin> getTableFillinLCMWedAmINCPer1(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMWedAmINCPer1(week);
    }

    public List<Fillin> getTableFillinLCMWedPmINCPer1(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMWedPmINCPer1(week);
    }
    public List<Fillin> getTableFillinLCMThuAmINCPer1(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMThuAmINCPer1(week);
    }

    public List<Fillin> getTableFillinLCMThuPmINCPer1(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMThuPmINCPer1(week);
    }

    public List<Fillin> getTableFillinLCMFriAmINCPer1(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMFriAmINCPer1(week);
    }

    public List<Fillin> getTableFillinLCMFriPmINCPer1(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMFriPmINCPer1(week);
    }

    public List<Fillin> getTableFillinLCMMonAmINCPer2(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMMonAmINCPer2(week);
    }

    public List<Fillin> getTableFillinLCMMonPmINCPer2(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMMonPmINCPer2(week);
    }

    public List<Fillin> getTableFillinLCMTueAmINCPer2(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMTueAmINCPer2(week);
    }

    public List<Fillin> getTableFillinLCMTuePmINCPer2(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTuePmINCPer2(week);
    }
    public List<Fillin> getTableFillinLCMWedAmINCPer2(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMWedAmINCPer2(week);
    }

    public List<Fillin> getTableFillinLCMWedPmINCPer2(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMWedPmINCPer2(week);
    }
    public List<Fillin> getTableFillinLCMThuAmINCPer2(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMThuAmINCPer2(week);
    }

    public List<Fillin> getTableFillinLCMThuPmINCPer2(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMThuPmINCPer2(week);
    }

    public List<Fillin> getTableFillinLCMFriAmINCPer2(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMFriAmINCPer2(week);
    }

    public List<Fillin> getTableFillinLCMFriPmINCPer2(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMFriPmINCPer2(week);
    }

    public List<Fillin> getTableFillinLCMMonAmSR(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMMonAmSR(week);
    }

    public List<Fillin> getTableFillinLCMMonPmSR(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMMonPmSR(week);
    }

    public List<Fillin> getTableFillinLCMTueAmSR(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMTueAmSR(week);
    }

    public List<Fillin> getTableFillinLCMTuePmSR(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTuePmSR(week);
    }
    public List<Fillin> getTableFillinLCMWedAmSR(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMWedAmSR(week);
    }

    public List<Fillin> getTableFillinLCMWedPmSR(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMWedPmSR(week);
    }
    public List<Fillin> getTableFillinLCMThuAmSR(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMThuAmSR(week);
    }

    public List<Fillin> getTableFillinLCMThuPmSR(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMThuPmSR(week);
    }

    public List<Fillin> getTableFillinLCMFriAmSR(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMFriAmSR(week);
    }

    public List<Fillin> getTableFillinLCMFriPmSR(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMFriPmSR(week);
    }

    public List<Fillin> getTableFillinLCMMonAmBalie(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMMonAmBalie(week);
    }

    public List<Fillin> getTableFillinLCMMonPmBalie(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMMonPmBalie(week);
    }

    public List<Fillin> getTableFillinLCMTueAmBalie(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMTueAmBalie(week);
    }

    public List<Fillin> getTableFillinLCMTuePmBalie(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTuePmBalie(week);
    }
    public List<Fillin> getTableFillinLCMWedAmBalie(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMWedAmBalie(week);
    }

    public List<Fillin> getTableFillinLCMWedPmBalie(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMWedPmBalie(week);
    }
    public List<Fillin> getTableFillinLCMThuAmBalie(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMThuAmBalie(week);
    }

    public List<Fillin> getTableFillinLCMThuPmBalie(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMThuPmBalie(week);
    }

    public List<Fillin> getTableFillinLCMFriAmBalie(String week) throws SQLException {
        return fillin4DAO.getTableFillinLCMFriAmBalie(week);
    }

    public List<Fillin> getTableFillinLCMFriPmBalie(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMFriPmBalie(week);
    }

    public List<Fillin> getTableFillinLCMTaskMonAm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTaskMonAm(week);
    }

    public List<Fillin> getTableFillinLCMTaskMonPm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTaskMonPm(week);
    }

    public List<Fillin> getTableFillinLCMTaskTueAm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTaskTueAm(week);
    }
    public List<Fillin> getTableFillinLCMTaskTuePm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTaskTuePm(week);
    }

    public List<Fillin> getTableFillinLCMTaskWedAm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTaskWedAm(week);
    }
    public List<Fillin> getTableFillinLCMTaskWedPm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTaskWedPm(week);
    }

    public List<Fillin> getTableFillinLCMTaskThuAm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTaskThuAm(week);
    }

    public List<Fillin> getTableFillinLCMTaskThuPm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTaskThuPm(week);
    }

    public List<Fillin> getTableFillinLCMTaskFriAm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTaskFriAm(week);
    }

    public List<Fillin> getTableFillinLCMTaskFriPm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMTaskFriPm(week);
    }

    public List<Fillin>  getTableFillinLCMAbsentMonAm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMAbsentMonAm(week);
    }

    public List<Fillin>  getTableFillinLCMAbsentMonPm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMAbsentMonPm(week);
    }

    public List<Fillin>  getTableFillinLCMAbsentTueAm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMAbsentTueAm(week);
    }
    public List<Fillin>  getTableFillinLCMAbsentTuePm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMAbsentTuePm(week);
    }

    public List<Fillin>  getTableFillinLCMAbsentWedAm(String week)throws SQLException {
        return fillin4DAO. getTableFillinLCMAbsentWedAm(week);
    }

    public List<Fillin>  getTableFillinLCMAbsentWedPm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMAbsentWedPm(week);
    }

    public List<Fillin>  getTableFillinLCMAbsentThuAm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMAbsentThuAm(week);
    }

    public List<Fillin>  getTableFillinLCMAbsentThuPm(String week)throws SQLException {
        return fillin4DAO.getTableFillinLCMAbsentThuPm(week);
    }

    public List<Fillin>  getTableFillinLCMAbsentFriAm(String week)throws SQLException {
        return fillin4DAO. getTableFillinLCMAbsentFriAm(week);
    }

    public List<Fillin>  getTableFillinLCMAbsentFriPm(String week)throws SQLException {
        return fillin4DAO. getTableFillinLCMAbsentFriPm(week);
    }
}
