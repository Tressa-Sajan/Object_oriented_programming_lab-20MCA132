//2,39.Write a program to write to a file, then read from the file and display the contents on the console. 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class read{
    public static void main(String[] args) throws IOException {
            FileWriter writer = new FileWriter("co6q2.txt",true);
            writer.write("new file is created");
            writer.close();
            FileReader reader = new FileReader("co6q2.txt");
            BufferedReader br = new BufferedReader(reader);
            String line;
            System.out.println("Data read from the file");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }
    }
