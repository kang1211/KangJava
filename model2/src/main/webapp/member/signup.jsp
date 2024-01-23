<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    
<div id="signup_wrap">
	<form id="signupFm" method="post" action="/members?cmd=signSave" enctype="multipart/form-data">
		
		<div class="myphoto">
			<div class="photo"></div>
			<input type="file" name="face" id="face">
			<label for="face">내 사진 업로드</label>
		</div>
		
		<div class="input_data">
			<label for="email"></label>
			<input type="email" name="email" id="email">
		</div>
		<div class="input_data">
			<label for="pin">PassWord</label>
			<input type="password" name="pin" id="pin">
		</div>
		<div class="input_data">
			<label for="pin2"></label>
			<input type="password" id="pin2">
		</div>
		<div class="input_data">
			<label for="name"></label>
			<input type="text" name="name" id="name" required>
		</div>
		<div class="input_data">
			<label for="tel"></label>
			<input type="text" name="tel" id="tel">
		</div>
		
		<div>
			<button type="button" id="bt" class="active inactive" disabled>Sign</button>
		</div>
	</form>
</div>