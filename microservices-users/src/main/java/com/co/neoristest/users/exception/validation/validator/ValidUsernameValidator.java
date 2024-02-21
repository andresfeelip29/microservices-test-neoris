package com.co.neoristest.users.exception.validation.validator;

import com.co.neoristest.users.exception.validation.anotations.ValidUsername;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Objects;


public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {

    @Override
    public void initialize(ValidUsername constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        String ragex = "[a-zA-Z]+";

        if(Objects.isNull(value)) return false;

        if(value.isEmpty()) return false;

        return value.matches(ragex);
    }
}
