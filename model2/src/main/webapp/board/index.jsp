<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!-- <head>
	<link rel="stylesheet" href="../static/css/board/index.css">
</head> -->

<div id="board_wrap">
	<h3> 내 코드를 도와줘!</h3>
	<div class="moveBt">
		<c:if test="${user != null}">
			<a href="/board_writePage.do">도움받기</a>
		</c:if>
		<div class="sortList">
			<a href="javascript:sortTitle()">제목
				<i class="bi bi-chevron-double-down"></i>
				<i class="bi bi-chevron-double-up iconHide"></i>
			</a>
			<a href="javascript:sortDate()">날짜
				<i class="bi bi-chevron-double-down"></i>
				<i class="bi bi-chevron-double-up iconHide"></i>
			</a>
			<a href="javascript:sortHit()">조회수
				<i class="bi bi-chevron-double-down"></i>
				<i class="bi bi-chevron-double-up iconHide"></i>
			</a>
		</div>
	</div>
	
	<div class="search_wrap">
	<form id="searchFm" method="get" action="board.do">
		<div class="search_box">
			<b>검색</b>
			<input type="text" name="keyword" id="keyword" placeholder="제목 또는 내용 검색">
			<i class="bi bi-search"></i>
		</div>
	</form>
	</div>
	
	<div id="llist_wrap">
		<table class="list_table">
			<thead>
				<tr>
					<th class="num">번호</th>
					<th class="title">제목</th>
					<th class="date">작성일</th>
					<th class="writer">작성자</th>
					<th class="hit">조회수</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
				<c:when test="${list == null }">
				<tr>
					<td colspan="5">등록된 글이 없습니다.</td>
				</tr>
				</c:when>
				<c:when test="${list != null}">
					<c:forEach var="res" items="${list}">
					<tr>
						<td class="num numtd">${res.id }</td>
						<td class="title titled">
							<a href="/board_read.do?id=${res.id}">${res.title }</a>
						</td>
						<td class="date dated">
							<fmt:formatDate value="${res.wdate }" pattern="yy.MM.dd HH:mm"/>
							<%-- <fmt:formatNumber value="12345678" type="currency"/> type currency는 접속한 지역에 따라 화폐단위가 다르게 나온다 --%>
							<%-- <fmt:formatNumber value="12345678" type="###,###점"/> type #숫자 자리와 문자열을 섞어 사용 가능 --%>
							<%-- <fmt:formatNumber value="12345678" type="%"/> --%> 
						</td>
						<td class="writer writertd">${res.writer }</td>
						<td class="hit hittd">${res.hit}</td>
					</tr>
					</c:forEach>
				</c:when>
				</c:choose>
			</tbody>
<%-- 게시글 페이징 --%>
<c:set var="pageTotalNum" value="${DBtotal/10 }"/>
<c:if test="${DBtotal%10 != 0 }">
	<c:set var = "pageTotalNum" value="${ pageTotalNum + 1 }"/>
</c:if>

<c:set var="pageNum" value="1"/><!-- 현재페이지 번호 -->
<c:if test="${param.page != null }">
	<c:set var="pageNum" value="${param.page }"/>
</c:if>

<c:set var="skip" value="5"/>
<c:set var="start" value="1"/>
<c:set var="end" value="${pageTotalNum > skip ? 5 : pageTotalNum}"/>
<c:if test="${pageTotalNum > skip && pageNum >= (skip/2+1) }">
	<c:set var="start" value="${pageNum-2 }"/>
	<c:set var="end" value="${pageTotalNum > pageNum+2 ? pageNum+2 : pageTotalNum }"/>
</c:if>
			<tfoot>
				<tr>
					<td colspan="5">
						
						<i class="bi bi-arrow-bar-left"></i>
						
						<c:forEach var="i" begin="${start }" end="${end }" step="1">
							<c:if test="${pageNum == i }"><%--현재 페이지 표시 --%>
								[${i}]
							</c:if>
							<c:if test="${pageNum != i }"><%--다른 페이지 표시 --%>
								<a href="/board.do?page=${i}">${i}</a>
							</c:if>
						</c:forEach>
						<i class="bi bi-arrow-bar-right"></i>
						
					</td>
				</tr>
			</tfoot>
		</table>
	</div>
	
</div>