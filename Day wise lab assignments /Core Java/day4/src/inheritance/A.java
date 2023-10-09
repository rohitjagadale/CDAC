package inheritance;

public class A /* extends Object */ {
	A() {
		//super()
		System.out.println("in A's ctor");
	}
}

class B extends A {
	B() {
		// super() : to invoke immediate super cls's ctor : added impl by javac
		System.out.println("in B's ctor");
	}
}

class C extends B {
	C() {
		// super();//impl added by javac
		System.out.println("in C's ctor");
	}
}
