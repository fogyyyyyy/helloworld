import java.io.*;
import java.io.IOException;

public class Test1 {
     public static void main(String args[]){
    	 File f = new File("D:\\大学\\尚学堂Java程序\\Test","test1.txt");
    	 System.out.println(f.getName()+"是可读的吗"+f.canRead());
    	 System.out.println(f.getName()+"是长度"+f.length());
    	 System.out.println(f.getName()+"是绝对路径"+f.getAbsolutePath());
    	 File file = new File("new.txt");
    	 if(!file.exists()) {
    		 try {
    			  file.createNewFile();
    			  System.out.println("创建成功");
    			 
    		 }
    		 catch(IOException exp) {}
    		 
    	 }
    	
     }
}