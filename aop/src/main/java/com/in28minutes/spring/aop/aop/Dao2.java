package com.in28minutes.spring.aop.aop;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
	public String retrieveSomething() {
		return "Dao2";
	}
}
