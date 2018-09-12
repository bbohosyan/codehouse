package com.codehouse.codehouse.validators.password;

import com.codehouse.codehouse.models.UserRegisterFormDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator
        implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }
    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context){
        UserRegisterFormDto user = (UserRegisterFormDto) obj;
        return user.getPassword().equals(user.getConfirmPassword());
    }
}
