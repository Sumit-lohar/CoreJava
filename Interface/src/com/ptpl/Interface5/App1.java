package com.ptpl.Interface5;

public class App1 {

	public static void main(String[] args) {

		MyDatabase m;

		m = new MongoDB();
		m.coneect();
		m = new MySql();
		m.coneect();
		m = new Oracle();
		m.coneect();
	}

}
