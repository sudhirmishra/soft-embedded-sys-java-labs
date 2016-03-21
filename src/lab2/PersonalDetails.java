package lab2;

public class PersonalDetails {
	private String name;
	private String address;
	
	public PersonalDetails(String name, String addr){
		this.name = name;
		this.address = addr;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String toString(){
		return "Name: " +name + ", Address: " + address;
	}
}
