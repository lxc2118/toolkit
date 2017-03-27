package com.fastwebx.db.condition.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited

public @interface CdtInit {

	public String colName() default "";

	public String inTableCol() default "";

	public String inTableName() default "";

	public String mainTableCol() default "";

	public String op() default "";

	public boolean distinct() default false;

	public boolean sql() default false;

	public String joinTableName() default "";

	public String joinColName() default "";;

	public String middleTableName() default "";

	public String middle2Main() default "";

	public String middle2Join() default "";

}
