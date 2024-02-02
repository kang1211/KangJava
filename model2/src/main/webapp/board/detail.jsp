<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<div id="detail_wrap">

	<div class="detail_text">
		<b>${data.id }.</b>
		<span class="hit_box"><i class="bi bi-eye-fill"></i>${data.hit}</span>
		<span class="date_box"><i class="bi bi-calendar-check"></i>${data.wdate}</span>
	</div>
	
	<div class="detail_text">
		<span class="title_head">제목</span>
		<b class="title_box">${data.title }</b>
	</div>
	
	<div class="detail_text">
		<div class="box">
			<span class="title_head">작성자</span>
			<b class="writer_box">${data.writer}</b>
		</div>
		<div class="box">
			<span class="title_head">언어</span>
			<b class="lang_box">${data.lang}</b>
		</div>
	</div>
	
	<div class="detail_text">
		<div class="content">${data.content}</div>
	</div>
	
	<c:if test="${user.num == data.member_id}">
	<div class="update_del">
		<button type="button" onclick="update('${data.id}')">수정</button>
		<button type="button" onclick="del('${data.id}')">삭제</button>
	</div>
	</c:if>
	
	<div id="reply_wrap">
		<h3>답글 작성</h3>
		<div class="reply_input">
			<form method="post" action="/board_reply.do" id="reply">
				<input type="hidden" name="board_id" value="${data.id}">
				<div class="input_box">
					<textarea name="comment" id="comment"></textarea>
					<button class="reply_bt">작성</button>
				</div>
			</form>
		</div>
		<div class="replay_list">
			<ul class="reply_list_box">
				
				<c:forEach var="row" items="${reply_list }">
				<li>
					<div class="reply_info">
						<b>${row.writer }</b>
						<small>
					<fmt:formatDate value="${row.wdate}" pattern="yy.MM.dd HH:mm"/>
						</small>
					</div>
					<div class="reply_comment">${row.comment }</div>
					<div class="del_bt">
						<c:if test="${row.member_id == user.num }">
							<a href="javascript:reply_del('${row.id}','${data.id}')">삭제</a>
						</c:if>
					</div>
				</li>
				</c:forEach>
				
			</ul>
		
		</div>
	</div>

</div>

<script>
	function update(i){
		location.href="/board_updatePage.do?id="+i;
	}
	function del(i){
		var really = confirm("정말로 삭제 하시겠습니까?");
		if(really){
			location.href="/board_delete.do?id="+i	
		}
	}
	
	function reply_del(i, bid){
		var real = confirm("진짜 삭제 하시겠");
		if(real){
			location.href="/board_replyDelete.do?id="+i+"&bid="+bid;
		}
	}
	
	<c:if test="${user==null}"><%-- 로그인 안할 때 존재하는 코드--%>
	$("#comment").on("focus", function(){
		alert("로그인후에 이용하세요");
		$(this).blur();
	});
	</c:if>
	
</script>