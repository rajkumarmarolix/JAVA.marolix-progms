package practice;

public class Encap {
	private String username;
	private int pwd;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
		System.out.println(username);
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
		System.out.println(pwd);
	}
	
public static void main(String[] args) {
 Encap en	=new Encap();
 en.setUsername("raj");
 en.setPwd(12345);
}
}
