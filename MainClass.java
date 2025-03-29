package Aston;

public class MainClass {
	//1
	public static void printThreeWords() {
		System.out.println("Orange");
	    System.out.println("Banana");
	    System.out.println("Apple");
		}
	
	//2
	public static void checkSumSign() {
		int a = 10;
		int b = -5;
		int sum = a + b;
		if (sum >= 0) { 
			System.out.println("Сумма положительная"); 
			} 
		else { 
			System.out.println("Сумма отрицательная"); 
			}
	}
	
	//3
	public static void printColor() {
	        int value = 101;
	        if (value <= 0) {
	            System.out.println("Красный");
	        }
	        if (value <= 100) {
	            System.out.println("Желтый");
	        }
	        if (value > 100) {
	            System.out.println("Зеленый");
	        }

	}
	
	//4
	public static void compareNumbers() {
	        int a = 5;
	        int b = 3;
	        if (a >= b) {
	            System.out.println("a >= b");
	        } 
	        else {
	            System.out.println("a < b");
	        }
	 }
	
	//5
	 public static boolean isBetween10And20(int a, int b) {
	        return a + b >=10 && a + b <=20;
	 }
		
	//6
	 public static void isPositiveOrNegative(int a) {
         System.out.println(a >= 0? "Positive" : "Negative");
	 }
		
	//7
	 public static boolean isNegativOrPositive(int a) {
	        return a < 0;
	 }
	 //8
	 public static void printLine(String line, int n) {
	        for (int i = 0; i < n; i++)
	            System.out.println(line);
	 }

	 //9
	 public static boolean doleapYear(int year) {
	        return year % 100 != 0 && year % 4 == 0 || year % 400 ==0;
	 }
		
	//10
	 public static void task10(int[] replaceValues) {
	        for (int i = 0; i < replaceValues.length; i++) {
	            replaceValues[i] = (replaceValues[i] > 0)? 0 : 1;
	            System.out.print(replaceValues[i] + " ");
	        }
	 }
		
	//11
	 public static void task11(int size) {
	        int[] fillArr = new int[size];
	        for (int i = 0; i < fillArr.length; i++) {
	            fillArr[i] = i + 1;
	            System.out.print(fillArr[i] + " ");
	        }
	 }
	 

	 


}
