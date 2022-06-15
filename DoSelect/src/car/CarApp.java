package car;

public class CarApp {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		int x=10;
		
		c1.setModel("Ford");
		c1.setMaxspeed(9);
		c1.setYear(10);
		System.out.println(x);
		System.out.println(c1);
		
		Car c2 = new Car();
		c2.startcar();
	}
}
