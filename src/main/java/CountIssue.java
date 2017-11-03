
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;

/**
 Semester: A171 
 * Course: STIW3054 
 * Group: A 
 * Task: Assignment 1 
 * Matric: 233061
 * Name: NurAinAmanina
 */

public class CountIssue {

    public static int issue() throws IOException {
        
        String target_dir = "C:\\Users\\admin\\Desktop\\TestFileAsg1";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        int count=0;
        for (File f : files) {
            if(f.isFile()) {
                BufferedReader inputStream = null;

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                       if (line.contains("public static void main")){
                           count++;
                       }
                    }
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } 
            }
        }
      //  System.out.println("Number of issue: "+ count );
        return count;
    }

}