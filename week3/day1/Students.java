package week3.day1;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("ID : " +id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("ID : "+id+" Name : "+name);
	}
	public void getStudentInfo(String email, int phoneNumber)
	{
		System.out.println("Email : "+email+ " PhoneNumber : " +phoneNumber);
	}
	public static void main(String[] args) {
		
		Students stud = new Students();
		stud.getStudentInfo(12345);
		stud.getStudentInfo(1234, "Lavanya");
		stud.getStudentInfo("abc@gmail.com", 123456780);
	}

}
