package getterNsetter;

public class Students {

	// this is the body of the code
	// so the body parts are the privates.
	private String name;
	private double classNo;
	private int age;

	// setters
	public void setName(String name) {// the void keyword is the method set
										// name, which is setName.
		// that then takes an argument, which is name, which returns nothing
		// hence the VOID.
		this.name = name;// in the method you have the this keyword, which is an
							// instance of name.
	}

	public void setClassNo(double classNo) {
		this.classNo = classNo;
	}

	public void setAge(int age) {
		if (age >= 11 || age <= 17) {
			this.age = age;
		} else {
			System.out.println("Error: you are not a school student.");
		}
	}

	// getter
	public String getName() {
		return name;
	}

	public double getClassNo() {
		return classNo;
	}

	public int getAge() {
		return age;
	}

}
