package com.affinidi.tests.api;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PostTests {

	@BeforeClass
	public void setUp() {
		RestAssured.baseURI = "http://localhost:3000/";
	}

	@Test
	public void verifyAllPostsRequest() {

	}
}
