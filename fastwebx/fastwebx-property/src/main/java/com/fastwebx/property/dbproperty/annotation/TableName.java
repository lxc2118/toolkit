package com.fastwebx.property.dbproperty.annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface TableName {
	public String tableName() default "sysConfig"; 
	public String keyColumn() default "sysKey";
	public String valueColumn() default "sysValue";
}
