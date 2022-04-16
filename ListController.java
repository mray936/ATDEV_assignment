package controller;

import java.io.IOException;
import java.util.ArrayList;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/list")
public class ListController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
		
		StudentDao sdao=new StudentDao();
		ArrayList<Student> al=sdao.getAllStd();
		req.setAttribute("data",al);
		req.getRequestDispatcher("list.jsp").forward(req, resp);
			
	}

}
