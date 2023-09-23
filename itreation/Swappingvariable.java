package itreation;

public class Swappingvariable {

	public static void main(String[] args) {
         int a=20,b=30 ,t;
         
         System.out.println("Before swapping a="+ a+"b="+b);
         
         // without using t
//         a=a+b;
//         b=a-b;
//         a=a-b;
         
         t=a;
         a=b;
         b=t;
         
         System.out.println("After the swapping a="+a+"b="+b);
	}

}
