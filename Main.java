package getterNsetter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// these are the Student objects.
		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();

		// doing s2.name="mike"; is wrong as name is set to private.
		// for this to work you need to set a getter. In Student.
		s1.setName("Shakar");
		s1.setAge(14);
		s1.setClassNo(1.50);

		s2.setName("Mike");
		s2.setAge(16);
		s2.setClassNo(3.12);

		s3.setName("Dave");
		s3.setAge(12);
		s3.setClassNo(0.45);

		System.out.println(s1.getName() + " whom is " + s1.getAge() + " and is in class " + s1.getClassNo());
		System.out.println(s2.getName() + " whom is " + s2.getAge() + " and is in class " + s2.getClassNo());
		System.out.println(s3.getName() + " whom is " + s3.getAge() + " and is in class " + s3.getClassNo());
	}

}
