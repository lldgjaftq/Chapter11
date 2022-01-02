package inheritancepolymorphism;
import java.util.ArrayList; 
import java.util.Random; 
import java.util.Scanner;
public class AdditionQuiz11_16 {

	public static void main(String[] args) {

	    Random rand = new Random();//设置一个Random类的对象rand
	    int number1 = rand.nextInt(10);
	    int number2 = rand.nextInt(10);
	    Scanner input = new Scanner(System.in);
	    System.out.println("what is " + number1 +"+" + number2 +"?");
	    ArrayList<Integer> answer = new ArrayList<>();//设置一个数组列表类的对象answer
	    answer.add(input.nextInt());
	    while(!answer.contains(number1 + number2)) {
	        System.out.println("wrong answer.try again. what is " + number1 + "+" + number2 +"?");
	        answer.add(input.nextInt());
	    }
	    System.out.println("you got it !");
	}
	
}


