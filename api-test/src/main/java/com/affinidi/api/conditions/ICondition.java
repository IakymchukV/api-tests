package com.affinidi.api.conditions;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public interface ICondition {

	ValidatableResponse check(Response response);
}
