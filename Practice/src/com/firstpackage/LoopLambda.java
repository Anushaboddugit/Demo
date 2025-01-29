package com.firstpackage;
//import java.util.LinkedList;
//import java.util.List;
@FunctionalInterface
interface MyFunctionalInterface {
    void doSomething();
}
public class LoopLambda {

public static void main(String[] args) {
	
        MyFunctionalInterface myLambda =LoopLambda::printMessage;
        myLambda.doSomething();
    }
    public static void printMessage() {
        System.out.println("Hello from the lambda!");
    }
}






































//public class LoopLambda {
//public static void main(String[] args) {
//	List<Integer> li=new LinkedList<Integer>();
//	li.add(1);
//	li.add(2);
//	li.add(3);
////	li.forEach((n)->System.out.println(n));
//	li.forEach(System.out::println);
//	
//}
//}