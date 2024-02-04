package Login;
import java.util.HashMap;
public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Pawatpai","12ab34pawat");
		logininfo.put("Petshop","password");
		
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}
