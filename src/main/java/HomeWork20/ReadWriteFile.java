package HomeWork20;

import java.io.IOException;

public interface ReadWriteFile {
    String readFile() throws IOException;
    void writeToFile(String msg) throws IOException;
}
