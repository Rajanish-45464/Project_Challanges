package demo;

public class StudentDetails {
	private String name;
	private int id;
	private String address;
	
	
	//this is getter and setter mathods
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	//this is constructors
	
	public StudentDetails(String name, int id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public StudentDetails() {
		super();
	}
}
