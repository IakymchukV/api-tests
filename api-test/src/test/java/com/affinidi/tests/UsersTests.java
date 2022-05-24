package com.affinidi.tests;


import com.affinidi.api.ProjectConfig;
import com.affinidi.api.conditions.Conditions;
import com.affinidi.api.payloads.UserPayloads;
import com.affinidi.api.services.UserApiServices;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UsersTests {

	private final UserApiServices userApiServices = new UserApiServices();

	private final Faker faker = new Faker();

	@BeforeClass
	public void setUp() {
		final ProjectConfig projectConfig = ConfigFactory.create(ProjectConfig.class);
		RestAssured.baseURI = projectConfig.baseUrl();
	}

	@Test
	public void verifyAllUsersRequest() {
		final String firstName = faker.name().firstName();
		final UserPayloads user = new UserPayloads()
				.firstName(firstName)
				.lastName(faker.name().lastName())
				.email(String.format("%s@gmail.com", firstName))
				.password("heavyPassword");

		userApiServices.registerUser(user)
					   .shouldHaveWithResponse(Conditions.statusCode(201)).body("accessToken", Matchers.not(Matchers.empty()));

	}
}
