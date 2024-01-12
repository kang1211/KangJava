<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
	String food=request.getParameter("food");
	String cost=request.getParameter("cost");
	String store=request.getParameter("store");
	
	Cookie[] cook = request.getCookies();
	for(Cookie c : cook){
		if(c.getName().equals("food"))
			food = c.getValue()+"-"+food;
		if(c.getName().equals("cost"))
			cost = c.getValue()+"-"+cost;
		if(c.getName().equals("store"))
			store = c.getValue()+"-"+store;
	}
	
	//Cookie cookie = new Cookie("name","이순신");

	Cookie foodck = new Cookie("food",food);
	Cookie costck = new Cookie("cost",cost);
	Cookie storeck = new Cookie("store",store);

	foodck.setMaxAge(3600);
	costck.setMaxAge(3600);
	storeck.setMaxAge(3600);
	//cookie.setMaxAge(60*60+20*60); //쿠키 유지 시간 1시간 20분
	
	//response.addCookie(cookie); // 클라이언트에게 쿠키 전송
	response.addCookie(foodck); // 클라이언트에게 쿠키 전송
	response.addCookie(costck); // 클라이언트에게 쿠키 전송
	response.addCookie(storeck); // 클라이언트에게 쿠키 전송

	// 쿠키삭제
/* 	Cookie[] ck = request.getCookies();
	for(Cookie c : ck){
		if(c.getName().equals("food")){
			c.setMaxAge(0);
			response.addCookie(c);
			break;
		}
	} */
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="cook_read.jsp">쿠키 확인</a>
	
</body>
</html>