import java.util.*;

public class number2 {

	public static void main(String[] args) {
		HashMap<String, String> word = new HashMap<String, String>();
		
		word.put("head", "�Ӹ�");
		word.put("teacher", "������");
		word.put("cat", "�����");
		word.put("aunt", "���ָӴ�");
		word.put("noodle", "����");
		word.put("child", "����");

		
		 for(String key : word.keySet()){
			 
	            String value = word.get(key);
	 
	            System.out.print(key + " = " + value + "       ");
	 
	        }
	}

	
}
