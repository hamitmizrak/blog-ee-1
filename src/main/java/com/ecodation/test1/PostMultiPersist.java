package com.ecodation.test1;

import java.util.Date;

import javax.persistence.PostPersist;

public class PostMultiPersist {

	@PostPersist
	public void postMethod() {
		System.out.println(new Date(System.currentTimeMillis()));

	}
}
