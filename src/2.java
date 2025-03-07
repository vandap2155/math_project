import java.util.Random;

public class MathProject {
  public static void main(String[] args) {
    Random random = new Random();
    int number1 = random.nextInt(10);
    int number2 = random.nextInt(10);
    System.out.println("Random numbers: " + number1 + ", " + number2);
  }
}
