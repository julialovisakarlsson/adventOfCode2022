import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class calorieCounting {
  static List<Integer> elvesTotalCalories = new ArrayList<>();

  private static void readInput() throws IOException {
    String line;
    int sum = 0;

    BufferedReader br = new BufferedReader(new FileReader("lucka1/input.txt"));

    while ((line = br.readLine()) != null) {
      if (!line.isBlank()) {
        sum += Integer.parseInt(line);
      } else {
        elvesTotalCalories.add(sum);
        sum = 0;
      }

    }

  }

  public static void main(String[] args) throws IOException {
    readInput();
    Object[] result = elvesTotalCalories.stream().sorted().toArray();

    System.out.println("Del 1:");
    System.out.println(result[elvesTotalCalories.size()-1]);

    System.out.println("Del 2:");
    int sum = 0;
    for (int i = 1; i < 4; i++) {
      sum += (Integer) result[elvesTotalCalories.size()-i];
    }
    System.out.println(sum);
  }
}