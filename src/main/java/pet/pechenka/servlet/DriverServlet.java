package pet.pechenka.servlet;

import pet.pechenka.entity.Driver;
import pet.pechenka.services.DriverService;


import javax.servlet.ServletConfig;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DriverServlet", value = "/DriverServlet")
public class DriverServlet extends HttpServlet {

    private DriverService driverService = new DriverService();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Driver>  drivers= driverService.findAllDrivers();
        request.setAttribute("driver" , drivers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/showDrivers.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Driver driver = new Driver(request.getParameter("firstName") , request.getParameter("lastName"), request.getParameter("email"), request.getParameter("address"));
        driverService.save(driver);
        response.sendRedirect("/driver");
    }


    @Override
    protected void  doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Driver driver = driverService.findById(id);
        driver.setFirstName(req.getParameter("name"));
        driver.setLastName(req.getParameter("lastName"));
        driver.setEmail(req.getParameter("email"));
        driver.setAddress(req.getParameter("address"));
        driverService.update(driver);
        resp.sendRedirect("/driver");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        driverService.delete(driverService.findById(id));
        resp.sendRedirect("/driver");
    }
}
