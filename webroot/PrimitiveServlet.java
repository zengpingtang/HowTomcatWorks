import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class PrimitiveServlet implements Servlet {

    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
    }

    /**
     * HTTP/1.1 200 OK
     * Server: Microsoft-IIS/4.0
     * Date: Mon, 5 Jan 2004 13:13:33 GMT
     * Content-Type: text/html
     * Last-Modified: Mon, 5 Jan 2004 13:13:12 GMT
     * Content-Length: 125
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        System.out.println("from service");
        PrintWriter out = response.getWriter();
        out.println("HTTP/1.1 200 OK");
        out.println("Server: Microsoft-IIS/4.0");
        out.println("Date: Mon, 5 Jan 2004 13:13:33 GMT");
        out.println("Content-Type: text/html");
        out.println("Last-Modified: Mon, 5 Jan 2004 13:13:12 GMT");
        out.println("Content-Length: 125");
        out.println();
        out.println("Hello. Roses are red.");
        out.print("Violets are blue.");
    }

    public void destroy() {
        System.out.println("destroy");
    }

    public String getServletInfo() {
        return null;
    }

    public ServletConfig getServletConfig() {
        return null;
    }

}
