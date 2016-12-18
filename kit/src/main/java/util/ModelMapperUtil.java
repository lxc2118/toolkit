package util;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

/**
 * Obj -> Obj 对象映射
 * 复制属性
 * ModelMapper
 * @author lxc
 * @date 2016/10/11 22:41:44
 */
public class ModelMapperUtil {

	public static <S, D> D map(S s, Class<D> clazz) {
		ModelMapper mm = new ModelMapper();
		return mm.map(s, clazz);
	}
	
	public static <S, D> D map(S s, Class<D> clazz, PropertyMap<S, D> pm){
		ModelMapper mm = new ModelMapper();
		mm.addMappings(pm);
		return mm.map(s, clazz);
	}
	
	/**
	 * 有问题
	 * destination.getClass != D.getClass
	 */
	@Deprecated
	public static <S, D> D map(S s, PropertyMap<S, D> pm){
		ModelMapper mm = new ModelMapper();
		mm.addMappings(pm);
		return mm.map(s, (Class<D>)pm.destination.getClass());
	}
}
