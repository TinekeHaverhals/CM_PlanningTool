package CM.Services;

import CM.Data.Fillin2DAO;
import CM.Data.Fillin3DAO;
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
public class FillinServices3 {
    @Autowired
    private Fillin3DAO fillin3DAO;

    public List<Fillin> getTableFillinMCFGMonAmTel(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGMonAmTel(week);
    }

    public List<Fillin> getTableFillinMCFGMonPmTel(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGMonPmTel(week);
    }
    public List<Fillin> getTableFillinMCFGTueAmTel(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGTueAmTel(week);
    }

    public List<Fillin> getTableFillinMCFGTuePmTel(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTuePmTel(week);
    }
    public List<Fillin> getTableFillinMCFGWedAmTel(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGWedAmTel(week);
    }

    public List<Fillin> getTableFillinMCFGWedPmTel(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGWedPmTel(week);
    }
    public List<Fillin> getTableFillinMCFGThuAmTel(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGThuAmTel(week);
    }

    public List<Fillin> getTableFillinMCFGThuPmTel(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGThuPmTel(week);
    }
    public List<Fillin> getTableFillinMCFGFriAmTel(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGFriAmTel(week);
    }

    public List<Fillin> getTableFillinMCFGFriPmTel(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGFriPmTel(week);
    }

    public List<Fillin> getTableFillinMCFGMonAmTelPer2(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGMonAmTelPer2(week);
    }

    public List<Fillin> getTableFillinMCFGMonPmTelPer2(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGMonPmTelPer2(week);
    }
    public List<Fillin> getTableFillinMCFGTueAmTelPer2(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGTueAmTelPer2(week);
    }

    public List<Fillin> getTableFillinMCFGTuePmTelPer2(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTuePmTelPer2(week);
    }
    public List<Fillin> getTableFillinMCFGWedAmTelPer2(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGWedAmTelPer2(week);
    }

    public List<Fillin> getTableFillinMCFGWedPmTelPer2(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGWedPmTelPer2(week);
    }
    public List<Fillin> getTableFillinMCFGThuAmTelPer2(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGThuAmTelPer2(week);
    }

    public List<Fillin> getTableFillinMCFGThuPmTelPer2(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGThuPmTelPer2(week);
    }
    public List<Fillin> getTableFillinMCFGFriAmTelPer2(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGFriAmTelPer2(week);
    }

    public List<Fillin> getTableFillinMCFGFriPmTelPer2(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGFriPmTelPer2(week);
    }

    public List<Fillin> getTableFillinMCFGMonAmTelPer3(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGMonAmTelPer3(week);
    }

    public List<Fillin> getTableFillinMCFGMonPmTelPer3(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGMonPmTelPer3(week);
    }
    public List<Fillin> getTableFillinMCFGTueAmTelPer3(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGTueAmTelPer3(week);
    }

    public List<Fillin> getTableFillinMCFGTuePmTelPer3(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTuePmTelPer3(week);
    }
    public List<Fillin> getTableFillinMCFGWedAmTelPer3(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGWedAmTelPer3(week);
    }

    public List<Fillin> getTableFillinMCFGWedPmTelPer3(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGWedPmTelPer3(week);
    }
    public List<Fillin> getTableFillinMCFGThuAmTelPer3(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGThuAmTelPer3(week);
    }

    public List<Fillin> getTableFillinMCFGThuPmTelPer3(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGThuPmTelPer3(week);
    }
    public List<Fillin> getTableFillinMCFGFriAmTelPer3(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGFriAmTelPer3(week);
    }

    public List<Fillin> getTableFillinMCFGFriPmTelPer3(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGFriPmTelPer3(week);
    }

    public List<Fillin> getTableFillinMCFGMonAmTelPer4(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGMonAmTelPer4(week);
    }

    public List<Fillin> getTableFillinMCFGMonPmTelPer4(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGMonPmTelPer4(week);
    }
    public List<Fillin> getTableFillinMCFGTueAmTelPer4(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGTueAmTelPer4(week);
    }

    public List<Fillin> getTableFillinMCFGTuePmTelPer4(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTuePmTelPer4(week);
    }
    public List<Fillin> getTableFillinMCFGWedAmTelPer4(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGWedAmTelPer4(week);
    }

    public List<Fillin> getTableFillinMCFGWedPmTelPer4(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGWedPmTelPer4(week);
    }
    public List<Fillin> getTableFillinMCFGThuAmTelPer4(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGThuAmTelPer4(week);
    }

    public List<Fillin> getTableFillinMCFGThuPmTelPer4(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGThuPmTelPer4(week);
    }
    public List<Fillin> getTableFillinMCFGFriAmTelPer4(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGFriAmTelPer4(week);
    }

    public List<Fillin> getTableFillinMCFGFriPmTelPer4(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGFriPmTelPer4(week);
    }

    public List<Fillin> getTableFillinMCFGMonAmINCPer1(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGMonAmINCPer1(week);
    }

    public List<Fillin> getTableFillinMCFGMonPmINCPer1(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGMonPmINCPer1(week);
    }
    public List<Fillin> getTableFillinMCFGTueAmINCPer1(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGTueAmINCPer1(week);
    }

    public List<Fillin> getTableFillinMCFGTuePmINCPer1(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTuePmINCPer1(week);
    }
    public List<Fillin> getTableFillinMCFGWedAmINCPer1(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGWedAmINCPer1(week);
    }

