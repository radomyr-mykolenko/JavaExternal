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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import classes.Flower;
import com.taxi.workwith_db.*;


@WebServlet("/FlowersDBcontent")
public class FlowersDBcontent extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Flower> flowers = new ArrayList<Flower>();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ConnectDB connectDB = new ConnectDB();
        Connection con = connectDB.getFlowersConnection();
        ResultSet rs = null;
        try {
            rs = con.createStatement().executeQuery(
                    "Select * From flowers ");

            while (true) {

                if (!rs.next()) break;

                // По каждой записи выборки формируется
                // объект класса Flower.
                // Значения свойств заполяются из полей записи
                Flower flower = new Flower(
                        rs.getLong(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
                // Добавление созданного объекта в коллекцию
                flowers.add(flower);
            }
            // Закрываем выборку и соединение с БД

           /*con.createStatement().executeUpdate("INSERT INTO user (name, email, password) \n" +
                   "\t\tVALUES\n" +
                   "\t\t('Petro', 'petro@gmail.com', '12345a'),\n" +
                   "\t\t(DEFAULT, 'err@err.com', 'password1_1'),\n" +
                   "\t\t('DImitryy', DEFAULT, 'password1_3');");*/
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("Database not found");
        }


        out.println("<head>\n" +
                "    <title>Flowers from Database</title>\n" +
                "    <link href=\"styles.css\" rel=\"stylesheet\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"header\">\n" +
                "<span id=\"logo_text\">Flowers Shop</span><br>\n" +
                "<span id=\"text_under_the_logo\"> Dear friend! Let's add flowers to our shop!</span>\n" +
                "</div>" +
                "<div class=\"maincontent\">" + "<jsp:include page=\"header.html\"/>");
        for (Flower flower : flowers) {
            out.println("<p>");
            out.println(flower.toString());
            out.println("</p>");
        }
        out.println("</div>\n" +
                "</body>\n" +
                "</html>");

    }

}
