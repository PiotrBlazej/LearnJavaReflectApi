package Fields;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) {
		try {
			User user = new User();
			/* getClass()
			 * user.getClass() returns the runtime type of user. I.e., if you have 
			 * User user = new BUser(); then user.getClass() will return the BUser class.
			 * User.class evaluates to the User class statically, and is used for
			 * other purposes often related to reflection.
			 */
			Class<? extends User> userClass = user.getClass();
			System.out.println("Class name: " + userClass.getSimpleName() );

			/*
			 * getFileds() - All the public fields up the entire class
			 * hierarchy. 
			 * getDeclaredFields() - All the fields, regardless of
			 * their accessibility but only for the current class, not any base
			 * classes that the current class might be inheriting from.
			 */
			Field[] fields = userClass.getDeclaredFields();
			for (Field f : fields) {
				System.out.println("Field name: "+f.getName()+ " Type: "+f.getType().getSimpleName());
			}

			// change values
			Field declaredField = userClass.getDeclaredField("password");
			declaredField.setAccessible(true);
			System.out.println("Old value field password: " + declaredField.get(user));
			declaredField.set(user, "newPassword");
			System.out.println("New value field password: " + declaredField.get(user));
			declaredField.setAccessible(false);

		} catch (Exception e) {

		}

	}

}
