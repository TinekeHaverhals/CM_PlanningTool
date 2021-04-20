package CM.Model;

import jdk.jfr.Enabled;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Tineke Haverhals
 * 26/03/21.
 */
@Entity
public class Department {
    @Id
    @GeneratedValue
    private int id;
    private String nameDepartment;

    public Department(){}

    public Department(String nameDepartment){
        this.nameDepartment = nameDepartment;
    }

    public int getId() {
        return id;
    }

    public Department setId(int id) {
        this.id = id;
        return this;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public Department setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
        return this;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", nameDepartment='" + nameDepartment + '\'' +
                '}';
    }

    public String getSingleLine() {
        return "Department{" +
                "id=" + id +
                ", nameDepartment='" + nameDepartment + '\'' +
                '}';
    }
}
