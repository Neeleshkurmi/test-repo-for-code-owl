import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class ReportGenerator {
    public int FetchUserCount(String url) throws Exception {
        Connection conn = DriverManager.getConnection(url, "user", "pass");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM users");
        if (rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    }
}