import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a string a ser invertida: ");
    String input = scanner.nextLine();
    scanner.close();

    String reversed = inverterString(input);

    System.out.println("String invertida: " + reversed);
  }

  public static String inverterString(String str) {
    String invertida = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      invertida += str.charAt(i);
    }

    return invertida;
  }
}
