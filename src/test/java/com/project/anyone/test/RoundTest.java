package com.project.anyone.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.junit.Test;

public class RoundTest {

	@Test
	public void 일반반올림테스트() {
		BigDecimal a = new BigDecimal("1231.5"); //홀수
		BigDecimal aa = a.setScale(0, RoundingMode.HALF_UP);
		assertEquals(aa.toString(), "1232");

		BigDecimal b = new BigDecimal("1232.5"); //짝수
		BigDecimal bb = b.setScale(0, RoundingMode.HALF_UP);
		assertEquals(bb.toString(), "1233");

	}

	@Test
	public void 은행원반올림테스트() {
		BigDecimal a = new BigDecimal("1231.5"); //홀수
		BigDecimal aa = a.setScale(0, RoundingMode.HALF_EVEN);
		assertEquals(aa.toString(), "1232");

		BigDecimal b = new BigDecimal("1232.5"); //짝수
		BigDecimal bb = b.setScale(0, RoundingMode.HALF_EVEN);
		//assertEquals(bb.toString(), "1233"); //실패
		assertEquals(bb.toString(), "1232");
	}

	@Test
	public void 기본값반올림테스트() {
		DecimalFormat format = new DecimalFormat("#00");
		String result = format.format(1231.5);
		assertEquals(result, "1232");

		DecimalFormat format2 = new DecimalFormat("#00");
		String result2 = format2.format(1232.5);
		//assertEquals(result2, "1233");		//실패
		assertEquals(result2, "1232");
	}

}
