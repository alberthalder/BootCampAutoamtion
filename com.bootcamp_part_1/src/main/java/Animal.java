
public class Animal {

	private String name;

		public Animal (String name) {
		
		this.name = name;
		
			}
	public void speak () {
		
		System.out.println("Hello my name is " + name);
		
		class Dog extends Animal {
			public Dog (String name) {
				super (name);
				
			}
			
				public void bark () {
				System.out.println("Woof!");
			}
		}
				
	}

}
