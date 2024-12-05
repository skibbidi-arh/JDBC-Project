import java.sql.*;
public class PreparedStatement {

    public static void main(String[] args) throws SQLException {
        ConnectToDB c = new ConnectToDB();
        Connection con = c.connect();
       // PreparedStatement ps = con.prepareStatement();
        Statement stmt = con.createStatement();

        String sql = "select * from employees";
        ResultSet r= stmt.executeQuery(sql);
        while (r.next()) {
            int emp_id = r.getInt("id");
            String emp_name = r.getString("name");
            String emp_job_title = r.getString("job_title");
            double emp_salary = r.getDouble("salary");

            System.out.println(emp_id);
            System.out.println(emp_name);
            System.out.println(emp_job_title);
            System.out.println(emp_salary);
        }


    }
}
