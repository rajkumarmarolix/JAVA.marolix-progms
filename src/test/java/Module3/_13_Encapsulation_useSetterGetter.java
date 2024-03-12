package Module3;

public class _13_Encapsulation_useSetterGetter {
	
	private long mobno;  
	private String pwd;
	

	public long getMobno() {    // right click program ,-click onsource,-click on setterand getter,- Finish
		return mobno;
	}


	public void setMobno(long mobno) {  //-click on setterand getter by deafult it take agruments in set method
		this.mobno = mobno;
		System.out.println(mobno);
	}


	public String getPwd() {       //in getter method arguments are not access
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
		System.out.println(pwd);
	}


	public static void main(String[] args) {
	_13_Encapsulation_useSetterGetter egs = new _13_Encapsulation_useSetterGetter(); // object
	      egs.setMobno(7893999789l); // use long use last L
	      egs.setPwd("Raj kumar");
	
	}

}
