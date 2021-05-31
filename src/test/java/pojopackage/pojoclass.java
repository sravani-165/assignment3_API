package pojopackage;

public class pojoclass {

//convert json bod to pojo using the website https://www.freecodeformat.com/json2pojo.php
	private String stream;

	private String firstname;

	private String lastname;

	private int id;

	public void setStream(String stream){
		this.stream = stream;
	}
	public String getStream(){
		return this.stream;
	}
	public void setFirstname(String firstname){
		this.firstname = firstname;
	}
	public String getFirstname(){
		return this.firstname;
	}
	public void setLastname(String lastname){
		this.lastname = lastname;
	}
	public String getLastname(){
		return this.lastname;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
}

