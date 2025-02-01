//UserInput.java

import java.util.Scanner;
// Class to handle user input for numbers and arrays
class UserInput {
    Scanner scan = new Scanner(System.in);
    Calculator calculator = new Calculator();
 // Method to input an array of numbers
    int[] arrayInput() {
        System.out.print("Enter the number of elements: ");
        int size = scan.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }
        return numbers;
    }
// Method to input two numbers for basic operations
    int[] numberInput() {
        int[] numbers = new int[2];
        System.out.println("Enter first number:");
        numbers[0] = scan.nextInt();
        System.out.println("Enter second number:");
        numbers[1] = scan.nextInt();
        return numbers;
    }
  // Method to select and perform a calculation
    void selectCalculation() {
        System.out.println("Select operation:");
        System.out.println("1: Add\n2: Subtract\n3: Multiply\n4: Divide\n5: Fibonacci\n6: Sum of Array\n7: Mean\n8: Variance\n9: Standard Deviation");

        int choice = scan.nextInt();
// Switchcase to select operation
        switch (choice) {
            case 1 -> {
                int[] nums = numberInput();
                System.out.println("Result: " + calculator.sum(nums[0], nums[1]));
            }
            case 2 -> {
                int[] nums = numberInput();
                System.out.println("Result: " + calculator.subtraction(nums[0], nums[1]));
            }
            case 3 -> {
                int[] nums = numberInput();
                System.out.println("Result: " + calculator.multiplication(nums[0], nums[1]));
            }
            case 4 -> {
                int[] nums = numberInput();
                System.out.println("Result: " + calculator.division(nums[0], nums[1]));
            }
            case 5 -> {
                System.out.println("Enter number of elements for Fibonacci sequence:");
				int n = scan.nextInt();
				calculator.fibonacci(n);  
            }
            case 6 -> {
                int[] arr = arrayInput();
                System.out.println("Result: " + calculator.sumOfArray(arr));
            }
            case 7 -> {
                int[] arr = arrayInput();
                System.out.println("Result: " + calculator.meanOfArray(arr));
            }
            case 8 -> {
                int[] arr = arrayInput();
                System.out.println("Result: " + calculator.varianceOfArray(arr));
            }
            case 9 -> {
                int[] arr = arrayInput();
                System.out.println("Result: " + calculator.standardDeviationOfArray(arr));
            }
            default -> System.out.println("Invalid choice! Please select a valid option.");
        }
    }
}
