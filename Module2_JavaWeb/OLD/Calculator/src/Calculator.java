import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator" , urlPatterns = "/calculate")
public class Calculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double first_operand = Double.parseDouble(request.getParameter("first_operand"));
        double second_operand = Double.parseDouble(request.getParameter("second_operand"));
        String operator = request.getParameter("operator");
        double result = 0;

        PrintWriter writer = response.getWriter();

        if(operator.equals("+")){
            result = first_operand+second_operand;
        }
        if(operator.equals("-")){
            result = first_operand-second_operand;
        }
        if(operator.equals("*")){
            result = first_operand*second_operand;
        }
        if(operator.equals("/")){
            if(second_operand==0){
                writer.println("ERROS");
            }
            else {
            result = first_operand/second_operand;}
        }
        writer.println("<html>");
        writer.println("<h1>"+first_operand +" "+operator+" "+second_operand+" = "+result+"</h1>");
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
