package com.codecool.servlet;

import com.codecool.model.User;
import com.codecool.service.EmailList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        User user = new User(req.getParameter("email"));
        EmailList.getInstance().addUsers(user);
        req.setAttribute("users", EmailList.getInstance().getUsers());
        req.getRequestDispatcher("main.jsp").forward(req, resp);
        
    }
    
    
}
