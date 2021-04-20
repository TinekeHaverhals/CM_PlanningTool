package CM.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Tineke Haverhals
 * 21/03/21.
 */
@Entity
public class Task {
    @Id
    @GeneratedValue
    private int id;
    private String taskName;
    private String description;
    private Date enddate;

    public Task(){
    }

    public Task(int id, String taskName, String description, Date enddate){
        this.id= id;
        this.taskName = taskName;
        this.description = description;
        this.enddate = enddate;
    }
    public Task( String taskName, String description, Date enddate){
        this.taskName = taskName;
        this.description = description;
        this.enddate = enddate;
    }

    public int getId() {
        return id;
    }

    public Task setId(int id) {
        this.id = id;
        return this;
    }

    public String getTaskName() {
        return taskName;
    }

    public Task setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Task setDescription(String description) {
        this.description = description;
        return this;
    }

    public Date getEnddate() {
        return enddate;
    }

    public Task setEnddate(Date enddate) {
        this.enddate = enddate;
        return this;
    }

    @Override
    public String toString() {
        return "tasks{" +
                ", id='" + id + '\'' +
                ", task='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", enddate='" + enddate + '\'' +
                '}';
    }

    public String getSingleLine() {
        return "tasks{" +
                ", id='" + id + '\'' +
                ", task='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", enddate='" + enddate + '\'' +
                '}';
    }

}
