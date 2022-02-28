package StudentMnsys;


import java.util.Scanner;

public class Student {
	long Enr_no;
	String name;
	String email;
	String gender;
	String location;
	String age;
	String father_name;
	String mother_name;
	String DOB;
	String contact_no;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long Enr_no, String name, String email, String contact_no) {
		super();
		this.Enr_no = Enr_no;
		this.name = name;
		this.email = email;
		this.contact_no = contact_no;
	}
	
		public Student(long enr_no) {
		super();
		Enr_no = enr_no;
	}
		public Student(long enr_no, String name, String email, String gender, String location, String age,
				String father_name, String mother_name, String dOB, String contact_no) {
			super();
			Enr_no = enr_no;
			this.name = name;
			this.email = email;
			this.gender = gender;
			this.location = location;
			this.age = age;
			this.father_name = father_name;
			this.mother_name = mother_name;
			DOB = dOB;
			this.contact_no = contact_no;
		}
		
		
		public Student(String name, String email, String gender, String age, String dOB, String father_name,
				String mother_name, String location, String contact_no) {
			this.name = name;
			this.email = email;
			this.gender = gender;
			this.location = location;
			this.age = age;
			this.father_name = father_name;
			this.mother_name = mother_name;
			DOB = dOB;
			this.contact_no = contact_no;
			
			// TODO Auto-generated constructor stub
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getFather_name() {
			return father_name;
		}
		public void setFather_name(String father_name) {
			this.father_name = father_name;
		}
		public String getMother_name() {
			return mother_name;
		}
		public void setMother_name(String mother_name) {
			this.mother_name = mother_name;
		}
		public String getDOB() {
			return DOB;
		}
		public void setDOB(String dOB) {
			DOB = dOB;
		}
		public long getEnr_no() {
		return Enr_no;
	}
	public void setEnr_no(long enr_no) {
		
		this.Enr_no = enr_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	
	@Override
	public String toString() {
		return "Student [Enr_no=" + Enr_no + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ ", location=" + location + ", age=" + age + ", father_name=" + father_name + ", mother_name="
				+ mother_name + ", DOB=" + DOB + ", contact_no=" + contact_no + "]";
	}
	
		

	

public  Student insert() {
	  
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("WELCOME TO STUDENT MANAGEMENT SYSTEM");
	System.out.println("enter the student name");
	  name = scanner.nextLine();
	System.out.println("enter the student email_id");
    email = scanner.nextLine();
    System.out.println("enter the gender");
    gender = scanner.nextLine();
    System.out.println("enter the student age");
    age = scanner.nextLine();
    System.out.println("enter the date of birth");
    DOB = scanner.nextLine();
    System.out.println("enter the fathername");
    father_name = scanner.nextLine();
    System.out.println("enter the student mother_name");
    mother_name = scanner.nextLine();
    System.out.println("enter the student location");
    location = scanner.nextLine();
	System.out.println("enter the student contact_no");
	 contact_no = scanner.nextLine();
	 
    	



	return new Student(name,email,gender,age,DOB,father_name,mother_name,location,contact_no);

	
}}