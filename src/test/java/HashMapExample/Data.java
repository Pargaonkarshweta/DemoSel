package HashMapExample;

import java.util.HashMap;

public class Data {
	
	//public static HashMap<String,String>getUserLoginInfo();
	
	public static HashMap<String, String> getUserLoginInfo(){
		HashMap<String,String> UserMap = new HashMap<String,String>();
		UserMap.put("User", "dummyfm, passw0rd");
		
		return UserMap;
		
	}

}
