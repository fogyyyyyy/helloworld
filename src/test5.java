import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
 
public class test5 {
	public static void main(String[] args) throws IOException {
		//1.���̶���
		Scanner sc = new Scanner(System.in);
		//2.������������󣬹���test.txt
		FileOutputStream fos = new FileOutputStream("text.txt");
		
		//3.��������ѭ��
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				break;
			}else {
				fos.write(line.getBytes()); //�ַ���ת���ֽ�
				fos.write("\r\n".getBytes()); //����
			}
		}
		
		fos.close();
		
	}
 
}