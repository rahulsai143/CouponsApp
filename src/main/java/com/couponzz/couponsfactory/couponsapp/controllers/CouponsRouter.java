package com.couponzz.couponsfactory.couponsapp.controllers;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.couponzz.couponsfactory.couponsapp.models.UserSchema;

@RestController
@RequestMapping("/couponsapp")
public class CouponsRouter {

	@RequestMapping(value = "/createuser",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.TEXT_PLAIN_VALUE)
	public String createUser(@RequestBody UserSchema userSchema,@RequestHeader Map<String, String> headers) {
		
		return "";
	}
}
