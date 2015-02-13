package com.project.anyone.test;

public class Example {

	public static void main(String[] args) {

		Example ex = new Example();

		//ex.method1();	//compile error 	

		try {
			ex.method1();

		} catch (SomeException e) {
			System.out.println("[예외]" + e);
		}

		ex.method2(); //Runtime Exception
		ex.method3(); //Error 

	}

	public void method1() throws SomeException {
		try {
			System.out.println("do someThing1");
			throw new Exception();

		} catch (Exception e) {
			throw new SomeException(e);

		}

	}

	public void method2() throws SomeRuntimeException {
		try {
			System.out.println("do someThing2");
			throw new Exception();

		} catch (Exception e) {
			throw new SomeRuntimeException(e);

		}

	}

	public void method3() throws SomeError {
		throw new SomeError(null);
	}
}
