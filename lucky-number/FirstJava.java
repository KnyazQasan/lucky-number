package test;
import java.util.concurrent.TimeUnit ;
import java.util.Scanner;
public class FirstJava {

	public static void main(String[] args) throws InterruptedException {
		Scanner read = new Scanner(System.in);
		System.out.println("What is your Name?");
		String name =read.next();
		System.out.println("Hi,"+name);
		TimeUnit.SECONDS.sleep(1);
		System.out.println("How are you"+ " " +name+"?");
		String mood = read.next();
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Always be fine"+ " " +name + " " + " :)");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("How old are you");
		int age = read.nextInt();
		System.out.println("Good"+" " + name);
		TimeUnit.SECONDS.sleep(3);
		System.out.println("I'll give you a lucky number :)");
		TimeUnit.SECONDS.sleep(4);
	    System.out.println("Your Lucky Number:");
	    TimeUnit.SECONDS.sleep(2);
		int alcount = name.length();
	    int luckynum = 0;
		
		if(age<15) {
		luckynum = (alcount * age) %10;
		
	    }else if(age<20) {
	    	luckynum =(age *age - alcount) % 10;
	    }else if(age<40) {
	    	luckynum = (alcount -age + age)% 10;
	    }else if(age<60) {
	    	luckynum = (age * age )% 10;
	    }else {
	    	luckynum = (alcount * 5-age)%10;
	    }
		if(luckynum<0) 
			luckynum = luckynum * -1;
		
		System.out.println(luckynum);
	}
	
}
