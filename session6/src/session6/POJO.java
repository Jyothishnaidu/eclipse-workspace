package session6;

// POJO -> Plain Old Java Object
//Spring FW -> Bean
//Industrially in a standard way it is -> Model
class Patient{
	
	private String name;
	private int age;
	private String disease;
		
	Patient() {
	}

	Patient(String name, int age, String disease) {
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getDisease() {
		return disease;
	}

	void setDisease(String disease) {
		this.disease = disease;
	}
	
}


public class POJO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
