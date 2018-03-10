package com.fund.BankApp.validations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Code {

	public String value() default "US";
	
	public String message() default "Code should start with US";
	
	public Class<?> [] groups() default {};
	
	public Class <? extends Payload> [] payload() default {};
}
