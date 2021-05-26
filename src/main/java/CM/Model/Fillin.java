package CM.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Tineke Haverhals
 * 6/04/21.
 */
@Entity
public class Fillin {
    @Id
    @GeneratedValue
    private int id;
    private int IdStaffMember;
    private String name;
    private String abbreviationName;
    private String week;
    private String month;
    private String location;
    private String department;
    private String namefunction;
    private String nameMember;
    private String abbreviationLocation;

    private String abbreviationNameMonAm;
    private String abbreviationNameMonPm;
    private String abbreviationNameTueAm;
    private String abbreviationNameTuePm;
    private String abbreviationNameWedAm;
    private String abbreviationNameWedPm;
    private String abbreviationNameThuAm;
    private String abbreviationNameThuPm;
    private String abbreviationNameFriAm;
    private String abbreviationNameFriPm;

    private String nameDate;
    private String monthBegin;
    private String monthEnd;

    private String monAmFunction;
    private String monAmTask;
    private String monAmLocation;
    private String monAmAbsent;

    private String monPmFunction;
    private String monPmTask;
    private String monPmLocation;
    private String monPmAbsent;

    private String tueAmFunction;
    private String tueAmTask;
    private String tueAmLocation;
    private String tueAmAbsent;

    private String tuePmFunction;
    private String tuePmTask;
    private String tuePmLocation;
    private String tuePmAbsent;

    private String wedAmFunction;
    private String wedAmTask;
    private String wedAmLocation;
    private String wedAmAbsent;

    private String wedPmFunction;
    private String wedPmTask;
    private String wedPmLocation;
    private String wedPmAbsent;

    private String thuAmFunction;
    private String thuAmTask;
    private String thuAmLocation;
    private String thuAmAbsent;

    private String thuPmFunction;
    private String thuPmTask;
    private String thuPmLocation;
    private String thuPmAbsent;

    private String friAmFunction;
    private String friAmTask;
    private String friAmLocation;
    private String friAmAbsent;

    private String friPmFunction;
    private String friPmTask;
    private String friPmLocation;
    private String friPmAbsent;

    public Fillin() {

    }

    public Fillin(String week, String department, String monAmFunction, String monAmTask, String monAmLocation, String monAmAbsent, String monPmFunction, String monPmTask, String monPmLocation, String monPmAbsent) {
        this.week = week;
        this.department = department;
        this.monAmFunction = monAmFunction;
        this.monAmTask = monAmTask;
        this.monAmLocation = monAmLocation;
        this.monAmAbsent = monAmAbsent;
        this.monPmFunction = monPmFunction;
        this.monPmTask = monPmTask;
        this.monPmLocation = monPmLocation;
        this.monPmAbsent = monPmAbsent;
    }

    public Fillin(String week, String department, String monAmAbsent, String monPmAbsent, String tueAmAbsent, String tuePmAbsent, String wedAmAbsent, String wedPmAbsent, String thuAmAbsent, String thuPmAbsent, String friAmAbsent, String friPmAbsent) {
        this.week = week;
        this.department = department;
        this.name = name;
        this.monAmAbsent = monAmAbsent;
        this.monPmAbsent = monAmAbsent;
        this.tueAmAbsent = tueAmAbsent;
        this.tuePmAbsent = tueAmAbsent;
        this.wedAmAbsent = wedAmAbsent;
        this.wedPmAbsent = wedAmAbsent;
        this.thuAmAbsent = thuAmAbsent;
        this.thuPmAbsent = thuAmAbsent;
        this.friAmAbsent = friAmAbsent;
        this.friPmAbsent = friAmAbsent;
    }

    public String getAbbreviationName() {
        return abbreviationName;
    }

    public Fillin setAbbreviationName(String abbreviationName) {
        this.abbreviationName = abbreviationName;
        return this;
    }

    public String getAbbreviationLocation() {
        return abbreviationLocation;
    }

    public Fillin setAbbreviationLocation(String abbreviationLocation) {
        this.abbreviationLocation = abbreviationLocation;
        return this;
    }

    public int getId() {
        return id;
    }

