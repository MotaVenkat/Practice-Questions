package LambdaExpressions;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Client {

	public static void main(String[] args) {
		MyFunctionalInterface myfunction = (String s) -> {
			System.out.println("Hellow world");
		};
		myfunction.printSomething("Ram");

		DemoInterface demo = () -> System.out.println("Hellow lambda ");
		demo.fun();

		Consumer<String> consumer = (s) -> {
			System.out.println("Hellow from " + s);
		};
		consumer.accept("Consumer testing");

		BiConsumer<String, String> biconsumer = (str, str1) -> {
			System.out.println("Hellow from " + str + " " + str1);
		};
		biconsumer.accept("Bi Consumer", "Testing");

		Predicate<String> predicateTest = (s) -> {
			if (s.equals("Scaler")) {
				System.out.println("Scaler is equals to given string Predicate interface ");
				return true;
			} else {
				System.out.println("Scaler is not equals to given string ");
				return false;
			}

		};
		predicateTest.test("Scaler");

		BiPredicate<Integer, String> bipredicatetest = (val, str1) -> {
			if (val > 5) {
				return true;

			} else {
				return false;
			}
		};
		System.out.println("Hellow Bipredicate testing " + bipredicatetest.test(6, "Hello"));

		BiFunction<String, String, String> bifunctiontest = (s1, s2) -> {
			return s1 + s2;
		};
		
		System.out.println(bifunctiontest.apply("Hellow world", " BiFunction"));
		Function <String,String> function =(str)->{
			return str;
		};
		System.out.println(function.apply("Hellow from Function interface"));
	}

}
