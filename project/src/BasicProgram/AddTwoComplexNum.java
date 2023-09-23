package BasicProgram;

public class AddTwoComplexNum {

	int real, image;

	public AddTwoComplexNum(int r, int i) {
		this.real = r;
		this.image = i;
	}

	void display() {
		System.out.println(this.real + " i" + this.image);
	}

	public static AddTwoComplexNum add(AddTwoComplexNum n1, AddTwoComplexNum n2) {

		AddTwoComplexNum c = new AddTwoComplexNum(0, 0);

		c.real = n1.real + n2.image;

		c.image = n1.real + n2.image;

		return c;

	}

	public static void main(String[] args) {

		AddTwoComplexNum c1 = new AddTwoComplexNum(4, 5);

		AddTwoComplexNum c2 = new AddTwoComplexNum(10, 5);

		System.out.println("frist complex num: ");

		c1.display();

		System.out.println("Second complex num: ");
		c2.display();

		AddTwoComplexNum c = add(c1, c2);

		System.out.println("Addition is");

		c.display();

	}

}
