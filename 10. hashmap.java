import java.util.*;

public class number2 {

	public static void main(String[] args) {
		HashMap<String, String> word = new HashMap<String, String>();
		
		word.put("head", "머리");
		word.put("teacher", "선생님");
		word.put("cat", "고양이");
		word.put("aunt", "아주머니");
		word.put("noodle", "국수");
		word.put("child", "아이");

		
		 for(String key : word.keySet()){
			 
	            String value = word.get(key);
	 
	            System.out.print(key + " = " + value + "       ");
	 
	        }
	}

	
}
