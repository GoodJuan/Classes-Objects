
public class MainCar {
	
	public static void main(String args[]){
		Car bugatti = new Car(2700000, "Bugatti Veyron", (float) 408.84, true);
		bugatti.getInfo();
		Car mazda = new Car(90000, "Mazda 626", (float) 210, false);
		mazda.getInfo();
	}
		
}
