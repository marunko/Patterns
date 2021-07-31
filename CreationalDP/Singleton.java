class Singleton_A{
	private volatile static Singleton_A instance;
	
	private Singleton_A( ) {
	 
	}
	
	public static Singleton_A getInstance() {
		if(instance == null)
			return instance = new Singleton_A();
		
		return null;
	}
 
}
//***********************************************************
// Another variant with generic type
class Singleton_B<T>{
	private final static Singleton_B<?> instance;
	 
	static {
		instance = new Singleton_B<>();
	}
	private Singleton_B( ) {
	 
	}
	
	public static  Singleton_B<?> getInstance() {
		return instance;
	}
	 
}
/* ****** IN MAIN *************************

	public static void main(String[] args) {
 
		Singleton_B<String> a = (Singleton_B<String>) Singleton_B.getInstance();
		Singleton_B<Integer> b = (Singleton_B<Integer>) Singleton_B.getInstance();
    
    System.out.println(b.equals(a)); // True
		System.out.println(a); // oop.Patterns.Singleton_B@21b8d17c
		System.out.println(b); // oop.Patterns.Singleton_B@21b8d17c
	}
