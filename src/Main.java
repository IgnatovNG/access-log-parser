import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        while (true) {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            boolean isFile = file.isFile();
            if (isDirectory || !fileExists) {
                System.out.println("Файл не существует или указан путь к папке");
                continue;
            }
            if (isFile) {
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + count);
                count++;
            }
        }
    }
}