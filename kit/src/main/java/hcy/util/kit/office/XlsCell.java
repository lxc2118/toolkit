package hcy.util.kit.office;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface XlsCell {

	// TODO pic实现
	public enum Type {
		string,pic;
	}
	
	String name();
	
	Type type() default Type.string;

}
