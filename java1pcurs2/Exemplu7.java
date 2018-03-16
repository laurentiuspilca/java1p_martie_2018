import java.io.*;

public class Exemplu7 {

    public static void main(String [] args) {
        File file = new File("B");
        deleteFile(file);
    }
    
    private static void deleteFile(File file) {
        File [] files = file.listFiles();
        
        for (File f : files) {
            if (f.isFile()) {
                f.delete();
            } else {
                deleteFile(f);
            }
        }
        
        file.delete();
    }
}