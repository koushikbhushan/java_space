package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		try {
			Class rfClass = Class.forName("reflection.Reflection");
			
			Class[] classes = rfClass.getClasses();
			for(Class c: classes) {
				System.out.println(c.getCanonicalName());
			}
			
			Method[] methods = rfClass.getDeclaredMethods();
			System.out.println("Methods: ");
			for(Method m : methods) {
				System.out.println(m.getName());
			}
			Method m = rfClass.getDeclaredMethod("setNum", new Class[]{Integer.TYPE});
			Object refInstance = rfClass.newInstance();
			m.invoke(refInstance, 1);
			
			m = rfClass.getDeclaredMethod("getNum", new Class[]{});
			Object res = m.invoke(refInstance);
			System.out.println(res);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
