package com.bartonsoft;

import java.util.ArrayList;
import java.util.Collection;

class Test {
	Test() {
		test(new ArrayList<>(), 1);
	}

	void test(Collection<Integer> c, Integer i) {
		if (i > 10) {
			c.add(i);
		} else {
			c.remove(i);
		}
	}
}
