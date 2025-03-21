
package pt.upskill.domain;

import java.util.Objects;
import java.util.Scanner;

    public class CalculadoraMenu {
        public static void main(String[] args) {
            Calculadora calculadora = new Calculadora();
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                menu();
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter first number: ");
                        double num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double num2 = scanner.nextDouble();
                        calculadora.save(calculadora.sum(num1, num2));
                        System.out.printf("Result: %.2f\n", calculadora.getResult());
                        question(calculadora);
                        break;
                    case 2:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        calculadora.save(calculadora.subtraction(num1, num2));
                        System.out.printf("Result: %.2f\n", calculadora.getResult());
                        question(calculadora);
                        break;
                    case 3:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        calculadora.save(calculadora.calculateProduct(num1, num2));
                        System.out.printf("Result: %.2f\n", calculadora.getResult());
                        question(calculadora);
                        break;
                    case 4:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        try {
                            calculadora.save(calculadora.division(num1, num2));
                            System.out.printf("Result: %.2f\n", calculadora.getResult());
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        question(calculadora);
                        break;
                    case 5:
                        System.out.print("Enter base number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter exponent: ");
                        num2 = scanner.nextDouble();
                        calculadora.save(calculadora.power(num1, num2));
                        System.out.printf("Result: %.2f\n", calculadora.getResult());
                        question(calculadora);
                        break;
                    case 6:
                        System.out.print("Enter number: ");
                        int number = scanner.nextInt();
                        try {
                            calculadora.save(calculadora.calculateFactorial(number));
                            System.out.printf("Result: %.2f\n", calculadora.getResult());
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 7:
                        System.out.print("Enter number: ");
                        number = scanner.nextInt();
                        System.out.printf("Result: %.2f\n", (calculadora.isComposedByCubes(number) ? "É igual à soma do cubo dos seus algarismos" : "Não é igual à soma do cubo dos seus algarismos"));
                        break;
                    case 8:
                        System.out.print("Enter binary string: ");
                        String binaryString = scanner.next();
                        try {
                            System.out.printf("Result: %.2f\n", calculadora.binaryToDecimal(binaryString));
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 9:
                        System.out.print("Enter decimal number: ");
                        number = scanner.nextInt();
                        System.out.printf("Result: %.2f\n", calculadora.decimalToBinary(number));
                        break;
                    case 10:
                        System.out.print("Enter integer number: ");
                        num1 = scanner.nextDouble();
                        System.out.printf("Result: %.2f\n", calculadora.intToHex(num1));
                        break;
                    case 11:
                        System.out.print("Enter number: ");
                        number = scanner.nextInt();
                        System.out.println("Result: " + (calculadora.isPrime(number) ? "É primo" : "Não é primo"));
                        break;
                    case 12:
                        calculadora.erase();
                        System.out.println("Result erased.");
                        break;
                    case 13:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
                System.out.println();
            }

            scanner.close();
        }
        public static void menu() {
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
            System.out.println("12. Erase Result");
            System.out.println("13. Exit");
            System.out.print("Choose an option: ");
        }

        public static void subMenu(Calculadora calculadora) {
            System.out.println("1. Sum");
            System.out.println("2. Subtraction");
            System.out.println("3. Product");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Erase Result and Restart");
            System.out.print("\nChoose an option: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter number: ");
                    double num1 = scanner.nextDouble();
                    calculadora.save(calculadora.sum(num1));
                    System.out.printf("Result: %.2f\n", calculadora.getResult());
                    break;
                case 2:
                    System.out.println("Enter number: ");
                    num1 = scanner.nextDouble();
                    calculadora.save(calculadora.subtraction(num1));
                    System.out.printf("Result: %.2f\n", calculadora.getResult());
                    break;
                case 3:
                    System.out.println("Enter number: ");
                    num1 = scanner.nextDouble();
                    calculadora.save(calculadora.calculateProduct(num1));
                    System.out.printf("Result: %.2f\n", calculadora.getResult());
                    break;
                case 4:
                    System.out.println("Enter number: ");
                    num1 = scanner.nextDouble();
                    calculadora.save(calculadora.division(num1));
                    System.out.printf("Result: %.2f\n", calculadora.getResult());
                    break;
                case 5:
                    System.out.println("Enter number: ");
                    num1 = scanner.nextDouble();
                    calculadora.save(calculadora.power(num1));
                    System.out.printf("Result: %.2f\n", calculadora.getResult());
                    break;
                case 6:
                    calculadora.erase();
                    System.out.println("Result erased.");
                    break;
            }
        }

        public static void question(Calculadora calculadora) {
            Scanner scanner = new Scanner(System.in);
            boolean keepGoing = true; // Loop continuará enquanto o usuário desejar.

            while (keepGoing) {
                System.out.println("Do you want to save the result? (Y/N): ");
                String answer = scanner.nextLine().toUpperCase();

                if (answer.startsWith("N")) {
                    keepGoing = false; // Sai do loop.
                } else if (answer.startsWith("Y")) {
                    subMenu(calculadora); // Chama o submenu para continuar com o resultado.
                } else {
                    System.out.println("Invalid input. Please enter 'Y' or 'N'.");
                }
            }
        }
    }


