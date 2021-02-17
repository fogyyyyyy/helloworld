import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
 
public class test5 {
	public static void main(String[] args) throws IOException {
		//1.键盘对象
		Scanner sc = new Scanner(System.in);
		//2.创建输出流对象，关联test.txt
		FileOutputStream fos = new FileOutputStream("text.txt");
		
		//3.定义无限循环
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				break;
			}else {
				fos.write(line.getBytes()); //字符串转换字节
				fos.write("\r\n".getBytes()); //换行
			}
		}
		
		fos.close();
		
	}
 
}