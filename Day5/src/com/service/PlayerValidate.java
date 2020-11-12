package com.service;

import com.pojo.CustomException;

public class PlayerValidate {
	public static void isValidAge(int age) throws CustomException {
		if (age < 19)
			throw new CustomException("InvalidAgeRangeException");
	}
}
