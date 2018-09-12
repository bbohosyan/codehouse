package com.codehouse.codehouse.validators.password;

import com.codehouse.codehouse.models.User;
import com.codehouse.codehouse.models.UserLoginFormDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator
        implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }
    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context){
        UserLoginFormDto user = (UserLoginFormDto) obj;
        return user.getPassword().equals(user.getConfirmPassword());
    }
}
