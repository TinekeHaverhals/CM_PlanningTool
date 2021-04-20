package CM.Data;

import CM.Model.StaffMember;
import CM.Model.Task;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Tineke Haverhals
 * 21/03/21.
 */
@Repository
public class TasksDAO {

    public List<Task> getTableTask() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Task, Description, Enddate FROM Tasks");
        List<Task> tasks= new ArrayList<>();
        Task task = null;
        if (rs!= null){
            while (rs.next()){
                task = new Task();
                task.setTaskName(rs.getString("task"));
                task.setDescription(rs.getString("description"));
                task.setEnddate(rs.getDate("enddate"));
                tasks.add(task);
            }
        }
        return tasks;
    }

    public Task getdeleteTask(String taskName) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM Tasks Where Task = ?");
        statement.setString(1, taskName);
        int rs = statement.executeUpdate();
        Task task = null;
        return task;
    }


    public Task getAddTask(String taskName, String description, Date enddate) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO Tasks ( Id,Task,Description, Enddate)VALUES (Null, ?, ?,?);");
        statement.setString(1, taskName);
        statement.setString(2, description);
        statement.setDate(3, (java.sql.Date) enddate);
        int rs = statement.executeUpdate();
        Task task = null;
        return task;
    }


}
