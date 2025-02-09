import java.sql.*;
import javax.servlet.http.HttpServletRequest;

public class SqlInjection {
    public static ResultSet doQuery(HttpServletRequest request, Connection connection) throws SQLException {
        String customerName = request.getParameter("customerName");
        
        // BAD CODE
        String query = "SELECT account_balance FROM user_data WHERE user_name = " + customerName;
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery(query);
        
        // FIXED CODE
        //PreparedStatement statement = connection.prepareStatement("SELECT account_balance FROM user_data WHERE user_name = ?");
        //statement.setString(1, customerName);
        //ResultSet results = statement.executeQuery();
        
        return(results);
    }
}
