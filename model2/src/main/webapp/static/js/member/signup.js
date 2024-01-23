/**
*
*
*/
$(function(){
	
	$(".input_data input").on("keyup",function(){
		
	});
	
	
	
	$("#bt").on("click",function(){//회원가입 버튼 클릭시
		if($("#pin").val() != $("#pin2").val()){
			alert("비밀번호를 확인해주세요");
			$("#pin").val("");
			$("#pin2").val("");
			$("#pin").focus();
		}else{}
		
	});
});


