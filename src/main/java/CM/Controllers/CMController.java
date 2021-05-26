package CM.Controllers;

import CM.Model.*;
import CM.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.Date;

/**
 * Tineke Haverhals
 * 21/03/21.
 */
@Controller
public class CMController {
    @Autowired
    private StaffMemberServices staffMemberServices;

    @Autowired
    private TasksServices tasksServices;

    @Autowired
    private FunctionServices functionServices;

    @Autowired
    private FillinServices fillinServices;

    @Autowired
    private FillinServices2 fillinServices2;

    @Autowired
    private FillinServices3 fillinServices3;

    @Autowired
    private FillinServices4 fillinServices4;

    @Autowired
    private LocationServices locationServices;

    @Autowired
    private DateNameServices dateNameServices;

    //login
    @GetMapping("login")
    public String login(Model model, StaffMember staffMember) throws SQLException {
        model.addAttribute("staffMember", new StaffMember(""));
        return "index";
    }


    @PostMapping("login")
        public String login2(@ModelAttribute("staffMember") StaffMember staffMemberReceived, HttpSession session) throws SQLException {
            StaffMember staffMember = staffMemberServices.getUserByEmployeeId(staffMemberReceived.getEmployeeId());
            if (staffMember != null) {
                System.out.println("user has logged in");
                session.setAttribute("staffMember", staffMember);
                String responsibility = staffMember.getResponsibility();
                String department = staffMember.getDepartment();
                if (responsibility.equals("Yes")) {
                    switch (department) {
                        case "LCM":
                            return "redirect:fillinLCM";
                        case "VCM":
                            return "redirect:fillinVCM";
                        case "MCFG":
                            return "redirect:fillinMCFG";
                        default:
                            return "redirect:index";
                    }
                } else {
                    switch (department) {
                        case "LCM":
                            return "redirect:fillinLCM2";
                        case "VCM":
                            return "redirect:fillinVCM2";
                        case "MCFG":
                            return "redirect:fillinMCFG2";
                        default:
                            return "redirect:index";
                    }
                }
            } else System.out.println("not logged in");
            return "index";
        }

    //FILL IN
    @GetMapping("pageFillin")
    public String pageFillin(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        String responsibility = staffMember.getResponsibility();
        String department = staffMember.getDepartment();
        System.out.println(responsibility);
        if (responsibility.equals("Yes")) {
            switch (department) {
                case "LCM":
                    return "redirect:fillinLCM";
                case "VCM":
                    return "redirect:fillinVCM";
                case "MCFG":
                    return "redirect:fillinLMCFG";
                default:
                    return "redirect:index";
            }
        } else {
            switch (department) {
                case "LCM":
                    return "redirect:fillinLCM2";
                case "VCM":
                    return "redirect:fillinVCM2";
                case "MCFG":
                    return "redirect:fillinMCFG2";
                default:
                    return "redirect:index";
            }
        }
    }

    @GetMapping("fillinLCM")
    public String fillinLCM(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        return "fillinLCM";
    }

