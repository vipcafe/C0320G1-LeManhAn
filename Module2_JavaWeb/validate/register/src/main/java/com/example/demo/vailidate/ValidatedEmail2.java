package com.example.demo.vailidate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidatedEmail2 implements ConstraintValidator<ValidatedEmail, String> {
   public void initialize(ValidatedEmail constraint) {
   }

   public boolean isValid(String contactField, ConstraintValidatorContext cxt) {
      return contactField != null && contactField.matches("[0-9]+")
              && (contactField.length() > 8) && (contactField.length() < 14);
   }
}
