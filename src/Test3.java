import java.util.Scanner;
import java.io.*;
public class Test3 {
	public static void main(String args[]) {
	       File sourceFile = getFile();
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


public static File getFile() {
	System.out.println("���뵼���ļ���ַ");
	Scanner a = new Scanner(System.in);
    while(true){
        String A = a.nextLine();
        File sourceFile = new File(A);
        if(!sourceFile.exists()){
            System.out.println("�ļ�·�������ڣ����䣺");
        }else if(sourceFile.isDirectory()){
            System.out.println("��������ļ��У����䣺");
        }else {
            return sourceFile;
        }
    }
   }

}

