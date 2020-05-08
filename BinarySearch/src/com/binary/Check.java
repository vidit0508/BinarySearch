package com.binary;

import java.util.ArrayList;
import java.util.List;

public class Check {

	public static void main(String[] args) {

		List<Object> check = new ArrayList<>();
		check.add("check");
		check.add(1);
		check.add(1l);

		for (Object l : check) {
			int res = 0;
			res += Integer.parseInt(l.toString());
			System.out.println(res);
		}

	}

}
