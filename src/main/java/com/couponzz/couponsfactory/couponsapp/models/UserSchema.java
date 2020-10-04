package com.couponzz.couponsfactory.couponsapp.models;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "UserSchema")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserSchema {

	@Id
	private Integer Id;

	@NotNull(message = "User's first name must not be null")
	private String firstname;

	@NotNull(message = "User's last name must not be null")
	private String lastname;

	private String middlename;

	@NotNull(message = "User's username must not be null")
	private String username;

	@NotNull(message = "User's password must not be null")
	private String password;

	@NotNull(message = "User's confirm Password must not be null")
	private String confirmPassword;

	@NotNull(message = "User's Email id must not be null")
	private String emailid;

	@NotNull(message = "User's date of birth must not be null")
	private String dateOfBirth;

	@NotNull(message = "User's Gender must not be null")
	private char Gender;

	@NotNull(message = "User's mobile Number must not be null")
	private String mobileNumber;

	@NotNull(message = "Provide the user role")
	private String role;

}
