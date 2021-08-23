package week3.day1;

public class Students {
	
	public void getStudentInfo() {
		System.out.println("Student Details");

	}
	
	public void getStudentInfo(int studId) {
		System.out.println("Student Id: " +studId);
	}
	
	public void getStudentInfo(int studId, String name) {
		System.out.println("Student Id: "+studId +", Student Name: "+name);

	}
	
	public void getStudentInfo(String email, long phoneNo) {
		System.out.println("Student Phone Number: "+phoneNo +", Student Email: "+email);
	}
	
	public static void main(String[] args) {
		Students studentObj = new Students(); 
		studentObj.getStudentInfo();
		studentObj.getStudentInfo(1001);
		studentObj.getStudentInfo(1002, "Nisha");
		studentObj.getStudentInfo("abc@gmail.com", 645678921);
		
		
	}

}
