package Classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		// get Class
		Class carClass = Car.class;

		System.out.println("Class name: " + carClass.getSimpleName() + " Package name: " + carClass.getPackage());

		// get Constructors
		Constructor[] constructors = carClass.getConstructors();
		for (Constructor c : constructors) {
			System.out.println("Constructor name: " + c.getName());
		}
		// Create new Instance
		try {
			// new instance with default constructor
			Car newInstance = (Car) carClass.newInstance();
			System.out.println("Default constructor: " + newInstance.getOwner());

			// new instance with constructor Car(String owner)
			Car newInstance2 = (Car) carClass.getConstructor(new Class[] { String.class }).newInstance("Owner");
			System.out.println("Constructor Car(String owner) : " + newInstance2.getOwner());
		} catch (Exception e) {

		}

		// get Methods
		Method[] methods = carClass.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println("Method name: " + m.getName() + " Return type: " + m.getReturnType());
		}

		// get Fields
		Field[] fields = carClass.getDeclaredFields();
		for (Field f : fields) {
			System.out.println("Fields name: " + f.getName() + " Type: " + f.getType().getSimpleName());
		}

		// get Interface
		Class[] interfaces = carClass.getInterfaces();
		for (Class c : interfaces) {
			System.out.println("Interface name: " + c.getSimpleName());
		}

	}

}
