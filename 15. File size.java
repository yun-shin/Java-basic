import java.io.File;

public class bigFile {	
	
	public static void listDirectory(File dir) {
		File[] all = dir.listFiles();
		
		long bigger = 0, name = 0, t;
		
		for(int i=0; i<all.length; i++) {
			File f = all[i];
				
			if(f.length() > bigger){
				bigger = f.length();
				name = i;
			}		
		}
		t = all[(int)name].lastModified();
			
		System.out.print("���� ū ������");
		System.out.print("\t" + all[(int)name].getPath());
		System.out.print("\t\t" + all[(int)name].length() + " ����Ʈ");
	}
	
	public static void main(String[] args) {
		listDirectory(new File("c:\\"));
	}
}

