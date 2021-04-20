package CM.Services;

import CM.Data.TasksDAO;
import CM.Model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 * Tineke Haverhals
 * 21/03/21.
 */
@Service
public class TasksServices {

    @Autowired
    private TasksDAO tasksDAO = new TasksDAO();

    public List<Task> getTableTask() throws SQLException {
        return tasksDAO.getTableTask();
    }

    public Task getdeleteTask (String taskName) throws Exception {
        return tasksDAO.getdeleteTask(taskName);
    }

    public Task getAddTask(String taskName, String description, Date enddate) throws Exception {
        return tasksDAO.getAddTask(taskName,description, enddate);
    }

}
