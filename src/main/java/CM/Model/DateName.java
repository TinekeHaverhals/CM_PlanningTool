package CM.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Tineke Haverhals
 * 8/04/21.
 */
@Entity
public class DateName {
    @Id
    @GeneratedValue
    private int id;
    private String nameDate;
    private String monthBegin;
    private String monthEnd;

    public DateName(){
    }

    public DateName(String nameDate){
        this.nameDate = nameDate;
    }

    public int getId() {
        return id;
    }

    public DateName setId(int id) {
        this.id = id;
        return this;
    }

    public String getNameDate() {
        return nameDate;
    }

    public DateName setNameDate(String nameDate) {
        this.nameDate = nameDate;
        return this;
    }

    public String getMonthBegin() {
        return monthBegin;
    }

    public DateName setMonthBegin(String monthBegin) {
        this.monthBegin = monthBegin;
        return this;
    }

    public String getMonthEnd() {
        return monthEnd;
    }

    public DateName setMonthEnd(String monthEnd) {
        this.monthEnd = monthEnd;
        return this;
    }
}
