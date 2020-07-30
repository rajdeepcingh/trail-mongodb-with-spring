package com.example.demo.model;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
class User {

	@Id
	private String userId;
	private String name;
	private Date creationDate = new Date();
	private Map<String, String> userSettings = new HashMap<>();

}

