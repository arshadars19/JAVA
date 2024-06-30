package oops_basics;

public class MotorBikeRunner {

	public static void main(String[] args) {

		// runner class object creation
		MotorBike ducati = new MotorBike(1000); // obj creation using constructor
		MotorBike honda = new MotorBike(2500);
		MotorBike bmw = new MotorBike();

		System.out.println("Ducati spped:- " + ducati.getSpeed());
		System.out.println("Honda speed:-" + honda.getSpeed());
		System.out.println("bmw speed:-" + bmw.getSpeed());

		ducati.setSpeed(100);

		honda.setSpeed(80);

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(50);

		System.out.println("Ducati spped:- " + ducati.getSpeed());
		System.out.println("Honda speed:-" + honda.getSpeed());

//		ducati.start();
//		honda.start();

//		//in class object creation
//		Bike duke = new Bike();
//		duke.bikeon();

	}

//	 static class Bike
//	{
//		void bikeon()
//		{
//			System.out.println("turn on ");
//		}
//	}

}
