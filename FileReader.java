import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader
{
    private String textFromFile;

    public String getTextFromFile(String pathToFile) throws IOException
    {
        textFromFile = null;
        Path path = Paths.get(pathToFile);

        try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8);)
        {
            textFromFile = stream.collect(Collectors.joining(System.lineSeparator()));
        }

        return textFromFile;
    }
}
