package com.ead_authuser.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UsernameConstraintImpl.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UsernameConstraint {
    String message() default "Invalid username. It must be between 4 and 50 characters and contain only letters, numbers, underscores, or hyphens.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
