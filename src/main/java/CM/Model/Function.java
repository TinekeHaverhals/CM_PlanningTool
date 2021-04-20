package CM.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Tineke Haverhals
 * 26/03/21.
 */
@Entity
public class Function {
    @Id
    @GeneratedValue
    public int id;
    private String department;
    private String namefunction;
    private int total;

    public Function(){

    }

    public Function(String department, String namefunction){
        this.department = department;
        this.namefunction = namefunction;
    }

    public Function(String department, String namefunction, int total){
        this.department = department;
        this.namefunction = namefunction;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public Function setId(int id) {
        this.id = id;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Function setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String getNamefunction() {
        return namefunction;
    }

    public Function setNamefunction(String namefunction) {
        this.namefunction = namefunction;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public Function setTotal(int total) {
        this.total = total;
        return this;
    }

}
