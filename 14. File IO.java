import java.io.*;

public class phone {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("c:\\Temp\\phone.txt");
			in = new InputStreamReader(fin, "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(in);

			int c;
			
			System.out.println("c:\\Temp\\phone.txt를 출력합니다.");
			while((c = bufferedReader.read()) != -1) {
				System.out.print((char) c);
			}
			
			fin.close();
			in.close();
		}
		
		catch(IOException e){
			System.out.println("입출력 오류");
		}

	}

}
