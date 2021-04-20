package CM.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Tineke Haverhals
 * 21/03/21.
 */
public class ConnectionFactory {
    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://moktok.intecbrussel.org:33306/tineke",
                "tineke",
                "tineke2020"
        );
    }
}