    public List<Fillin> getTableFillinMCFGWedPmINCPer1(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGWedPmINCPer1(week);
    }
    public List<Fillin> getTableFillinMCFGThuAmINCPer1(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGThuAmINCPer1(week);
    }

    public List<Fillin> getTableFillinMCFGThuPmINCPer1(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGThuPmINCPer1(week);
    }

    public List<Fillin> getTableFillinMCFGFriAmINCPer1(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGFriAmINCPer1(week);
    }

    public List<Fillin> getTableFillinMCFGFriPmINCPer1(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGFriPmINCPer1(week);
    }

    public List<Fillin> getTableFillinMCFGMonAmINCPer2(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGMonAmINCPer2(week);
    }

    public List<Fillin> getTableFillinMCFGMonPmINCPer2(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGMonPmINCPer2(week);
    }
    public List<Fillin> getTableFillinMCFGTueAmINCPer2(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGTueAmINCPer2(week);
    }

    public List<Fillin> getTableFillinMCFGTuePmINCPer2(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTuePmINCPer2(week);
    }
    public List<Fillin> getTableFillinMCFGWedAmINCPer2(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGWedAmINCPer2(week);
    }

    public List<Fillin> getTableFillinMCFGWedPmINCPer2(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGWedPmINCPer2(week);
    }
    public List<Fillin> getTableFillinMCFGThuAmINCPer2(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGThuAmINCPer2(week);
    }

    public List<Fillin> getTableFillinMCFGThuPmINCPer2(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGThuPmINCPer2(week);
    }

    public List<Fillin> getTableFillinMCFGFriAmINCPer2(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGFriAmINCPer2(week);
    }

    public List<Fillin> getTableFillinMCFGFriPmINCPer2(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGFriPmINCPer2(week);
    }

    public List<Fillin> getTableFillinMCFGMonAmSR(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGMonAmSR(week);
    }

    public List<Fillin> getTableFillinMCFGMonPmSR(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGMonPmSR(week);
    }

    public List<Fillin> getTableFillinMCFGTueAmSR(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGTueAmSR(week);
    }

    public List<Fillin> getTableFillinMCFGTuePmSR(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTuePmSR(week);
    }
    public List<Fillin> getTableFillinMCFGWedAmSR(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGWedAmSR(week);
    }

    public List<Fillin> getTableFillinMCFGWedPmSR(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGWedPmSR(week);
    }
    public List<Fillin> getTableFillinMCFGThuAmSR(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGThuAmSR(week);
    }

    public List<Fillin> getTableFillinMCFGThuPmSR(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGThuPmSR(week);
    }

    public List<Fillin> getTableFillinMCFGFriAmSR(String week) throws SQLException {
        return fillin3DAO.getTableFillinMCFGFriAmSR(week);
    }

    public List<Fillin> getTableFillinMCFGFriPmSR(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGFriPmSR(week);
    }

    public List<Fillin> getTableFillinMCFGTaskMonAm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTaskMonAm(week);
    }

    public List<Fillin> getTableFillinMCFGTaskMonPm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTaskMonPm(week);
    }

    public List<Fillin> getTableFillinMCFGTaskTueAm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTaskTueAm(week);
    }
    public List<Fillin> getTableFillinMCFGTaskTuePm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTaskTuePm(week);
    }

    public List<Fillin> getTableFillinMCFGTaskWedAm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTaskWedAm(week);
    }
    public List<Fillin> getTableFillinMCFGTaskWedPm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTaskWedPm(week);
    }

    public List<Fillin> getTableFillinMCFGTaskThuAm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTaskThuAm(week);
    }
    public List<Fillin> getTableFillinMCFGTaskThuPm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTaskThuPm(week);
    }

    public List<Fillin> getTableFillinMCFGTaskFriAm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTaskFriAm(week);
    }
    public List<Fillin> getTableFillinMCFGTaskFriPm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGTaskFriPm(week);
    }

    public List<Fillin>  getTableFillinMCFGAbsentMonAm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGAbsentMonAm(week);
    }


    public List<Fillin>  getTableFillinMCFGAbsentMonPm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGAbsentMonPm(week);
    }

    public List<Fillin>  getTableFillinMCFGAbsentTueAm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGAbsentTueAm(week);
    }
    public List<Fillin>  getTableFillinMCFGAbsentTuePm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGAbsentTuePm(week);
    }

    public List<Fillin> getTableFillinMCFGAbsentWedAm(String week)throws SQLException {
        return fillin3DAO. getTableFillinMCFGAbsentWedAm(week);
    }

    public List<Fillin>  getTableFillinMCFGAbsentWedPm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGAbsentWedPm(week);
    }

    public List<Fillin>  getTableFillinMCFGAbsentThuAm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGAbsentThuAm(week);
    }

    public List<Fillin>  getTableFillinMCFGAbsentThuPm(String week)throws SQLException {
        return fillin3DAO.getTableFillinMCFGAbsentThuPm(week);
    }

    public List<Fillin>  getTableFillinMCFGAbsentFriAm(String week)throws SQLException {
        return fillin3DAO. getTableFillinMCFGAbsentFriAm(week);
    }

    public List<Fillin>  getTableFillinMCFGAbsentFriPm(String week)throws SQLException {
        return fillin3DAO. getTableFillinMCFGAbsentFriPm(week);
    }

}
