public class Main {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;
    int resultado = sumarNumeros(a, b, c);
    System.out.println("La suma de los números es: " + resultado);
  }

  public static int sumarNumeros(int num1, int num2, int num3) {
    int suma = num1 + num2 + num3;
    return suma;
  }
}
