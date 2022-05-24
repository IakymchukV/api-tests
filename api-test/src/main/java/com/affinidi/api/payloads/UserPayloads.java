package com.affinidi.api.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors (fluent = true)
public class UserPayloads {

	@JsonProperty ("firstName")
	private String firstName;

	@JsonProperty ("lastName")
	private String lastName;

	@JsonProperty ("id")
	private String id;

	@JsonProperty ("password")
	private String password;

	@JsonProperty ("email")
	private String email;
}
