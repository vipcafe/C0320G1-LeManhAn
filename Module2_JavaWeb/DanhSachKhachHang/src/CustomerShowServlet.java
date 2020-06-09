import ListIdol.Customer;
import ListIdol.ListCustomer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerShowServlet" , urlPatterns = "/customer")
public class CustomerShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = ListCustomer.customer();
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