    @GetMapping("newFillinLCM")
    public String newFillinLCM(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        model.addAttribute("fillinLCMWeek", fillinServices.getTableFillinLCMWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionLCMsMonAm", fillinServices.getAllfunctionLCMMonAm(fillin.getWeek()));
        model.addAttribute("functionLCMsMonPm", fillinServices.getAllfunctionLCMMonPm(fillin.getWeek()));
        model.addAttribute("functionLCMsTueAm", fillinServices.getAllfunctionLCMTueAm(fillin.getWeek()));
        model.addAttribute("functionLCMsTuePm", fillinServices.getAllfunctionLCMTuePm(fillin.getWeek()));
        model.addAttribute("functionLCMsWedAm", fillinServices.getAllfunctionLCMWedAm(fillin.getWeek()));
        model.addAttribute("functionLCMsWedPm", fillinServices.getAllfunctionLCMWedPm(fillin.getWeek()));
        model.addAttribute("functionLCMsThuAm", fillinServices.getAllfunctionLCMThuAm(fillin.getWeek()));
        model.addAttribute("functionLCMsThuPm", fillinServices.getAllfunctionLCMThuPm(fillin.getWeek()));
        model.addAttribute("functionLCMsFriAm", fillinServices.getAllfunctionLCMFriAm(fillin.getWeek()));
        model.addAttribute("functionLCMsFriPm", fillinServices.getAllfunctionLCMFriPm(fillin.getWeek()));
        return "sendfillinLCM";
    }

    @GetMapping("sendnewFillinLCM")
    public String sendnewFillinLCM(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        String department = staffMember.getDepartment();
        model.addAttribute("newFillin", fillinServices.getAddFillin(IdStaffMember, fillin.getWeek(), department, fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "fillinLCM";
    }

    @GetMapping("fillinLCM2")
    public String fillinLCM2(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        return "fillinLCM2";
    }

    @GetMapping("newFillinLCM2")
    public String newFillinLCM2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        model.addAttribute("fillinLCMWeek", fillinServices.getTableFillinLCMWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionLCMsMonAm", fillinServices.getAllfunctionLCMMonAm(fillin.getWeek()));
        model.addAttribute("functionLCMsMonPm", fillinServices.getAllfunctionLCMMonPm(fillin.getWeek()));
        model.addAttribute("functionLCMsTueAm", fillinServices.getAllfunctionLCMTueAm(fillin.getWeek()));
        model.addAttribute("functionLCMsTuePm", fillinServices.getAllfunctionLCMTuePm(fillin.getWeek()));
        model.addAttribute("functionLCMsWedAm", fillinServices.getAllfunctionLCMWedAm(fillin.getWeek()));
        model.addAttribute("functionLCMsWedPm", fillinServices.getAllfunctionLCMWedPm(fillin.getWeek()));
        model.addAttribute("functionLCMsThuAm", fillinServices.getAllfunctionLCMThuAm(fillin.getWeek()));
        model.addAttribute("functionLCMsThuPm", fillinServices.getAllfunctionLCMThuPm(fillin.getWeek()));
        model.addAttribute("functionLCMsFriAm", fillinServices.getAllfunctionLCMFriAm(fillin.getWeek()));
        model.addAttribute("functionLCMsFriPm", fillinServices.getAllfunctionLCMFriPm(fillin.getWeek()));
        return "sendfillinLCM2";
    }
    @GetMapping("sendnewFillinLCM2")
    public String sendnewFillinLCM2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        String department = staffMember.getDepartment();
        model.addAttribute("newFillin", fillinServices.getAddFillin(IdStaffMember, fillin.getWeek(), department, fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "fillinLCM2";
    }

    @GetMapping("fillinVCM")
    public String fillinVCM(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        return "fillinVCM";
    }

    @GetMapping("newFillinVCM")
    public String newFillinVCM(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        model.addAttribute("fillinVCMWeek", fillinServices.getTableFillinVCMWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionVCMsMonAm", fillinServices.getAllfunctionVCMMonAm(fillin.getWeek()));
        model.addAttribute("functionVCMsMonPm", fillinServices.getAllfunctionVCMMonPm(fillin.getWeek()));
        model.addAttribute("functionVCMsTueAm", fillinServices.getAllfunctionVCMTueAm(fillin.getWeek()));
        model.addAttribute("functionVCMsTuePm", fillinServices.getAllfunctionVCMTuePm(fillin.getWeek()));
        model.addAttribute("functionVCMsWedAm", fillinServices.getAllfunctionVCMWedAm(fillin.getWeek()));
        model.addAttribute("functionVCMsWedPm", fillinServices.getAllfunctionVCMWedPm(fillin.getWeek()));
        model.addAttribute("functionVCMsThuAm", fillinServices.getAllfunctionVCMThuAm(fillin.getWeek()));
        model.addAttribute("functionVCMsThuPm", fillinServices.getAllfunctionVCMThuPm(fillin.getWeek()));
        model.addAttribute("functionVCMsFriAm", fillinServices.getAllfunctionVCMFriAm(fillin.getWeek()));
        model.addAttribute("functionVCMsFriPm", fillinServices.getAllfunctionVCMFriPm(fillin.getWeek()));
        return "sendfillinVCM";
    }
    @GetMapping("sendnewFillinVCM")
    public String sendnewFillinVCM(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        String department = staffMember.getDepartment();
        model.addAttribute("newFillin", fillinServices.getAddFillin(IdStaffMember, fillin.getWeek(), department, fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "fillinVCM";
    }

    @GetMapping("fillinVCM2")
    public String fillinVCM2(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        return "fillinVCM2";
    }

    @GetMapping("newFillinVCM2")
    public String newFillinVCM2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        model.addAttribute("fillinVCMWeek", fillinServices.getTableFillinVCMWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionVCMsMonAm", fillinServices.getAllfunctionVCMMonAm(fillin.getWeek()));
        model.addAttribute("functionVCMsMonPm", fillinServices.getAllfunctionVCMMonPm(fillin.getWeek()));
        model.addAttribute("functionVCMsTueAm", fillinServices.getAllfunctionVCMTueAm(fillin.getWeek()));
        model.addAttribute("functionVCMsTuePm", fillinServices.getAllfunctionVCMTuePm(fillin.getWeek()));
        model.addAttribute("functionVCMsWedAm", fillinServices.getAllfunctionVCMWedAm(fillin.getWeek()));
        model.addAttribute("functionVCMsWedPm", fillinServices.getAllfunctionVCMWedPm(fillin.getWeek()));
        model.addAttribute("functionVCMsThuAm", fillinServices.getAllfunctionVCMThuAm(fillin.getWeek()));
        model.addAttribute("functionVCMsThuPm", fillinServices.getAllfunctionVCMThuPm(fillin.getWeek()));
        model.addAttribute("functionVCMsFriAm", fillinServices.getAllfunctionVCMFriAm(fillin.getWeek()));
        model.addAttribute("functionVCMsFriPm", fillinServices.getAllfunctionVCMFriPm(fillin.getWeek()));
        return "sendfillinVCM2";
    }
    @GetMapping("sendnewFillinVCM2")
    public String sendnewFillinVCM2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        String department = staffMember.getDepartment();
        model.addAttribute("newFillin", fillinServices.getAddFillin(IdStaffMember, fillin.getWeek(), department, fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "fillinVCM2";
    }


    @GetMapping("fillinMCFG")
    public String fillinMCFG(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        return "fillinMCFG";
    }

    @GetMapping("newFillinMCFG")
    public String newFillinMCFG(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        model.addAttribute("fillinMCFGWeek", fillinServices.getTableFillinMCFGWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionMCFGsMonAm", fillinServices.getAllfunctionMCFGMonAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsMonPm", fillinServices.getAllfunctionMCFGMonPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsTueAm", fillinServices.getAllfunctionMCFGTueAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsTuePm", fillinServices.getAllfunctionMCFGTuePm(fillin.getWeek()));
        model.addAttribute("functionMCFGsWedAm", fillinServices.getAllfunctionMCFGWedAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsWedPm", fillinServices.getAllfunctionMCFGWedPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsThuAm", fillinServices.getAllfunctionMCFGThuAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsThuPm", fillinServices.getAllfunctionMCFGThuPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsFriAm", fillinServices.getAllfunctionMCFGFriAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsFriPm", fillinServices.getAllfunctionMCFGFriPm(fillin.getWeek()));
        return "sendfillinMCFG";
    }
    @GetMapping("sendnewFillinMCFG")
    public String sendnewFillinMCFG(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        String department = staffMember.getDepartment();
        model.addAttribute("newFillin", fillinServices.getAddFillin(IdStaffMember, fillin.getWeek(), department, fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "fillinMCFG";
    }

    @GetMapping("fillinMCFG2")
    public String fillinMCFG2(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        return "fillinMCFG2";
    }

    @GetMapping("newFillinMCFG2")
    public String newFillinMCFG2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        model.addAttribute("fillinMCFGWeek", fillinServices.getTableFillinMCFGWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionMCFGsMonAm", fillinServices.getAllfunctionMCFGMonAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsMonPm", fillinServices.getAllfunctionMCFGMonPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsTueAm", fillinServices.getAllfunctionMCFGTueAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsTuePm", fillinServices.getAllfunctionMCFGTuePm(fillin.getWeek()));
        model.addAttribute("functionMCFGsWedAm", fillinServices.getAllfunctionMCFGWedAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsWedPm", fillinServices.getAllfunctionMCFGWedPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsThuAm", fillinServices.getAllfunctionMCFGThuAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsThuPm", fillinServices.getAllfunctionMCFGThuPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsFriAm", fillinServices.getAllfunctionMCFGFriAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsFriPm", fillinServices.getAllfunctionMCFGFriPm(fillin.getWeek()));
        return "sendfillinMCFG2";
    }

    @GetMapping("sendnewFillinMCFG2")
    public String sendnewFillinMCFG2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        String department = staffMember.getDepartment();
        model.addAttribute("newFillin", fillinServices.getAddFillin(IdStaffMember, fillin.getWeek(), department, fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "fillinMCFG2";
    }

    @GetMapping("changefillin")
    public String changefillin(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        String responsibility = staffMember.getResponsibility();
        String department = staffMember.getDepartment();
        System.out.println(responsibility);
        if (responsibility.equals("Yes")) {
            switch (department) {
                case "LCM":
                    return "redirect:changefillinLCM";
                case "VCM":
                    return "redirect:changefillinVCM";
                case "MCFG":
                    return "redirect:changefillinMCFG";
                default:
                    return "redirect:index";
            }
        } else {
            switch (department) {
                case "LCM":
                    return "redirect:changefillinLCM2";
                case "VCM":
                    return "redirect:changefillinVCM2";
                case "MCFG":
                    return "redirect:changefillinMCFG2";
                default:
                    return "redirect:index";
            }
        }
    }

    @GetMapping("changefillinLCM")
    public String changefillinLCM(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        return "changefillinLCM";
    }

    @GetMapping("changepagefillinLCM")
    public String changepagefillinLCM(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("fillinLCMWeek", fillinServices.getTableFillinLCMWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionLCMsMonAm", fillinServices.getAllfunctionLCMMonAm(fillin.getWeek()));
        model.addAttribute("functionLCMsMonPm", fillinServices.getAllfunctionLCMMonPm(fillin.getWeek()));
        model.addAttribute("functionLCMsTueAm", fillinServices.getAllfunctionLCMTueAm(fillin.getWeek()));
        model.addAttribute("functionLCMsTuePm", fillinServices.getAllfunctionLCMTuePm(fillin.getWeek()));
        model.addAttribute("functionLCMsWedAm", fillinServices.getAllfunctionLCMWedAm(fillin.getWeek()));
        model.addAttribute("functionLCMsWedPm", fillinServices.getAllfunctionLCMWedPm(fillin.getWeek()));
        model.addAttribute("functionLCMsThuAm", fillinServices.getAllfunctionLCMThuAm(fillin.getWeek()));
        model.addAttribute("functionLCMsThuPm", fillinServices.getAllfunctionLCMThuPm(fillin.getWeek()));
        model.addAttribute("functionLCMsFriAm", fillinServices.getAllfunctionLCMFriAm(fillin.getWeek()));
        model.addAttribute("functionLCMsFriPm", fillinServices.getAllfunctionLCMFriPm(fillin.getWeek()));
        return "changefillinLCMPage";
    }

    @GetMapping("sendchangeFillinLCM")
    public String sendchangeFillinLCM(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        String department = staffMember.getDepartment();
        model.addAttribute("changeLCM", fillinServices.getChangeFillin(IdStaffMember, fillin.getWeek(), fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changefillinLCM";
    }

    @GetMapping("changefillinLCM2")
    public String changefillinLCM2(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        return "changefillinLCM2";
    }

    @GetMapping("changepagefillinLCM2")
    public String changepagefillinLCM2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("fillinLCMWeek", fillinServices.getTableFillinLCMWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionLCMsMonAm", fillinServices.getAllfunctionLCMMonAm(fillin.getWeek()));
        model.addAttribute("functionLCMsMonPm", fillinServices.getAllfunctionLCMMonPm(fillin.getWeek()));
        model.addAttribute("functionLCMsTueAm", fillinServices.getAllfunctionLCMTueAm(fillin.getWeek()));
        model.addAttribute("functionLCMsTuePm", fillinServices.getAllfunctionLCMTuePm(fillin.getWeek()));
        model.addAttribute("functionLCMsWedAm", fillinServices.getAllfunctionLCMWedAm(fillin.getWeek()));
        model.addAttribute("functionLCMsWedPm", fillinServices.getAllfunctionLCMWedPm(fillin.getWeek()));
        model.addAttribute("functionLCMsThuAm", fillinServices.getAllfunctionLCMThuAm(fillin.getWeek()));
        model.addAttribute("functionLCMsThuPm", fillinServices.getAllfunctionLCMThuPm(fillin.getWeek()));
        model.addAttribute("functionLCMsFriAm", fillinServices.getAllfunctionLCMFriAm(fillin.getWeek()));
        model.addAttribute("functionLCMsFriPm", fillinServices.getAllfunctionLCMFriPm(fillin.getWeek()));
        return "changefillinLCMPage2";
    }

    @GetMapping("sendchangeFillinLCM2")
    public String sendchangeFillinLCM2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        String department = staffMember.getDepartment();
        model.addAttribute("changeLCM", fillinServices.getChangeFillin(IdStaffMember, fillin.getWeek(), fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changefillinLCM2";
    }

    @GetMapping("changefillinVCM")
    public String changefillinVCM(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        return "changefillinVCM";
    }

    @GetMapping("changepagefillinVCM")
    public String changepagefillinVCM(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("fillinVCMWeek", fillinServices.getTableFillinVCMWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionVCMsMonAm", fillinServices.getAllfunctionVCMMonAm(fillin.getWeek()));
        model.addAttribute("functionVCMsMonPm", fillinServices.getAllfunctionVCMMonPm(fillin.getWeek()));
        model.addAttribute("functionVCMsTueAm", fillinServices.getAllfunctionVCMTueAm(fillin.getWeek()));
        model.addAttribute("functionVCMsTuePm", fillinServices.getAllfunctionVCMTuePm(fillin.getWeek()));
        model.addAttribute("functionVCMsWedAm", fillinServices.getAllfunctionVCMWedAm(fillin.getWeek()));
        model.addAttribute("functionVCMsWedPm", fillinServices.getAllfunctionVCMWedPm(fillin.getWeek()));
        model.addAttribute("functionVCMsThuAm", fillinServices.getAllfunctionVCMThuAm(fillin.getWeek()));
        model.addAttribute("functionVCMsThuPm", fillinServices.getAllfunctionVCMThuPm(fillin.getWeek()));
        model.addAttribute("functionVCMsFriAm", fillinServices.getAllfunctionVCMFriAm(fillin.getWeek()));
        model.addAttribute("functionVCMsFriPm", fillinServices.getAllfunctionVCMFriPm(fillin.getWeek()));
        return "changefillinVCMPage";
    }

    @GetMapping("sendchangeFillinVCM")
    public String sendchangeFillinVCM(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        String department = staffMember.getDepartment();
        model.addAttribute("changeVCM", fillinServices.getChangeFillin(IdStaffMember, fillin.getWeek(), fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changefillinVCM";
    }

    @GetMapping("changefillinVCM2")
    public String changefillinVCM2(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        return "changefillinVCM2";
    }

    @GetMapping("changepagefillinVCM2")
    public String changepagefillinVCM2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("fillinVCMWeek", fillinServices.getTableFillinVCMWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionVCMsMonAm", fillinServices.getAllfunctionVCMMonAm(fillin.getWeek()));
        model.addAttribute("functionVCMsMonPm", fillinServices.getAllfunctionVCMMonPm(fillin.getWeek()));
        model.addAttribute("functionVCMsTueAm", fillinServices.getAllfunctionVCMTueAm(fillin.getWeek()));
        model.addAttribute("functionVCMsTuePm", fillinServices.getAllfunctionVCMTuePm(fillin.getWeek()));
        model.addAttribute("functionVCMsWedAm", fillinServices.getAllfunctionVCMWedAm(fillin.getWeek()));
        model.addAttribute("functionVCMsWedPm", fillinServices.getAllfunctionVCMWedPm(fillin.getWeek()));
        model.addAttribute("functionVCMsThuAm", fillinServices.getAllfunctionVCMThuAm(fillin.getWeek()));
        model.addAttribute("functionVCMsThuPm", fillinServices.getAllfunctionVCMThuPm(fillin.getWeek()));
        model.addAttribute("functionVCMsFriAm", fillinServices.getAllfunctionVCMFriAm(fillin.getWeek()));
        model.addAttribute("functionVCMsFriPm", fillinServices.getAllfunctionVCMFriPm(fillin.getWeek()));
        return "changefillinVCMPage2";
    }

    @GetMapping("sendchangeFillinVCM2")
    public String sendchangeFillinVCM2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        String department = staffMember.getDepartment();
        model.addAttribute("changeVCM", fillinServices.getChangeFillin(IdStaffMember, fillin.getWeek(), fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changefillinVCM2";
    }

    @GetMapping("changefillinMCFG")
    public String changefillinMCFG(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        return "changefillinMCFG";
    }

    @GetMapping("changepagefillinMCFG")
    public String changepagefillinMCFG(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("fillinMCFGWeek", fillinServices.getTableFillinMCFGWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionMCFGsMonAm", fillinServices.getAllfunctionMCFGMonAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsMonPm", fillinServices.getAllfunctionMCFGMonPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsTueAm", fillinServices.getAllfunctionMCFGTueAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsTuePm", fillinServices.getAllfunctionMCFGTuePm(fillin.getWeek()));
        model.addAttribute("functionMCFGsWedAm", fillinServices.getAllfunctionMCFGWedAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsWedPm", fillinServices.getAllfunctionMCFGWedPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsThuAm", fillinServices.getAllfunctionMCFGThuAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsThuPm", fillinServices.getAllfunctionMCFGThuPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsFriAm", fillinServices.getAllfunctionMCFGFriAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsFriPm", fillinServices.getAllfunctionMCFGFriPm(fillin.getWeek()));
        return "changefillinMCFGPage";
    }

    @GetMapping("sendchangeFillinMCFG")
    public String sendchangeFillinMCFG(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        String department = staffMember.getDepartment();
        model.addAttribute("changeMCFG", fillinServices.getChangeFillin(IdStaffMember, fillin.getWeek(), fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changefillinMCFG";
    }


    @GetMapping("changefillinMCFG2")
    public String changefillinMCFG2(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        return "changefillinMCFG2";
    }

    @GetMapping("changepagefillinMCFG2")
    public String changepagefillinMCFG2 (Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("fillinMCFGWeek", fillinServices.getTableFillinMCFGWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionMCFGsMonAm", fillinServices.getAllfunctionMCFGMonAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsMonPm", fillinServices.getAllfunctionMCFGMonPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsTueAm", fillinServices.getAllfunctionMCFGTueAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsTuePm", fillinServices.getAllfunctionMCFGTuePm(fillin.getWeek()));
        model.addAttribute("functionMCFGsWedAm", fillinServices.getAllfunctionMCFGWedAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsWedPm", fillinServices.getAllfunctionMCFGWedPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsThuAm", fillinServices.getAllfunctionMCFGThuAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsThuPm", fillinServices.getAllfunctionMCFGThuPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsFriAm", fillinServices.getAllfunctionMCFGFriAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsFriPm", fillinServices.getAllfunctionMCFGFriPm(fillin.getWeek()));
        return "changefillinMCFGPage2";
    }

    @GetMapping("sendchangeFillinMCFG2")
    public String sendchangeFillinMCFG2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        String department = staffMember.getDepartment();
        model.addAttribute("changeMCFG", fillinServices.getChangeFillin(IdStaffMember, fillin.getWeek(), fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changefillinMCFG2";
    }
    //LCM
    @GetMapping("lcm")
    public String lcm(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "LCM";
    }

    @GetMapping("searchLCM")
    public String searchLCM(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinLCMWeek", fillinServices.getTableFillinLCMWeek(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmTel", fillinServices4.getTableFillinLCMMonAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmTel", fillinServices4.getTableFillinLCMMonPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmTel", fillinServices4.getTableFillinLCMTueAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmTel", fillinServices4.getTableFillinLCMTuePmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmTel", fillinServices4.getTableFillinLCMWedAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmTel", fillinServices4.getTableFillinLCMWedPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmTel", fillinServices4.getTableFillinLCMThuAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmTel", fillinServices4.getTableFillinLCMThuPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmTel", fillinServices4.getTableFillinLCMFriAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmTel", fillinServices4.getTableFillinLCMFriPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmTelPer2", fillinServices4.getTableFillinLCMMonAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmTelPer2", fillinServices4.getTableFillinLCMMonPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmTelPer2", fillinServices4.getTableFillinLCMTueAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmTelPer2", fillinServices4.getTableFillinLCMTuePmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmTelPer2", fillinServices4.getTableFillinLCMWedAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmTelPer2", fillinServices4.getTableFillinLCMWedPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmTelPer2", fillinServices4.getTableFillinLCMThuAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmTelPer2", fillinServices4.getTableFillinLCMThuPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmTelPer2", fillinServices4.getTableFillinLCMFriAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmTelPer2", fillinServices4.getTableFillinLCMFriPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmTel2Per", fillinServices4.getTableFillinLCMMonAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmTel2Per", fillinServices4.getTableFillinLCMMonPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmTel2Per", fillinServices4.getTableFillinLCMTueAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmTel2Per", fillinServices4.getTableFillinLCMTuePmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmTel2Per", fillinServices4.getTableFillinLCMWedAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmTel2Per", fillinServices4.getTableFillinLCMWedPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmTel2Per", fillinServices4.getTableFillinLCMThuAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmTel2Per", fillinServices4.getTableFillinLCMThuPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmTel2Per", fillinServices4.getTableFillinLCMFriAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmTel2Per", fillinServices4.getTableFillinLCMFriPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmINCPer1", fillinServices4.getTableFillinLCMMonAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmINCPer1", fillinServices4.getTableFillinLCMMonPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmINCPer1", fillinServices4.getTableFillinLCMTueAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmINCPer1", fillinServices4.getTableFillinLCMTuePmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmINCPer1", fillinServices4.getTableFillinLCMWedAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmINCPer1", fillinServices4.getTableFillinLCMWedPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmINCPer1", fillinServices4.getTableFillinLCMThuAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmINCPer1", fillinServices4.getTableFillinLCMThuPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmINCPer1", fillinServices4.getTableFillinLCMFriAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmINCPer1", fillinServices4.getTableFillinLCMFriPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmINCPer2", fillinServices4.getTableFillinLCMMonAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmINCPer2", fillinServices4.getTableFillinLCMMonPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmINCPer2", fillinServices4.getTableFillinLCMTueAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmINCPer2", fillinServices4.getTableFillinLCMTuePmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmINCPer2", fillinServices4.getTableFillinLCMWedAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmINCPer2", fillinServices4.getTableFillinLCMWedPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmINCPer2", fillinServices4.getTableFillinLCMThuAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmINCPer2", fillinServices4.getTableFillinLCMThuPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmINCPer2", fillinServices4.getTableFillinLCMFriAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmINCPer2", fillinServices4.getTableFillinLCMFriPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmSR", fillinServices4.getTableFillinLCMMonAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmSR", fillinServices4.getTableFillinLCMMonPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmSR", fillinServices4.getTableFillinLCMTueAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmSR", fillinServices4.getTableFillinLCMTuePmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmSR", fillinServices4.getTableFillinLCMWedAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmSR", fillinServices4.getTableFillinLCMWedPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmSR", fillinServices4.getTableFillinLCMThuAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmSR", fillinServices4.getTableFillinLCMThuPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmSR", fillinServices4.getTableFillinLCMFriAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmSR", fillinServices4.getTableFillinLCMFriPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmBalie", fillinServices4.getTableFillinLCMMonAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmBalie", fillinServices4.getTableFillinLCMMonPmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmBalie", fillinServices4.getTableFillinLCMTueAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmBalie", fillinServices4.getTableFillinLCMTuePmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmBalie", fillinServices4.getTableFillinLCMWedAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmBalie", fillinServices4.getTableFillinLCMWedPmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmBalie", fillinServices4.getTableFillinLCMThuAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmBalie", fillinServices4.getTableFillinLCMThuPmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmBalie", fillinServices4.getTableFillinLCMFriAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmBalie", fillinServices4.getTableFillinLCMFriPmBalie(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskMonAm", fillinServices4.getTableFillinLCMTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskMonPm", fillinServices4.getTableFillinLCMTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskTueAm", fillinServices4.getTableFillinLCMTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskTuePm", fillinServices4.getTableFillinLCMTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskWedAm", fillinServices4.getTableFillinLCMTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskWedPm", fillinServices4.getTableFillinLCMTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskThuAm", fillinServices4.getTableFillinLCMTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskThuPm", fillinServices4.getTableFillinLCMTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskFriAm", fillinServices4.getTableFillinLCMTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskFriPm", fillinServices4.getTableFillinLCMTaskFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentMonAm", fillinServices4.getTableFillinLCMAbsentMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentMonPm", fillinServices4.getTableFillinLCMAbsentMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentTueAm", fillinServices4.getTableFillinLCMAbsentTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentTuePm", fillinServices4.getTableFillinLCMAbsentTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentWedAm", fillinServices4.getTableFillinLCMAbsentWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentWedPm", fillinServices4.getTableFillinLCMAbsentWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentThuAm", fillinServices4.getTableFillinLCMAbsentThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentThuPm", fillinServices4.getTableFillinLCMAbsentThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentFriAm", fillinServices4.getTableFillinLCMAbsentFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentFriPm", fillinServices4.getTableFillinLCMAbsentFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "LCMKopie";
    }

    @GetMapping("lcm2")
    public String lcm2(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "LCM2";
    }

    @GetMapping("searchLCM2")
    public String searchLCM2(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinLCMWeek", fillinServices.getTableFillinLCMWeek(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmTel", fillinServices4.getTableFillinLCMMonAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmTel", fillinServices4.getTableFillinLCMMonPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmTel", fillinServices4.getTableFillinLCMTueAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmTel", fillinServices4.getTableFillinLCMTuePmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmTel", fillinServices4.getTableFillinLCMWedAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmTel", fillinServices4.getTableFillinLCMWedPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmTel", fillinServices4.getTableFillinLCMThuAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmTel", fillinServices4.getTableFillinLCMThuPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmTel", fillinServices4.getTableFillinLCMFriAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmTel", fillinServices4.getTableFillinLCMFriPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmTelPer2", fillinServices4.getTableFillinLCMMonAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmTelPer2", fillinServices4.getTableFillinLCMMonPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmTelPer2", fillinServices4.getTableFillinLCMTueAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmTelPer2", fillinServices4.getTableFillinLCMTuePmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmTelPer2", fillinServices4.getTableFillinLCMWedAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmTelPer2", fillinServices4.getTableFillinLCMWedPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmTelPer2", fillinServices4.getTableFillinLCMThuAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmTelPer2", fillinServices4.getTableFillinLCMThuPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmTelPer2", fillinServices4.getTableFillinLCMFriAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmTelPer2", fillinServices4.getTableFillinLCMFriPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmTel2Per", fillinServices4.getTableFillinLCMMonAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmTel2Per", fillinServices4.getTableFillinLCMMonPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmTel2Per", fillinServices4.getTableFillinLCMTueAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmTel2Per", fillinServices4.getTableFillinLCMTuePmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmTel2Per", fillinServices4.getTableFillinLCMWedAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmTel2Per", fillinServices4.getTableFillinLCMWedPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmTel2Per", fillinServices4.getTableFillinLCMThuAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmTel2Per", fillinServices4.getTableFillinLCMThuPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmTel2Per", fillinServices4.getTableFillinLCMFriAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmTel2Per", fillinServices4.getTableFillinLCMFriPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmINCPer1", fillinServices4.getTableFillinLCMMonAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmINCPer1", fillinServices4.getTableFillinLCMMonPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmINCPer1", fillinServices4.getTableFillinLCMTueAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmINCPer1", fillinServices4.getTableFillinLCMTuePmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmINCPer1", fillinServices4.getTableFillinLCMWedAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmINCPer1", fillinServices4.getTableFillinLCMWedPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmINCPer1", fillinServices4.getTableFillinLCMThuAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmINCPer1", fillinServices4.getTableFillinLCMThuPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmINCPer1", fillinServices4.getTableFillinLCMFriAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmINCPer1", fillinServices4.getTableFillinLCMFriPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmINCPer2", fillinServices4.getTableFillinLCMMonAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmINCPer2", fillinServices4.getTableFillinLCMMonPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmINCPer2", fillinServices4.getTableFillinLCMTueAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmINCPer2", fillinServices4.getTableFillinLCMTuePmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmINCPer2", fillinServices4.getTableFillinLCMWedAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmINCPer2", fillinServices4.getTableFillinLCMWedPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmINCPer2", fillinServices4.getTableFillinLCMThuAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmINCPer2", fillinServices4.getTableFillinLCMThuPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmINCPer2", fillinServices4.getTableFillinLCMFriAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmINCPer2", fillinServices4.getTableFillinLCMFriPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmSR", fillinServices4.getTableFillinLCMMonAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmSR", fillinServices4.getTableFillinLCMMonPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmSR", fillinServices4.getTableFillinLCMTueAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmSR", fillinServices4.getTableFillinLCMTuePmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmSR", fillinServices4.getTableFillinLCMWedAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmSR", fillinServices4.getTableFillinLCMWedPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmSR", fillinServices4.getTableFillinLCMThuAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmSR", fillinServices4.getTableFillinLCMThuPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmSR", fillinServices4.getTableFillinLCMFriAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmSR", fillinServices4.getTableFillinLCMFriPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmBalie", fillinServices4.getTableFillinLCMMonAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmBalie", fillinServices4.getTableFillinLCMMonPmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmBalie", fillinServices4.getTableFillinLCMTueAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmBalie", fillinServices4.getTableFillinLCMTuePmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmBalie", fillinServices4.getTableFillinLCMWedAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmBalie", fillinServices4.getTableFillinLCMWedPmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmBalie", fillinServices4.getTableFillinLCMThuAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmBalie", fillinServices4.getTableFillinLCMThuPmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmBalie", fillinServices4.getTableFillinLCMFriAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmBalie", fillinServices4.getTableFillinLCMFriPmBalie(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskMonAm", fillinServices4.getTableFillinLCMTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskMonPm", fillinServices4.getTableFillinLCMTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskTueAm", fillinServices4.getTableFillinLCMTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskTuePm", fillinServices4.getTableFillinLCMTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskWedAm", fillinServices4.getTableFillinLCMTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskWedPm", fillinServices4.getTableFillinLCMTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskThuAm", fillinServices4.getTableFillinLCMTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskThuPm", fillinServices4.getTableFillinLCMTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskFriAm", fillinServices4.getTableFillinLCMTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskFriPm", fillinServices4.getTableFillinLCMTaskFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentMonAm", fillinServices4.getTableFillinLCMAbsentMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentMonPm", fillinServices4.getTableFillinLCMAbsentMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentTueAm", fillinServices4.getTableFillinLCMAbsentTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentTuePm", fillinServices4.getTableFillinLCMAbsentTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentWedAm", fillinServices4.getTableFillinLCMAbsentWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentWedPm", fillinServices4.getTableFillinLCMAbsentWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentThuAm", fillinServices4.getTableFillinLCMAbsentThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentThuPm", fillinServices4.getTableFillinLCMAbsentThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentFriAm", fillinServices4.getTableFillinLCMAbsentFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentFriPm", fillinServices4.getTableFillinLCMAbsentFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "LCMKopie2";
    }
    //VCM
    @GetMapping("vcm")
    public String vcm(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "VCM";
    }

    @GetMapping("searchVCM")
    public String searchVCM(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinVCMWeek", fillinServices.getTableFillinVCMWeek(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmMail", fillinServices2.getTableFillinVCMMonAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmMail", fillinServices2.getTableFillinVCMMonPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmMail", fillinServices2.getTableFillinVCMTueAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmMail", fillinServices2.getTableFillinVCMTuePmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmMail", fillinServices2.getTableFillinVCMWedAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmMail", fillinServices2.getTableFillinVCMWedPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmMail", fillinServices2.getTableFillinVCMThuAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmMail", fillinServices2.getTableFillinVCMThuPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmMail", fillinServices2.getTableFillinVCMFriAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmMail", fillinServices2.getTableFillinVCMFriPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTel", fillinServices2.getTableFillinVCMMonAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTel", fillinServices2.getTableFillinVCMMonPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTel", fillinServices2.getTableFillinVCMTueAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTel", fillinServices2.getTableFillinVCMTuePmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTel", fillinServices2.getTableFillinVCMWedAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTel", fillinServices2.getTableFillinVCMWedPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTel", fillinServices2.getTableFillinVCMThuAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTel", fillinServices2.getTableFillinVCMThuPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTel", fillinServices2.getTableFillinVCMFriAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTel", fillinServices2.getTableFillinVCMFriPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTelPer2", fillinServices2.getTableFillinVCMMonAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTelPer2", fillinServices2.getTableFillinVCMMonPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTelPer2", fillinServices2.getTableFillinVCMTueAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTelPer2", fillinServices2.getTableFillinVCMTuePmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTelPer2", fillinServices2.getTableFillinVCMWedAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTelPer2", fillinServices2.getTableFillinVCMWedPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTelPer2", fillinServices2.getTableFillinVCMThuAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTelPer2", fillinServices2.getTableFillinVCMThuPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTelPer2", fillinServices2.getTableFillinVCMFriAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTelPer2", fillinServices2.getTableFillinVCMFriPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTelPer3", fillinServices2.getTableFillinVCMMonAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTelPer3", fillinServices2.getTableFillinVCMMonPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTelPer3", fillinServices2.getTableFillinVCMTueAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTelPer3", fillinServices2.getTableFillinVCMTuePmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTelPer3", fillinServices2.getTableFillinVCMWedAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTelPer3", fillinServices2.getTableFillinVCMWedPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTelPer3", fillinServices2.getTableFillinVCMThuAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTelPer3", fillinServices2.getTableFillinVCMThuPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTelPer3", fillinServices2.getTableFillinVCMFriAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTelPer3", fillinServices2.getTableFillinVCMFriPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTel2", fillinServices2.getTableFillinVCMMonAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTel2", fillinServices2.getTableFillinVCMMonPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTel2", fillinServices2.getTableFillinVCMTueAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTel2", fillinServices2.getTableFillinVCMTuePmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTel2", fillinServices2.getTableFillinVCMWedAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTel2", fillinServices2.getTableFillinVCMWedPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTel2", fillinServices2.getTableFillinVCMThuAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTel2", fillinServices2.getTableFillinVCMThuPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTel2", fillinServices2.getTableFillinVCMFriAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTel2", fillinServices2.getTableFillinVCMFriPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTel2Per2", fillinServices2.getTableFillinVCMMonAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTel2Per2", fillinServices2.getTableFillinVCMMonPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTel2Per2", fillinServices2.getTableFillinVCMTueAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTel2Per2", fillinServices2.getTableFillinVCMTuePmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTel2Per2", fillinServices2.getTableFillinVCMWedAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTel2Per2", fillinServices2.getTableFillinVCMWedPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTel2Per2", fillinServices2.getTableFillinVCMThuAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTel2Per2", fillinServices2.getTableFillinVCMThuPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTel2Per2", fillinServices2.getTableFillinVCMFriAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTel2Per2", fillinServices2.getTableFillinVCMFriPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmZabbix", fillinServices2.getTableFillinVCMMonAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmZabbix", fillinServices2.getTableFillinVCMMonPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmZabbix", fillinServices2.getTableFillinVCMTueAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmZabbix", fillinServices2.getTableFillinVCMTuePmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmZabbix", fillinServices2.getTableFillinVCMWedAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmZabbix", fillinServices2.getTableFillinVCMWedPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmZabbix", fillinServices2.getTableFillinVCMThuAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmZabbix", fillinServices2.getTableFillinVCMThuPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmZabbix", fillinServices2.getTableFillinVCMFriAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmZabbix", fillinServices2.getTableFillinVCMFriPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer1", fillinServices2.getTableFillinVCMMonAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer1", fillinServices2.getTableFillinVCMMonPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer1", fillinServices2.getTableFillinVCMTueAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer1", fillinServices2.getTableFillinVCMTuePmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer1", fillinServices2.getTableFillinVCMWedAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer1", fillinServices2.getTableFillinVCMWedPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer1", fillinServices2.getTableFillinVCMThuAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer1", fillinServices2.getTableFillinVCMThuPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer1", fillinServices2.getTableFillinVCMFriAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer1", fillinServices2.getTableFillinVCMFriPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer2", fillinServices2.getTableFillinVCMMonAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer2", fillinServices2.getTableFillinVCMMonPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer2", fillinServices2.getTableFillinVCMTueAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer2", fillinServices2.getTableFillinVCMTuePmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer2", fillinServices2.getTableFillinVCMWedAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer2", fillinServices2.getTableFillinVCMWedPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer2", fillinServices2.getTableFillinVCMThuAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer2", fillinServices2.getTableFillinVCMThuPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer2", fillinServices2.getTableFillinVCMFriAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer2", fillinServices2.getTableFillinVCMFriPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer3", fillinServices2.getTableFillinVCMMonAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer3", fillinServices2.getTableFillinVCMMonPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer3", fillinServices2.getTableFillinVCMTueAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer3", fillinServices2.getTableFillinVCMTuePmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer3", fillinServices2.getTableFillinVCMWedAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer3", fillinServices2.getTableFillinVCMWedPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer3", fillinServices2.getTableFillinVCMThuAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer3", fillinServices2.getTableFillinVCMThuPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer3", fillinServices2.getTableFillinVCMFriAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer3", fillinServices2.getTableFillinVCMFriPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer4", fillinServices2.getTableFillinVCMMonAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer4", fillinServices2.getTableFillinVCMMonPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer4", fillinServices2.getTableFillinVCMTueAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer4", fillinServices2.getTableFillinVCMTuePmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer4", fillinServices2.getTableFillinVCMWedAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer4", fillinServices2.getTableFillinVCMWedPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer4", fillinServices2.getTableFillinVCMThuAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer4", fillinServices2.getTableFillinVCMThuPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer4", fillinServices2.getTableFillinVCMFriAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer4", fillinServices2.getTableFillinVCMFriPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmSR", fillinServices2.getTableFillinVCMMonAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmSR", fillinServices2.getTableFillinVCMMonPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmSR", fillinServices2.getTableFillinVCMTueAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmSR", fillinServices2.getTableFillinVCMTuePmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmSR", fillinServices2.getTableFillinVCMWedAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmSR", fillinServices2.getTableFillinVCMWedPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmSR", fillinServices2.getTableFillinVCMThuAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmSR", fillinServices2.getTableFillinVCMThuPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmSR", fillinServices2.getTableFillinVCMFriAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmSR", fillinServices2.getTableFillinVCMFriPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmSRPer2", fillinServices2.getTableFillinVCMMonAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmSRPer2", fillinServices2.getTableFillinVCMMonPmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmSRPer2", fillinServices2.getTableFillinVCMTueAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmSRPer2", fillinServices2.getTableFillinVCMTuePmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmSRPer2", fillinServices2.getTableFillinVCMWedAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmSRPer2", fillinServices2.getTableFillinVCMWedPmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmSRPer2", fillinServices2.getTableFillinVCMThuAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmSRPer2", fillinServices2.getTableFillinVCMThuPmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmSRPer2", fillinServices2.getTableFillinVCMFriAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmSRPer2", fillinServices2.getTableFillinVCMFriPmSRPer2(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentMonAm", fillinServices2.getTableFillinVCMAbsentMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentMonPm", fillinServices2.getTableFillinVCMAbsentMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentTueAm", fillinServices2.getTableFillinVCMAbsentTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentTuePm", fillinServices2.getTableFillinVCMAbsentTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentWedAm", fillinServices2.getTableFillinVCMAbsentWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentWedPm", fillinServices2.getTableFillinVCMAbsentWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentThuAm", fillinServices2.getTableFillinVCMAbsentThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentThuPm", fillinServices2.getTableFillinVCMAbsentThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentFriAm", fillinServices2.getTableFillinVCMAbsentFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentFriPm", fillinServices2.getTableFillinVCMAbsentFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskMonAm", fillinServices2.getTableFillinVCMTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskMonPm", fillinServices2.getTableFillinVCMTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskTueAm", fillinServices2.getTableFillinVCMTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskTuePm", fillinServices2.getTableFillinVCMTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskWedAm", fillinServices2.getTableFillinVCMTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskWedPm", fillinServices2.getTableFillinVCMTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskThuAm", fillinServices2.getTableFillinVCMTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskThuPm", fillinServices2.getTableFillinVCMTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskFriAm", fillinServices2.getTableFillinVCMTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskFriPm", fillinServices2.getTableFillinVCMTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "VCMKopie";
    }

    @GetMapping("vcm2")
    public String vcm2(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "VCM2";
    }

    @GetMapping("searchVCM2")
    public String searchVCM2(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinVCMWeek", fillinServices.getTableFillinVCMWeek(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmMail", fillinServices2.getTableFillinVCMMonAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmMail", fillinServices2.getTableFillinVCMMonPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmMail", fillinServices2.getTableFillinVCMTueAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmMail", fillinServices2.getTableFillinVCMTuePmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmMail", fillinServices2.getTableFillinVCMWedAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmMail", fillinServices2.getTableFillinVCMWedPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmMail", fillinServices2.getTableFillinVCMThuAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmMail", fillinServices2.getTableFillinVCMThuPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmMail", fillinServices2.getTableFillinVCMFriAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmMail", fillinServices2.getTableFillinVCMFriPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTel", fillinServices2.getTableFillinVCMMonAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTel", fillinServices2.getTableFillinVCMMonPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTel", fillinServices2.getTableFillinVCMTueAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTel", fillinServices2.getTableFillinVCMTuePmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTel", fillinServices2.getTableFillinVCMWedAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTel", fillinServices2.getTableFillinVCMWedPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTel", fillinServices2.getTableFillinVCMThuAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTel", fillinServices2.getTableFillinVCMThuPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTel", fillinServices2.getTableFillinVCMFriAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTel", fillinServices2.getTableFillinVCMFriPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTelPer2", fillinServices2.getTableFillinVCMMonAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTelPer2", fillinServices2.getTableFillinVCMMonPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTelPer2", fillinServices2.getTableFillinVCMTueAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTelPer2", fillinServices2.getTableFillinVCMTuePmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTelPer2", fillinServices2.getTableFillinVCMWedAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTelPer2", fillinServices2.getTableFillinVCMWedPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTelPer2", fillinServices2.getTableFillinVCMThuAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTelPer2", fillinServices2.getTableFillinVCMThuPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTelPer2", fillinServices2.getTableFillinVCMFriAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTelPer2", fillinServices2.getTableFillinVCMFriPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTelPer3", fillinServices2.getTableFillinVCMMonAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTelPer3", fillinServices2.getTableFillinVCMMonPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTelPer3", fillinServices2.getTableFillinVCMTueAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTelPer3", fillinServices2.getTableFillinVCMTuePmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTelPer3", fillinServices2.getTableFillinVCMWedAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTelPer3", fillinServices2.getTableFillinVCMWedPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTelPer3", fillinServices2.getTableFillinVCMThuAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTelPer3", fillinServices2.getTableFillinVCMThuPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTelPer3", fillinServices2.getTableFillinVCMFriAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTelPer3", fillinServices2.getTableFillinVCMFriPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTel2", fillinServices2.getTableFillinVCMMonAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTel2", fillinServices2.getTableFillinVCMMonPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTel2", fillinServices2.getTableFillinVCMTueAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTel2", fillinServices2.getTableFillinVCMTuePmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTel2", fillinServices2.getTableFillinVCMWedAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTel2", fillinServices2.getTableFillinVCMWedPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTel2", fillinServices2.getTableFillinVCMThuAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTel2", fillinServices2.getTableFillinVCMThuPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTel2", fillinServices2.getTableFillinVCMFriAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTel2", fillinServices2.getTableFillinVCMFriPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTel2Per2", fillinServices2.getTableFillinVCMMonAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTel2Per2", fillinServices2.getTableFillinVCMMonPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTel2Per2", fillinServices2.getTableFillinVCMTueAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTel2Per2", fillinServices2.getTableFillinVCMTuePmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTel2Per2", fillinServices2.getTableFillinVCMWedAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTel2Per2", fillinServices2.getTableFillinVCMWedPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTel2Per2", fillinServices2.getTableFillinVCMThuAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTel2Per2", fillinServices2.getTableFillinVCMThuPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTel2Per2", fillinServices2.getTableFillinVCMFriAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTel2Per2", fillinServices2.getTableFillinVCMFriPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmZabbix", fillinServices2.getTableFillinVCMMonAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmZabbix", fillinServices2.getTableFillinVCMMonPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmZabbix", fillinServices2.getTableFillinVCMTueAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmZabbix", fillinServices2.getTableFillinVCMTuePmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmZabbix", fillinServices2.getTableFillinVCMWedAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmZabbix", fillinServices2.getTableFillinVCMWedPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmZabbix", fillinServices2.getTableFillinVCMThuAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmZabbix", fillinServices2.getTableFillinVCMThuPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmZabbix", fillinServices2.getTableFillinVCMFriAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmZabbix", fillinServices2.getTableFillinVCMFriPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer1", fillinServices2.getTableFillinVCMMonAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer1", fillinServices2.getTableFillinVCMMonPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer1", fillinServices2.getTableFillinVCMTueAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer1", fillinServices2.getTableFillinVCMTuePmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer1", fillinServices2.getTableFillinVCMWedAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer1", fillinServices2.getTableFillinVCMWedPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer1", fillinServices2.getTableFillinVCMThuAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer1", fillinServices2.getTableFillinVCMThuPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer1", fillinServices2.getTableFillinVCMFriAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer1", fillinServices2.getTableFillinVCMFriPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer2", fillinServices2.getTableFillinVCMMonAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer2", fillinServices2.getTableFillinVCMMonPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer2", fillinServices2.getTableFillinVCMTueAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer2", fillinServices2.getTableFillinVCMTuePmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer2", fillinServices2.getTableFillinVCMWedAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer2", fillinServices2.getTableFillinVCMWedPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer2", fillinServices2.getTableFillinVCMThuAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer2", fillinServices2.getTableFillinVCMThuPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer2", fillinServices2.getTableFillinVCMFriAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer2", fillinServices2.getTableFillinVCMFriPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer3", fillinServices2.getTableFillinVCMMonAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer3", fillinServices2.getTableFillinVCMMonPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer3", fillinServices2.getTableFillinVCMTueAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer3", fillinServices2.getTableFillinVCMTuePmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer3", fillinServices2.getTableFillinVCMWedAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer3", fillinServices2.getTableFillinVCMWedPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer3", fillinServices2.getTableFillinVCMThuAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer3", fillinServices2.getTableFillinVCMThuPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer3", fillinServices2.getTableFillinVCMFriAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer3", fillinServices2.getTableFillinVCMFriPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer4", fillinServices2.getTableFillinVCMMonAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer4", fillinServices2.getTableFillinVCMMonPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer4", fillinServices2.getTableFillinVCMTueAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer4", fillinServices2.getTableFillinVCMTuePmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer4", fillinServices2.getTableFillinVCMWedAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer4", fillinServices2.getTableFillinVCMWedPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer4", fillinServices2.getTableFillinVCMThuAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer4", fillinServices2.getTableFillinVCMThuPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer4", fillinServices2.getTableFillinVCMFriAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer4", fillinServices2.getTableFillinVCMFriPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmSR", fillinServices2.getTableFillinVCMMonAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmSR", fillinServices2.getTableFillinVCMMonPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmSR", fillinServices2.getTableFillinVCMTueAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmSR", fillinServices2.getTableFillinVCMTuePmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmSR", fillinServices2.getTableFillinVCMWedAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmSR", fillinServices2.getTableFillinVCMWedPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmSR", fillinServices2.getTableFillinVCMThuAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmSR", fillinServices2.getTableFillinVCMThuPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmSR", fillinServices2.getTableFillinVCMFriAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmSR", fillinServices2.getTableFillinVCMFriPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmSRPer2", fillinServices2.getTableFillinVCMMonAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmSRPer2", fillinServices2.getTableFillinVCMMonPmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmSRPer2", fillinServices2.getTableFillinVCMTueAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmSRPer2", fillinServices2.getTableFillinVCMTuePmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmSRPer2", fillinServices2.getTableFillinVCMWedAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmSRPer2", fillinServices2.getTableFillinVCMWedPmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmSRPer2", fillinServices2.getTableFillinVCMThuAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmSRPer2", fillinServices2.getTableFillinVCMThuPmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmSRPer2", fillinServices2.getTableFillinVCMFriAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmSRPer2", fillinServices2.getTableFillinVCMFriPmSRPer2(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentMonAm", fillinServices2.getTableFillinVCMAbsentMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentMonPm", fillinServices2.getTableFillinVCMAbsentMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentTueAm", fillinServices2.getTableFillinVCMAbsentTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentTuePm", fillinServices2.getTableFillinVCMAbsentTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentWedAm", fillinServices2.getTableFillinVCMAbsentWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentWedPm", fillinServices2.getTableFillinVCMAbsentWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentThuAm", fillinServices2.getTableFillinVCMAbsentThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentThuPm", fillinServices2.getTableFillinVCMAbsentThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentFriAm", fillinServices2.getTableFillinVCMAbsentFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentFriPm", fillinServices2.getTableFillinVCMAbsentFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskMonAm", fillinServices2.getTableFillinVCMTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskMonPm", fillinServices2.getTableFillinVCMTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskTueAm", fillinServices2.getTableFillinVCMTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskTuePm", fillinServices2.getTableFillinVCMTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskWedAm", fillinServices2.getTableFillinVCMTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskWedPm", fillinServices2.getTableFillinVCMTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskThuAm", fillinServices2.getTableFillinVCMTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskThuPm", fillinServices2.getTableFillinVCMTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskFriAm", fillinServices2.getTableFillinVCMTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskFriPm", fillinServices2.getTableFillinVCMTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "VCMKopie2";
    }

    // MCFG
    @GetMapping("mcfg")
    public String mcfg(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "MCFG";
    }

    @GetMapping("searchMCFG")
    public String searchMCFG(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinMCFGWeek", fillinServices.getTableFillinMCFGWeek(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel", fillinServices3.getTableFillinMCFGMonAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel", fillinServices3.getTableFillinMCFGMonPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel", fillinServices3.getTableFillinMCFGTueAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel", fillinServices3.getTableFillinMCFGTuePmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel", fillinServices3.getTableFillinMCFGWedAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel", fillinServices3.getTableFillinMCFGWedPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel", fillinServices3.getTableFillinMCFGThuAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel", fillinServices3.getTableFillinMCFGThuPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel", fillinServices3.getTableFillinMCFGFriAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel", fillinServices3.getTableFillinMCFGFriPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel2", fillinServices3.getTableFillinMCFGMonAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel2", fillinServices3.getTableFillinMCFGMonPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel2", fillinServices3.getTableFillinMCFGTueAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel2", fillinServices3.getTableFillinMCFGTuePmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel2", fillinServices3.getTableFillinMCFGWedAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel2", fillinServices3.getTableFillinMCFGWedPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel2", fillinServices3.getTableFillinMCFGThuAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel2", fillinServices3.getTableFillinMCFGThuPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel2", fillinServices3.getTableFillinMCFGFriAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel2", fillinServices3.getTableFillinMCFGFriPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel3", fillinServices3.getTableFillinMCFGMonAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel3", fillinServices3.getTableFillinMCFGMonPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel3", fillinServices3.getTableFillinMCFGTueAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel3", fillinServices3.getTableFillinMCFGTuePmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel3", fillinServices3.getTableFillinMCFGWedAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel3", fillinServices3.getTableFillinMCFGWedPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel3", fillinServices3.getTableFillinMCFGThuAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel3", fillinServices3.getTableFillinMCFGThuPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel3", fillinServices3.getTableFillinMCFGFriAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel3", fillinServices3.getTableFillinMCFGFriPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel4", fillinServices3.getTableFillinMCFGMonAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel4", fillinServices3.getTableFillinMCFGMonPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel4", fillinServices3.getTableFillinMCFGTueAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel4", fillinServices3.getTableFillinMCFGTuePmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel4", fillinServices3.getTableFillinMCFGWedAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel4", fillinServices3.getTableFillinMCFGWedPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel4", fillinServices3.getTableFillinMCFGThuAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel4", fillinServices3.getTableFillinMCFGThuPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel4", fillinServices3.getTableFillinMCFGFriAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel4", fillinServices3.getTableFillinMCFGFriPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmINCPer1", fillinServices3.getTableFillinMCFGMonAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmINCPer1", fillinServices3.getTableFillinMCFGMonPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmINCPer1", fillinServices3.getTableFillinMCFGTueAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmINCPer1", fillinServices3.getTableFillinMCFGTuePmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmINCPer1", fillinServices3.getTableFillinMCFGWedAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmINCPer1", fillinServices3.getTableFillinMCFGWedPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmINCPer1", fillinServices3.getTableFillinMCFGThuAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmINCPer1", fillinServices3.getTableFillinMCFGThuPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmINCPer1", fillinServices3.getTableFillinMCFGFriAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmINCPer1", fillinServices3.getTableFillinMCFGFriPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmINCPer2", fillinServices3.getTableFillinMCFGMonAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmINCPer2", fillinServices3.getTableFillinMCFGMonPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmINCPer2", fillinServices3.getTableFillinMCFGTueAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmINCPer2", fillinServices3.getTableFillinMCFGTuePmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmINCPer2", fillinServices3.getTableFillinMCFGWedAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmINCPer2", fillinServices3.getTableFillinMCFGWedPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmINCPer2", fillinServices3.getTableFillinMCFGThuAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmINCPer2", fillinServices3.getTableFillinMCFGThuPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmINCPer2", fillinServices3.getTableFillinMCFGFriAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmINCPer2", fillinServices3.getTableFillinMCFGFriPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmSR", fillinServices3.getTableFillinMCFGMonAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmSR", fillinServices3.getTableFillinMCFGMonPmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmSR", fillinServices3.getTableFillinMCFGTueAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmSR", fillinServices3.getTableFillinMCFGTuePmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmSR", fillinServices3.getTableFillinMCFGWedAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmSR", fillinServices3.getTableFillinMCFGWedPmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmSR", fillinServices3.getTableFillinMCFGThuAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmSR", fillinServices3.getTableFillinMCFGThuPmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmSR", fillinServices3.getTableFillinMCFGFriAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmSR", fillinServices3.getTableFillinMCFGFriPmSR(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskMonAm", fillinServices3.getTableFillinMCFGTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskMonPm", fillinServices3.getTableFillinMCFGTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskTueAm", fillinServices3.getTableFillinMCFGTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskTuePm", fillinServices3.getTableFillinMCFGTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskWedAm", fillinServices3.getTableFillinMCFGTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskWedPm", fillinServices3.getTableFillinMCFGTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskThuAm", fillinServices3.getTableFillinMCFGTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskThuPm", fillinServices3.getTableFillinMCFGTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskFriAm", fillinServices3.getTableFillinMCFGTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskFriPm", fillinServices3.getTableFillinMCFGTaskFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentMonAm", fillinServices3.getTableFillinMCFGAbsentMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentMonPm", fillinServices3.getTableFillinMCFGAbsentMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentTueAm", fillinServices3.getTableFillinMCFGAbsentTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGMAbsentTuePm", fillinServices3.getTableFillinMCFGAbsentTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGMAbsentWedAm", fillinServices3.getTableFillinMCFGAbsentWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentWedPm", fillinServices3.getTableFillinMCFGAbsentWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentThuAm", fillinServices3.getTableFillinMCFGAbsentThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentThuPm", fillinServices3.getTableFillinMCFGAbsentThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentFriAm", fillinServices3.getTableFillinMCFGAbsentFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentFriPm", fillinServices3.getTableFillinMCFGAbsentFriPm(fillin.getWeek()));
        return "MCFGKopie";
    }

    @GetMapping("mcfg2")
    public String mcfg2(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "MCFG2";
    }

    @GetMapping("searchMCFG2")
    public String searchMCFG2(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinMCFGWeek", fillinServices.getTableFillinMCFGWeek(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel", fillinServices3.getTableFillinMCFGMonAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel", fillinServices3.getTableFillinMCFGMonPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel", fillinServices3.getTableFillinMCFGTueAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel", fillinServices3.getTableFillinMCFGTuePmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel", fillinServices3.getTableFillinMCFGWedAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel", fillinServices3.getTableFillinMCFGWedPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel", fillinServices3.getTableFillinMCFGThuAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel", fillinServices3.getTableFillinMCFGThuPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel", fillinServices3.getTableFillinMCFGFriAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel", fillinServices3.getTableFillinMCFGFriPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel2", fillinServices3.getTableFillinMCFGMonAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel2", fillinServices3.getTableFillinMCFGMonPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel2", fillinServices3.getTableFillinMCFGTueAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel2", fillinServices3.getTableFillinMCFGTuePmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel2", fillinServices3.getTableFillinMCFGWedAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel2", fillinServices3.getTableFillinMCFGWedPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel2", fillinServices3.getTableFillinMCFGThuAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel2", fillinServices3.getTableFillinMCFGThuPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel2", fillinServices3.getTableFillinMCFGFriAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel2", fillinServices3.getTableFillinMCFGFriPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel3", fillinServices3.getTableFillinMCFGMonAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel3", fillinServices3.getTableFillinMCFGMonPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel3", fillinServices3.getTableFillinMCFGTueAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel3", fillinServices3.getTableFillinMCFGTuePmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel3", fillinServices3.getTableFillinMCFGWedAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel3", fillinServices3.getTableFillinMCFGWedPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel3", fillinServices3.getTableFillinMCFGThuAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel3", fillinServices3.getTableFillinMCFGThuPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel3", fillinServices3.getTableFillinMCFGFriAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel3", fillinServices3.getTableFillinMCFGFriPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel4", fillinServices3.getTableFillinMCFGMonAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel4", fillinServices3.getTableFillinMCFGMonPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel4", fillinServices3.getTableFillinMCFGTueAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel4", fillinServices3.getTableFillinMCFGTuePmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel4", fillinServices3.getTableFillinMCFGWedAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel4", fillinServices3.getTableFillinMCFGWedPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel4", fillinServices3.getTableFillinMCFGThuAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel4", fillinServices3.getTableFillinMCFGThuPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel4", fillinServices3.getTableFillinMCFGFriAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel4", fillinServices3.getTableFillinMCFGFriPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmINCPer1", fillinServices3.getTableFillinMCFGMonAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmINCPer1", fillinServices3.getTableFillinMCFGMonPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmINCPer1", fillinServices3.getTableFillinMCFGTueAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmINCPer1", fillinServices3.getTableFillinMCFGTuePmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmINCPer1", fillinServices3.getTableFillinMCFGWedAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmINCPer1", fillinServices3.getTableFillinMCFGWedPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmINCPer1", fillinServices3.getTableFillinMCFGThuAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmINCPer1", fillinServices3.getTableFillinMCFGThuPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmINCPer1", fillinServices3.getTableFillinMCFGFriAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmINCPer1", fillinServices3.getTableFillinMCFGFriPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmINCPer2", fillinServices3.getTableFillinMCFGMonAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmINCPer2", fillinServices3.getTableFillinMCFGMonPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmINCPer2", fillinServices3.getTableFillinMCFGTueAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmINCPer2", fillinServices3.getTableFillinMCFGTuePmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmINCPer2", fillinServices3.getTableFillinMCFGWedAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmINCPer2", fillinServices3.getTableFillinMCFGWedPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmINCPer2", fillinServices3.getTableFillinMCFGThuAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmINCPer2", fillinServices3.getTableFillinMCFGThuPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmINCPer2", fillinServices3.getTableFillinMCFGFriAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmINCPer2", fillinServices3.getTableFillinMCFGFriPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmSR", fillinServices3.getTableFillinMCFGMonAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmSR", fillinServices3.getTableFillinMCFGMonPmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmSR", fillinServices3.getTableFillinMCFGTueAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmSR", fillinServices3.getTableFillinMCFGTuePmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmSR", fillinServices3.getTableFillinMCFGWedAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmSR", fillinServices3.getTableFillinMCFGWedPmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmSR", fillinServices3.getTableFillinMCFGThuAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmSR", fillinServices3.getTableFillinMCFGThuPmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmSR", fillinServices3.getTableFillinMCFGFriAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmSR", fillinServices3.getTableFillinMCFGFriPmSR(fillin.getWeek()));

         return "MCFGKopie2";
    }
    //SCHEMA
    @GetMapping("schema")
    public String schema(Model model, HttpSession session, Fillin fillin) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "schema";
    }

    @GetMapping("searchSchema")
    public String searchSchema(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinMCFGWeek", fillinServices.getTableFillinMCFGWeek(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel", fillinServices3.getTableFillinMCFGMonAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel", fillinServices3.getTableFillinMCFGMonPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel", fillinServices3.getTableFillinMCFGTueAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel", fillinServices3.getTableFillinMCFGTuePmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel", fillinServices3.getTableFillinMCFGWedAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel", fillinServices3.getTableFillinMCFGWedPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel", fillinServices3.getTableFillinMCFGThuAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel", fillinServices3.getTableFillinMCFGThuPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel", fillinServices3.getTableFillinMCFGFriAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel", fillinServices3.getTableFillinMCFGFriPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel2", fillinServices3.getTableFillinMCFGMonAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel2", fillinServices3.getTableFillinMCFGMonPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel2", fillinServices3.getTableFillinMCFGTueAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel2", fillinServices3.getTableFillinMCFGTuePmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel2", fillinServices3.getTableFillinMCFGWedAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel2", fillinServices3.getTableFillinMCFGWedPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel2", fillinServices3.getTableFillinMCFGThuAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel2", fillinServices3.getTableFillinMCFGThuPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel2", fillinServices3.getTableFillinMCFGFriAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel2", fillinServices3.getTableFillinMCFGFriPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel3", fillinServices3.getTableFillinMCFGMonAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel3", fillinServices3.getTableFillinMCFGMonPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel3", fillinServices3.getTableFillinMCFGTueAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel3", fillinServices3.getTableFillinMCFGTuePmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel3", fillinServices3.getTableFillinMCFGWedAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel3", fillinServices3.getTableFillinMCFGWedPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel3", fillinServices3.getTableFillinMCFGThuAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel3", fillinServices3.getTableFillinMCFGThuPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel3", fillinServices3.getTableFillinMCFGFriAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel3", fillinServices3.getTableFillinMCFGFriPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel4", fillinServices3.getTableFillinMCFGMonAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel4", fillinServices3.getTableFillinMCFGMonPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel4", fillinServices3.getTableFillinMCFGTueAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel4", fillinServices3.getTableFillinMCFGTuePmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel4", fillinServices3.getTableFillinMCFGWedAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel4", fillinServices3.getTableFillinMCFGWedPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel4", fillinServices3.getTableFillinMCFGThuAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel4", fillinServices3.getTableFillinMCFGThuPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel4", fillinServices3.getTableFillinMCFGFriAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel4", fillinServices3.getTableFillinMCFGFriPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmINCPer1", fillinServices3.getTableFillinMCFGMonAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmINCPer1", fillinServices3.getTableFillinMCFGMonPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmINCPer1", fillinServices3.getTableFillinMCFGTueAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmINCPer1", fillinServices3.getTableFillinMCFGTuePmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmINCPer1", fillinServices3.getTableFillinMCFGWedAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmINCPer1", fillinServices3.getTableFillinMCFGWedPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmINCPer1", fillinServices3.getTableFillinMCFGThuAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmINCPer1", fillinServices3.getTableFillinMCFGThuPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmINCPer1", fillinServices3.getTableFillinMCFGFriAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmINCPer1", fillinServices3.getTableFillinMCFGFriPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmINCPer2", fillinServices3.getTableFillinMCFGMonAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmINCPer2", fillinServices3.getTableFillinMCFGMonPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmINCPer2", fillinServices3.getTableFillinMCFGTueAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmINCPer2", fillinServices3.getTableFillinMCFGTuePmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmINCPer2", fillinServices3.getTableFillinMCFGWedAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmINCPer2", fillinServices3.getTableFillinMCFGWedPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmINCPer2", fillinServices3.getTableFillinMCFGThuAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmINCPer2", fillinServices3.getTableFillinMCFGThuPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmINCPer2", fillinServices3.getTableFillinMCFGFriAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmINCPer2", fillinServices3.getTableFillinMCFGFriPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmSR", fillinServices3.getTableFillinMCFGMonAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmSR", fillinServices3.getTableFillinMCFGMonPmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmSR", fillinServices3.getTableFillinMCFGTueAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmSR", fillinServices3.getTableFillinMCFGTuePmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmSR", fillinServices3.getTableFillinMCFGWedAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmSR", fillinServices3.getTableFillinMCFGWedPmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmSR", fillinServices3.getTableFillinMCFGThuAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmSR", fillinServices3.getTableFillinMCFGThuPmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmSR", fillinServices3.getTableFillinMCFGFriAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmSR", fillinServices3.getTableFillinMCFGFriPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmMail", fillinServices2.getTableFillinVCMMonAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmMail", fillinServices2.getTableFillinVCMMonPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmMail", fillinServices2.getTableFillinVCMTueAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmMail", fillinServices2.getTableFillinVCMTuePmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmMail", fillinServices2.getTableFillinVCMWedAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmMail", fillinServices2.getTableFillinVCMWedPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmMail", fillinServices2.getTableFillinVCMThuAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmMail", fillinServices2.getTableFillinVCMThuPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmMail", fillinServices2.getTableFillinVCMFriAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmMail", fillinServices2.getTableFillinVCMFriPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTel", fillinServices2.getTableFillinVCMMonAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTel", fillinServices2.getTableFillinVCMMonPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTel", fillinServices2.getTableFillinVCMTueAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTel", fillinServices2.getTableFillinVCMTuePmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTel", fillinServices2.getTableFillinVCMWedAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTel", fillinServices2.getTableFillinVCMWedPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTel", fillinServices2.getTableFillinVCMThuAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTel", fillinServices2.getTableFillinVCMThuPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTel", fillinServices2.getTableFillinVCMFriAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTel", fillinServices2.getTableFillinVCMFriPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTelPer2", fillinServices2.getTableFillinVCMMonAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTelPer2", fillinServices2.getTableFillinVCMMonPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTelPer2", fillinServices2.getTableFillinVCMTueAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTelPer2", fillinServices2.getTableFillinVCMTuePmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTelPer2", fillinServices2.getTableFillinVCMWedAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTelPer2", fillinServices2.getTableFillinVCMWedPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTelPer2", fillinServices2.getTableFillinVCMThuAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTelPer2", fillinServices2.getTableFillinVCMThuPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTelPer2", fillinServices2.getTableFillinVCMFriAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTelPer2", fillinServices2.getTableFillinVCMFriPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTelPer3", fillinServices2.getTableFillinVCMMonAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTelPer3", fillinServices2.getTableFillinVCMMonPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTelPer3", fillinServices2.getTableFillinVCMTueAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTelPer3", fillinServices2.getTableFillinVCMTuePmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTelPer3", fillinServices2.getTableFillinVCMWedAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTelPer3", fillinServices2.getTableFillinVCMWedPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTelPer3", fillinServices2.getTableFillinVCMThuAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTelPer3", fillinServices2.getTableFillinVCMThuPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTelPer3", fillinServices2.getTableFillinVCMFriAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTelPer3", fillinServices2.getTableFillinVCMFriPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTel2", fillinServices2.getTableFillinVCMMonAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTel2", fillinServices2.getTableFillinVCMMonPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTel2", fillinServices2.getTableFillinVCMTueAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTel2", fillinServices2.getTableFillinVCMTuePmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTel2", fillinServices2.getTableFillinVCMWedAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTel2", fillinServices2.getTableFillinVCMWedPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTel2", fillinServices2.getTableFillinVCMThuAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTel2", fillinServices2.getTableFillinVCMThuPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTel2", fillinServices2.getTableFillinVCMFriAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTel2", fillinServices2.getTableFillinVCMFriPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTel2Per2", fillinServices2.getTableFillinVCMMonAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTel2Per2", fillinServices2.getTableFillinVCMMonPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTel2Per2", fillinServices2.getTableFillinVCMTueAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTel2Per2", fillinServices2.getTableFillinVCMTuePmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTel2Per2", fillinServices2.getTableFillinVCMWedAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTel2Per2", fillinServices2.getTableFillinVCMWedPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTel2Per2", fillinServices2.getTableFillinVCMThuAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTel2Per2", fillinServices2.getTableFillinVCMThuPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTel2Per2", fillinServices2.getTableFillinVCMFriAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTel2Per2", fillinServices2.getTableFillinVCMFriPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmZabbix", fillinServices2.getTableFillinVCMMonAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmZabbix", fillinServices2.getTableFillinVCMMonPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmZabbix", fillinServices2.getTableFillinVCMTueAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmZabbix", fillinServices2.getTableFillinVCMTuePmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmZabbix", fillinServices2.getTableFillinVCMWedAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmZabbix", fillinServices2.getTableFillinVCMWedPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmZabbix", fillinServices2.getTableFillinVCMThuAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmZabbix", fillinServices2.getTableFillinVCMThuPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmZabbix", fillinServices2.getTableFillinVCMFriAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmZabbix", fillinServices2.getTableFillinVCMFriPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer1", fillinServices2.getTableFillinVCMMonAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer1", fillinServices2.getTableFillinVCMMonPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer1", fillinServices2.getTableFillinVCMTueAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer1", fillinServices2.getTableFillinVCMTuePmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer1", fillinServices2.getTableFillinVCMWedAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer1", fillinServices2.getTableFillinVCMWedPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer1", fillinServices2.getTableFillinVCMThuAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer1", fillinServices2.getTableFillinVCMThuPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer1", fillinServices2.getTableFillinVCMFriAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer1", fillinServices2.getTableFillinVCMFriPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer2", fillinServices2.getTableFillinVCMMonAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer2", fillinServices2.getTableFillinVCMMonPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer2", fillinServices2.getTableFillinVCMTueAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer2", fillinServices2.getTableFillinVCMTuePmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer2", fillinServices2.getTableFillinVCMWedAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer2", fillinServices2.getTableFillinVCMWedPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer2", fillinServices2.getTableFillinVCMThuAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer2", fillinServices2.getTableFillinVCMThuPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer2", fillinServices2.getTableFillinVCMFriAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer2", fillinServices2.getTableFillinVCMFriPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer3", fillinServices2.getTableFillinVCMMonAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer3", fillinServices2.getTableFillinVCMMonPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer3", fillinServices2.getTableFillinVCMTueAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer3", fillinServices2.getTableFillinVCMTuePmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer3", fillinServices2.getTableFillinVCMWedAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer3", fillinServices2.getTableFillinVCMWedPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer3", fillinServices2.getTableFillinVCMThuAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer3", fillinServices2.getTableFillinVCMThuPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer3", fillinServices2.getTableFillinVCMFriAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer3", fillinServices2.getTableFillinVCMFriPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer4", fillinServices2.getTableFillinVCMMonAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer4", fillinServices2.getTableFillinVCMMonPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer4", fillinServices2.getTableFillinVCMTueAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer4", fillinServices2.getTableFillinVCMTuePmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer4", fillinServices2.getTableFillinVCMWedAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer4", fillinServices2.getTableFillinVCMWedPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer4", fillinServices2.getTableFillinVCMThuAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer4", fillinServices2.getTableFillinVCMThuPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer4", fillinServices2.getTableFillinVCMFriAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer4", fillinServices2.getTableFillinVCMFriPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmSR", fillinServices2.getTableFillinVCMMonAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmSR", fillinServices2.getTableFillinVCMMonPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmSR", fillinServices2.getTableFillinVCMTueAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmSR", fillinServices2.getTableFillinVCMTuePmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmSR", fillinServices2.getTableFillinVCMWedAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmSR", fillinServices2.getTableFillinVCMWedPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmSR", fillinServices2.getTableFillinVCMThuAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmSR", fillinServices2.getTableFillinVCMThuPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmSR", fillinServices2.getTableFillinVCMFriAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmSR", fillinServices2.getTableFillinVCMFriPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmSRPer2", fillinServices2.getTableFillinVCMMonAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmSRPer2", fillinServices2.getTableFillinVCMMonPmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmSRPer2", fillinServices2.getTableFillinVCMTueAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmSRPer2", fillinServices2.getTableFillinVCMTuePmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmSRPer2", fillinServices2.getTableFillinVCMWedAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmSRPer2", fillinServices2.getTableFillinVCMWedPmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmSRPer2", fillinServices2.getTableFillinVCMThuAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmSRPer2", fillinServices2.getTableFillinVCMThuPmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmSRPer2", fillinServices2.getTableFillinVCMFriAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmSRPer2", fillinServices2.getTableFillinVCMFriPmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmTel", fillinServices4.getTableFillinLCMMonAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmTel", fillinServices4.getTableFillinLCMMonPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmTel", fillinServices4.getTableFillinLCMTueAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmTel", fillinServices4.getTableFillinLCMTuePmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmTel", fillinServices4.getTableFillinLCMWedAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmTel", fillinServices4.getTableFillinLCMWedPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmTel", fillinServices4.getTableFillinLCMThuAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmTel", fillinServices4.getTableFillinLCMThuPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmTel", fillinServices4.getTableFillinLCMFriAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmTel", fillinServices4.getTableFillinLCMFriPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmTelPer2", fillinServices4.getTableFillinLCMMonAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmTelPer2", fillinServices4.getTableFillinLCMMonPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmTelPer2", fillinServices4.getTableFillinLCMTueAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmTelPer2", fillinServices4.getTableFillinLCMTuePmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmTelPer2", fillinServices4.getTableFillinLCMWedAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmTelPer2", fillinServices4.getTableFillinLCMWedPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmTelPer2", fillinServices4.getTableFillinLCMThuAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmTelPer2", fillinServices4.getTableFillinLCMThuPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmTelPer2", fillinServices4.getTableFillinLCMFriAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmTelPer2", fillinServices4.getTableFillinLCMFriPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmTel2Per", fillinServices4.getTableFillinLCMMonAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmTel2Per", fillinServices4.getTableFillinLCMMonPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmTel2Per", fillinServices4.getTableFillinLCMTueAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmTel2Per", fillinServices4.getTableFillinLCMTuePmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmTel2Per", fillinServices4.getTableFillinLCMWedAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmTel2Per", fillinServices4.getTableFillinLCMWedPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmTel2Per", fillinServices4.getTableFillinLCMThuAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmTel2Per", fillinServices4.getTableFillinLCMThuPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmTel2Per", fillinServices4.getTableFillinLCMFriAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmTel2Per", fillinServices4.getTableFillinLCMFriPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmINCPer1", fillinServices4.getTableFillinLCMMonAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmINCPer1", fillinServices4.getTableFillinLCMMonPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmINCPer1", fillinServices4.getTableFillinLCMTueAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmINCPer1", fillinServices4.getTableFillinLCMTuePmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmINCPer1", fillinServices4.getTableFillinLCMWedAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmINCPer1", fillinServices4.getTableFillinLCMWedPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmINCPer1", fillinServices4.getTableFillinLCMThuAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmINCPer1", fillinServices4.getTableFillinLCMThuPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmINCPer1", fillinServices4.getTableFillinLCMFriAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmINCPer1", fillinServices4.getTableFillinLCMFriPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmINCPer2", fillinServices4.getTableFillinLCMMonAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmINCPer2", fillinServices4.getTableFillinLCMMonPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmINCPer2", fillinServices4.getTableFillinLCMTueAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmINCPer2", fillinServices4.getTableFillinLCMTuePmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmINCPer2", fillinServices4.getTableFillinLCMWedAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmINCPer2", fillinServices4.getTableFillinLCMWedPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmINCPer2", fillinServices4.getTableFillinLCMThuAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmINCPer2", fillinServices4.getTableFillinLCMThuPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmINCPer2", fillinServices4.getTableFillinLCMFriAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmINCPer2", fillinServices4.getTableFillinLCMFriPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmSR", fillinServices4.getTableFillinLCMMonAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmSR", fillinServices4.getTableFillinLCMMonPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmSR", fillinServices4.getTableFillinLCMTueAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmSR", fillinServices4.getTableFillinLCMTuePmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmSR", fillinServices4.getTableFillinLCMWedAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmSR", fillinServices4.getTableFillinLCMWedPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmSR", fillinServices4.getTableFillinLCMThuAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmSR", fillinServices4.getTableFillinLCMThuPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmSR", fillinServices4.getTableFillinLCMFriAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmSR", fillinServices4.getTableFillinLCMFriPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmBalie", fillinServices4.getTableFillinLCMMonAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmBalie", fillinServices4.getTableFillinLCMMonPmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmBalie", fillinServices4.getTableFillinLCMTueAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmBalie", fillinServices4.getTableFillinLCMTuePmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmBalie", fillinServices4.getTableFillinLCMWedAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmBalie", fillinServices4.getTableFillinLCMWedPmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmBalie", fillinServices4.getTableFillinLCMThuAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmBalie", fillinServices4.getTableFillinLCMThuPmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmBalie", fillinServices4.getTableFillinLCMFriAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmBalie", fillinServices4.getTableFillinLCMFriPmBalie(fillin.getWeek()));
        return "schemaKopie";
    }

    @GetMapping("schema2")
    public String schema2(Model model, HttpSession session, Fillin fillin) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "schema2";
    }

    @GetMapping("searchSchema2")
    public String searchSchema2(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinMCFGWeek", fillinServices.getTableFillinMCFGWeek(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel", fillinServices3.getTableFillinMCFGMonAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel", fillinServices3.getTableFillinMCFGMonPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel", fillinServices3.getTableFillinMCFGTueAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel", fillinServices3.getTableFillinMCFGTuePmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel", fillinServices3.getTableFillinMCFGWedAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel", fillinServices3.getTableFillinMCFGWedPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel", fillinServices3.getTableFillinMCFGThuAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel", fillinServices3.getTableFillinMCFGThuPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel", fillinServices3.getTableFillinMCFGFriAmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel", fillinServices3.getTableFillinMCFGFriPmTel(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel2", fillinServices3.getTableFillinMCFGMonAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel2", fillinServices3.getTableFillinMCFGMonPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel2", fillinServices3.getTableFillinMCFGTueAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel2", fillinServices3.getTableFillinMCFGTuePmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel2", fillinServices3.getTableFillinMCFGWedAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel2", fillinServices3.getTableFillinMCFGWedPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel2", fillinServices3.getTableFillinMCFGThuAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel2", fillinServices3.getTableFillinMCFGThuPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel2", fillinServices3.getTableFillinMCFGFriAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel2", fillinServices3.getTableFillinMCFGFriPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel3", fillinServices3.getTableFillinMCFGMonAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel3", fillinServices3.getTableFillinMCFGMonPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel3", fillinServices3.getTableFillinMCFGTueAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel3", fillinServices3.getTableFillinMCFGTuePmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel3", fillinServices3.getTableFillinMCFGWedAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel3", fillinServices3.getTableFillinMCFGWedPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel3", fillinServices3.getTableFillinMCFGThuAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel3", fillinServices3.getTableFillinMCFGThuPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel3", fillinServices3.getTableFillinMCFGFriAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel3", fillinServices3.getTableFillinMCFGFriPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmTel4", fillinServices3.getTableFillinMCFGMonAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmTel4", fillinServices3.getTableFillinMCFGMonPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmTel4", fillinServices3.getTableFillinMCFGTueAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmTel4", fillinServices3.getTableFillinMCFGTuePmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmTel4", fillinServices3.getTableFillinMCFGWedAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmTel4", fillinServices3.getTableFillinMCFGWedPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmTel4", fillinServices3.getTableFillinMCFGThuAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmTel4", fillinServices3.getTableFillinMCFGThuPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmTel4", fillinServices3.getTableFillinMCFGFriAmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmTel4", fillinServices3.getTableFillinMCFGFriPmTelPer4(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmINCPer1", fillinServices3.getTableFillinMCFGMonAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmINCPer1", fillinServices3.getTableFillinMCFGMonPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmINCPer1", fillinServices3.getTableFillinMCFGTueAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmINCPer1", fillinServices3.getTableFillinMCFGTuePmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmINCPer1", fillinServices3.getTableFillinMCFGWedAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmINCPer1", fillinServices3.getTableFillinMCFGWedPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmINCPer1", fillinServices3.getTableFillinMCFGThuAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmINCPer1", fillinServices3.getTableFillinMCFGThuPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmINCPer1", fillinServices3.getTableFillinMCFGFriAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmINCPer1", fillinServices3.getTableFillinMCFGFriPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmINCPer2", fillinServices3.getTableFillinMCFGMonAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmINCPer2", fillinServices3.getTableFillinMCFGMonPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmINCPer2", fillinServices3.getTableFillinMCFGTueAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmINCPer2", fillinServices3.getTableFillinMCFGTuePmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmINCPer2", fillinServices3.getTableFillinMCFGWedAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmINCPer2", fillinServices3.getTableFillinMCFGWedPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmINCPer2", fillinServices3.getTableFillinMCFGThuAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmINCPer2", fillinServices3.getTableFillinMCFGThuPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmINCPer2", fillinServices3.getTableFillinMCFGFriAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmINCPer2", fillinServices3.getTableFillinMCFGFriPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonAmSR", fillinServices3.getTableFillinMCFGMonAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPmSR", fillinServices3.getTableFillinMCFGMonPmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAmSR", fillinServices3.getTableFillinMCFGTueAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePmSR", fillinServices3.getTableFillinMCFGTuePmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAmSR", fillinServices3.getTableFillinMCFGWedAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPmSR", fillinServices3.getTableFillinMCFGWedPmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAmSR", fillinServices3.getTableFillinMCFGThuAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPmSR", fillinServices3.getTableFillinMCFGThuPmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAmSR", fillinServices3.getTableFillinMCFGFriAmSR(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPmSR", fillinServices3.getTableFillinMCFGFriPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmMail", fillinServices2.getTableFillinVCMMonAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmMail", fillinServices2.getTableFillinVCMMonPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmMail", fillinServices2.getTableFillinVCMTueAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmMail", fillinServices2.getTableFillinVCMTuePmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmMail", fillinServices2.getTableFillinVCMWedAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmMail", fillinServices2.getTableFillinVCMWedPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmMail", fillinServices2.getTableFillinVCMThuAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmMail", fillinServices2.getTableFillinVCMThuPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmMail", fillinServices2.getTableFillinVCMFriAmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmMail", fillinServices2.getTableFillinVCMFriPmMail(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTel", fillinServices2.getTableFillinVCMMonAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTel", fillinServices2.getTableFillinVCMMonPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTel", fillinServices2.getTableFillinVCMTueAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTel", fillinServices2.getTableFillinVCMTuePmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTel", fillinServices2.getTableFillinVCMWedAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTel", fillinServices2.getTableFillinVCMWedPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTel", fillinServices2.getTableFillinVCMThuAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTel", fillinServices2.getTableFillinVCMThuPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTel", fillinServices2.getTableFillinVCMFriAmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTel", fillinServices2.getTableFillinVCMFriPmTel(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTelPer2", fillinServices2.getTableFillinVCMMonAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTelPer2", fillinServices2.getTableFillinVCMMonPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTelPer2", fillinServices2.getTableFillinVCMTueAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTelPer2", fillinServices2.getTableFillinVCMTuePmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTelPer2", fillinServices2.getTableFillinVCMWedAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTelPer2", fillinServices2.getTableFillinVCMWedPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTelPer2", fillinServices2.getTableFillinVCMThuAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTelPer2", fillinServices2.getTableFillinVCMThuPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTelPer2", fillinServices2.getTableFillinVCMFriAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTelPer2", fillinServices2.getTableFillinVCMFriPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTelPer3", fillinServices2.getTableFillinVCMMonAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTelPer3", fillinServices2.getTableFillinVCMMonPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTelPer3", fillinServices2.getTableFillinVCMTueAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTelPer3", fillinServices2.getTableFillinVCMTuePmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTelPer3", fillinServices2.getTableFillinVCMWedAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTelPer3", fillinServices2.getTableFillinVCMWedPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTelPer3", fillinServices2.getTableFillinVCMThuAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTelPer3", fillinServices2.getTableFillinVCMThuPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTelPer3", fillinServices2.getTableFillinVCMFriAmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTelPer3", fillinServices2.getTableFillinVCMFriPmTelPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTel2", fillinServices2.getTableFillinVCMMonAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTel2", fillinServices2.getTableFillinVCMMonPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTel2", fillinServices2.getTableFillinVCMTueAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTel2", fillinServices2.getTableFillinVCMTuePmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTel2", fillinServices2.getTableFillinVCMWedAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTel2", fillinServices2.getTableFillinVCMWedPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTel2", fillinServices2.getTableFillinVCMThuAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTel2", fillinServices2.getTableFillinVCMThuPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTel2", fillinServices2.getTableFillinVCMFriAmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTel2", fillinServices2.getTableFillinVCMFriPmTel2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmTel2Per2", fillinServices2.getTableFillinVCMMonAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmTel2Per2", fillinServices2.getTableFillinVCMMonPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmTel2Per2", fillinServices2.getTableFillinVCMTueAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmTel2Per2", fillinServices2.getTableFillinVCMTuePmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmTel2Per2", fillinServices2.getTableFillinVCMWedAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmTel2Per2", fillinServices2.getTableFillinVCMWedPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmTel2Per2", fillinServices2.getTableFillinVCMThuAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmTel2Per2", fillinServices2.getTableFillinVCMThuPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmTel2Per2", fillinServices2.getTableFillinVCMFriAmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmTel2Per2", fillinServices2.getTableFillinVCMFriPmTel2Per2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmZabbix", fillinServices2.getTableFillinVCMMonAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmZabbix", fillinServices2.getTableFillinVCMMonPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmZabbix", fillinServices2.getTableFillinVCMTueAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmZabbix", fillinServices2.getTableFillinVCMTuePmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmZabbix", fillinServices2.getTableFillinVCMWedAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmZabbix", fillinServices2.getTableFillinVCMWedPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmZabbix", fillinServices2.getTableFillinVCMThuAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmZabbix", fillinServices2.getTableFillinVCMThuPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmZabbix", fillinServices2.getTableFillinVCMFriAmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmZabbix", fillinServices2.getTableFillinVCMFriPmZabbix(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer1", fillinServices2.getTableFillinVCMMonAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer1", fillinServices2.getTableFillinVCMMonPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer1", fillinServices2.getTableFillinVCMTueAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer1", fillinServices2.getTableFillinVCMTuePmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer1", fillinServices2.getTableFillinVCMWedAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer1", fillinServices2.getTableFillinVCMWedPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer1", fillinServices2.getTableFillinVCMThuAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer1", fillinServices2.getTableFillinVCMThuPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer1", fillinServices2.getTableFillinVCMFriAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer1", fillinServices2.getTableFillinVCMFriPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer2", fillinServices2.getTableFillinVCMMonAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer2", fillinServices2.getTableFillinVCMMonPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer2", fillinServices2.getTableFillinVCMTueAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer2", fillinServices2.getTableFillinVCMTuePmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer2", fillinServices2.getTableFillinVCMWedAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer2", fillinServices2.getTableFillinVCMWedPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer2", fillinServices2.getTableFillinVCMThuAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer2", fillinServices2.getTableFillinVCMThuPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer2", fillinServices2.getTableFillinVCMFriAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer2", fillinServices2.getTableFillinVCMFriPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer3", fillinServices2.getTableFillinVCMMonAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer3", fillinServices2.getTableFillinVCMMonPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer3", fillinServices2.getTableFillinVCMTueAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer3", fillinServices2.getTableFillinVCMTuePmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer3", fillinServices2.getTableFillinVCMWedAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer3", fillinServices2.getTableFillinVCMWedPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer3", fillinServices2.getTableFillinVCMThuAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer3", fillinServices2.getTableFillinVCMThuPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer3", fillinServices2.getTableFillinVCMFriAmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer3", fillinServices2.getTableFillinVCMFriPmINCPer3(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmINCPer4", fillinServices2.getTableFillinVCMMonAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmINCPer4", fillinServices2.getTableFillinVCMMonPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmINCPer4", fillinServices2.getTableFillinVCMTueAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmINCPer4", fillinServices2.getTableFillinVCMTuePmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmINCPer4", fillinServices2.getTableFillinVCMWedAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmINCPer4", fillinServices2.getTableFillinVCMWedPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmINCPer4", fillinServices2.getTableFillinVCMThuAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmINCPer4", fillinServices2.getTableFillinVCMThuPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmINCPer4", fillinServices2.getTableFillinVCMFriAmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmINCPer4", fillinServices2.getTableFillinVCMFriPmINCPer4(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmSR", fillinServices2.getTableFillinVCMMonAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmSR", fillinServices2.getTableFillinVCMMonPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmSR", fillinServices2.getTableFillinVCMTueAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmSR", fillinServices2.getTableFillinVCMTuePmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmSR", fillinServices2.getTableFillinVCMWedAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmSR", fillinServices2.getTableFillinVCMWedPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmSR", fillinServices2.getTableFillinVCMThuAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmSR", fillinServices2.getTableFillinVCMThuPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmSR", fillinServices2.getTableFillinVCMFriAmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmSR", fillinServices2.getTableFillinVCMFriPmSR(fillin.getWeek()));
        model.addAttribute("fillinVCMMonAmSRPer2", fillinServices2.getTableFillinVCMMonAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPmSRPer2", fillinServices2.getTableFillinVCMMonPmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAmSRPer2", fillinServices2.getTableFillinVCMTueAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePmSRPer2", fillinServices2.getTableFillinVCMTuePmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAmSRPer2", fillinServices2.getTableFillinVCMWedAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPmSRPer2", fillinServices2.getTableFillinVCMWedPmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAmSRPer2", fillinServices2.getTableFillinVCMThuAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPmSRPer2", fillinServices2.getTableFillinVCMThuPmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAmSRPer2", fillinServices2.getTableFillinVCMFriAmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPmSRPer2", fillinServices2.getTableFillinVCMFriPmSRPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmTel", fillinServices4.getTableFillinLCMMonAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmTel", fillinServices4.getTableFillinLCMMonPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmTel", fillinServices4.getTableFillinLCMTueAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmTel", fillinServices4.getTableFillinLCMTuePmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmTel", fillinServices4.getTableFillinLCMWedAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmTel", fillinServices4.getTableFillinLCMWedPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmTel", fillinServices4.getTableFillinLCMThuAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmTel", fillinServices4.getTableFillinLCMThuPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmTel", fillinServices4.getTableFillinLCMFriAmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmTel", fillinServices4.getTableFillinLCMFriPmTel(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmTelPer2", fillinServices4.getTableFillinLCMMonAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmTelPer2", fillinServices4.getTableFillinLCMMonPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmTelPer2", fillinServices4.getTableFillinLCMTueAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmTelPer2", fillinServices4.getTableFillinLCMTuePmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmTelPer2", fillinServices4.getTableFillinLCMWedAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmTelPer2", fillinServices4.getTableFillinLCMWedPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmTelPer2", fillinServices4.getTableFillinLCMThuAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmTelPer2", fillinServices4.getTableFillinLCMThuPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmTelPer2", fillinServices4.getTableFillinLCMFriAmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmTelPer2", fillinServices4.getTableFillinLCMFriPmTelPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmTel2Per", fillinServices4.getTableFillinLCMMonAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmTel2Per", fillinServices4.getTableFillinLCMMonPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmTel2Per", fillinServices4.getTableFillinLCMTueAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmTel2Per", fillinServices4.getTableFillinLCMTuePmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmTel2Per", fillinServices4.getTableFillinLCMWedAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmTel2Per", fillinServices4.getTableFillinLCMWedPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmTel2Per", fillinServices4.getTableFillinLCMThuAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmTel2Per", fillinServices4.getTableFillinLCMThuPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmTel2Per", fillinServices4.getTableFillinLCMFriAmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmTel2Per", fillinServices4.getTableFillinLCMFriPmTel2Per(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmINCPer1", fillinServices4.getTableFillinLCMMonAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmINCPer1", fillinServices4.getTableFillinLCMMonPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmINCPer1", fillinServices4.getTableFillinLCMTueAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmINCPer1", fillinServices4.getTableFillinLCMTuePmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmINCPer1", fillinServices4.getTableFillinLCMWedAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmINCPer1", fillinServices4.getTableFillinLCMWedPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmINCPer1", fillinServices4.getTableFillinLCMThuAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmINCPer1", fillinServices4.getTableFillinLCMThuPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmINCPer1", fillinServices4.getTableFillinLCMFriAmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmINCPer1", fillinServices4.getTableFillinLCMFriPmINCPer1(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmINCPer2", fillinServices4.getTableFillinLCMMonAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmINCPer2", fillinServices4.getTableFillinLCMMonPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmINCPer2", fillinServices4.getTableFillinLCMTueAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmINCPer2", fillinServices4.getTableFillinLCMTuePmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmINCPer2", fillinServices4.getTableFillinLCMWedAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmINCPer2", fillinServices4.getTableFillinLCMWedPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmINCPer2", fillinServices4.getTableFillinLCMThuAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmINCPer2", fillinServices4.getTableFillinLCMThuPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmINCPer2", fillinServices4.getTableFillinLCMFriAmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmINCPer2", fillinServices4.getTableFillinLCMFriPmINCPer2(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmSR", fillinServices4.getTableFillinLCMMonAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmSR", fillinServices4.getTableFillinLCMMonPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmSR", fillinServices4.getTableFillinLCMTueAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmSR", fillinServices4.getTableFillinLCMTuePmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmSR", fillinServices4.getTableFillinLCMWedAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmSR", fillinServices4.getTableFillinLCMWedPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmSR", fillinServices4.getTableFillinLCMThuAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmSR", fillinServices4.getTableFillinLCMThuPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmSR", fillinServices4.getTableFillinLCMFriAmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmSR", fillinServices4.getTableFillinLCMFriPmSR(fillin.getWeek()));
        model.addAttribute("fillinLCMMonAmBalie", fillinServices4.getTableFillinLCMMonAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPmBalie", fillinServices4.getTableFillinLCMMonPmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAmBalie", fillinServices4.getTableFillinLCMTueAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePmBalie", fillinServices4.getTableFillinLCMTuePmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAmBalie", fillinServices4.getTableFillinLCMWedAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPmBalie", fillinServices4.getTableFillinLCMWedPmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAmBalie", fillinServices4.getTableFillinLCMThuAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPmBalie", fillinServices4.getTableFillinLCMThuPmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAmBalie", fillinServices4.getTableFillinLCMFriAmBalie(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPmBalie", fillinServices4.getTableFillinLCMFriPmBalie(fillin.getWeek()));
        return "schemaKopie2";
    }

    // OWN DATA
    @GetMapping("ownData")
    public String ownData(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchOwn", fillinServices.getSearchOwnDate(fillin.getWeek(),IdStaffMember ));
        return "ownData";
    }

    @GetMapping("searchOwn")
    public String searchOwn(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("ownDataWeek", fillinServices.getTableFillinWeek(fillin.getWeek()));
        model.addAttribute("searchOwn", fillinServices.getSearchOwnDate(fillin.getWeek(),IdStaffMember ));
        return "ownDataKopie";
    }

    @GetMapping("ownData2")
    public String ownData2(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        return "ownData2";
    }

    @GetMapping("searchOwn2")
    public String searchOwn2(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("ownDataWeek2", fillinServices.getTableFillinWeek(fillin.getWeek()));
        model.addAttribute("searchOwn2", fillinServices.getSearchOwnDate(fillin.getWeek(),IdStaffMember ));
        return "ownDataKopie2";
    }

    // OWN DATA ABSENT
    @GetMapping("ownDataAbsent")
    public String ownDataAbsent(Model model, HttpSession session, Absent absent, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("fillins", fillinServices.getSearchOwnDataAbsent(fillin.getMonth(), IdStaffMember));
        return "owndataabsent";
    }

    @GetMapping("searchOwnDataAbsent")
    public String searchOwnDataAbsent(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchOwnDataAbsent", fillinServices.getSearchOwnDataAbsent(fillin.getMonth(), IdStaffMember));
        return "owndataabsent";
    }

    @GetMapping("ownDataAbsent2")
    public String ownDataAbsent2(Model model, HttpSession session, Absent absent, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("fillins", fillinServices.getSearchOwnDataAbsent(fillin.getMonth(), IdStaffMember));
        return "owndataabsent2";
    }

    @GetMapping("searchOwnDataAbsent2")
    public String searchOwnDataAbsent2(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchOwnDataAbsent2", fillinServices.getSearchOwnDataAbsent(fillin.getMonth(), IdStaffMember));
        return "owndataabsent2";
    }

    //ALL DATA ABSENT
    @GetMapping("allAbsent")
    public String allAbsent(Model model, HttpSession session, Absent absent, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        return "allabsent";
    }

    @GetMapping("allAbsent2")
    public String allAbsent2(Model model, HttpSession session, Absent absent, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        return "allabsent2";
    }

    @GetMapping("allDataAbsentAllMembers")
    public String allDataAbsent(Model model, HttpSession session, Absent absent, Fillin fillin, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchAllDataAbsent", fillinServices.getSearchAllDataAbsent(fillin.getWeek()));
        return "allabsentallmembers";
    }

    @GetMapping("searchAllDataAbsent")
    public String searchAllDataAbsent(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchAllDataAbsent", fillinServices.getSearchAllDataAbsent(fillin.getWeek()));
        return "allabsentallmembers";
    }

    @GetMapping("allDataAbsentAllMembers2")
    public String allDataAbsent2(Model model, HttpSession session, Absent absent, Fillin fillin, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchAllDataAbsent2", fillinServices.getSearchAllDataAbsent(fillin.getWeek()));
        return "allabsentallmembers2";
    }

    @GetMapping("searchAllDataAbsent2")
    public String searchAllDataAbsent2(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchAllDataAbsent2", fillinServices.getSearchAllDataAbsent(fillin.getWeek()));
        return "allabsentallmembers2";
    }

    @GetMapping("allDataAbsentAllMembersMonth")
    public String allDataAbsentMonth(Model model, HttpSession session, Absent absent, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("searchAllDataAbsentMonth", fillinServices.getSearchAllDataAbsentMonth(fillin.getMonth()));
        return "allabsentallmembersmonth";
    }

    @GetMapping("searchAllDataAbsentMonth")
    public String searchAllDataAbsentMonth(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchAllDataAbsentMonth", fillinServices.getSearchAllDataAbsentMonth(fillin.getMonth()));
        return "allabsentallmembersmonth";
    }

    @GetMapping("allDataAbsentAllMembersMonth2")
    public String allDataAbsentMonth2(Model model, HttpSession session, Absent absent, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("searchAllDataAbsentMonth2", fillinServices.getSearchAllDataAbsentMonth(fillin.getMonth()));
        return "allabsentallmembersmonth2";
    }

    @GetMapping("searchAllDataAbsentMonth2")
    public String searchAllDataAbsentMonth2(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchAllDataAbsentMonth2", fillinServices.getSearchAllDataAbsentMonth(fillin.getMonth()));
        return "allabsentallmembersmonth2";
    }

    @GetMapping("allDataAbsentDepartment")
    public String allDataAbsentDepartment(Model model, HttpSession session, Absent absent, Fillin fillin, StaffMember staffMember, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchAllDataAbsentDepartment", fillinServices.getSearchAllDataAbsentDepartment(fillin.getWeek(), fillin.getDepartment()));
        return "allabsentdepartment";
    }

    @GetMapping("searchAllDataAbsentDepartment")
    public String searchAllDataAbsentDepartment(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchAllDataAbsentDepartment", fillinServices.getSearchAllDataAbsentDepartment(fillin.getWeek(), fillin.getDepartment()));
        return "allabsentdepartment";
    }

    @GetMapping("allDataAbsentDepartment2")
    public String allDataAbsentDepartment2(Model model, HttpSession session, Absent absent, StaffMember staffMember, Fillin fillin, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("searchAllDataAbsentDepartment2", fillinServices.getSearchAllDataAbsentDepartment(fillin.getWeek(), fillin.getDepartment()));
        return "allabsentdepartment2";
    }

    @GetMapping("searchAllDataAbsentDepartment2")
    public String searchAllDataAbsentDepartment2(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchAllDataAbsentDepartment2", fillinServices.getSearchAllDataAbsentDepartment(fillin.getWeek(), fillin.getDepartment()));
        return "allabsentdepartment2";
    }

    @GetMapping("allDataAbsentDepartmentMonth")
    public String allDataAbsentDepartmentMonth(Model model, HttpSession session, Absent absent, StaffMember staffMember, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("searchAllDataAbsentDepartmentMonth", fillinServices.getSearchAllDataAbsentDepartmentMonth(fillin.getMonth(), fillin.getDepartment()));
        return "allabsentdepartmentmonth";
    }

    @GetMapping("searchAllDataAbsentDepartmentMonth")
    public String searchAllDataAbsentDepartmentMonth(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchAllDataAbsentDepartmentMonth", fillinServices.getSearchAllDataAbsentDepartmentMonth(fillin.getMonth(), fillin.getDepartment()));
        return "allabsentdepartmentmonth";
    }

    @GetMapping("allDataAbsentDepartmentMonth2")
    public String allDataAbsentDepartmentMonth2(Model model, HttpSession session, Absent absent, StaffMember staffMember, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("searchAllDataAbsentDepartmentMonth2", fillinServices.getSearchAllDataAbsentDepartmentMonth(fillin.getMonth(), fillin.getDepartment()));
        return "allabsentdepartmentmonth2";
    }

    @GetMapping("searchAllDataAbsentDepartmentMonth2")
    public String searchAllDataAbsentDepartmentMonth2(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchAllDataAbsentDepartmentMonth2", fillinServices.getSearchAllDataAbsentDepartmentMonth(fillin.getMonth(), fillin.getDepartment()));
        return "allabsentdepartmentmonth2";
    }

    // ALL TASKS ALL MEMBERS
    @GetMapping("alltasksallmember")
    public String tasksMember(Model model, HttpSession session, DateName dateName, Fillin fillin, StaffMember staffMember) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchTasksMemberMonAm", fillinServices.getsearchTasksMemberMonAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberMonPm", fillinServices.getsearchTasksMemberMonPm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberTueAm", fillinServices.getsearchTasksMemberTueAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberTuePm", fillinServices.getsearchTasksMemberTuePm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberWedAm", fillinServices.getsearchTasksMemberWedAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberWedPm", fillinServices.getsearchTasksMemberWedPm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberThuAm", fillinServices.getsearchTasksMemberThuAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberThuPm", fillinServices.getsearchTasksMemberThuPm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberFriAm", fillinServices.getsearchTasksMemberFriAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberFriPm", fillinServices.getsearchTasksMemberFriPm(fillin.getWeek(), fillin.getDepartment()));
        return "alltasksallmember";
    }

    // ALL TASKS ALL MEMBERS
    @GetMapping("searchTasksMember")
    public String searchTasksMember(Model model, HttpSession session, DateName dateName, Fillin fillin, StaffMember staffMember) throws SQLException {
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("taskWeek", fillinServices.getTableFillinWeek(fillin.getWeek()));
        model.addAttribute("searchTasksMemberMonAm", fillinServices.getsearchTasksMemberMonAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberMonPm", fillinServices.getsearchTasksMemberMonPm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberTueAm", fillinServices.getsearchTasksMemberTueAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberTuePm", fillinServices.getsearchTasksMemberTuePm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberWedAm", fillinServices.getsearchTasksMemberWedAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberWedPm", fillinServices.getsearchTasksMemberWedPm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberThuAm", fillinServices.getsearchTasksMemberThuAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberThuPm", fillinServices.getsearchTasksMemberThuPm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberFriAm", fillinServices.getsearchTasksMemberFriAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberFriPm", fillinServices.getsearchTasksMemberFriPm(fillin.getWeek(), fillin.getDepartment()));
        return "alltasksallmemberKopie";
    }

    @GetMapping("alltasksallmember2")
    public String tasksMember2(Model model, HttpSession session, DateName dateName, Fillin fillin, StaffMember staffMember) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchTasksMemberMonAm2", fillinServices.getsearchTasksMemberMonAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberMonPm2", fillinServices.getsearchTasksMemberMonPm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberTueAm2", fillinServices.getsearchTasksMemberTueAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberTuePm2", fillinServices.getsearchTasksMemberTuePm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberWedAm2", fillinServices.getsearchTasksMemberWedAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberWedPm2", fillinServices.getsearchTasksMemberWedPm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberThuAm2", fillinServices.getsearchTasksMemberThuAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberThuPm2", fillinServices.getsearchTasksMemberThuPm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberFriAm2", fillinServices.getsearchTasksMemberFriAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberFriPm2", fillinServices.getsearchTasksMemberFriPm(fillin.getWeek(), fillin.getDepartment()));
        return "alltasksallmember2";
    }

    // ALL TASKS ALL MEMBERS
    @GetMapping("searchTasksMember2")
    public String searchTasksMember2(Model model, HttpSession session, DateName dateName, Fillin fillin, StaffMember staffMember) throws SQLException {
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("taskWeek2", fillinServices.getTableFillinWeek(fillin.getWeek()));
        model.addAttribute("searchTasksMemberMonAm2", fillinServices.getsearchTasksMemberMonAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberMonPm2", fillinServices.getsearchTasksMemberMonPm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberTueAm2", fillinServices.getsearchTasksMemberTueAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberTuePm2", fillinServices.getsearchTasksMemberTuePm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberWedAm2", fillinServices.getsearchTasksMemberWedAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberWedPm2", fillinServices.getsearchTasksMemberWedPm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberThuAm2", fillinServices.getsearchTasksMemberThuAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberThuPm2", fillinServices.getsearchTasksMemberThuPm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberFriAm2", fillinServices.getsearchTasksMemberFriAm(fillin.getWeek(), fillin.getDepartment()));
        model.addAttribute("searchTasksMemberFriPm2", fillinServices.getsearchTasksMemberFriPm(fillin.getWeek(), fillin.getDepartment()));
        return "alltasksallmemberKopie2";
    }


    //  ALL LOCATION
    @GetMapping("alllocation")
    public String alllocation(Model model, HttpSession session, Location location) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("locations", locationServices.getTableLocation());
        return "alllocation";
    }

    @GetMapping("addlocation")
    public String addlocation(Model model, HttpSession session, Task task) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        return "newlocation";
    }

    @GetMapping("newlocation")
    public String newlocation(Model model, HttpSession session, Location location) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("newlocation", locationServices.getAddLocation(location.getLocationName(), location.getAbbreviationLocation()));
        return "newlocation";
    }

    @GetMapping("deleteLoc")
    public String deleteTa(Model model, HttpSession session, Location location) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        return "deleteLocation";
    }

    @GetMapping("deleteLocation")
    public String deleteTask(Model model, HttpSession session, Location location) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("deleteLocation", locationServices.getdeleteLocation(location.getLocationName()));
        return "deleteLocation";
    }

    // ALL TASKS
    @GetMapping("alltask")
    public String alltask(Model model, HttpSession session, Task task) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("deleteTask", tasksServices.getdeleteTask(task.getTaskName()));
        return "alltasks";
    }

    @GetMapping("add")
    public String add(Model model, HttpSession session, Task task) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        return "newtask";
    }

    @GetMapping("newtask")
    public String newtask(Model model, HttpSession session, Task task) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("newtask", tasksServices.getAddTask(task.getTaskName(), task.getDescription(), task.getEnddate()));
        return "newtask";
    }

    @GetMapping("deleteTa")
    public String deleteTa(Model model, HttpSession session, Task task) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        return "deleteTask";
    }

    @GetMapping("deleteTask")
    public String deleteTask(Model model, HttpSession session, Task task) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("deleteTask", tasksServices.getdeleteTask(task.getTaskName()));
        return "deleteTask";
    }

    // ALL FUNCTIONS
    @GetMapping("allfunction")
    public String allfunction(Model model, HttpSession session, Function function) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("functions", functionServices.getAllFunction());
        return "allfunctions";
    }

    @GetMapping("addfunction")
    public String addfunction(Model model, HttpSession session, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("user"));
        return "newFunction";
    }

    @GetMapping("newfunction")
    public String newfunction(Model model, HttpSession session, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("newFunction", functionServices.getAddFunction(function.getDepartment(), function.getNamefunction()));
        return "newFunction";
    }

    @GetMapping("deletefunction")
    public String deletefunction(Model model, HttpSession session, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        return "deleteFunction";
    }

    @GetMapping("deletefun")
    public String deletefun(Model model, HttpSession session, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("deletefun", functionServices.getdeleteFunction(function.getDepartment(), function.getNamefunction()));
        return "deleteFunction";
    }

    //ALL Dates
    @GetMapping("alldateName")
    public String alldateName(Model model, HttpSession session, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        return "alldateName";
    }

    @GetMapping("addDate")
    public String addDate(Model model, HttpSession session, StaffMember staffMember) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        return "newDate";
    }

    @GetMapping("newDate")
    public String newDate(Model model, HttpSession session, StaffMember staffMember, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("newDate", dateNameServices.getAddDate(dateName.getNameDate(), dateName.getMonthBegin(), dateName.getMonthEnd()));
        return "newDate";
    }

    @GetMapping("deleteDate")
    public String deleteDate(Model model, HttpSession session, StaffMember staffMember) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        return "deleteDate";
    }

    @GetMapping("deleteADate")
    public String deleteADate(Model model, HttpSession session, StaffMember staffMember, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("deleteADate", dateNameServices.getDeleteDate(dateName.getNameDate()));
        return "deleteDate";
    }



    // NEW STAFF MEMBER
    @GetMapping("addMember")
    public String addMember(Model model, HttpSession session, StaffMember staffMember) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        return "newMember";
    }

    @GetMapping("newMember")
    public String newMember(Model model, HttpSession session, StaffMember staffMember) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("newMember", staffMemberServices.getAddStaffMember(staffMember.getName(), staffMember.getAbbreviationName(), staffMember.getEmployeeId(), staffMember.getDepartment(), staffMember.getMobileNumber(), staffMember.getPrive(), staffMember.getCodePhoneNumber(), staffMember.getPhoneNumber(), staffMember.getAgentNumber(), staffMember.getResponsibility()));
        return "newMember";
    }

    // DELETE MEMBER
    @GetMapping("deleteMem")
    public String deleteMem(Model model, HttpSession session, StaffMember staffMember) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        return "deleteMember";
    }

    @GetMapping("deleteMember")
    public String deleteMember(Model model, HttpSession session, StaffMember staffMember) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("deleteMember", staffMemberServices.getDeleteMember(staffMember.getEmployeeId()));
        return "deleteMember";
    }

    // Change member
    @GetMapping("changeMem")
    public String changeMem(Model model, HttpSession session, StaffMember staffMember) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        return "changeMember";
    }

    @GetMapping("changeMember")
    public String changeMember(Model model, HttpSession session, StaffMember staffMember) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("deleteMember", staffMemberServices.getChangeMember(staffMember.getEmployeeId(), staffMember.getResponsibility()));
        return "changeMember";
    }

    // ALL STAFFMEMBER
    @GetMapping("allStaffMember")
    public String allStaffMember(Model model, HttpSession session, StaffMember staffMember) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "listMembers";
    }


    //CHECK
    @GetMapping("check")
    public String check(Model model, HttpSession session, DateName dateName, Fillin fillin) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        return "check";
    }
    @GetMapping("searchCheck")
    public String searchCheck(Model model, HttpSession session, DateName dateName, Fillin fillin) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchCheck", fillinServices.getCheck(fillin.getWeek()));
        model.addAttribute("searchCheckFunctionMonAm", fillinServices.getCheckFunctionMonAm(fillin.getWeek()));
        model.addAttribute("searchCheckFunctionMonPm", fillinServices.getCheckFunctionMonPm(fillin.getWeek()));
        model.addAttribute("searchCheckFunctionTueAm", fillinServices.getCheckFunctionTueAm(fillin.getWeek()));
        model.addAttribute("searchCheckFunctionTuePm", fillinServices.getCheckFunctionTuePm(fillin.getWeek()));
        model.addAttribute("searchCheckFunctionWedAm", fillinServices.getCheckFunctionWedAm(fillin.getWeek()));
        model.addAttribute("searchCheckFunctionWedPm", fillinServices.getCheckFunctionWedPm(fillin.getWeek()));
        model.addAttribute("searchCheckFunctionThuAm", fillinServices.getCheckFunctionThuAm(fillin.getWeek()));
        model.addAttribute("searchCheckFunctionThuPm", fillinServices.getCheckFunctionThuPm(fillin.getWeek()));
        model.addAttribute("searchCheckFunctionFriAm", fillinServices.getCheckFunctionFriAm(fillin.getWeek()));
        model.addAttribute("searchCheckFunctionFriPm", fillinServices.getCheckFunctionFriPm(fillin.getWeek()));
        return "check";
    }

    @GetMapping("signOut")
    public String signOut() throws SQLException {
        return "index";
    }

    @GetMapping("changeotherId")
    public String changeotherId(Model model, HttpSession session) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        return "changeotherId";
    }

