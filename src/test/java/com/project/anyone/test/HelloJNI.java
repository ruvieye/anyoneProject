/*
 * @(#)HelloJNI.java $version 2015. 2. 10.
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.project.anyone.test;

/**
 * @author nhn
 */
public class HelloJNI {
	static {
		System.loadLibrary("hello"); // Load native library at runtime
										// hello.dll (Windows) or libhello.so (Unixes)
	}

	// Declare a native method sayHello() that receives nothing and returns void
	private native void sayHello();

	// Test Driver
	public static void main(String[] args) {
		System.out.println("TEST");
		new HelloJNI().sayHello(); // invoke the native method
	}
}
