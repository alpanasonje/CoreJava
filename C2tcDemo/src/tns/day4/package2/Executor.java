// accessing different package class
package tns.day4.package2;

import tns.day4.package1.Base;

public class Executor {
	public static void main(String[] args) {

		Base b1 = new Base();
		
		// private, default and protected members can't access

		/*
		 * b1.varPrivate=21; b1.methodPrivate(); b1.varDefault=11; b1.methodDefault();
		 * b1.varProtected=31; b1.methodProtected();
		 */

		b1.methodPublic();
		b1.varPublic = 21;
		b1.methodPublic();

	}
}
