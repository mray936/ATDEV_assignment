package controller;

import java.io.IOException;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/reg")
public class RegController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
		
		String userid=req.getParameter("sid");
		int sid;
		if(userid.equals("")) {
			sid=0;
		}
		else
		{
			sid=Integer.parseInt(req.getParameter("sid"));
		}
		System.out.println(sid);	
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String contact=req.getParameter("contact");
		String pass=req.getParameter("pass");
			
		Student std=new Student();
	
		std.setId(sid);
		std.setName(name);
		std.setEmail(email);
		std.setContact(contact);
		std.setPass(pass);
		
		StudentDao sdao=new StudentDao();
		sdao.addStudent(std);
		req.setAttribute("msg", "Student added successfully!!!!!");
		req.getRequestDispatcher("Stud_Registration.jsp").forward(req, resp);
			
	}

}
