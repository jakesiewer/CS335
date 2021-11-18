import java.util.ArrayList;
import java.util.*;
public class User {
	
	private String userName;
	private String level;
	private AccessControl accessControl;
	
	public static ArrayList<User> userArr = new ArrayList<User>();
	public int count = 0;

	public User(String userName,String level, AccessControl accessControl){
		this.userName = userName;
		this.level = level;
		this.accessControl = accessControl;
		
		setArray();
		getArray();
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public AccessControl getAccessControl() {
		return accessControl;
	}
	public void setAccessControl(AccessControl accessControl) {
		this.accessControl = accessControl;
	}
	
	public void setArray() 
	{
		boolean bool = true;
		for (int i = 0; i < userArr.size(); i++) 
		{
			if (userArr.get(i).userName.equals(userName)) 
			{
				bool = false;
			}
		}
		
		if (bool) 
		{
			userArr.add(this); // adds name and position to array

		} 
		
		else 
		{
			count++;
			System.out.println("DUPLICATE NAME: " + count);
		}

	}

	public void getArray()
	{
		if (level.equals("SUPERUSER Level")) 
		{
			System.out.println(Arrays.toString(userArr.toArray()));
		} 
		
		else 
		{
			System.out.println("error, not SUPERUSER");
		}
	}
	
	@Override
	public String toString(){
		return "Name: "+userName+", Level: "+level+", Access Control Level:"+accessControl.getControlLevel()+", Access: "+accessControl.getAccess() + "\n";
	}
	
}