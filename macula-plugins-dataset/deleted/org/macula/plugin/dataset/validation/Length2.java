package org.macula.plugin.dataset.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * <p> <b>Length2</b> 是非英文字符算2个长度的annotation. </p>
 * 
 */

@Documented
@Constraint(validatedBy = Length2Validator.class)
@Target({
		METHOD,
		FIELD,
		ANNOTATION_TYPE,
		CONSTRUCTOR,
		PARAMETER })
@Retention(RUNTIME)
public @interface Length2 {
	int min() default 0;

	int max() default Integer.MAX_VALUE;

	String message() default "{org.hibernate.validator.constraints.Length.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
