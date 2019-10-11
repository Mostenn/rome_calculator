
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Objects;

import static java.util.Objects.isNull;

@WebServlet("")
public class App extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String action = request.getParameter("action");
            Converter converter = new Converter();

            if (Objects.equals(action, "convert")){
                String arab = request.getParameter("arab");
                if (!Objects.equals(arab,"")){
                    if (Long.valueOf(arab) < 4000){
                        request.setAttribute("arab", arab);
                        request.setAttribute("rome", converter.Converter(arab));
                    }else {
                        request.setAttribute("arab", "Ups");
                        request.setAttribute("rome", "Ups");
                        request.setAttribute("message", "Enter correct number");
                    }
                }
            }

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
