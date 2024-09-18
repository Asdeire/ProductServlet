package com.asdeire.productservlet;

import com.asdeire.productservlet.entity.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            products.add(new Product(i, "Product " + i, i * 10.0));
        }

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html><body>");
        out.println("<h1>Product List</h1>");
        out.println("<ul>");

        for (Product product : products) {
            out.println("<li>ID: " + product.getId() + ", Title: " + product.getTitle() + ", Cost: $" + product.getCost() + "</li>");
        }

        out.println("</ul>");
        out.println("</body></html>");
    }
}
