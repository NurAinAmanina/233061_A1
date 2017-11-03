
import java.io.File;
import java.io.FileNotFoundException;

public class main {
   
  public static void main(String args[]) throws Exception{
    
     FileCount f = new FileCount();
     int count = f.fc();
     int ci = CountIssue.issue();
  
     System.out.println("Number of File: "+count);
     System.out.println("Number of Issue: "+ ci);
     
  }
}