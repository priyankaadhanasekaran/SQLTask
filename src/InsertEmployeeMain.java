import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEmployeeMain {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/empl";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO Employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setInt(1, 101);
            pstmt.setString(2, "Jenny");
            pstmt.setInt(3, 25);
            pstmt.setInt(4, 10000);
            pstmt.executeUpdate();

            pstmt.setInt(1, 102);
            pstmt.setString(2, "Jacky");
            pstmt.setInt(3, 30);
            pstmt.setInt(4, 20000);
            pstmt.executeUpdate();

            pstmt.setInt(1, 103);
            pstmt.setString(2, "Joe");
            pstmt.setInt(3, 20);
            pstmt.setInt(4, 40000);
            pstmt.executeUpdate();

            pstmt.setInt(1, 104);
            pstmt.setString(2, "John");
            pstmt.setInt(3, 40);
            pstmt.setInt(4, 80000);
            pstmt.executeUpdate();

            pstmt.setInt(1, 105);
            pstmt.setString(2, "Shameer");
            pstmt.setInt(3, 25);
            pstmt.setInt(4, 90000);
            pstmt.executeUpdate();

            System.out.println("All records inserted successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
