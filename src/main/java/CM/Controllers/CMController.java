package CM.Controllers;

import CM.Model.*;
import CM.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.Id;
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
                    return "redirect:changepagefillinLCM2";
                case "VCM":
                    return "redirect:changepagefillinVCM2";
                case "MCFG":
                    return "redirect:changepagefillinMCFG2";
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
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionLCMs", functionServices.getAllfunctionLCM());
        return "fillinLCM";
    }

    @GetMapping("newFillinLCM")
    public String newFillinLCM(Model model, HttpSession session, Fillin fillin, Task task, DateName dateName, Function function, Location location) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionLCMs", functionServices.getAllfunctionLCM());
        String department = staffMember.getDepartment();
        model.addAttribute("newFillin", fillinServices.getAddFillin(IdStaffMember, fillin.getWeek(), department, fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "fillinLCM";
    }

    @GetMapping("fillinLCM2")
    public String fillinLCM2(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName, Location location) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionLCMs", functionServices.getAllfunctionLCM());
        return "fillinLCM2";
    }

    @GetMapping("newFillinLCM2")
    public String newFillinLCM2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionLCMs", functionServices.getAllfunctionLCM());
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
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionVCMs", functionServices.getAllfunctionVCM());
        return "fillinVCM";
    }

    @GetMapping("newFillinVCM")
    public String newFillinVCM(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionVCMs", functionServices.getAllfunctionVCM());
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
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionVCMs", functionServices.getAllfunctionVCM());
        return "fillinVCM2";
    }

    @GetMapping("newFillinVCM2")
    public String newFillinVCM2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionVCMs", functionServices.getAllfunctionVCM());
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
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionMCFGs", functionServices.getAllfunctionMCFG());
        return "fillinMCFG";
    }

    @GetMapping("newFillinMCFG")
    public String newFillinMCFG(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionMCFGs", functionServices.getAllfunctionMCFG());
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
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionMCFGs", functionServices.getAllfunctionMCFG());
        return "fillinMCFG2";
    }

    @GetMapping("newFillinMCFG2")
    public String newFillinMCFG2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNamesId", fillinServices.getDateNameId(IdStaffMember));
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionMCFGs", functionServices.getAllfunctionMCFG());
        String department = staffMember.getDepartment();
        model.addAttribute("newFillin", fillinServices.getAddFillin(IdStaffMember, fillin.getWeek(),department, fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "fillinMCFG2";
    }

    @GetMapping("changepagefillinLCM")
    public String changepagefillinLCM(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionLCMs", functionServices.getAllfunctionLCM());
        return "changefillinLCM";
    }

    @GetMapping("changefillinLCM")
    public String changefillinLCM(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionLCMs", functionServices.getAllfunctionLCM());
        model.addAttribute("changeLCM", fillinServices.getChangeFillin(IdStaffMember, fillin.getWeek(), fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changefillinLCM";
    }

    @GetMapping("changepagefillinLCM2")
    public String changepagefillinLCM2(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionLCMs", functionServices.getAllfunctionLCM());
        model.addAttribute("changeLCM", fillinServices.getChangeFillin(IdStaffMember, fillin.getWeek(), fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changefillinLCM2";
    }

    @GetMapping("changefillinLCM2")
    public String changefillinLCM2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionLCMs", functionServices.getAllfunctionLCM());
        model.addAttribute("changeLCM", fillinServices.getChangeFillin(IdStaffMember, fillin.getWeek(), fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changefillinLCM2";
    }

    @GetMapping("changepagefillinVCM")
    public String changepagefillinVCM(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionVCMs", functionServices.getAllfunctionLCM());
        return "changefillinLCM";
    }

    @GetMapping("changefillinVCM")
    public String changefillinVCM(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionVCMs", functionServices.getAllfunctionVCM());
        model.addAttribute("changeVCM", fillinServices.getChangeFillin(IdStaffMember, fillin.getWeek(), fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changefillinVCM";
    }

    @GetMapping("changepagefillinVCM2")
    public String changepagefillinVCM2(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionVCMs", functionServices.getAllfunctionVCM());
        return "changefillinVCM2";
    }

    @GetMapping("changefillinVCM2")
    public String changefillinVCM2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionVCMs", functionServices.getAllfunctionVCM());
        model.addAttribute("changeVCM", fillinServices.getChangeFillin(IdStaffMember, fillin.getWeek(), fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changefilliVLCM2";
    }

    @GetMapping("changepagefillinMCFG")
    public String changepagefillinMCFG(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionMCFGs", functionServices.getAllfunctionMCFG());
        return "changefillinMCFG";
    }

    @GetMapping("changefillinMCFG")
    public String changefillinMCFG(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionMCFGs", functionServices.getAllfunctionMCFG());
        model.addAttribute("changeMCFG", fillinServices.getChangeFillin(IdStaffMember, fillin.getWeek(), fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changefillinMCFG";
    }

    @GetMapping("changepagefillinMCFG2")
    public String changepagefillinMCFG2(Model model, HttpSession session, Fillin fillin, Task task, Function function, DateName dateName) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionMCFGs", functionServices.getAllfunctionMCFG());
        return "changefillinMCFG2";
    }

    @GetMapping("changefillinMCFG2")
    public String changefillinMCFG2(Model model, HttpSession session, Fillin fillin, Task task, Date date, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", fillinServices.getAllDateName());
        model.addAttribute("tasks", tasksServices.getTableTask());
        model.addAttribute("locations", locationServices.getTableLocation());
        model.addAttribute("functionMCFGs", functionServices.getAllfunctionMCFG());
        model.addAttribute("changeMCFG", fillinServices.getChangeFillin(IdStaffMember, fillin.getWeek(), fillin.getMonAmFunction(), fillin.getMonAmTask(), fillin.getMonAmLocation(), fillin.getMonAmAbsent(), fillin.getMonPmFunction(), fillin.getMonPmTask(), fillin.getMonPmLocation(), fillin.getMonPmAbsent(), fillin.getTueAmFunction(), fillin.getTueAmTask(), fillin.getTueAmLocation(), fillin.getTueAmAbsent(), fillin.getTuePmFunction(), fillin.getTuePmTask(), fillin.getTuePmLocation(), fillin.getTuePmAbsent(), fillin.getWedAmFunction(), fillin.getWedAmTask(), fillin.getWedAmLocation(), fillin.getWedAmAbsent(), fillin.getWedPmFunction(), fillin.getWedPmTask(), fillin.getWedPmLocation(), fillin.getWedPmAbsent(), fillin.getThuAmFunction(), fillin.getThuAmTask(), fillin.getThuAmLocation(), fillin.getThuAmAbsent(), fillin.getThuPmFunction(), fillin.getThuPmTask(), fillin.getThuPmLocation(), fillin.getThuPmAbsent(), fillin.getFriAmFunction(), fillin.getFriAmTask(), fillin.getFriAmLocation(), fillin.getFriAmAbsent(), fillin.getFriPmFunction(), fillin.getFriPmTask(), fillin.getFriPmLocation(), fillin.getFriPmAbsent()));
        return "changefillinMCFG2";
    }
    //LCM
    @GetMapping("lcm")
    public String lcm(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinLCMMonAm", fillinServices.getTableFillinLCMMonAm(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPm", fillinServices.getTableFillinLCMMonPm(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAm", fillinServices.getTableFillinLCMTueAm(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePm", fillinServices.getTableFillinLCMTuePm(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAm", fillinServices.getTableFillinLCMWedAm(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPm", fillinServices.getTableFillinLCMWedPm(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAm", fillinServices.getTableFillinLCMThuAm(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPm", fillinServices.getTableFillinLCMThuPm(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAm", fillinServices.getTableFillinLCMFriAm(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPm", fillinServices.getTableFillinLCMFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentMon", fillinServices.getTableFillinLCMAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentTue", fillinServices.getTableFillinLCMAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentWed", fillinServices.getTableFillinLCMAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentThu", fillinServices.getTableFillinLCMAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentFri", fillinServices.getTableFillinLCMAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskMonAm", fillinServices.getTableFillinLCMTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskMonPm", fillinServices.getTableFillinLCMTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskTueAm", fillinServices.getTableFillinLCMTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskTuePm", fillinServices.getTableFillinLCMTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskWedAm", fillinServices.getTableFillinLCMTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskWedPm", fillinServices.getTableFillinLCMTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskThuAm", fillinServices.getTableFillinLCMTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskThuPm", fillinServices.getTableFillinLCMTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskFriAm", fillinServices.getTableFillinLCMTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskFriPm", fillinServices.getTableFillinLCMTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "LCM";

    }

    @GetMapping("searchLCM")
    public String searchLCM(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinLCMMonAm", fillinServices.getTableFillinLCMMonAm(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPm", fillinServices.getTableFillinLCMMonPm(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAm", fillinServices.getTableFillinLCMTueAm(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePm", fillinServices.getTableFillinLCMTuePm(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAm", fillinServices.getTableFillinLCMWedAm(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPm", fillinServices.getTableFillinLCMWedPm(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAm", fillinServices.getTableFillinLCMThuAm(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPm", fillinServices.getTableFillinLCMThuPm(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAm", fillinServices.getTableFillinLCMFriAm(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPm", fillinServices.getTableFillinLCMFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentMon", fillinServices.getTableFillinLCMAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentTue", fillinServices.getTableFillinLCMAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentWed", fillinServices.getTableFillinLCMAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentThu", fillinServices.getTableFillinLCMAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentFri", fillinServices.getTableFillinLCMAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskMonAm", fillinServices.getTableFillinLCMTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskMonPm", fillinServices.getTableFillinLCMTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskTueAm", fillinServices.getTableFillinLCMTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskTuePm", fillinServices.getTableFillinLCMTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskWedAm", fillinServices.getTableFillinLCMTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskWedPm", fillinServices.getTableFillinLCMTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskThuAm", fillinServices.getTableFillinLCMTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskThuPm", fillinServices.getTableFillinLCMTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskFriAm", fillinServices.getTableFillinLCMTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskFriPm", fillinServices.getTableFillinLCMTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "LCM";
    }

    @GetMapping("lcm2")
    public String lcm2(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinLCMMonAm2", fillinServices.getTableFillinLCMMonAm(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPm2", fillinServices.getTableFillinLCMMonPm(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAm2", fillinServices.getTableFillinLCMTueAm(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePm2", fillinServices.getTableFillinLCMTuePm(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAm2", fillinServices.getTableFillinLCMWedAm(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPm2", fillinServices.getTableFillinLCMWedPm(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAm2", fillinServices.getTableFillinLCMThuAm(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPm2", fillinServices.getTableFillinLCMThuPm(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAm2", fillinServices.getTableFillinLCMFriAm(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPm2", fillinServices.getTableFillinLCMFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentMon2", fillinServices.getTableFillinLCMAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentTue2", fillinServices.getTableFillinLCMAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentWed2", fillinServices.getTableFillinLCMAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentThu2", fillinServices.getTableFillinLCMAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentFri2", fillinServices.getTableFillinLCMAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskMonAm2", fillinServices.getTableFillinLCMTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskMonPm2", fillinServices.getTableFillinLCMTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskTueAm2", fillinServices.getTableFillinLCMTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskTuePm2", fillinServices.getTableFillinLCMTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskWedAm2", fillinServices.getTableFillinLCMTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskWedPm2", fillinServices.getTableFillinLCMTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskThuAm2", fillinServices.getTableFillinLCMTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskThuPm2", fillinServices.getTableFillinLCMTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskFriAm2", fillinServices.getTableFillinLCMTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskFriPm2", fillinServices.getTableFillinLCMTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "LCM2";
    }

    @GetMapping("searchLCM2")
    public String searchLCM2(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinLCMMonAm2", fillinServices.getTableFillinLCMMonAm(fillin.getWeek()));
        model.addAttribute("fillinLCMMonPm2", fillinServices.getTableFillinLCMMonPm(fillin.getWeek()));
        model.addAttribute("fillinLCMTueAm2", fillinServices.getTableFillinLCMTueAm(fillin.getWeek()));
        model.addAttribute("fillinLCMTuePm2", fillinServices.getTableFillinLCMTuePm(fillin.getWeek()));
        model.addAttribute("fillinLCMWedAm2", fillinServices.getTableFillinLCMWedAm(fillin.getWeek()));
        model.addAttribute("fillinLCMWedPm2", fillinServices.getTableFillinLCMWedPm(fillin.getWeek()));
        model.addAttribute("fillinLCMThuAm2", fillinServices.getTableFillinLCMThuAm(fillin.getWeek()));
        model.addAttribute("fillinLCMThuPm2", fillinServices.getTableFillinLCMThuPm(fillin.getWeek()));
        model.addAttribute("fillinLCMFriAm2", fillinServices.getTableFillinLCMFriAm(fillin.getWeek()));
        model.addAttribute("fillinLCMFriPm2", fillinServices.getTableFillinLCMFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentMon2", fillinServices.getTableFillinLCMAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentTue2", fillinServices.getTableFillinLCMAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentWed2", fillinServices.getTableFillinLCMAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentThu2", fillinServices.getTableFillinLCMAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinLCMAbsentFri2", fillinServices.getTableFillinLCMAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskMonAm2", fillinServices.getTableFillinLCMTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskMonPm2", fillinServices.getTableFillinLCMTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskTueAm2", fillinServices.getTableFillinLCMTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskTuePm2", fillinServices.getTableFillinLCMTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskWedAm2", fillinServices.getTableFillinLCMTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskWedPm2", fillinServices.getTableFillinLCMTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskThuAm2", fillinServices.getTableFillinLCMTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskThuPm2", fillinServices.getTableFillinLCMTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskFriAm2", fillinServices.getTableFillinLCMTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinLCMTaskFriPm2", fillinServices.getTableFillinLCMTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "LCM2";
    }

    //VCM
    @GetMapping("vcm")
    public String vcm(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinVCMMonAm", fillinServices.getTableFillinVCMMonAm(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPm", fillinServices.getTableFillinVCMMonPm(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAm", fillinServices.getTableFillinVCMTueAm(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePm", fillinServices.getTableFillinVCMTuePm(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAm", fillinServices.getTableFillinVCMWedAm(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPm", fillinServices.getTableFillinVCMWedPm(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAm", fillinServices.getTableFillinVCMThuAm(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPm", fillinServices.getTableFillinVCMThuPm(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAm", fillinServices.getTableFillinVCMFriAm(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPm", fillinServices.getTableFillinVCMFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentMon", fillinServices.getTableFillinVCMAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentTue", fillinServices.getTableFillinVCMAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentWed", fillinServices.getTableFillinVCMAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentThu", fillinServices.getTableFillinVCMAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentFri", fillinServices.getTableFillinVCMAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskMonAm", fillinServices.getTableFillinVCMTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskMonPm", fillinServices.getTableFillinVCMTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskTueAm", fillinServices.getTableFillinVCMTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskTuePm", fillinServices.getTableFillinVCMTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskWedAm", fillinServices.getTableFillinVCMTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskWedPm", fillinServices.getTableFillinVCMTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskThuAm", fillinServices.getTableFillinVCMTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskThuPm", fillinServices.getTableFillinVCMTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskFriAm", fillinServices.getTableFillinVCMTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskFriPm", fillinServices.getTableFillinVCMTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "VCM";
    }

    @GetMapping("searchVCM")
    public String searchVCM(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinVCMMonAm", fillinServices.getTableFillinVCMMonAm(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPm", fillinServices.getTableFillinVCMMonPm(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAm", fillinServices.getTableFillinVCMTueAm(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePm", fillinServices.getTableFillinVCMTuePm(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAm", fillinServices.getTableFillinVCMWedAm(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPm", fillinServices.getTableFillinVCMWedPm(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAm", fillinServices.getTableFillinVCMThuAm(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPm", fillinServices.getTableFillinVCMThuPm(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAm", fillinServices.getTableFillinVCMFriAm(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPm", fillinServices.getTableFillinVCMFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentMon", fillinServices.getTableFillinVCMAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentTue", fillinServices.getTableFillinVCMAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentWed", fillinServices.getTableFillinVCMAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentThu", fillinServices.getTableFillinVCMAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentFri", fillinServices.getTableFillinVCMAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskMonAm", fillinServices.getTableFillinVCMTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskMonPm", fillinServices.getTableFillinVCMTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskTueAm", fillinServices.getTableFillinVCMTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskTuePm", fillinServices.getTableFillinVCMTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskWedAm", fillinServices.getTableFillinVCMTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskWedPm", fillinServices.getTableFillinVCMTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskThuAm", fillinServices.getTableFillinVCMTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskThuPm", fillinServices.getTableFillinVCMTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskFriAm", fillinServices.getTableFillinVCMTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskFriPm", fillinServices.getTableFillinVCMTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "VCM";
    }

    @GetMapping("vcm2")
    public String vcm2(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinVCMMonAm2", fillinServices.getTableFillinVCMMonAm(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPm2", fillinServices.getTableFillinVCMMonPm(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAm2", fillinServices.getTableFillinVCMTueAm(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePm2", fillinServices.getTableFillinVCMTuePm(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAm2", fillinServices.getTableFillinVCMWedAm(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPm2", fillinServices.getTableFillinVCMWedPm(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAm2", fillinServices.getTableFillinVCMThuAm(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPm2", fillinServices.getTableFillinVCMThuPm(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAm2", fillinServices.getTableFillinVCMFriAm(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPm2", fillinServices.getTableFillinVCMFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentMon2", fillinServices.getTableFillinVCMAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentTue2", fillinServices.getTableFillinVCMAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentWed2", fillinServices.getTableFillinVCMAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentThu2", fillinServices.getTableFillinVCMAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentFri2", fillinServices.getTableFillinVCMAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskMonAm2", fillinServices.getTableFillinVCMTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskMonPm2", fillinServices.getTableFillinVCMTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskTueAm2", fillinServices.getTableFillinVCMTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskTuePm2", fillinServices.getTableFillinVCMTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskWedAm2", fillinServices.getTableFillinVCMTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskWedPm2", fillinServices.getTableFillinVCMTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskThuAm2", fillinServices.getTableFillinVCMTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskThuPm2", fillinServices.getTableFillinVCMTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskFriAm2", fillinServices.getTableFillinVCMTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskFriPm2", fillinServices.getTableFillinVCMTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "VCM2";
    }

    @GetMapping("searchVCM2")
    public String searchVCM2(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinVCMMonAm2", fillinServices.getTableFillinVCMMonAm(fillin.getWeek()));
        model.addAttribute("fillinVCMMonPm2", fillinServices.getTableFillinVCMMonPm(fillin.getWeek()));
        model.addAttribute("fillinVCMTueAm2", fillinServices.getTableFillinVCMTueAm(fillin.getWeek()));
        model.addAttribute("fillinVCMTuePm2", fillinServices.getTableFillinVCMTuePm(fillin.getWeek()));
        model.addAttribute("fillinVCMWedAm2", fillinServices.getTableFillinVCMWedAm(fillin.getWeek()));
        model.addAttribute("fillinVCMWedPm2", fillinServices.getTableFillinVCMWedPm(fillin.getWeek()));
        model.addAttribute("fillinVCMThuAm2", fillinServices.getTableFillinVCMThuAm(fillin.getWeek()));
        model.addAttribute("fillinVCMThuPm2", fillinServices.getTableFillinVCMThuPm(fillin.getWeek()));
        model.addAttribute("fillinVCMFriAm2", fillinServices.getTableFillinVCMFriAm(fillin.getWeek()));
        model.addAttribute("fillinVCMFriPm2", fillinServices.getTableFillinVCMFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentMon2", fillinServices.getTableFillinVCMAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentTue2", fillinServices.getTableFillinVCMAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentWed2", fillinServices.getTableFillinVCMAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentThu2", fillinServices.getTableFillinVCMAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinVCMAbsentFri2", fillinServices.getTableFillinVCMAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskMonAm2", fillinServices.getTableFillinVCMTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskMonPm2", fillinServices.getTableFillinVCMTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskTueAm2", fillinServices.getTableFillinVCMTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskTuePm2", fillinServices.getTableFillinVCMTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskWedAm2", fillinServices.getTableFillinVCMTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskWedPm2", fillinServices.getTableFillinVCMTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskThuAm2", fillinServices.getTableFillinVCMTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskThuPm2", fillinServices.getTableFillinVCMTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskFriAm2", fillinServices.getTableFillinVCMTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinVCMTaskFriPm2", fillinServices.getTableFillinVCMTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "VCM2";
    }

    // MCFG
    @GetMapping("mcfg")
    public String mcfg(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinMCFGMonAm", fillinServices.getTableFillinMCFGMonAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPm", fillinServices.getTableFillinMCFGMonPm(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAm", fillinServices.getTableFillinMCFGTueAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePm", fillinServices.getTableFillinMCFGTuePm(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAm", fillinServices.getTableFillinMCFGWedAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPm", fillinServices.getTableFillinMCFGWedPm(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAm", fillinServices.getTableFillinMCFGThuAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPm", fillinServices.getTableFillinMCFGThuPm(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAm", fillinServices.getTableFillinMCFGFriAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPm", fillinServices.getTableFillinMCFGFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentMon", fillinServices.getTableFillinMCFGAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentTue", fillinServices.getTableFillinMCFGAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentWed", fillinServices.getTableFillinMCFGAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentThu", fillinServices.getTableFillinMCFGAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentFri", fillinServices.getTableFillinMCFGAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskMonAm", fillinServices.getTableFillinMCFGTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskMonPm", fillinServices.getTableFillinMCFGTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskTueAm", fillinServices.getTableFillinMCFGTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskTuePm", fillinServices.getTableFillinMCFGTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskWedAm", fillinServices.getTableFillinMCFGTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskWedPm", fillinServices.getTableFillinMCFGTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskThuAm", fillinServices.getTableFillinMCFGTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskThuPm", fillinServices.getTableFillinMCFGTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskFriAm", fillinServices.getTableFillinMCFGTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskFriPm", fillinServices.getTableFillinMCFGTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "MCFG";
    }

    @GetMapping("searchMCFG")
    public String searchMCFG(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinMCFGMonAm", fillinServices.getTableFillinMCFGMonAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPm", fillinServices.getTableFillinMCFGMonPm(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAm", fillinServices.getTableFillinMCFGTueAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePm", fillinServices.getTableFillinMCFGTuePm(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAm", fillinServices.getTableFillinMCFGWedAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPm", fillinServices.getTableFillinMCFGWedPm(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAm", fillinServices.getTableFillinMCFGThuAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPm", fillinServices.getTableFillinMCFGThuPm(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAm", fillinServices.getTableFillinMCFGFriAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPm", fillinServices.getTableFillinMCFGFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentMon", fillinServices.getTableFillinMCFGAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentTue", fillinServices.getTableFillinMCFGAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentWed", fillinServices.getTableFillinMCFGAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentThu", fillinServices.getTableFillinMCFGAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentFri", fillinServices.getTableFillinMCFGAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskMonAm", fillinServices.getTableFillinMCFGTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskMonPm", fillinServices.getTableFillinMCFGTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskTueAm", fillinServices.getTableFillinMCFGTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskTuePm", fillinServices.getTableFillinMCFGTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskWedAm", fillinServices.getTableFillinMCFGTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskWedPm", fillinServices.getTableFillinMCFGTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskThuAm", fillinServices.getTableFillinMCFGTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskThuPm", fillinServices.getTableFillinMCFGTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskFriAm", fillinServices.getTableFillinMCFGTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskFriPm", fillinServices.getTableFillinMCFGTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "MCFG";
    }

    @GetMapping("mcfg2")
    public String mcfg2(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinMCFGMonAm2", fillinServices.getTableFillinMCFGMonAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPm2", fillinServices.getTableFillinMCFGMonPm(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAm2", fillinServices.getTableFillinMCFGTueAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePm2", fillinServices.getTableFillinMCFGTuePm(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAm2", fillinServices.getTableFillinMCFGWedAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPm2", fillinServices.getTableFillinMCFGWedPm(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAm2", fillinServices.getTableFillinMCFGThuAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPm2", fillinServices.getTableFillinMCFGThuPm(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAm2", fillinServices.getTableFillinMCFGFriAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPm2", fillinServices.getTableFillinMCFGFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentMon2", fillinServices.getTableFillinMCFGAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentTue2", fillinServices.getTableFillinMCFGAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentWed2", fillinServices.getTableFillinMCFGAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentThu2", fillinServices.getTableFillinMCFGAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentFri2", fillinServices.getTableFillinMCFGAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskMonAm2", fillinServices.getTableFillinMCFGTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskMonPm2", fillinServices.getTableFillinMCFGTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskTueAm2", fillinServices.getTableFillinMCFGTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskTuePm2", fillinServices.getTableFillinMCFGTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskWedAm2", fillinServices.getTableFillinMCFGTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskWedPm2", fillinServices.getTableFillinMCFGTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskThuAm2", fillinServices.getTableFillinMCFGTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskThuPm2", fillinServices.getTableFillinMCFGTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskFriAm2", fillinServices.getTableFillinMCFGTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskFriPm2", fillinServices.getTableFillinMCFGTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "MCFG2";
    }

    @GetMapping("searchMCFG2")
    public String searchMCFG2(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinMCFGMonAm2", fillinServices.getTableFillinMCFGMonAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGMonPm2", fillinServices.getTableFillinMCFGMonPm(fillin.getWeek()));
        model.addAttribute("fillinMCFGTueAm2", fillinServices.getTableFillinMCFGTueAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGTuePm2", fillinServices.getTableFillinMCFGTuePm(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedAm2", fillinServices.getTableFillinMCFGWedAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGWedPm2", fillinServices.getTableFillinMCFGWedPm(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuAm2", fillinServices.getTableFillinMCFGThuAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGThuPm2", fillinServices.getTableFillinMCFGThuPm(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriAm2", fillinServices.getTableFillinMCFGFriAm(fillin.getWeek()));
        model.addAttribute("fillinMCFGFriPm2", fillinServices.getTableFillinMCFGFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentMon2", fillinServices.getTableFillinMCFGAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentTue2", fillinServices.getTableFillinMCFGAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentWed2", fillinServices.getTableFillinMCFGAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentThu2", fillinServices.getTableFillinMCFGAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGAbsentFri2", fillinServices.getTableFillinMCFGAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskMonAm2", fillinServices.getTableFillinMCFGTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskMonPm2", fillinServices.getTableFillinMCFGTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskTueAm2", fillinServices.getTableFillinMCFGTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskTuePm2", fillinServices.getTableFillinMCFGTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskWedAm2", fillinServices.getTableFillinMCFGTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskWedPm2", fillinServices.getTableFillinMCFGTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskThuAm2", fillinServices.getTableFillinMCFGTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskThuPm2", fillinServices.getTableFillinMCFGTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskFriAm2", fillinServices.getTableFillinMCFGTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinMCFGTaskFriPm2", fillinServices.getTableFillinMCFGTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "MCFG2";
    }

    //SCHEMA
    @GetMapping("schema")
    public String schema(Model model, HttpSession session, Fillin fillin) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinMonAm", fillinServices.getTableFillinMonAm(fillin.getWeek()));
        model.addAttribute("fillinMonPm", fillinServices.getTableFillinMonPm(fillin.getWeek()));
        model.addAttribute("fillinTueAm", fillinServices.getTableFillinTueAm(fillin.getWeek()));
        model.addAttribute("fillinTuePm", fillinServices.getTableFillinTuePm(fillin.getWeek()));
        model.addAttribute("fillinWedAm", fillinServices.getTableFillinWedAm(fillin.getWeek()));
        model.addAttribute("fillinWedPm", fillinServices.getTableFillinWedPm(fillin.getWeek()));
        model.addAttribute("fillinThuAm", fillinServices.getTableFillinThuAm(fillin.getWeek()));
        model.addAttribute("fillinThuPm", fillinServices.getTableFillinThuPm(fillin.getWeek()));
        model.addAttribute("fillinFriAm", fillinServices.getTableFillinFriAm(fillin.getWeek()));
        model.addAttribute("fillinFriPm", fillinServices.getTableFillinFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentMon", fillinServices.getTableFillinAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentTue", fillinServices.getTableFillinAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentWed", fillinServices.getTableFillinAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentThu", fillinServices.getTableFillinAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentFri", fillinServices.getTableFillinAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinTaskMonAm", fillinServices.getTableFillinTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskMonPm", fillinServices.getTableFillinTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskTueAm", fillinServices.getTableFillinTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskTuePm", fillinServices.getTableFillinTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskWedAm", fillinServices.getTableFillinTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskWedPm", fillinServices.getTableFillinTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskThuAm", fillinServices.getTableFillinTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskThuPm", fillinServices.getTableFillinTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskFriAm", fillinServices.getTableFillinTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskFriPm", fillinServices.getTableFillinTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "schema";
    }

    @GetMapping("searchSchema")
    public String searchSchema(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinMonAm", fillinServices.getTableFillinMonAm(fillin.getWeek()));
        model.addAttribute("fillinMonPm", fillinServices.getTableFillinMonPm(fillin.getWeek()));
        model.addAttribute("fillinTueAm", fillinServices.getTableFillinTueAm(fillin.getWeek()));
        model.addAttribute("fillinTuePm", fillinServices.getTableFillinTuePm(fillin.getWeek()));
        model.addAttribute("fillinWedAm", fillinServices.getTableFillinWedAm(fillin.getWeek()));
        model.addAttribute("fillinWedPm", fillinServices.getTableFillinWedPm(fillin.getWeek()));
        model.addAttribute("fillinThuAm", fillinServices.getTableFillinThuAm(fillin.getWeek()));
        model.addAttribute("fillinThuPm", fillinServices.getTableFillinThuPm(fillin.getWeek()));
        model.addAttribute("fillinFriAm", fillinServices.getTableFillinFriAm(fillin.getWeek()));
        model.addAttribute("fillinFriPm", fillinServices.getTableFillinFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentMon", fillinServices.getTableFillinAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentTue", fillinServices.getTableFillinAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentWed", fillinServices.getTableFillinAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentThu", fillinServices.getTableFillinAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentFri", fillinServices.getTableFillinAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinTaskMonAm", fillinServices.getTableFillinTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskMonPm", fillinServices.getTableFillinTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskTueAm", fillinServices.getTableFillinTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskTuePm", fillinServices.getTableFillinTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskWedAm", fillinServices.getTableFillinTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskWedPm", fillinServices.getTableFillinTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskThuAm", fillinServices.getTableFillinTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskThuPm", fillinServices.getTableFillinTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskFriAm", fillinServices.getTableFillinTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskFriPm", fillinServices.getTableFillinTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "schema";
    }

    @GetMapping("schema2")
    public String schema2(Model model, HttpSession session, Fillin fillin) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinMonAm2", fillinServices.getTableFillinMonAm(fillin.getWeek()));
        model.addAttribute("fillinMonPm2", fillinServices.getTableFillinMonPm(fillin.getWeek()));
        model.addAttribute("fillinTueAm2", fillinServices.getTableFillinTueAm(fillin.getWeek()));
        model.addAttribute("fillinTuePm2", fillinServices.getTableFillinTuePm(fillin.getWeek()));
        model.addAttribute("fillinWedAm2", fillinServices.getTableFillinWedAm(fillin.getWeek()));
        model.addAttribute("fillinWedPm2", fillinServices.getTableFillinWedPm(fillin.getWeek()));
        model.addAttribute("fillinThuAm2", fillinServices.getTableFillinThuAm(fillin.getWeek()));
        model.addAttribute("fillinThuPm2", fillinServices.getTableFillinThuPm(fillin.getWeek()));
        model.addAttribute("fillinFriAm2", fillinServices.getTableFillinFriAm(fillin.getWeek()));
        model.addAttribute("fillinFriPm2", fillinServices.getTableFillinFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentMon2", fillinServices.getTableFillinAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentTue2", fillinServices.getTableFillinAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentWed2", fillinServices.getTableFillinAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentThu2", fillinServices.getTableFillinAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentFri2", fillinServices.getTableFillinAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinTaskMonAm2", fillinServices.getTableFillinTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskMonPm2", fillinServices.getTableFillinTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskTueAm2", fillinServices.getTableFillinTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskTuePm2", fillinServices.getTableFillinTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskWedAm2", fillinServices.getTableFillinTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskWedPm2", fillinServices.getTableFillinTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskThuAm2", fillinServices.getTableFillinTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskThuPm2", fillinServices.getTableFillinTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskFriAm2", fillinServices.getTableFillinTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskFriPm2", fillinServices.getTableFillinTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "schema2";
    }

    @GetMapping("searchSchema2")
    public String searchSchema2(Model model, HttpSession session, StaffMember staffMember, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("fillinMonAm2", fillinServices.getTableFillinMonAm(fillin.getWeek()));
        model.addAttribute("fillinMonPm2", fillinServices.getTableFillinMonPm(fillin.getWeek()));
        model.addAttribute("fillinTueAm2", fillinServices.getTableFillinTueAm(fillin.getWeek()));
        model.addAttribute("fillinTuePm2", fillinServices.getTableFillinTuePm(fillin.getWeek()));
        model.addAttribute("fillinWedAm2", fillinServices.getTableFillinWedAm(fillin.getWeek()));
        model.addAttribute("fillinWedPm2", fillinServices.getTableFillinWedPm(fillin.getWeek()));
        model.addAttribute("fillinThuAm2", fillinServices.getTableFillinThuAm(fillin.getWeek()));
        model.addAttribute("fillinThuPm2", fillinServices.getTableFillinThuPm(fillin.getWeek()));
        model.addAttribute("fillinFriAm2", fillinServices.getTableFillinFriAm(fillin.getWeek()));
        model.addAttribute("fillinFriPm2", fillinServices.getTableFillinFriPm(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentMon2", fillinServices.getTableFillinAbsentMon(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentTue2", fillinServices.getTableFillinAbsentTue(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentWed2", fillinServices.getTableFillinAbsentWed(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentThu2", fillinServices.getTableFillinAbsentThu(fillin.getWeek()));
        model.addAttribute("tableFillinAbsentFri2", fillinServices.getTableFillinAbsentFri(fillin.getWeek()));
        model.addAttribute("tableFillinTaskMonAm2", fillinServices.getTableFillinTaskMonAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskMonPm2", fillinServices.getTableFillinTaskMonPm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskTueAm2", fillinServices.getTableFillinTaskTueAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskTuePm2", fillinServices.getTableFillinTaskTuePm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskWedAm2", fillinServices.getTableFillinTaskWedAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskWedPm2", fillinServices.getTableFillinTaskWedPm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskThuAm2", fillinServices.getTableFillinTaskThuAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskThuPm2", fillinServices.getTableFillinTaskThuPm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskFriAm2", fillinServices.getTableFillinTaskFriAm(fillin.getWeek()));
        model.addAttribute("tableFillinTaskFriPm2", fillinServices.getTableFillinTaskFriPm(fillin.getWeek()));
        model.addAttribute("staffMembers", staffMemberServices.getAllStaffMember());
        return "schema2";
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
        model.addAttribute("searchOwn", fillinServices.getSearchOwnDate(fillin.getWeek(),IdStaffMember ));
        return "ownData";
    }

    @GetMapping("ownData2")
    public String ownData2(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchOwn", fillinServices.getSearchOwnDate(fillin.getWeek(),IdStaffMember ));
        return "ownData2";
    }

    @GetMapping("searchOwn2")
    public String searchOwn2(Model model, HttpSession session, Fillin fillin, DateName dateName) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        StaffMember staffMember = (StaffMember) session.getAttribute("staffMember");
        int IdStaffMember = staffMember.getId();
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchOwn", fillinServices.getSearchOwnDate(fillin.getWeek(),IdStaffMember ));
        return "ownData2";
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
        model.addAttribute("fillins", fillinServices.getSearchOwnDataAbsent(fillin.getMonth(), IdStaffMember));
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
        model.addAttribute("newFunction", functionServices.getAddFunction(function.getDepartment(), function.getNamefunction(), function.getTotal()));
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

    @GetMapping("changefunction")
    public String changefunction(Model model, HttpSession session, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        return "changeFunction";
    }

    @GetMapping("changefun")
    public String changefun(Model model, HttpSession session, Function function) throws Exception {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("changefun", functionServices.getChangeFunction(function.getDepartment(), function.getNamefunction(), function.getTotal()));
        return "changeFunction";
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

    //@GetMapping("DateNameBy")
    //    public String DateName(Model model, HttpSession session, DateName dateName) throws SQLException {
    //        model.addAttribute("staffMember", session.getAttribute("staffMember"));
    //        model.addAttribute("dateNames", fillinServices.getDateName());
    //        return "alldateName";
    //    }

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
        model.addAttribute("searchCheck", fillinServices.getCheck(fillin.getWeek()));
        return "check";
    }
    @GetMapping("searchCheck")
    public String searchCheck(Model model, HttpSession session, DateName dateName, Fillin fillin) throws SQLException {
        model.addAttribute("staffMember", session.getAttribute("staffMember"));
        model.addAttribute("dateNames", dateNameServices.getAllDateName());
        model.addAttribute("searchCheck", fillinServices.getCheck(fillin.getWeek()));
        return "check";
    }

    @GetMapping("signOut")
    public String signOut() throws SQLException {
        return "index";
    }

}