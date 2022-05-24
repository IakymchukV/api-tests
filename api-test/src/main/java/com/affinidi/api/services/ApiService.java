package com.affinidi.api.services;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.affinidi.api.ProjectConfig;
import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.aeonbits.owner.ConfigFactory;

public class ApiService {

	protected RequestSpecification apiSetup() {
		return RestAssured.given()
						  .contentType(ContentType.JSON)
						  .filters(getFilters());
	}

	private List<Filter> getFilters() {
		ProjectConfig projectConfig = ConfigFactory.create(ProjectConfig.class);
		if (projectConfig.logging()) {
			return Arrays.asList(new RequestLoggingFilter(), new ResponseLoggingFilter());
		}
		return Collections.emptyList();
	}
}
