import java.io.*;
import java.io.IOException;

public class Test1 {
     public static void main(String args[]){
    	 File f = new File("D:\\��ѧ\\��ѧ��Java����\\Test","test1.txt");
    	 System.out.println(f.getName()+"�ǿɶ�����"+f.canRead());
    	 System.out.println(f.getName()+"�ǳ���"+f.length());
    	 System.out.println(f.getName()+"�Ǿ���·��"+f.getAbsolutePath());
    	 File file = new File("new.txt");
    	 if(!file.exists()) {
    		 try {
    			  file.createNewFile();
    			  System.out.println("�����ɹ�");
    			 
    		 }
    		 catch(IOException exp) {}
    		 
    	 }
    	
     }
}