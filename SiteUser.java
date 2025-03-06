package com.study.mysite.sbb.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class SiteUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(unique = true)
	private String username;
	
	private String password;
	
	@Column(unique = true)
	private String email;
	
	//사용자 아이콘-01)엔티티에 컬럼추가 => signup_form.html
	private String imageUrl;//이미지 업로드 위치
}





