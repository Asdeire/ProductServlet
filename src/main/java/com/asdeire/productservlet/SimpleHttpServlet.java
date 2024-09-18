package com.asdeire.productservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/info")
public class SimpleHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Отримання сесії та лічильника
        HttpSession session = req.getSession(true);
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 0;
        }
        counter++;
        session.setAttribute("counter", counter);

        // Налаштування відповіді
        req.setAttribute("contextPath", req.getContextPath());
        req.setAttribute("servletPath", req.getServletPath());
        req.setAttribute("pathInfo", req.getPathInfo());
        req.setAttribute("queryString", req.getQueryString());
        req.setAttribute("param1", req.getParameter("param1"));
        req.setAttribute("param2", req.getParameter("param2"));
        req.setAttribute("userAgent", req.getHeader("User-Agent"));
        req.setAttribute("counter", counter);

        // Перехід до JSP
        req.getRequestDispatcher("/info.jsp").forward(req, resp);
    }
}

