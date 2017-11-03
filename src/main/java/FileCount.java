
import java.io.File;

/**
 Semester: A171 
 * Course: STIW3054 
 * Group: A 
 * Task: Assignment 1 
 * Matric: 233061
 * Name: NurAinAmanina
 */

public class FileCount {
    
    public static int fc(){

    // File[] listFiles() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
  
    File directory=new File("C:\\Users\\admin\\Desktop\\TestFileAsg1");
    int fileCount=directory.list().length;
        return fileCount;
  
}
}