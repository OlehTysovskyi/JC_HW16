package First_Task;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {


	public static void main(String[] args) {
		
		
		Class pc = Person.class;
		Person p = new Person("Ben", "Mazovskiy", 24);
		
		//get name
		System.out.println("-Name of class: [" + pc.getName() + "];");
		System.out.println("-Simple name of class: [" + pc.getSimpleName() + "];");
		
		//get modifier
		System.out.println("\n-Class modifier: [" + Modifier.toString(pc.getModifiers()) + "];");
		System.out.println("-Class is abstract: [" + Modifier.isAbstract(pc.getModifiers()) + "];");
		System.out.println("-Class is public: [" + Modifier.isPublic(pc.getModifiers()) + "];");

		//get package
		System.out.println("\n-Package name: [" + pc.getPackageName() + "];");

		//get super class
		System.out.println("\n-Super class: [" + pc.getSuperclass() + "];");
		
		//get interface
		Class [] interfaces = pc.getInterfaces();
		
		System.out.println("\n-Interfaces[" + interfaces.length + "]:");
		for(int i=0; i<interfaces.length; i++) {
			System.out.println((i+1)  + ")" + interfaces[i]);
		}
		
		//get constructors
		Constructor[] constructors = pc.getConstructors();
		
		System.out.println("\n-Constructors[" + constructors.length + "]:");
		for(int i=0; i<constructors.length; i++) {
			System.out.println((i+1)  + ")" + constructors[i]);
		}	
		
		//get fields
		Field [] fields = pc.getDeclaredFields();
		
		System.out.println("\n-Declarated fields[" + fields.length + "]:");
		for(int i=0; i<fields.length; i++) {
			System.out.println((i+1)  + ")" + fields[i]);
		}
		
		//field set
		System.out.println("\n-Before setting age: " + p.toString());
		Field name = null;
		try {
			name = pc.getField("name");
			name.set(p, "Anrew");
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-After setting age: " + p.toString());
		
		//get methods
		Method [] methods = pc.getMethods();
		
		System.out.println("\n-Methods[" + methods.length + "]:");
		for(int i=0; i<methods.length; i++) {
			System.out.println((i+1)  + ")" + methods[i]);
		}
		
		try {
			System.out.println("\n" + p.toString());
			methods[4].invoke(p, "Marta");
			System.out.println("-Using method of class by invoke[setName]:" + "\n" + p.toString());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
 	}

}
