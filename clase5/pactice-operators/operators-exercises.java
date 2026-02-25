import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercise1(scanner);
        // Exercise2(scanner);
        // Exercise3();
        // Exercise4(scanner);
        // ConditonalEx1(scanner);
        // ConditonalEx2(scanner);
        // ConditonalEx3(scanner);
        ConditionalEx4(scanner);
        scanner.close();
    }

     //// Sequences ///// 
    //////////// Exercise 1 ---- Completed
    public static void Exercise1(Scanner scanner) {
        System.out.print("Enter the side measure of the square: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("No valid number provided.");
            return;
        }
        double side = scanner.nextDouble();

        if (side < 0) {
            System.out.println("Number must be positive");
            return;
        }

        double perimeter = side * 4;
        System.out.println("=====================");
        System.out.println("The Square perimeter is: " + perimeter);
        System.out.println("_____________________");
    }
    
    //////////// Exercise 2 ---- Completed
    public static void Exercise2(Scanner scanner) {
        System.out.print("Enter a value for a: ");
        if (!scanner.hasNextInt()) {
            System.out.println("No valid integer provided.");
            return;
        }
        int a = scanner.nextInt();
        System.out.print("Enter a value for b: ");
        if (!scanner.hasNextInt()) {
            System.out.println("No valid integer provided.");
            return;
        }
        int b = scanner.nextInt();
        System.out.print("Enter a value for c: ");
        if (!scanner.hasNextInt()) {
            System.out.println("No valid integer provided.");
            return;
        }
        int c = scanner.nextInt();
        System.out.print("Enter a value for d: ");
        if (!scanner.hasNextInt()) {
            System.out.println("No valid integer provided.");
            return;
        }
        int d = scanner.nextInt();

        int sum = a + b;
        int product = c * d;

        System.out.println("=====================");
        System.out.println("The sum of a and b is " + sum);
        System.out.println("The product of c and d is " + product);
        System.out.println("_____________________");
    }
    
    //////////// Exercise 3 ---- Completed
    public static void Exercise3() {
        int[] numsArray = new int[4];
        for(int i = 0; i < numsArray.length; i++) {
            numsArray[i] = (int)(Math.random() * 100);
        }
        
        int sum = 0;
        for (int num : numsArray) {
                sum += num;
            }
            
            double average = (double) sum / numsArray.length;
            
            System.out.println("=====================");
            System.out.println("Array: " + java.util.Arrays.toString(numsArray) ); // reppresentation of array into a string 
            System.out.println("Sum: " + sum );
            System.out.println("Average: " + average );
            System.out.println("_____________________");
        }
        
        //////////// Exercise 4 ---- Completed
        public static void Exercise4(Scanner scanner) {
            System.out.print("Enter the item's value: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("No valid number provided.");
                return;
            }
            double item = scanner.nextDouble();

            System.out.print("Enter the quantity purchased: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("No valid number provided.");
                return;
            }
            double quantity = scanner.nextDouble();

            double totalPrice = item * quantity;

            System.out.println("=====================");
            System.out.println("The bill's total price is: $" + totalPrice);
            System.out.println("_____________________");
        }

//// Conditionals ///// 
        //////////// Coonditional 1 ---- Completed
        public static void ConditonalEx1(Scanner scanner) {
            System.out.print("Enter the first number: ");
            if (!scanner.hasNextInt()) {
                System.out.println("No valid integer provided.");
                return;
            }
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            if (!scanner.hasNextInt()) {
                System.out.println("No valid integer provided.");
                return;
            }
            int num2 = scanner.nextInt();

            if (num1 >= num2) {
                int sum = num1 + num2;
                int diff = num1 - num2;
                System.out.println("=====================");
                System.out.println("The sum between the two numbers is: " + sum);
                System.out.println("The difference between the two numbers is: " + diff);
                System.out.println("_____________________");
            } else {
                int product = num1 * num2;
                double division = (double) num1 / num2;
                System.out.println("=====================");
                System.out.println("The product between the two numbers is: " + product);
                System.out.println("The division of the first number by the second is: " + division);
                System.out.println("_____________________");
            }
        } 
 
        //////////// Coonditional 2 ---- Completed
        public static void ConditonalEx2(Scanner scanner) {
            double[] marks = new double[3];

            System.out.print("Enter the first mark: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("No valid number provided.");
                return;
            }
            marks[0] = scanner.nextDouble();

            System.out.print("Enter the second mark: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("No valid number provided.");
                return;
            }
            marks[1] = scanner.nextDouble();

            System.out.print("Enter the third mark: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("No valid number provided.");
                return;
            }
            marks[2] = scanner.nextDouble();

            double sum = 0;
            for (double mark : marks) {
                sum += mark;
            }
            double average = sum / marks.length;

            System.out.println("=====================");
            System.out.println("Average: " + average);
            if (average >= 7.0) {
                System.out.println("El alumno es Promocionado");
            } else {
                System.out.println("El alumno es Aplazado");
            }
            System.out.println("_____________________");
        }
        //////////// Coonditional 3 ---- Completed
        public static void ConditonalEx3 (Scanner scanner) {
            System.out.print("Enter a positive number: ");
            if (!scanner.hasNextInt()) {
                System.out.println("No valid integer provided.");
                return;
            }
            int num = scanner.nextInt();
            System.out.println("=====================");
            if (num < 0) {
                System.out.println("The number is not positive.");
                return;
            }
            
            if (num > 9) {
                System.out.println("The number has two digits");
            } else {
                System.out.println("The number has one digit"); 
            }
            System.out.println("_____________________");
        }
    //////////// Coonditional 4 ---- Completed
    public static void ConditionalEx4 (Scanner scanner) {
        int[] numbers = new int[3];

        System.out.println("Enter the first number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("No valid integer provided.");
            return;
        }
        numbers[0] = scanner.nextInt();

        System.out.println("Enter the second number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("No valid integer provided.");
            return;
        }
        numbers[1] = scanner.nextInt();

        System.out.println("Enter the third number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("No valid integer provided.");
            return;
        }
        numbers[2] = scanner.nextInt();

        int largest = findLargest(numbers);
        System.out.println("=====================");
        System.out.println("The largest number is: " + largest);
        System.out.println("_____________________");
    }

    public static int findLargest(int[] arr) {
        int max = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
        
    
    