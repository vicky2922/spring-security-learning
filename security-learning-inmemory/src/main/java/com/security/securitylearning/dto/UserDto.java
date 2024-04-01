package com.security.securitylearning.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	
	private int id;
	private String name;
	private int age;
	public UserDto(int i, String string, int j) {
		this.id=i;
		this.name=string;
		this.age=j;
	}
}
