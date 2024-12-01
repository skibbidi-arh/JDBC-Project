import java.sql.*;
public class InsertDB {

    public static void main(String[] args) throws SQLException {
        ConnectToDB c = new ConnectToDB();
        Connection conn = c.connect();
        Statement stmt = conn.createStatement();




    }
}
