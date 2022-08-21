package week3.day1assignments;


class Students{
	public void getStudentInfo(int id) {
		System.out.println("Student Id :  " +id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id :  "+id);
		System.out.println("Student Name : " +name);
	}
	public void getStudentInfo(String email, int phoneNo) {
		System.out.println("Email  :   " +email);
		System.out.println("PhoneNo: "  +phoneNo);
	}
}
public class StudentsInfo {
    public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(1234);
		obj.getStudentInfo(1111,"xxxxx");
		obj.getStudentInfo("abc@gmail.com", 123456789);
	}
}
