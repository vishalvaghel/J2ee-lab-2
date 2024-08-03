Import java.sql.*;

Public class GetDesignation {
    Public static void main(String[] args) {
        String dbUrl = “jdbc:mysql://localhost:3306/your_database”;
        String username = “your_username”;
        String password = “your_password”;
        Int empno = 101;

        Try (Connection conn = DriverManager.getConnection(dbUrl, username, password);
             CallableStatement cs = conn.prepareCall(“{call get_designation(?, ?)}”)) {

             Cs.setInt(1, empno);

             Cs.registerOutParameter(2, Types.VARCHAR);

            
            Cs.execute();

            
            String designation = cs.getString(2);

            System.out.println(“Designation for employee “ + empno + “: “ + designation);
        } catch (SQLException e) {
            System.err.println(“Error retrieving designation: “ + e.getMessage());
        }
    } 
}
