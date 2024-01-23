package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class member_control
 */
@WebServlet("/member_control")
public class member_control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public member_control() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}
	
	// GET, POST 요청에 대한 일괄처리 메서드
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// 서버는 대부분 사용자의 주소요청에 동작한다. 주소요청이 없으면 대부분 동작하지 않는다.
		// 사용자가 요청한 주소를 보고 그에 맞는 응답 페이지 제공이나 값을 제공한다.
		// 서블렛은 사용자의 요청을 목적에 맞게 처리하기 휘한 클래스이다.
		// 서버 대신해서 쵸엉을 처리해주는 역할을 한다.
		String cmd = request.getParameter("cmd"); // 요청 주소의 cmd 파라미터 값 가져오기
		
		if(cmd.equals("signup")){ // 요청 파라미터가 signup일 경우 회원가입페이지를 요청한거
			request.setAttribute("prt", "member/signup");
			// 회원가입 페이지를 제공하기위해 request객체를 이용한것일뿐 반두시 이와같은 방법이 아니여도 된다.
			// 사용자 요청에 의한 페이지 제공은 정적페이지(.html, .jsp 등) 그대로 제공할수도 있고
			// 위와 같이 include 방식으로 제공할 수 있다.
		}
		
		RequestDispatcher rds = request.getRequestDispatcher("/");//제공할 페이지
		rds.forward(request, response);
		// 기존의 사용자 브라우저의 내용을 교체하는 방식
		// 주소는 변경 되지 않는다.
		
	}
	
}



/*
*
*
*	dispatcher를 사용하면 요청에 대한 페이지를 forward 또는 include하여 제공한다.
*/