    @GetMapping("changeotherIdPageLCM")
    public String changeotherIdPageLCM(Model model, HttpSession session, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        return "changeotherIdLCM";
    }

    @GetMapping("changeotherIdLCM")
    public String changeotherIdLCM(Model model, HttpSession session, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("fillinLCMWeek", fillinServices.getTableFillinLCMWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("staffMembersLCM", staffMemberServices.getAllStaffMemberLCM());
        model.addAttribute("functionLCMsMonAm", fillinServices.getAllfunctionLCMMonAm(fillin.getWeek()));
        model.addAttribute("functionLCMsMonPm", fillinServices.getAllfunctionLCMMonPm(fillin.getWeek()));
        model.addAttribute("functionLCMsTueAm", fillinServices.getAllfunctionLCMTueAm(fillin.getWeek()));
        model.addAttribute("functionLCMsTuePm", fillinServices.getAllfunctionLCMTuePm(fillin.getWeek()));
        model.addAttribute("functionLCMsWedAm", fillinServices.getAllfunctionLCMWedAm(fillin.getWeek()));
        model.addAttribute("functionLCMsWedPm", fillinServices.getAllfunctionLCMWedPm(fillin.getWeek()));
        model.addAttribute("functionLCMsThuAm", fillinServices.getAllfunctionLCMThuAm(fillin.getWeek()));
        model.addAttribute("functionLCMsThuPm", fillinServices.getAllfunctionLCMThuPm(fillin.getWeek()));
        model.addAttribute("functionLCMsFriAm", fillinServices.getAllfunctionLCMFriAm(fillin.getWeek()));
        model.addAttribute("functionLCMsFriPm", fillinServices.getAllfunctionLCMFriPm(fillin.getWeek()));
        return "changeotherIdLCMPage";
    }

    @GetMapping("changeotherIdLCMPage")
    public String changeotherIdLCMPage(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("changeFillinID", fillinServices.getChangeFillinID (fillin.getNameMember(), fillin.getWeek(),fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changeotherIdLCM";
    }

    @GetMapping("changeotherIdePageMCFG")
    public String changeotherIdePageMCFG(Model model, HttpSession session , Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        return "changeotherIdMCFG";
    }

    @GetMapping("changeotherIdMCFG")
    public String changeotherIdMCFG(Model model, HttpSession session , Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("staffMembersMCFG", staffMemberServices.getAllStaffMemberMCFG());
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("staffMembersMCFG", staffMemberServices.getAllStaffMemberMCFG());
        model.addAttribute("fillinMCFGWeek", fillinServices.getTableFillinMCFGWeek(fillin.getWeek()));
        model.addAttribute("functionMCFGsMonAm", fillinServices.getAllfunctionMCFGMonAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsMonPm", fillinServices.getAllfunctionMCFGMonPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsTueAm", fillinServices.getAllfunctionMCFGTueAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsTuePm", fillinServices.getAllfunctionMCFGTuePm(fillin.getWeek()));
        model.addAttribute("functionMCFGsWedAm", fillinServices.getAllfunctionMCFGWedAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsWedPm", fillinServices.getAllfunctionMCFGWedPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsThuAm", fillinServices.getAllfunctionMCFGThuAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsThuPm", fillinServices.getAllfunctionMCFGThuPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsFriAm", fillinServices.getAllfunctionMCFGFriAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsFriPm", fillinServices.getAllfunctionMCFGFriPm(fillin.getWeek()));
        return "changeotherIdMCFGPage";
    }

    @GetMapping("changeotherIdMCFGPage")
    public String changeotherIdMCFGPage(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("changeFillinID", fillinServices.getChangeFillinID (fillin.getNameMember(), fillin.getWeek(),fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changeotherIdMCFG";
    }

    @GetMapping("changeotherIdPageVCM")
    public String changeotherIdPageVCM(Model model, HttpSession session, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        return "changeotherIdVCM";
    }

    @GetMapping("changeotherIdVCM")
    public String changeotherIdVCM(Model model, HttpSession session, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("fillinVCMWeek", fillinServices.getTableFillinVCMWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("staffMembersVCM", staffMemberServices.getAllStaffMemberVCM());
        model.addAttribute("functionVCMsMonAm", fillinServices.getAllfunctionVCMMonAm(fillin.getWeek()));
        model.addAttribute("functionVCMsMonPm", fillinServices.getAllfunctionVCMMonPm(fillin.getWeek()));
        model.addAttribute("functionVCMsTueAm", fillinServices.getAllfunctionVCMTueAm(fillin.getWeek()));
        model.addAttribute("functionVCMsTuePm", fillinServices.getAllfunctionVCMTuePm(fillin.getWeek()));
        model.addAttribute("functionVCMsWedAm", fillinServices.getAllfunctionVCMWedAm(fillin.getWeek()));
        model.addAttribute("functionVCMsWedPm", fillinServices.getAllfunctionVCMWedPm(fillin.getWeek()));
        model.addAttribute("functionVCMsThuAm", fillinServices.getAllfunctionVCMThuAm(fillin.getWeek()));
        model.addAttribute("functionVCMsThuPm", fillinServices.getAllfunctionVCMThuPm(fillin.getWeek()));
        model.addAttribute("functionVCMsFriAm", fillinServices.getAllfunctionVCMFriAm(fillin.getWeek()));
        model.addAttribute("functionVCMsFriPm", fillinServices.getAllfunctionVCMFriPm(fillin.getWeek()));
        return "changeotherIdVCMPage";
    }

    @GetMapping("changeotherIdVCMPage")
    public String changeotherIdVCMPage(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("changeFillinID", fillinServices.getChangeFillinID (fillin.getNameMember(), fillin.getWeek(),fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changeotherIdVCM";
    }

    @GetMapping("allStaffMemberLCM")
    public String allStaffMemberLCM(Model model, HttpSession session, StaffMember staffMember) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("staffMembersLCM", staffMemberServices.getAllStaffMemberLCM());
        return "changeotherIdLCM";
    }

    @GetMapping("allStaffMemberMCFG")
    public String allStaffMemberMCFG(Model model, HttpSession session, StaffMember staffMember) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("staffMembersMCFG", staffMemberServices.getAllStaffMemberMCFG());
        return "changeotherIdMCFG";
    }

    @GetMapping("allStaffMemberVCM")
    public String allStaffMemberVCM(Model model, HttpSession session, StaffMember staffMember) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("staffMembersVCM", staffMemberServices.getAllStaffMemberVCM());
        return "changeotherIdVCM";
    }


    @GetMapping("fillinotherId")
    public String fillinotherId(Model model, HttpSession session) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        return "fillinotherId";
    }

    @GetMapping("fillinotherIdPageLCM")
    public String fillinotherIdPageLCM(Model model, HttpSession session, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        return "fillinotherIdLCM";
    }

    @GetMapping("fillinotherIdLCM")
    public String fillinotherIdLCM(Model model, HttpSession session, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("fillinLCMWeek", fillinServices.getTableFillinLCMWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("staffMembersLCM", staffMemberServices.getAllStaffMemberLCM());
        model.addAttribute("functionLCMsMonAm", fillinServices.getAllfunctionLCMMonAm(fillin.getWeek()));
        model.addAttribute("functionLCMsMonPm", fillinServices.getAllfunctionLCMMonPm(fillin.getWeek()));
        model.addAttribute("functionLCMsTueAm", fillinServices.getAllfunctionLCMTueAm(fillin.getWeek()));
        model.addAttribute("functionLCMsTuePm", fillinServices.getAllfunctionLCMTuePm(fillin.getWeek()));
        model.addAttribute("functionLCMsWedAm", fillinServices.getAllfunctionLCMWedAm(fillin.getWeek()));
        model.addAttribute("functionLCMsWedPm", fillinServices.getAllfunctionLCMWedPm(fillin.getWeek()));
        model.addAttribute("functionLCMsThuAm", fillinServices.getAllfunctionLCMThuAm(fillin.getWeek()));
        model.addAttribute("functionLCMsThuPm", fillinServices.getAllfunctionLCMThuPm(fillin.getWeek()));
        model.addAttribute("functionLCMsFriAm", fillinServices.getAllfunctionLCMFriAm(fillin.getWeek()));
        model.addAttribute("functionLCMsFriPm", fillinServices.getAllfunctionLCMFriPm(fillin.getWeek()));
        return "fillinotherIdLCMPage";
    }

    @GetMapping("fillinotherIdLCMPage")
    public String fillinotherIdLCMPage(Model model, HttpSession session, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("staffMembersLCM", staffMemberServices.getAllStaffMemberLCM());
        model.addAttribute("FillinFillinID", fillinServices.getFillinFillinIDLCM (fillin.getNameMember(), fillin.getWeek(),fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "fillinotherIdLCM";
    }

    @GetMapping("fillinotherIdPageMCFG")
    public String fillinotherIdPageMCFG(Model model, HttpSession session, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        return "fillinotherIdMCFG";
    }

    @GetMapping("fillinotherIdMCFG")
    public String fillinotherIdMCFG(Model model, HttpSession session, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("fillinMCFGWeek", fillinServices.getTableFillinMCFGWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("staffMembersMCFG", staffMemberServices.getAllStaffMemberMCFG());
        model.addAttribute("functionMCFGsMonAm", fillinServices.getAllfunctionMCFGMonAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsMonPm", fillinServices.getAllfunctionMCFGMonPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsTueAm", fillinServices.getAllfunctionMCFGTueAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsTuePm", fillinServices.getAllfunctionMCFGTuePm(fillin.getWeek()));
        model.addAttribute("functionMCFGsWedAm", fillinServices.getAllfunctionMCFGWedAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsWedPm", fillinServices.getAllfunctionMCFGWedPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsThuAm", fillinServices.getAllfunctionMCFGThuAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsThuPm", fillinServices.getAllfunctionMCFGThuPm(fillin.getWeek()));
        model.addAttribute("functionMCFGsFriAm", fillinServices.getAllfunctionMCFGFriAm(fillin.getWeek()));
        model.addAttribute("functionMCFGsFriPm", fillinServices.getAllfunctionMCFGFriPm(fillin.getWeek()));
        return "fillinotherIdMCFGPage";
    }

    @GetMapping("fillinotherIdMCFGPage")
    public String fillinotherIdMCFGPage(Model model, HttpSession session, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("fillinFillinID", fillinServices.getFillinFillinIDMCFG (fillin.getNameMember(), fillin.getWeek(),fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "fillinotherIdMCFG";
    }

    @GetMapping("fillinotherIdPageVCM")
    public String fillinotherIdPageVCM(Model model, HttpSession session, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        return "fillinotherIdVCM";
    }

    @GetMapping("fillinotherIdVCM")
    public String fillinotherIdVCM(Model model, HttpSession session, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("fillinVCMWeek", fillinServices.getTableFillinVCMWeek(fillin.getWeek()));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("staffMembersVCM", staffMemberServices.getAllStaffMemberVCM());
        model.addAttribute("functionVCMsMonAm", fillinServices.getAllfunctionVCMMonAm(fillin.getWeek()));
        model.addAttribute("functionVCMsMonPm", fillinServices.getAllfunctionVCMMonPm(fillin.getWeek()));
        model.addAttribute("functionVCMsTueAm", fillinServices.getAllfunctionVCMTueAm(fillin.getWeek()));
        model.addAttribute("functionVCMsTuePm", fillinServices.getAllfunctionVCMTuePm(fillin.getWeek()));
        model.addAttribute("functionVCMsWedAm", fillinServices.getAllfunctionVCMWedAm(fillin.getWeek()));
        model.addAttribute("functionVCMsWedPm", fillinServices.getAllfunctionVCMWedPm(fillin.getWeek()));
        model.addAttribute("functionVCMsThuAm", fillinServices.getAllfunctionVCMThuAm(fillin.getWeek()));
        model.addAttribute("functionVCMsThuPm", fillinServices.getAllfunctionVCMThuPm(fillin.getWeek()));
        model.addAttribute("functionVCMsFriAm", fillinServices.getAllfunctionVCMFriAm(fillin.getWeek()));
        model.addAttribute("functionVCMsFriPm", fillinServices.getAllfunctionVCMFriPm(fillin.getWeek()));
        return "fillinotherIdVCMPage";
    }

    @GetMapping("fillinotherIdVCMPage")
    public String fillinotherIdVCMPage(Model model, HttpSession session, Fillin fillin) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("fillinFillinID", fillinServices.getFillinFillinIDVCM (fillin.getNameMember(), fillin.getWeek(),fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "fillinotherIdVCM";
    }

}