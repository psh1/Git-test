package ru.psh1.test;

public class Main {

	public static void main(String[] args) {
		Test1 r = new Test1();
		r.Scan();
		r.i = count(r.i);
		r.k = count(r.k);
		r.Scan(r.i, r.k);

	}

	private static int count(int x) {
		x++;
	
		return x;
	}

}
