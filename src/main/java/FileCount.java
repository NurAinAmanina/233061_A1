
import java.io.File;

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