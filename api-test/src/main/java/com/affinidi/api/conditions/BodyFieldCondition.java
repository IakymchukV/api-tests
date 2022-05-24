package com.affinidi.api.conditions;


import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import lombok.RequiredArgsConstructor;
import org.hamcrest.Matcher;

@RequiredArgsConstructor
public class BodyFieldCondition implements ICondition {

	private final String jsonPath;

	private final Matcher matcher;

	@Override
	public ValidatableResponse check(final Response response) {
		return response.then().assertThat().body(jsonPath, matcher);
	}
}
