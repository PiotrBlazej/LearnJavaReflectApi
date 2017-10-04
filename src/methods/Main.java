package methods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		// get Class
		Class<? extends Car> carClass = car.getClass();
		// get Constructors
		Constructor<?>[] constructors = carClass.getDeclaredConstructors();
		for (Constructor c : constructors) {
			System.out.println("Constructor name: " + c.getName());
			// get parameters
			Parameter[] parameters = c.getParameters();
			for (Parameter p : parameters) {
				System.out
						.println("Parameter name: " + p.getName() + " Parameter type: " + p.getType().getSimpleName());
			}
		}
		// get Methods
		Method[] declaredMethods = carClass.getDeclaredMethods();
		for (Method m : declaredMethods) {
			System.out.println("Method name: " + m.getName() + "    Modifier: " + Modifier.toString(m.getModifiers()));

			Parameter[] parameters = m.getParameters();
			for (Parameter p : parameters) {
				System.out.println("Parameter name: " + p.getName());
			}
		}
		// Invoke method
		try {
			Method declaredMethod = carClass.getDeclaredMethod("numbsOfWheels", int.class);
			Object invoke = declaredMethod.invoke(car, 5);
			System.out.println("Numbers of wheels (Invoke method): " + invoke.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// get Interface
		Class<?>[] interfaces = carClass.getInterfaces();
		for (Class c : interfaces) {
			System.out.println("Interfaces: " + c.getSimpleName());
		}
		// get SuperClass
		System.out.println("Super class: " + carClass.getSuperclass().getSimpleName());

	}

}
