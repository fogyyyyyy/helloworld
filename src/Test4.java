import java.util.Scanner; 
import java.io.*;
public class Test4 {
	public static void main(String args[]) {
    	System.out.println("���뵼���ļ���ַ\n");
		Scanner a = new Scanner(System.in);
	    String A = a.nextLine();
        File sourceFile = new File(A);
        File targetFile = new File("D:\\��ѧ\\��ѧ��Java����\\Test\\test.txt");
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
        	System.out.println("�����ɹ�");
        	
        }
        catch(IOException e){
        	System.out.println("Error"+e);
        }
	}       
}

