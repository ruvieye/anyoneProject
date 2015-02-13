package com.project.anyone.test;

import java.lang.reflect.Field;

import org.junit.Test;

public class HashCodeTest {

	@Test
	public void 해쉬코드() {
		MyHashClass a = new MyHashClass(1, 2211, "손");
		System.out.println(a.hashCode());

		MyHashClass b = new MyHashClass(2, 22, "손");
		System.out.println(b.hashCode());

	}
}

class MyHashClass {
	private int intValue;
	private long longValue;
	private String strValue;

	public MyHashClass(int intValue, long longValue, String strValue) {
		this.intValue = intValue;
		this.longValue = longValue;
		this.strValue = strValue;
	}

	@Override
	public int hashCode() {
		int result = 17;
		int hash = 0;

		Field field[] = this.getClass().getDeclaredFields();
		for (Field eachField : field) {

			if (eachField.getType().isAssignableFrom(boolean.class)) {
				System.out.println("boolean");
				hash = 1;

			} else if (eachField.getType().isAssignableFrom(byte.class) || eachField.getType().isAssignableFrom(char.class) || eachField.getType().isAssignableFrom(short.class)
				|| eachField.getType().isAssignableFrom(int.class)) {
				System.out.println("byte int short char");
				try {
					hash = eachField.getInt(this);

				} catch (IllegalArgumentException e) {

				} catch (IllegalAccessException e) {

				}

			} else if (eachField.getType().isAssignableFrom(long.class)) {
				System.out.println("long");
				hash = hash >>> 32;

			} else if (eachField.getType().isAssignableFrom(float.class)) {
				System.out.println("float");
				try {
					hash = Float.floatToIntBits(eachField.getFloat(this));
				} catch (IllegalArgumentException e) {
				} catch (IllegalAccessException e) {
				}

			} else if (eachField.getType().isAssignableFrom(double.class)) {
				System.out.println("double");
				try {
					hash = (int)Double.doubleToRawLongBits(eachField.getDouble(this));
				} catch (IllegalArgumentException e) {
				} catch (IllegalAccessException e) {
				}
			} else {

			}

		}

		result = 31 * result + hash;
		return result;
	}
}
