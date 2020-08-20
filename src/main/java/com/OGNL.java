package com;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/**
 * 此类主要用于 mapper 文件中非空验证
 */
public class OGNL {

	public static boolean isNotEmpty(Object o) {
		return !isEmpty(o);
	}

	public static boolean isEmpty(Object o) {
		if (o == null)
			return true;

		if (o instanceof String) {
			if (((String) o).length() == 0) {
				return true;
			}
		} else if (o instanceof Collection) {
			if (((Collection) o).isEmpty()) {
				return true;
			}
		} else if (o.getClass().isArray()) {
			if (Array.getLength(o) == 0) {
				return true;
			}
		} else if (o instanceof Map) {
			if (((Map) o).isEmpty()) {
				return true;
			}
		} else {
			return false;
		}

		return false;

	}
	public static boolean isCollection(Object o){
		return isNotEmpty(o)&&((o instanceof Collection)||(o.getClass().isArray()));
	}
}
