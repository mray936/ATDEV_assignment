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

@WebServlet("/update")
public class Update_DeleteController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
		
		int sid=Integer.parseInt(req.getParameter("sid"));
		String action=req.getParameter("action");
				
		StudentDao sdao=new StudentDao();
		
		if(action.equals("delete")) 
		{
			sdao.deleteStd(sid);
			req.getRequestDispatcher("list").forward(req, resp);
		}
		else if(action.equals("update")) 
		{
			Student std= sdao.getDataById(sid);
			req.setAttribute("data", std);
			req.getRequestDispatcher("Stud_Registration.jsp").forward(req, resp);
		}
		
		}

}
