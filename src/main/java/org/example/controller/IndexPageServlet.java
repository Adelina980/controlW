package org.example.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.repository.ScheduleRepository;
import org.example.service.ScheduleService;

import java.io.IOException;

@WebServlet("/")
public class IndexPageServlet extends HttpServlet {
    private ScheduleService service = new ScheduleService();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try{
            request.setAttribute("schedules", service.findAll());
            request.getRequestDispatcher("index.ftl").forward(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
