package CM.Services;

import CM.Data.Fillin2DAO;
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
public class FillinServices2 {
    @Autowired
    private Fillin2DAO fillin2DAO;

    public List<Fillin> getTableFillinVCMMonAmMail(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMMonAmMail(week);
    }

    public List<Fillin> getTableFillinVCMMonPmMail(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMMonPmMail(week);
    }
    public List<Fillin> getTableFillinVCMTueAmMail(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMTueAmMail(week);
    }

    public List<Fillin> getTableFillinVCMTuePmMail(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTuePmMail(week);
    }
    public List<Fillin> getTableFillinVCMWedAmMail(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMWedAmMail(week);
    }

    public List<Fillin> getTableFillinVCMWedPmMail(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMWedPmMail(week);
    }
    public List<Fillin> getTableFillinVCMThuAmMail(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMThuAmMail(week);
    }

    public List<Fillin> getTableFillinVCMThuPmMail(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMThuPmMail(week);
    }
    public List<Fillin> getTableFillinVCMFriAmMail(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMFriAmMail(week);
    }

    public List<Fillin> getTableFillinVCMFriPmMail(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMFriPmMail(week);
    }

    public List<Fillin> getTableFillinVCMMonAmTel(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMMonAmTel(week);
    }

    public List<Fillin> getTableFillinVCMMonPmTel(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMMonPmTel(week);
    }
    public List<Fillin> getTableFillinVCMTueAmTel(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMTueAmTel(week);
    }

    public List<Fillin> getTableFillinVCMTuePmTel(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTuePmTel(week);
    }
    public List<Fillin> getTableFillinVCMWedAmTel(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMWedAmTel(week);
    }

    public List<Fillin> getTableFillinVCMWedPmTel(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMWedPmTel(week);
    }
    public List<Fillin> getTableFillinVCMThuAmTel(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMThuAmTel(week);
    }

    public List<Fillin> getTableFillinVCMThuPmTel(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMThuPmTel(week);
    }
    public List<Fillin> getTableFillinVCMFriAmTel(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMFriAmTel(week);
    }

    public List<Fillin> getTableFillinVCMFriPmTel(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMFriPmTel(week);
    }

