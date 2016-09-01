
public class Car {
	
	private int cost;
	private String brand;
	private float maxSpd;
	private boolean raceCar;
	
	public Car(int cost, String brand, float maxSpd, boolean raceCar){
		this.cost = cost;
		this.brand = brand;
		this.maxSpd = maxSpd;
		this.raceCar = raceCar;
	}
	
	public void getInfo(){
		System.out.println("This is a " + brand + "\n It's cost is around " + cost + "\n It's max speed is " + maxSpd + "\n It is a race car or not" + raceCar);

	}
	
}
