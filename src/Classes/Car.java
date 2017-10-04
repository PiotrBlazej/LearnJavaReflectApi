package Classes;

public class Car implements CarInterface {
	private String owner;
	
	public Car() {

	}
	public Car(String owner) {
		this.owner = owner;
	}


	@Override
	public int numbOfWheels() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	

}
