package pt.upskill.domain;

import java.util.Scanner;

    public class CalculadoraMenu {
        public static void main(String[] args) {
            Calculadora calculadora = new Calculadora();
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("Menu:");
                System.out.println("1. Sum");
                System.out.println("2. Subtraction");
                System.out.println("3. Product");
                System.out.println("4. Division");
                System.out.println("5. Power");
                System.out.println("6. Calculate Factorial");
                System.out.println("7. Check if Number is Composed by Cubes");
                System.out.println("8. Convert Binary to Decimal");
                System.out.println("9. Convert Decimal to Binary");
                System.out.println("10. Convert Integer to Hex");
                System.out.println("11. Check if Number is Prime");
                System.out.println("12. Save Result");
                System.out.println("13. Erase Result");
                System.out.println("14. Exit");
                System.out.print("\nChoose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter first number: ");
                        double num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double num2 = scanner.nextDouble();
                        System.out.println("Result: " + calculadora.sum(num1, num2));
                        break;
                    case 2:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + calculadora.subtraction(num1, num2));
                        break;
                    case 3:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + calculadora.calculateProduct(num1, num2));
                        break;
                    case 4:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        try {
                            System.out.println("Result: " + calculadora.division(num1, num2));
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.print("Enter base number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter exponent: ");
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + calculadora.power(num1, num2));
                        break;
                    case 6:
                        System.out.print("Enter number: ");
                        int number = scanner.nextInt();
                        try {
                            System.out.println("Result: " + calculadora.calculateFactorial(number));
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 7:
                        System.out.print("Enter number: ");
                        number = scanner.nextInt();
                        System.out.println("Result: " + calculadora.isComposedByCubes(number));
                        break;
                    case 8:
                        System.out.print("Enter binary string: ");
                        String binaryString = scanner.next();
                        try {
                            System.out.println("Result: " + calculadora.binaryToDecimal(binaryString));
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 9:
                        System.out.print("Enter decimal number: ");
                        number = scanner.nextInt();
                        System.out.println("Result: " + calculadora.decimalToBinary(number));
                        break;
                    case 10:
                        System.out.print("Enter integer number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Result: " + calculadora.intToHex(num1));
                        break;
                    case 11:
                        System.out.print("Enter number: ");
                        number = scanner.nextInt();
                        System.out.println("Result: " + calculadora.isPrime(number));
                        break;
                    case 12:
                        System.out.print("Enter result to save: ");
                        double result = scanner.nextDouble();
                        calculadora.save(result);
                        System.out.println("Result saved.");
                        break;
                    case 13:
                        calculadora.erase();
                        System.out.println("Result erased.");
                        break;
                    case 14:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
                System.out.println();
            }

            scanner.close();
        }
    }


