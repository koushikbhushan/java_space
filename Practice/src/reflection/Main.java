package reflection;

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
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
