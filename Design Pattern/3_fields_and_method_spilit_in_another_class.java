class Address{
    

    private String street = "";
	private String city = "";
	private String state = "";
	private int postalCode = 0;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	
	public Address(String street,String city, String state, int postalCode) {
		super();
		this.street=street;
		this.city=city;
		this.state=state;
		this.postalCode=postalCode;
	}
	
	public String toString(){
	    
	    return getStreet()+" "+getCity()+" "+getState()+" "+getPostalCode();
	}
	
	
	
}

class Birthday{
    
    private int day;
    private int month;
    private int year;
    
    public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
    public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
    public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}	
	
	public Birthday(int day, int month, int year) {
		super();
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString(){
	    
	    return getDay()+"/"+getMonth()+"/"+getYear();
	}
	
}



public class Customer {
	
	private String firstName = "";
	private String lastName = "";
	private Birthday birthday = null;
	private Address address=null;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Customer(String firstName, String lastName, Address address ,Birthday birthday) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address=address;
		this.birthday=birthday;
	}
	public String toString(){
	    
	    return getFirstName()+" "+getLastName();
	}
	
	
	public static void main(String[] args){
	
	    Address sallySmithAddress = new Address("123 Main St","Perry","Iowa",50220);
	    
	    Birthday sallySmithBirthday = new Birthday(12,12,1974);
	    
	    Customer sallySmith =new Customer("Sally" ,"Smith", sallySmithAddress,sallySmithBirthday);
	    
	    System.out.println(sallySmith);
	    System.out.println(sallySmith.address);
	    System.out.println(sallySmith.birthday);
	}
}
