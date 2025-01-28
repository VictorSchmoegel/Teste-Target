import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
    int numero = scanner.nextInt();

    if (isFibonacci(numero)) {
      System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
    } else {
      System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
    }

    scanner.close();
  }

  public static boolean isFibonacci(int num) {
    if (num < 0)
      return false;
    int a = 0, b = 1;

    while (a <= num) {
      if (a == num)
        return true;
      int temp = a + b;
      a = b;
      b = temp;
    }

    return false;
  }
}
