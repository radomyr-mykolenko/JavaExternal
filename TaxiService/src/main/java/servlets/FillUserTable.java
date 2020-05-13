package servlets;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;


@WebServlet("/FillUserTable")
public class FillUserTable extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/taxi_db", "root", "root566");
            con.createStatement().executeUpdate("INSERT INTO user (name, email, password) \n" +
                    "\t\tVALUES\n" +
                    "\t\t('Petro', 'petro@gmail.com', '12345a'),\n" +
                    "\t\t(DEFAULT, 'err@err.com', 'password1_1'),\n" +
                    "\t\t('DImitryy', DEFAULT, 'password1_3');");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            out.println("database not found");
        }
    }
}
