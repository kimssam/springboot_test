package com.study.mysite.sbb.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
	
	@Size(min=3, max=25)
	@NotBlank(message="사용자 ID는 필수 사항입니다.") 
	private String username;
	
	@NotBlank(message="비밀번호는 필수 사항입니다.") 
	private String password1;
	
	@NotBlank(message="비밀번호 확인는 필수 사항입니다.") 
	private String password2;
	
	@NotBlank(message="이메일은 필수 사항입니다.")
	@Email
	private String email;
}
