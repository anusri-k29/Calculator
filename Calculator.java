import java.util.*;
//Class for mathematical operations for the calculator
class Calculator {
	//method for addition
    int sum(int a, int b) {
        return a + b;
    }
	//method for subtraction
    int subtraction(int a, int b) {
        return a - b;
    }
	// method for multiplication
    int multiplication(int a, int b) {
        return a * b;
    }
	//method for division
    int division(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
	//method to generate Fibonacci sequence up to n terms
    void fibonacci(int n) {
    int a = 0, b = 1, sum;
    
    if (n <= 0) {// Invalid input for non-positive number
        System.out.println("Invalid input! Enter a number greater than 0.");
        return;// Exit if n is non-positive
    }

    System.out.print("Fibonacci Sequence: " + a);// Print first term (0)
    if (n > 1) {
        System.out.print(" " + b);
    }
	// Generate Fibonacci sequence by summing the previous two terms
    for (int i = 2; i < n; i++) {
        sum = a + b;
        System.out.print(" " + sum);
        a = b;
        b = sum;
    }
    System.out.println(); 
}
    // method to calculate sum of array
    int sumOfArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) sum += num;
        return sum;
    }
	//method to calculate mean of array
    double meanOfArray(int[] numbers) {
        return (double) sumOfArray(numbers) / numbers.length;
    }
	// method to calculate variance of array
    double varianceOfArray(int[] numbers) {
        double mean = meanOfArray(numbers);
        double variance = 0;
        for (int num : numbers) variance += Math.pow(num - mean, 2);
        return variance / numbers.length;
    }
	// method to calculate standard deviation of array
    double standardDeviationOfArray(int[] numbers) {
        return Math.sqrt(varianceOfArray(numbers));
    }
}
