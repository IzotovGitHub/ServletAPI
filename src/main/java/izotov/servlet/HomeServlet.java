package izotov.servlet;

import izotov.servlet.route.Route;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log("Method init");
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        RequestDispatcher dispatcher = req.getRequestDispatcher(Route.JSP.HOME);
        dispatcher.forward(req, resp);
    }
        @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        RequestDispatcher dispatcher = req.getRequestDispatcher(Route.JSP.LOGIN);
        dispatcher.forward(req, resp);
    }
    
    @Override
    public void destroy() {
        log("Method destroy");
    }
}
