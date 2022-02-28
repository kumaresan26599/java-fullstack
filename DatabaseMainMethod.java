package StudentMnsys;


import java.util.Scanner;

public class DatabaseMainMethod {
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);	
		System.out.println("enter how many students to show");
		int a =scan.nextInt();
		Student t= new Student();
		Course t1 = new Course();
		FeePayment t2 =new FeePayment();
		for(int i=0;i<=a;i++) {
		t.setEnr_no((int)(Math.random()*100000));
		t.insert();
		t1.enroll();
		t2.insert();
		System.out.println(t);
		System.out.println(t1);

System.out.println(t2);
		}
}
}