package StudentMnsys;

import java.util.Scanner;

public class Course {
String course_id;
String course_name;
String duration;
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(String course_id, String course_name, String duration) {
	super();
	this.course_id = course_id;
	this.course_name = course_name;
	this.duration = duration;
}
public String getCourse_id() {
	return course_id;
}
public void setCourse_id(String course_id) {
	this.course_id = course_id;
}
public String getCourse_name() {
	return course_name;
}
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "Course Details :\n  course_id=  "+ course_id+"\n" + " course_name=" + course_name+"\n" + ", duration=" + duration ;
}
public Course enroll() {
	Scanner scan =  new Scanner(System.in);
	System.out.println("enter the course id");
	course_id = scan.nextLine();
	System.out.println("enter the course name");
	course_name = scan.nextLine();
	System.out.println("enter the course duration");
	duration= scan.nextLine();
	return new Course (course_id,course_name,duration);
	
}
}