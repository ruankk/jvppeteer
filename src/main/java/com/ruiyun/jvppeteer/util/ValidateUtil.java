package com.ruiyun.jvppeteer.util;

import java.util.Collection;

public class ValidateUtil {
	
	public static boolean isEmpty(Collection<?> c) {
		return c == null || c.isEmpty();
	}
	
	public static boolean isNotEmpty(Collection<?> c) {
		return !ValidateUtil.isEmpty(c);
	}
}