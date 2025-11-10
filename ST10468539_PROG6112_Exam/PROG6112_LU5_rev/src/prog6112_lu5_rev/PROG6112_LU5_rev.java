
package prog6112_lu5_rev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

public class PROG6112_LU5_rev {

    public static void main(String[] args) {
        // TODO code application logic here
        try { 
            BufferedWriter file = new BufferedWriter (new FileWriter ("file.txt")); 
            //PrintWriter file = new PrintWriter("file.txt"); 
            file.write("a record\n"); 
            file.write("another record"); 
            file.close(); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        }
        
        try (BufferedReader file = new BufferedReader (new FileReader ("file.txt"))) { 
            String record; 
            
            while ((record = file.readLine()) != null) {
                String[] parts = record.split(","); 
                
                String name = parts[0]; 
                int grade = Integer.parseInt(parts[1]); 
            }
        } catch (IOException e) { 
            e.printStackTrace(); 
        }
        
        try (RandomAccessFile file = new RandomAccessFile("file.txt", "rw")) { 
            file.writeUTF("ben");
            file.writeInt(22);
        } catch (IOException e) { 
            e.printStackTrace(); 
        }
        
        try (RandomAccessFile file = new RandomAccessFile("file.txt", "r")) { 
            file.seek(file.readUTF().length() +2);
            
            String name = file.readUTF(); 
            int age = file.readInt(); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        }
        
        /*
        file.getFilePointer(); 
        file.length(); 
        file.seek(position); 
        
        IOException 
        EOFException 
        FileNotFoundException
        NumberFormatException 
        */
    }
    
}

/*
filewriter/reader 
bufferedwriter/reader 
printwriter 
randomaccessfile
*/