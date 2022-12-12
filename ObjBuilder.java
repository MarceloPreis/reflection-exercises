package reflextionExercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjBuilder {
	private Class<?> classT;
	
	public ObjBuilder(Class<?> classT) {
		this.classT = classT;
	}
	
	public Object build() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		try {
			Constructor<?> constT = classT.getDeclaredConstructor();
			
			return constT.newInstance();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
