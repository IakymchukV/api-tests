package com.affinidi.api.assertions;

import com.affinidi.api.conditions.ICondition;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class AssertableResponse {

	private final Response response;

	public AssertableResponse shouldHave(final ICondition condition) {
		log.info("Should have conditions {}", condition);
		condition.check(response);
		return this;
	}

	public ValidatableResponse shouldHaveWithResponse(final ICondition condition) {
		log.info("Should have conditions {}", condition);
		return condition.check(response);
	}
}
