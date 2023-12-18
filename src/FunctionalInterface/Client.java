package FunctionalInterface;

import java.util.function.Consumer;

public class Client implements functionalTest,FunctionalTest2 {

	

	public static void main(String[] arg) {
		Client cs = new Client();
		cs.myPlaylist();
		functionalTest.functionTest();

	}

	@Override
	public void myPlaylist() {
		// TODO Auto-generated method stub
		functionalTest.super.myPlaylist();
		FunctionalTest2.super.myPlaylist();
	}

	@Override
	public void newPlaylist() {
		// TODO Auto-generated method stub
		
	}

}
