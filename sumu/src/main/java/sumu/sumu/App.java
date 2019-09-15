package sumu.sumu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        String folderPath = System.getProperty("user.dir") + "\\src\\main\\java\\Data\\";
        String fileName = "demo.txt";
        
        File file = new File(folderPath + fileName);
        FileWriter fw = new FileWriter(file, true);
        fw.write("Priyanka Kumari\n");
        fw.close();
        
        FileInputStream fis= new FileInputStream(file);
        fis.read();
        int i;
        while((i = fis.read()) != -1)
        {
        	System.out.print((char) i);
        }
        
        
    }
}
