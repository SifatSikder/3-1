package workship_plainText_to_html;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader implements  Reader{

    @Override
    public String read() throws IOException {
        return new String(Files.readAllBytes(Paths.get("sample.txt")));
    }
}
