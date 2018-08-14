package com.example.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor //추가 모든 필드가 있는 생성자를 만든다.
@NoArgsConstructor(access = AccessLevel.PRIVATE)  //추가 디폴트 생성자를 만든다. 이놈이 필요한이유는 JPA 덕분 
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3989560790211865879L;

	@Id
	@GeneratedValue
	Long id;
	String name;
	String username;
	String remark;
	public User(String name, String username, String remark) {
	this.name = name;
	this.username = username;
	this.remark = remark;
	}

}
