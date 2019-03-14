package com.tutorialspoint;

import java.util.List;

public class TestOverride {
	public static void main(String[] args) {
		test(1);
		int[] ids = {1,2};
		test(ids);
	}
	public static void test(int id) {
		System.out.println("数字:");
		System.out.println(id);
	}
	
	public static void test(int[] ids) {
		System.out.println("数组");

		for (int id : ids) {
			
			System.out.println(id);
		}
	}

}
