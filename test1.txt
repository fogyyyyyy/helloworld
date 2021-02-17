import java.util.Scanner; 
import java.io.*;
public class Test4 {
	public static void main(String args[]) {
    	System.out.println("输入导入文件地址\n");
		Scanner a = new Scanner(System.in);
	    String A = a.nextLine();
        File sourceFile = new File(A);
        File targetFile = new File("D:\\大学\\尚学堂Java程序\\Test\\test.txt");
        char c[] =new char[19];
        try {
        	Writer out = new FileWriter(targetFile,true);
        	Reader in =new FileReader(sourceFile);
        	int n=-1;
        	while((n=in.read(c))!=-1) {
        		out.write(c,0,n);
        	}
        	out.flush();
        	out.close();
        	System.out.println("拷贝成功");
        	
        }
        catch(IOException e){
        	System.out.println("Error"+e);
        }
	}       
}

