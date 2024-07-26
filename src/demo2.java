import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCount = 0;

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }

        System.out.println(wordCount);
        scanner.close();
    }
}

