package sayHi;

public class Person {
	String firstName;
	String lastName;
	int age;
	/**
	 * @param firstName - first name
	 * @param lname - last name
	 * @param age   - age of person in years
	 */
	public Person(String fname, String lname, int age) {
		super();
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person: " + firstName + " " + lastName + ", " + age;
	}
	/**
	 * @return the firstName
	 */
	public String getFname() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFname(String fname) {
		this.firstName = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lastName;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lastName = lname;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person makePerson(Person that) throws UnderAgeException {
		if(this.age<18 || that.getAge()<18) {
			throw new UnderAgeException();
		}
		Person child = new Person(this.firstName, that.getLname(),0);
		return child;
	}
	
	public static void main(String[] args) {
		Person r = new Person("Romeo","Montegeux",11);
		System.out.println("R, " + r);
		System.out.println(Math.PI);
	}

}
