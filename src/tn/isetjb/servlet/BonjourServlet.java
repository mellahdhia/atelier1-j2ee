package tn.isetjb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

public class BonjourServlet extends HttpServlet{
	private int compteur=0;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        this.compteur++;
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\" />");
        out.println("<title>Bonjour Iset</title>");
        out.println("Cette Servlet a �t� acc�d�e " + this.compteur + " fois.");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Bonjour Iset Djerba!</p>");
        out.println("</body>");
        out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
}
