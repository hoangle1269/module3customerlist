package com.example.customerlist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội", "path/to/image1.jpg"));
        customers.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "path/to/image2.jpg"));
        customers.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định", "path/to/image3.jpg"));
        customers.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây", "path/to/image4.jpg"));
        customers.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", "path/to/image5.jpg"));

        request.setAttribute("customers", customers);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}

