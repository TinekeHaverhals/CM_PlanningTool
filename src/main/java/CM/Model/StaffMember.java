package CM.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Tineke Haverhals
 * 21/03/21.
 */
@Entity
public class StaffMember {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String abbreviationName;
    private String employeeId;
    private String department;
    private String mobileNumber;
    private String prive;
    private String codePhoneNumber;
    private String phoneNumber;
    private String agentNumber;
    private String responsibility;

    public StaffMember(){
    }

    public StaffMember(String employeeId){
        this.employeeId = employeeId;
    }

    public StaffMember(String employeeId, String department){
        this.employeeId = employeeId;
        this.department = department;
    }


    public StaffMember(String name, String abbreviationName, String employeeId, String department, String mobileNumber, String prive, String codePhoneNumber, String phoneNumber, String agentNumber){
        this.name = name;
        this.abbreviationName = abbreviationName;
        this.employeeId = employeeId;
        this.department = department;
        this.mobileNumber = mobileNumber;
        this.prive = prive;
        this.codePhoneNumber = codePhoneNumber;
        this.phoneNumber = phoneNumber;
        this.agentNumber = agentNumber;
    }

    public int getId() {
        return id;
    }

    public StaffMember setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StaffMember setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public StaffMember setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public StaffMember setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public String getPrive() {
        return prive;
    }

    public StaffMember setPrive(String prive) {
        this.prive = prive;
        return this;
    }

    public String getCodePhoneNumber() {
        return codePhoneNumber;
    }

    public StaffMember setCodePhoneNumber(String codePhoneNumber) {
        this.codePhoneNumber = codePhoneNumber;
        return this;
    }

    public String getAbbreviationName() {
        return abbreviationName;
    }

    public StaffMember setAbbreviationName(String abbreviationName) {
        this.abbreviationName = abbreviationName;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public StaffMember setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public StaffMember setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getAgentNumber() {
        return agentNumber;
    }

    public StaffMember setAgentNumber(String agentNumber) {
        this.agentNumber = agentNumber;
        return this;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public StaffMember setResponsibility(String responsibility) {
        this.responsibility = responsibility;
        return this;
    }

    @Override
    public String toString() {
        return "StaffMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", abbreviationName='" + abbreviationName + '\'' +
                ", employeeId=" + employeeId +'\'' +
                ", department=" + department +'\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", prive='" + prive + '\'' +
                ", codePhoneNumber='" + codePhoneNumber + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", agentenNumber=" + agentNumber +
                ", responsibility=" + responsibility +
                '}';
    }

    public String getSingleLine() {
        return "StaffMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", abbreviationName='" + abbreviationName + '\'' +
                ", employeeId=" + employeeId +'\'' +
                ", department=" + department +'\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", prive='" + prive + '\'' +
                ", codePhoneNumber='" + codePhoneNumber + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", agentNumber=" + agentNumber +
                ", responsibility=" + responsibility +
                '}';
    }

}
