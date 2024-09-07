package oops_abstract;

abstract class Animal {
	abstract void bark();

//	void bark() {
//		System.out.println("bow bow 1");// wont execute this because of override
//	}
}

class dog extends Animal {

	void bark() {
		System.out.println("bow bow 2");
	}
}

class cat extends Animal {

	void bark() {
		System.out.println("meow meow");
	}
}

public class AnimalRunner_ex {
	public static void main(String[] args) {
//		Animal ani = new dog();
//		ani.bark();
		Animal[] ani = { new dog(), new cat() };
		for (Animal object : ani) {
			object.bark();
		}
	}

}
