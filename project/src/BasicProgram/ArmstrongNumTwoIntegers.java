package BasicProgram;

public class ArmstrongNumTwoIntegers {

	public static void main(String[] args) {
		int num = 373, O, R, result = 0;

		O = num;

		while (O != 0) {
			R = O % 10;
			result += Math.pow(R, 3);
			O /= 10;
		}

		if (result == num)
			System.out.println(num + " is armstrong");
		else
			System.out.println(num + "is not armstrong");
	}

}
