package FunctionalInterface;

@FunctionalInterface
public interface functionalTest {
	
	void newPlaylist();
	

	public default void myPlaylist() {
		
		System.out.println("I am from functionalTest");
	}
	
	static void functionTest() {
		System.out.println("I am from static function");
		
	}
}
