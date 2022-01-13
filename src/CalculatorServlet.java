import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calc")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstStr = request.getParameter("first");
        String secondStr = request.getParameter("second");
        String op = request.getParameter("operation");
        int first = 0;
        int second = 0;

        boolean error = false;


        try {
            first = Integer.parseInt(firstStr);
            second = Integer.parseInt(secondStr);
        }catch (NumberFormatException e){
            error = true;
            e.printStackTrace();
        }

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Calculator</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Result: </h1>");
        if (!error){
            if (op.equals("plus")){
                writer.println(first + second);
            }else if (op.equals("minus")){
                writer.println(first - second);
            }else if (op.equals("mult")){
                writer.println(first * second);
            }else if (op.equals("divide")){
                if (second == 0){
                    writer.println("You cannot divide by zero");
                }
                writer.println(first / second);
            }else if (op.equals("percent")){
                if (second == 0){
                    writer.println("You cannot divide by zero");
                }
                writer.println(first % second);
            }
        }else
            writer.println("Correct your inputs");
        writer.println("</body>");
        writer.println("</html>");

    }
}
