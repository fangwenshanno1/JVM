package com.atguigu.jvm.main;

public class JVMTest {

	public static void main(String[] args) {
		System.out.print("最大内存");
		System.out.println(Runtime.getRuntime().maxMemory() / 1024.0 / 1024 + "M");
		System.out.print("当前可用内存");
		System.out.println(Runtime.getRuntime().freeMemory() / 1024.0 / 1024 + "M");
		System.out.print("当前申请内存");
		System.out.println(Runtime.getRuntime().totalMemory() / 1024.0 / 1024 + "M");
	}

}
