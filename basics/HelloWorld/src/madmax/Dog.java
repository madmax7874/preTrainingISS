package madmax;

public class Dog implements Animal {
    String name;  
    int age;
    
    Dog(String n){  
	    name = n;
    }

	@Override
	public void sound() {
		System.out.println(name + " says, 'Bow bow!'");		
	}
	
	public void setAge(int inputAge) {
		age = inputAge;
	}
	
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		Dog madmax = new Dog("madmax");
		madmax.sound();
		madmax.setAge(21);
		System.out.println(madmax.getAge());
	}
}
