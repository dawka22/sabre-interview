package main.java.com.creditcard;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CardValidateServlet")
public class CardValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String creditCardNumber = req.getParameter("creditCardNumber");
		
		if(IsNumber.check(creditCardNumber)) {
			resp.getWriter().append("OK");
		} else {
			resp.getWriter().append("ERROR");
		}
	}
}
