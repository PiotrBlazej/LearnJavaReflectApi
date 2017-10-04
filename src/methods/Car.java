package methods;

public class Car extends AbstractCar implements CarInterface {

	private String owner;
	
	public Car() {

	}
	
	public Car(String owner, String model) {

		this.owner = owner;
	}

	@Override
	public int numbsOfWheels(int i) {
		// TODO Auto-generated method stub
		return i;
	}
	public String getModel(){
	return	super.getModel();
	}

}
