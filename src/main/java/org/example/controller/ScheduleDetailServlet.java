package org.example.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model.Schedule;
import org.example.service.ScheduleService;

import java.io.IOException;

@WebServlet("/scheduleDetail/*")
public class ScheduleDetailServlet extends HttpServlet {
    private ScheduleService service = new ScheduleService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idParam = request.getParameter("id");
        if (idParam != null && !idParam.isEmpty()) {
            try {
                Long id = Long.parseLong(idParam);
                Schedule schedule = service.findById(id);

                if (schedule != null) {
                    request.setAttribute("schedule", schedule);
                    request.getRequestDispatcher("scheduleDetail.ftl").forward(request, response);
                } else {

                    request.getRequestDispatcher("error.ftl").forward(request, response);
                }
            } catch (NumberFormatException e) {

                request.getRequestDispatcher("error.ftl").forward(request, response);
            }

        } else {

            request.getRequestDispatcher("error.ftl").forward(request, response);
        }
    }

}

