package CM.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Tineke Haverhals
 * 26/03/21.
 */
@Entity
public class Absent {
    @Id
    @GeneratedValue
    private int id;
    private Date date;
    private Date beginDate;
    private Date endDate;
    private String AmPm;
    private int IdStaffMember;
    private int IdDepartment;

    public Absent(){

    }
    public Absent(Date beginDate, Date endDate ){
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public Absent(Date date, String AmPm, int IdStaffMember, int IdDepartment){
        this.date = date;
        this.AmPm = AmPm;
        this.IdStaffMember = IdStaffMember;
        this.IdDepartment = IdDepartment;
    }

    public int getId() {
        return id;
    }

    public Absent setId(int id) {
        this.id = id;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Absent setDate(Date date) {
        this.date = date;
        return this;
    }

    public String getAmPm() {
        return AmPm;
    }

    public Absent setAmPm(String amPm) {
        AmPm = amPm;
        return this;
    }

    public int getIdStaffMember() {
        return IdStaffMember;
    }

    public Absent setIdStaffMember(int idStaffMember) {
        IdStaffMember = idStaffMember;
        return this;
    }

    public int getIdDepartment() {
        return IdDepartment;
    }

    public Absent setIdDepartment(int idDepartment) {
        IdDepartment = idDepartment;
        return this;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public Absent setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Absent setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }
}
