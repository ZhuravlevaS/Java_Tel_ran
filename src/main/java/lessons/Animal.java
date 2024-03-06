package lessons;

public class Animal {
	int age;
	String name;

	Animal[] children = new Animal[1];

	public void creatChild(int age, String name) {
		this.children[0] = new Animal(age, name);
	}
	public Animal() {}

	public Animal(int age, String name) {
		this.name = name;
		this.age = age;
	}
}
