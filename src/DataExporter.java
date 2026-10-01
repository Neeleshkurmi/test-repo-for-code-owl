import java.io.FileWriter;
import java.io.IOException;

public class DataExporter {
    public void exportData(String path, String data) {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(data);
            writer.close();
        } catch (Exception e) {
            
        }
    }