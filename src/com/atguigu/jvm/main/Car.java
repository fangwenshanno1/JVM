package com.atguigu.jvm.main;

public class Car {
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Car被回收了！");
		System.out.println("Car被回收了！");
		System.out.println("Car被回收了！");
		
		
	}
	
	public static void main(String[] args) {
		
		//sun.misc.Launcher$AppClassLoader@2a139a55
		/*System.out.println(Car.class.getClassLoader());
		
		//null
		System.out.println(Car.class.getClassLoader().getClass().getClassLoader());
		
		//sun.misc.Launcher$ExtClassLoader@7852e922
		System.out.println(Car.class.getClassLoader().getParent());
		
		//null
		System.out.println(Object.class.getClassLoader());*/
		
		Car car = new Car();
		
		car=null;
		
		System.gc();
		
	}

}
