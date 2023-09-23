package Com.objectReutrn;

public class ObjectReturn1 {

	
	  public static void updatefees(Student s) {
//	  System.out.println("before updatingfees is "+s.getFees());
//	  
	  s.fees = s.fees+10*s.fees/100; // s.fees = s.fees+10+120*s.fees/12;
	  
	  s.sname = "mr."+s.sname;
	  
	  s.roll = 2+s.roll;
	  
//	  System.out.println("After updatingfees is "+s.getFees());
//	  System.out.println("After updating name "+s.getSname());
//	  System.out.println("After updateing roll number "+s.getRoll()); 
	  
	  }
	  
	/*
	 * public static void updatename(Student n) {
	 * System.out.println("before updatingfees is "+n.getSname());
	 * 
	 * n.sname = "mr."+n.sname;
	 * 
	 * System.out.println("After the change name:"+n.getSname()); }
	 */
	 
	public static void main(String[] args) {

		ObjectReturn1 o = new ObjectReturn1();

		Student s1 = new Student("sumit", 1, 1200.0);
		Student s2 = new Student("rohit", 1, 1300.0);
		Student s3 = new Student("aniket", 1, 1400.0);
		Student s4 = new Student("amit", 1, 1500.0);

		updatefees(s1);	

		System.out.println(s1.toString());

	}

}
