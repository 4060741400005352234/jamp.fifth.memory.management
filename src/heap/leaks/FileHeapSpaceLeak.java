package heap.leaks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileHeapSpaceLeak {

    private static String fileName = "D:/file.txt";
    private static int lineCounter;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
        try {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(++lineCounter);
            }
        } finally {
            br.close();
        }
    }
}
