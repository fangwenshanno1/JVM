package com.atguigu.jvm.main;

public class SingleTon {

	private SingleTon() {
	}

	private static class LazyHolder {
		static final SingleTon INSTANCE = new SingleTon();
	}

	public static SingleTon getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	public static void main(String[] args) {
		SingleTon.getInstance();
	}

}
