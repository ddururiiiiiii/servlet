package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

/**
 * 1. 파라미터 전송 기능
 * http://localhost:8080/request-param?username=hello&age=20
 * <p>
 * 2. 동일한 파라미터 전송 가능
 * http://localhost:8080/request-param?username=hello&username=kim&age=20 */
@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class requestParamServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        req.getParameterNames().asIterator()
                .forEachRemaining(paramName -> System.out.println(paramName
                        + "=" + req.getParameter(paramName)));

        System.out.println("[전체 파라미터 조회] - end");
        System.out.println();
        System.out.println("[단일 파라미터 조회]");
        String username = req.getParameter("username");
        System.out.println("request.getParameter(username) = " + username);
        String age = req.getParameter("age");
        System.out.println("request.getParameter(age) = " + age);
        System.out.println();

        System.out.println("[이름이 같은 복수 파라미터 조회]");
        System.out.println("request.getParameterValues(username)");
        String[] usernames = req.getParameterValues("username");
        for (String name : usernames) {
            System.out.println("username=" + name);
        }
        res.getWriter().write("ok");
    }
}
