import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author syou
 * @date 2018/5/8.
 */
public class LoginServlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        ServletConfig config = this.getServletConfig();
        ServletContext context = config.getServletContext();
        System.out.println("LoginServlet 初始化...");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context=this.getServletContext();
        context.setAttribute("key","world");
        PrintWriter writer = resp.getWriter();
        writer.write("welcome to come back");
        writer.close();

    }
}
