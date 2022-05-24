package com.affinidi.api.services;

import com.affinidi.api.assertions.AssertableResponse;
import com.affinidi.api.payloads.UserPayloads;

public class UserApiServices extends ApiService {


	public AssertableResponse registerUser(final UserPayloads user) {
		return new AssertableResponse(apiSetup().body(user)
												.when()
												.post("register"));
	}
}
