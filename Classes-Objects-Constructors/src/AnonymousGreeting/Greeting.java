package AnonymousGreeting;

//Anonymous Class
interface Greeting {
	void sayHello();
	
	
public static void main(String[] args) {
	Greeting g = new Greeting() {
		
		@Override
		public void sayHello() {
			System.out.println("Hello");
			
		}
	};
	g.sayHello();
}
}
