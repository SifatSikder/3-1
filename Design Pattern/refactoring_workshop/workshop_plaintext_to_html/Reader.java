package workship_plainText_to_html;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public interface Reader {
    String read() throws IOException;
}
