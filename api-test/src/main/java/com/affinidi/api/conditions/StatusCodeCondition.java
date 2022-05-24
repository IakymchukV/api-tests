package com.affinidi.api.conditions;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StatusCodeCondition implements ICondition {

	private final int statusCode;

	@Override
	public ValidatableResponse check(final Response response) {
		return response.then().assertThat().statusCode(statusCode);
	}
}
