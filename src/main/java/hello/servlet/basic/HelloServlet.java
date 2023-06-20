package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    //ctrl + o
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //soutm + enter
        System.out.println("HelloServlet.service");

        //soutv + enter
        System.out.println("resp = " + resp);
        System.out.println("req = " + req);

        //ctrl + r : 서버재시작

        String username = req.getParameter("username");
        System.out.println("username = " + username);

        resp.setContentType("text/plain");

        //옛날 시스템이 아닌 이상 utf-8을 쓰셈.
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("hello" + username);

    }
}
