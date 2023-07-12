public class Owner{
	private String firstName;
	private String lastName;
	private int age;
	private Certificate certificate;

	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public Certificate getCertificate(){
		return certificate;
	}
	public void setCertificate(Certificate certificate){
		this.certificate = certificate;
	}
}