    public List<Fillin> getTableFillinVCMMonAmTelPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMMonAmTelPer2(week);
    }

    public List<Fillin> getTableFillinVCMMonPmTelPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMMonPmTelPer2(week);
    }
    public List<Fillin> getTableFillinVCMTueAmTelPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMTueAmTelPer2(week);
    }

    public List<Fillin> getTableFillinVCMTuePmTelPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTuePmTelPer2(week);
    }
    public List<Fillin> getTableFillinVCMWedAmTelPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMWedAmTelPer2(week);
    }

    public List<Fillin> getTableFillinVCMWedPmTelPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMWedPmTelPer2(week);
    }
    public List<Fillin> getTableFillinVCMThuAmTelPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMThuAmTelPer2(week);
    }

    public List<Fillin> getTableFillinVCMThuPmTelPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMThuPmTelPer2(week);
    }
    public List<Fillin> getTableFillinVCMFriAmTelPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMFriAmTelPer2(week);
    }

    public List<Fillin> getTableFillinVCMFriPmTelPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMFriPmTelPer2(week);
    }


    public List<Fillin> getTableFillinVCMMonAmTelPer3(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMMonAmTelPer3(week);
    }

    public List<Fillin> getTableFillinVCMMonPmTelPer3(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMMonPmTelPer3(week);
    }
    public List<Fillin> getTableFillinVCMTueAmTelPer3(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMTueAmTelPer3(week);
    }

    public List<Fillin> getTableFillinVCMTuePmTelPer3(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTuePmTelPer3(week);
    }
    public List<Fillin> getTableFillinVCMWedAmTelPer3(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMWedAmTelPer3(week);
    }

    public List<Fillin> getTableFillinVCMWedPmTelPer3(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMWedPmTelPer3(week);
    }
    public List<Fillin> getTableFillinVCMThuAmTelPer3(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMThuAmTelPer3(week);
    }

    public List<Fillin> getTableFillinVCMThuPmTelPer3(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMThuPmTelPer3(week);
    }
    public List<Fillin> getTableFillinVCMFriAmTelPer3(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMFriAmTelPer3(week);
    }

    public List<Fillin> getTableFillinVCMFriPmTelPer3(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMFriPmTelPer3(week);
    }


    public List<Fillin> getTableFillinVCMMonAmTel2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMMonAmTel2(week);
    }

    public List<Fillin> getTableFillinVCMMonPmTel2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMMonPmTel2(week);
    }
    public List<Fillin> getTableFillinVCMTueAmTel2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMTueAmTel2(week);
    }

    public List<Fillin> getTableFillinVCMTuePmTel2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTuePmTel2(week);
    }
    public List<Fillin> getTableFillinVCMWedAmTel2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMWedAmTel2(week);
    }

    public List<Fillin> getTableFillinVCMWedPmTel2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMWedPmTel2(week);
    }
    public List<Fillin> getTableFillinVCMThuAmTel2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMThuAmTel2(week);
    }

    public List<Fillin> getTableFillinVCMThuPmTel2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMThuPmTel2(week);
    }
    public List<Fillin> getTableFillinVCMFriAmTel2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMFriAmTel2(week);
    }

    public List<Fillin> getTableFillinVCMFriPmTel2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMFriPmTel2(week);
    }

    public List<Fillin> getTableFillinVCMMonAmTel2Per2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMMonAmTel2Per2(week);
    }

    public List<Fillin> getTableFillinVCMMonPmTel2Per2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMMonPmTel2Per2(week);
    }
    public List<Fillin> getTableFillinVCMTueAmTel2Per2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMTueAmTel2Per2(week);
    }

    public List<Fillin> getTableFillinVCMTuePmTel2Per2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTuePmTel2Per2(week);
    }
    public List<Fillin> getTableFillinVCMWedAmTel2Per2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMWedAmTel2Per2(week);
    }

    public List<Fillin> getTableFillinVCMWedPmTel2Per2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMWedPmTel2Per2(week);
    }
    public List<Fillin> getTableFillinVCMThuAmTel2Per2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMThuAmTel2Per2(week);
    }

    public List<Fillin> getTableFillinVCMThuPmTel2Per2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMThuPmTel2Per2(week);
    }
    public List<Fillin> getTableFillinVCMFriAmTel2Per2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMFriAmTel2Per2(week);
    }

    public List<Fillin> getTableFillinVCMFriPmTel2Per2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMFriPmTel2Per2(week);
    }

    public List<Fillin> getTableFillinVCMMonAmZabbix(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMMonAmZabbix(week);
    }

    public List<Fillin> getTableFillinVCMMonPmZabbix(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMMonPmZabbix(week);
    }
    public List<Fillin> getTableFillinVCMTueAmZabbix(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMTueAmZabbix(week);
    }

    public List<Fillin> getTableFillinVCMTuePmZabbix(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTuePmZabbix(week);
    }
    public List<Fillin> getTableFillinVCMWedAmZabbix(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMWedAmZabbix(week);
    }

    public List<Fillin> getTableFillinVCMWedPmZabbix(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMWedPmZabbix(week);
    }
    public List<Fillin> getTableFillinVCMThuAmZabbix (String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMThuAmZabbix(week);
    }

    public List<Fillin> getTableFillinVCMThuPmZabbix(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMThuPmZabbix(week);
    }

    public List<Fillin> getTableFillinVCMFriAmZabbix(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMFriAmZabbix(week);
    }

    public List<Fillin> getTableFillinVCMFriPmZabbix(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMFriPmZabbix(week);
    }

    public List<Fillin> getTableFillinVCMMonAmINCPer1(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMMonAmINCPer1(week);
    }

    public List<Fillin> getTableFillinVCMMonPmINCPer1(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMMonPmINCPer1(week);
    }
    public List<Fillin> getTableFillinVCMTueAmINCPer1(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMTueAmINCPer1(week);
    }

    public List<Fillin> getTableFillinVCMTuePmINCPer1(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTuePmINCPer1(week);
    }
    public List<Fillin> getTableFillinVCMWedAmINCPer1(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMWedAmINCPer1(week);
    }

    public List<Fillin> getTableFillinVCMWedPmINCPer1(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMWedPmINCPer1(week);
    }
    public List<Fillin> getTableFillinVCMThuAmINCPer1(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMThuAmINCPer1(week);
    }

    public List<Fillin> getTableFillinVCMThuPmINCPer1(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMThuPmINCPer1(week);
    }

    public List<Fillin> getTableFillinVCMFriAmINCPer1(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMFriAmINCPer1(week);
    }

    public List<Fillin> getTableFillinVCMFriPmINCPer1(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMFriPmINCPer1(week);
    }

    public List<Fillin> getTableFillinVCMMonAmINCPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMMonAmINCPer2(week);
    }

    public List<Fillin> getTableFillinVCMMonPmINCPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMMonPmINCPer2(week);
    }

    public List<Fillin> getTableFillinVCMTueAmINCPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMTueAmINCPer2(week);
    }

    public List<Fillin> getTableFillinVCMTuePmINCPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTuePmINCPer2(week);
    }
    public List<Fillin> getTableFillinVCMWedAmINCPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMWedAmINCPer2(week);
    }

    public List<Fillin> getTableFillinVCMWedPmINCPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMWedPmINCPer2(week);
    }
    public List<Fillin> getTableFillinVCMThuAmINCPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMThuAmINCPer2(week);
    }

    public List<Fillin> getTableFillinVCMThuPmINCPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMThuPmINCPer2(week);
    }

    public List<Fillin> getTableFillinVCMFriAmINCPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMFriAmINCPer2(week);
    }

    public List<Fillin> getTableFillinVCMFriPmINCPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMFriPmINCPer2(week);
    }

    public List<Fillin> getTableFillinVCMMonAmINCPer3(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMMonAmINCPer3(week);
    }

    public List<Fillin> getTableFillinVCMMonPmINCPer3(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMMonPmINCPer3(week);
    }
    public List<Fillin> getTableFillinVCMTueAmINCPer3(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMTueAmINCPer3(week);
    }

    public List<Fillin> getTableFillinVCMTuePmINCPer3(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTuePmINCPer3(week);
    }
    public List<Fillin> getTableFillinVCMWedAmINCPer3(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMWedAmINCPer3(week);
    }

    public List<Fillin> getTableFillinVCMWedPmINCPer3(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMWedPmINCPer3(week);
    }
    public List<Fillin> getTableFillinVCMThuAmINCPer3(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMThuAmINCPer3(week);
    }

    public List<Fillin> getTableFillinVCMThuPmINCPer3(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMThuPmINCPer3(week);
    }

    public List<Fillin> getTableFillinVCMFriAmINCPer3(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMFriAmINCPer3(week);
    }

    public List<Fillin> getTableFillinVCMFriPmINCPer3(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMFriPmINCPer3(week);
    }

    public List<Fillin> getTableFillinVCMMonAmINCPer4(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMMonAmINCPer4(week);
    }

    public List<Fillin> getTableFillinVCMMonPmINCPer4(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMMonPmINCPer4(week);
    }
    public List<Fillin> getTableFillinVCMTueAmINCPer4(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMTueAmINCPer4(week);
    }

    public List<Fillin> getTableFillinVCMTuePmINCPer4(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTuePmINCPer4(week);
    }
    public List<Fillin> getTableFillinVCMWedAmINCPer4(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMWedAmINCPer4(week);
    }

    public List<Fillin> getTableFillinVCMWedPmINCPer4(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMWedPmINCPer1(week);
    }
    public List<Fillin> getTableFillinVCMThuAmINCPer4(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMThuAmINCPer4(week);
    }

    public List<Fillin> getTableFillinVCMThuPmINCPer4(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMThuPmINCPer4(week);
    }

    public List<Fillin> getTableFillinVCMFriAmINCPer4(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMFriAmINCPer4(week);
    }

    public List<Fillin> getTableFillinVCMFriPmINCPer4(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMFriPmINCPer4(week);
    }

    public List<Fillin> getTableFillinVCMMonAmSR(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMMonAmSR(week);
    }

    public List<Fillin> getTableFillinVCMMonPmSR(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMMonPmSR(week);
    }
    public List<Fillin> getTableFillinVCMTueAmSR(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMTueAmSR(week);
    }

    public List<Fillin> getTableFillinVCMTuePmSR(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTuePmSR(week);
    }
    public List<Fillin> getTableFillinVCMWedAmSR(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMWedAmSR(week);
    }

    public List<Fillin> getTableFillinVCMWedPmSR(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMWedPmSR(week);
    }
    public List<Fillin> getTableFillinVCMThuAmSR(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMThuAmSR(week);
    }

    public List<Fillin> getTableFillinVCMThuPmSR(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMThuPmSR(week);
    }

    public List<Fillin> getTableFillinVCMFriAmSR(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMFriAmSR(week);
    }

    public List<Fillin> getTableFillinVCMFriPmSR(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMFriPmSR(week);
    }

    public List<Fillin> getTableFillinVCMMonAmSRPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMMonAmSRPer2(week);
    }

    public List<Fillin> getTableFillinVCMMonPmSRPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMMonPmSRPer2(week);
    }
    public List<Fillin> getTableFillinVCMTueAmSRPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMTueAmSRPer2(week);
    }

    public List<Fillin> getTableFillinVCMTuePmSRPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTuePmSRPer2(week);
    }
    public List<Fillin> getTableFillinVCMWedAmSRPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMWedAmSRPer2(week);
    }

    public List<Fillin> getTableFillinVCMWedPmSRPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMWedPmSR(week);
    }
    public List<Fillin> getTableFillinVCMThuAmSRPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMThuAmSRPer2(week);
    }

    public List<Fillin> getTableFillinVCMThuPmSRPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMThuPmSRPer2(week);
    }

    public List<Fillin> getTableFillinVCMFriAmSRPer2(String week) throws SQLException {
        return fillin2DAO.getTableFillinVCMFriAmSR(week);
    }

    public List<Fillin> getTableFillinVCMFriPmSRPer2(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMFriPmSR(week);
    }

    public List<Fillin> getTableFillinVCMTaskMonAm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTaskMonAm(week);
    }

    public List<Fillin> getTableFillinVCMTaskMonPm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTaskMonPm(week);
    }

    public List<Fillin> getTableFillinVCMTaskTueAm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTaskTueAm(week);
    }
    public List<Fillin> getTableFillinVCMTaskTuePm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTaskTuePm(week);
    }

    public List<Fillin> getTableFillinVCMTaskWedAm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTaskWedAm(week);
    }
    public List<Fillin> getTableFillinVCMTaskWedPm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTaskWedPm(week);
    }

    public List<Fillin> getTableFillinVCMTaskThuAm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTaskThuAm(week);
    }
    public List<Fillin> getTableFillinVCMTaskThuPm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTaskThuPm(week);
    }

    public List<Fillin> getTableFillinVCMTaskFriAm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTaskFriAm(week);
    }
    public List<Fillin> getTableFillinVCMTaskFriPm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMTaskFriPm(week);
    }

    public List<Fillin>  getTableFillinVCMAbsentMonAm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMAbsentMonAm(week);
    }


    public List<Fillin>  getTableFillinVCMAbsentMonPm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMAbsentMonPm(week);
    }

    public List<Fillin>  getTableFillinVCMAbsentTueAm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMAbsentTueAm(week);
    }
    public List<Fillin>  getTableFillinVCMAbsentTuePm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMAbsentTuePm(week);
    }

    public List<Fillin>  getTableFillinVCMAbsentWedAm(String week)throws SQLException {
        return fillin2DAO. getTableFillinVCMAbsentWedAm(week);
    }

    public List<Fillin>  getTableFillinVCMAbsentWedPm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMAbsentWedPm(week);
    }

    public List<Fillin>  getTableFillinVCMAbsentThuAm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMAbsentThuAm(week);
    }

    public List<Fillin>  getTableFillinVCMAbsentThuPm(String week)throws SQLException {
        return fillin2DAO.getTableFillinVCMAbsentThuPm(week);
    }

    public List<Fillin>  getTableFillinVCMAbsentFriAm(String week)throws SQLException {
        return fillin2DAO. getTableFillinVCMAbsentFriAm(week);
    }

    public List<Fillin>  getTableFillinVCMAbsentFriPm(String week)throws SQLException {
        return fillin2DAO. getTableFillinVCMAbsentFriPm(week);
    }
}
