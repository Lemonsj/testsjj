
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-24
 * Time: 16:09
 **/

@WebServlet
@MultipartConfig
public class UploadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println(username);
        String password = req.getParameter("password");
        System.out.println(password);

        Collection<Part> parts = req.getParts();

        for(Part part : parts) {
            System.out.println(part.getName());
            System.out.println(part.getContentType());
            Collection<String> headerNames = part.getHeaderNames();
            for(String headerName : headerNames) {
                System.out.println(part.getHeader(headerName));
            }
            System.out.println(part.getSize());
            System.out.println(part.getSubmittedFileName());

            InputStream is = part.getInputStream();
            Scanner scanner = new Scanner(is,"utf-8");
            System.out.println(scanner.next());
            System.out.println("***************************8");
        }

    }
}

