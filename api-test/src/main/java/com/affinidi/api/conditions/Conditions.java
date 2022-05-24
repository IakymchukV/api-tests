package com.affinidi.api.conditions;

import lombok.experimental.UtilityClass;
import org.hamcrest.Matcher;

@UtilityClass
public class Conditions {

	public StatusCodeCondition statusCode(final int code) {
		return new StatusCodeCondition(code);
	}

	public BodyFieldCondition bodyFieldCondition(final String jsonPath, final Matcher matcher) {
		return new BodyFieldCondition(jsonPath, matcher);
	}
}