    public Fillin setId(int id) {
        this.id = id;
        return this;
    }

    public int getIdStaffMember() {
        return IdStaffMember;
    }

    public Fillin setIdStaffMember(int idStaffMember) {
        IdStaffMember = idStaffMember;
        return this;
    }

    public String getWeek() {
        return week;
    }

    public Fillin setWeek(String week) {
        this.week = week;
        return this;
    }

    public String getMonth() {
        return month;
    }

    public Fillin setMonth(String month) {
        this.month = month;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Fillin setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String getName() {
        return name;
    }

    public Fillin setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameDate() {
        return nameDate;
    }

    public Fillin setNameDate(String nameDate) {
        this.nameDate = nameDate;
        return this;
    }

    public String getMonthBegin() {
        return monthBegin;
    }

    public Fillin setMonthBegin(String monthBegin) {
        this.monthBegin = monthBegin;
        return this;
    }

    public String getMonthEnd() {
        return monthEnd;
    }

    public Fillin setMonthEnd(String monthEnd) {
        this.monthEnd = monthEnd;
        return this;
    }

    public String getMonAmFunction() {
        return monAmFunction;
    }

    public Fillin setMonAmFunction(String monAmFunction) {
        this.monAmFunction = monAmFunction;
        return this;
    }

    public String getMonAmTask() {
        return monAmTask;
    }

    public Fillin setMonAmTask(String monAmTask) {
        this.monAmTask = monAmTask;
        return this;
    }

    public String getMonAmLocation() {
        return monAmLocation;
    }

    public Fillin setMonAmLocation(String monAmLocation) {
        this.monAmLocation = monAmLocation;
        return this;
    }

    public String getMonAmAbsent() {
        return monAmAbsent;
    }

    public Fillin setMonAmAbsent(String monAmAbsent) {
        this.monAmAbsent = monAmAbsent;
        return this;
    }

    public String getMonPmFunction() {
        return monPmFunction;
    }

    public Fillin setMonPmFunction(String monPmFunction) {
        this.monPmFunction = monPmFunction;
        return this;
    }

    public String getMonPmTask() {
        return monPmTask;
    }

    public Fillin setMonPmTask(String monPmTask) {
        this.monPmTask = monPmTask;
        return this;
    }

    public String getMonPmLocation() {
        return monPmLocation;
    }

    public Fillin setMonPmLocation(String monPmLocation) {
        this.monPmLocation = monPmLocation;
        return this;
    }

    public String getMonPmAbsent() {
        return monPmAbsent;
    }

    public Fillin setMonPmAbsent(String monPmAbsent) {
        this.monPmAbsent = monPmAbsent;
        return this;
    }

    public String getTueAmFunction() {
        return tueAmFunction;
    }

    public Fillin setTueAmFunction(String tueAmFunction) {
        this.tueAmFunction = tueAmFunction;
        return this;
    }

    public String getTueAmTask() {
        return tueAmTask;
    }

    public Fillin setTueAmTask(String tueAmTask) {
        this.tueAmTask = tueAmTask;
        return this;
    }

    public String getTueAmLocation() {
        return tueAmLocation;
    }

    public Fillin setTueAmLocation(String tueAmLocation) {
        this.tueAmLocation = tueAmLocation;
        return this;
    }

    public String getTueAmAbsent() {
        return tueAmAbsent;
    }

    public Fillin setTueAmAbsent(String tueAmAbsent) {
        this.tueAmAbsent = tueAmAbsent;
        return this;
    }

    public String getTuePmFunction() {
        return tuePmFunction;
    }

    public Fillin setTuePmFunction(String tuePmFunction) {
        this.tuePmFunction = tuePmFunction;
        return this;
    }

    public String getTuePmTask() {
        return tuePmTask;
    }

    public Fillin setTuePmTask(String tuePmTask) {
        this.tuePmTask = tuePmTask;
        return this;
    }

    public String getTuePmLocation() {
        return tuePmLocation;
    }

    public Fillin setTuePmLocation(String tuePmLocation) {
        this.tuePmLocation = tuePmLocation;
        return this;
    }

    public String getTuePmAbsent() {
        return tuePmAbsent;
    }

    public Fillin setTuePmAbsent(String tuePmAbsent) {
        this.tuePmAbsent = tuePmAbsent;
        return this;
    }

    public String getWedAmFunction() {
        return wedAmFunction;
    }

    public Fillin setWedAmFunction(String wedAmFunction) {
        this.wedAmFunction = wedAmFunction;
        return this;
    }

    public String getWedAmTask() {
        return wedAmTask;
    }

    public Fillin setWedAmTask(String wedAmTask) {
        this.wedAmTask = wedAmTask;
        return this;
    }

    public String getWedAmLocation() {
        return wedAmLocation;
    }

    public Fillin setWedAmLocation(String wedAmLocation) {
        this.wedAmLocation = wedAmLocation;
        return this;
    }

    public String getWedAmAbsent() {
        return wedAmAbsent;
    }

    public Fillin setWedAmAbsent(String wedAmAbsent) {
        this.wedAmAbsent = wedAmAbsent;
        return this;
    }

    public String getWedPmFunction() {
        return wedPmFunction;
    }

    public Fillin setWedPmFunction(String wedPmFunction) {
        this.wedPmFunction = wedPmFunction;
        return this;
    }

    public String getWedPmTask() {
        return wedPmTask;
    }

    public Fillin setWedPmTask(String wedPmTask) {
        this.wedPmTask = wedPmTask;
        return this;
    }

    public String getWedPmLocation() {
        return wedPmLocation;
    }

    public Fillin setWedPmLocation(String wedPmLocation) {
        this.wedPmLocation = wedPmLocation;
        return this;
    }

    public String getWedPmAbsent() {
        return wedPmAbsent;
    }

    public Fillin setWedPmAbsent(String wedPmAbsent) {
        this.wedPmAbsent = wedPmAbsent;
        return this;
    }

    public String getThuAmFunction() {
        return thuAmFunction;
    }

    public Fillin setThuAmFunction(String thuAmFunction) {
        this.thuAmFunction = thuAmFunction;
        return this;
    }

    public String getThuAmTask() {
        return thuAmTask;
    }

    public Fillin setThuAmTask(String thuAmTask) {
        this.thuAmTask = thuAmTask;
        return this;
    }

    public String getThuAmLocation() {
        return thuAmLocation;
    }

    public Fillin setThuAmLocation(String thuAmLocation) {
        this.thuAmLocation = thuAmLocation;
        return this;
    }

    public String getThuAmAbsent() {
        return thuAmAbsent;
    }

    public Fillin setThuAmAbsent(String thuAmAbsent) {
        this.thuAmAbsent = thuAmAbsent;
        return this;
    }

    public String getThuPmFunction() {
        return thuPmFunction;
    }

    public Fillin setThuPmFunction(String thuPmFunction) {
        this.thuPmFunction = thuPmFunction;
        return this;
    }

    public String getThuPmTask() {
        return thuPmTask;
    }

    public Fillin setThuPmTask(String thuPmTask) {
        this.thuPmTask = thuPmTask;
        return this;
    }

    public String getThuPmLocation() {
        return thuPmLocation;
    }

    public Fillin setThuPmLocation(String thuPmLocation) {
        this.thuPmLocation = thuPmLocation;
        return this;
    }

    public String getThuPmAbsent() {
        return thuPmAbsent;
    }

    public Fillin setThuPmAbsent(String thuPmAbsent) {
        this.thuPmAbsent = thuPmAbsent;
        return this;
    }

    public String getFriAmFunction() {
        return friAmFunction;
    }

    public Fillin setFriAmFunction(String friAmFunction) {
        this.friAmFunction = friAmFunction;
        return this;
    }

    public String getFriAmTask() {
        return friAmTask;
    }

    public Fillin setFriAmTask(String friAmTask) {
        this.friAmTask = friAmTask;
        return this;
    }

    public String getFriAmLocation() {
        return friAmLocation;
    }

    public Fillin setFriAmLocation(String friAmLocation) {
        this.friAmLocation = friAmLocation;
        return this;
    }

    public String getFriAmAbsent() {
        return friAmAbsent;
    }

    public Fillin setFriAmAbsent(String friAmAbsent) {
        this.friAmAbsent = friAmAbsent;
        return this;
    }

    public String getFriPmFunction() {
        return friPmFunction;
    }

    public Fillin setFriPmFunction(String friPmFunction) {
        this.friPmFunction = friPmFunction;
        return this;
    }

    public String getFriPmTask() {
        return friPmTask;
    }

    public Fillin setFriPmTask(String friPmTask) {
        this.friPmTask = friPmTask;
        return this;
    }

    public String getFriPmLocation() {
        return friPmLocation;
    }

    public Fillin setFriPmLocation(String friPmLocation) {
        this.friPmLocation = friPmLocation;
        return this;
    }

    public String getFriPmAbsent() {
        return friPmAbsent;
    }

    public Fillin setFriPmAbsent(String friPmAbsent) {
        this.friPmAbsent = friPmAbsent;
        return this;
    }

    public String getNamefunction() {
        return namefunction;
    }

    public Fillin setNamefunction(String namefunction) {
        this.namefunction = namefunction;
        return this;
    }

    public String getNameMember() {
        return nameMember;
    }

    public Fillin setNameMember(String nameMember) {
        this.nameMember = nameMember;
        return this;
    }

    public String getLocation() {

        return location;
    }

    public Fillin setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getAbbreviationNameMonAm() {
        return abbreviationNameMonAm;
    }

    public Fillin setAbbreviationNameMonAm(String abbreviationNameMonAm) {
        this.abbreviationNameMonAm = abbreviationNameMonAm;
        return this;
    }

    public String getAbbreviationNameMonPm() {
        return abbreviationNameMonPm;
    }

    public Fillin setAbbreviationNameMonPm(String abbreviationNameMonPm) {
        this.abbreviationNameMonPm = abbreviationNameMonPm;
        return this;
    }

    public String getAbbreviationNameTueAm() {
        return abbreviationNameTueAm;
    }

    public Fillin setAbbreviationNameTueAm(String abbreviationNameTueAm) {
        this.abbreviationNameTueAm = abbreviationNameTueAm;
        return this;
    }

    public String getAbbreviationNameTuePm() {
        return abbreviationNameTuePm;
    }

    public Fillin setAbbreviationNameTuePm(String abbreviationNameTuePm) {
        this.abbreviationNameTuePm = abbreviationNameTuePm;
        return this;
    }

    public String getAbbreviationNameWedAm() {
        return abbreviationNameWedAm;
    }

    public Fillin setAbbreviationNameWedAm(String abbreviationNameWedAm) {
        this.abbreviationNameWedAm = abbreviationNameWedAm;
        return this;
    }

    public String getAbbreviationNameWedPm() {
        return abbreviationNameWedPm;
    }

    public Fillin setAbbreviationNameWedPm(String abbreviationNameWedPm) {
        this.abbreviationNameWedPm = abbreviationNameWedPm;
        return this;
    }

    public String getAbbreviationNameThuAm() {
        return abbreviationNameThuAm;
    }

    public Fillin setAbbreviationNameThuAm(String abbreviationNameThuAm) {
        this.abbreviationNameThuAm = abbreviationNameThuAm;
        return this;
    }

    public String getAbbreviationNameThuPm() {
        return abbreviationNameThuPm;
    }

    public Fillin setAbbreviationNameThuPm(String abbreviationNameThuPm) {
        this.abbreviationNameThuPm = abbreviationNameThuPm;
        return this;
    }

    public String getAbbreviationNameFriAm() {
        return abbreviationNameFriAm;
    }

    public Fillin setAbbreviationNameFriAm(String abbreviationNameFriAm) {
        this.abbreviationNameFriAm = abbreviationNameFriAm;
        return this;
    }

    public String getAbbreviationNameFriPm() {
        return abbreviationNameFriPm;
    }

    public Fillin setAbbreviationNameFriPm(String abbreviationNameFriPm) {
        this.abbreviationNameFriPm = abbreviationNameFriPm;
        return this;
    }

}
