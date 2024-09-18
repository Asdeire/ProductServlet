package com.asdeire.productservlet;

import com.asdeire.productservlet.repository.ProductRepository;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ProductRepository repository = new ProductRepository();
        sce.getServletContext().setAttribute("productRepository", repository);
    }
}

