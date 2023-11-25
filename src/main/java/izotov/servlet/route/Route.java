package izotov.servlet.route;

public interface Route {
    interface JSP {
        String BASE = "/WEB-INF/jsp";
        String HOME = BASE + "/home.jsp";
        String LOGIN = BASE + "/login.jsp";
    }
}
