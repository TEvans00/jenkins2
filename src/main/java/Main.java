import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    System.out.println("Welcome to the calculator");
    System.out.println("Enter a command:");

    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNext()) {
      String command = scanner.next();
      if (command.equals("add")) {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(calculator.add(num1, num2));
      }
      else if (command.equals("subtract")) {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(calculator.subtract(num1, num2));
      }
      else if (command.equals("multiply")) {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(calculator.multiply(num1, num2));
      }
      else if (command.equals("divide")) {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(calculator.divide(num1, num2));
      }
      else if (command.equals("fibonacci")) {
        int num = scanner.nextInt();
        System.out.println(calculator.fibonacciNumberFinder(num));
      }
      else if (command.equals("binary")) {
        int num = scanner.nextInt();
        System.out.println(calculator.intToBinaryNumber(num));
      }
      else if (command.equals("exit")) {
        break;
      }
      else {
        System.out.println("Command unrecognized.");
      }
    }
  }
}
