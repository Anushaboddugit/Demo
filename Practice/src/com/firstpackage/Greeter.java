package com.firstpackage;
interface Greeting{
	public void perform();
}
class HelloWorldGreeting implements Greeting{
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}
}
public class Greeter {
public void greet(Greeting greeting) {
	greeting.perform();
}
	public static void main(String arg[]) {
		Greeter greeter= new Greeter();
		HelloWorldGreeting helloWorldGreeting=new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
	}
}

