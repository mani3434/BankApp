package com.fund.BankApp.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodeConstraintValidator implements ConstraintValidator<Code, String> {

	public String codePrefix;
	
	@Override
	public void initialize(Code code) {
		codePrefix = code.value();
	}
	
	@Override
	public boolean isValid(String code, ConstraintValidatorContext arg1) {
	
		boolean result;
		
		if(code!= null)
			result = code.startsWith(codePrefix);
		
		else
			result = true;
		
		return result;
	}

}
