package files_examples;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesExamples {
    public static void main(String[] args) {
        String folderPath = "./data";
        Path dataFile = Paths.get(folderPath, "betelgeuse.txt");
        List<String> lines;
        System.out.println(dataFile.toAbsolutePath());
        try {
//            if (Files.notExists(Paths.get(folderPath)))
//                Files.createDirectory(Paths.get(folderPath));
            if (Files.exists(dataFile)) {
                lines = Files.readAllLines(dataFile);
                for (String line : lines) {
                    System.out.println(line);
                }
                lines.add("Started: May 28, 2019");
                lines.add("Graduated: October 8, 2019");

                Files.write(dataFile, lines, StandardOpenOption.APPEND);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Finished");
//        if (Files.exists(dataFile))
//            System.out.println("Lookie there");
//        else System.out.println("No file found");
    }
}
