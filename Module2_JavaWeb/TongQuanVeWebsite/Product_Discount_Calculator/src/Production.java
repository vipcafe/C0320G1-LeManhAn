import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

@WebServlet(name = "Production ", urlPatterns = "/product")
public class Production extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pattern = "###,###.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String name = request.getParameter("name");
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));

        PrintWriter writer = response.getWriter();
        float amount = (float)(price-(price*percent*0.01));

        writer.println("<html>");
        writer.println("<h1>Sản phẩm : "+name+"</h1>");
        writer.println("<h1>Giá : "+decimalFormat.format(price)+"</h1>");
        writer.println("<h1>Chiết khấu : "+decimalFormat.format(percent)+" %</h1> ");
        writer.println("<h1>Giá sau chiết khấu :"+decimalFormat.format(amount)+"</h1>");
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
