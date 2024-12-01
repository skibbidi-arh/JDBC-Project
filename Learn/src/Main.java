import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test1";

//here in the end always write the name of the database or schema you want to connect to, not the connection or user name
        String username = "test1";
        String password = "test1";
        String q1 ="Select * from employees";

        try (Connection conn = DriverManager.getConnection(url, username, password))
        {
            System.out.println("Connected to database");
            Statement stmt = conn.createStatement();
               //Connection is an interface
               // conn is an instance
               // Drivermanager is a built in class
               //getConnection is a method of that class
            ResultSet rs = stmt.executeQuery(q1);
            while (rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job = rs.getString("job_title");
                double salary = rs.getDouble("salary");
                System.out.println(id + " " + name + " " + job + " " + salary);
            }
            rs.close();
            stmt.close();
            conn.close();

        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }


    }
}
