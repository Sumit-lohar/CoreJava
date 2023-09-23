package Com.objectReutrn;

public class Student {
  String sname ;
  int roll;
  double fees;
  
  
public Student(String sname, int roll, double fees) {
	super();
	this.sname = sname;
	this.roll = roll;
	this.fees = fees;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
@Override
public String toString() {
	return "Student [sname=" + sname + ", roll=" + roll + ", fees=" + fees + "]";
}
  
  

  
  
}
