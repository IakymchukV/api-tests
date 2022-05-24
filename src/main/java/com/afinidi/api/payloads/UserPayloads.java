package com.afinidi.api.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPayloads{

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("id")
	private String id;

	@JsonProperty("age")
	private String age;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setAge(String age){
		this.age = age;
	}

	public String getAge(){
		return age;
	}

	@Override
 	public String toString(){
		return 
			"UserPayloads{" + 
			"firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",id = '" + id + '\'' + 
			",age = '" + age + '\'' + 
			"}";
		}
}
