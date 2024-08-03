Import java.sql.*;

Public class InsertEmployee {
    Public static void main(String[] args) {
        String dbUrl = “jdbc:mysql://localhost:3306/your_database”;
        String username = “Manan_Dori”;
        String password = “your_password”;

       
        String name = “Manan Dori”;
        String email = manan.dori@example.com;
        String department = “Marketing”;

        Try (Connection conn = DriverManager.getConnection(dbUrl, username, password);
             CallableStatement cs = conn.prepareCall(“{call insert_employee(?, ?, ?)}”)) {

            Cs.setString(1, name);
            Cs.setString(2, email);
            Cs.setString(3, department);
            Cs.execute();

            System.out.println(“Employee record inserted successfully!”);
        } catch (SQLException e) {
            System.err.println(“Error inserting employee record: “ + e.getMessage());
        }
    }
}
