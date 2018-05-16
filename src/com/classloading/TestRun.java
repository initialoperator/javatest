package com.classloading;

public class TestRun {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
		ClassLoader cl = TestRun.class.getClassLoader();
		ClassLoader cl2 = TestRun.class.getClassLoader();
		try {
			Class dClass = cl.loadClass("com.classloading.Dynamics");
			System.out.println("dClass.getName() = " + dClass.getName());
			Dynamics d = (Dynamics) dClass.newInstance();
			Class dClass2 = cl2.loadClass("com.classloading.Dynamics");
			System.out.println("is dClass and dCLass2 the same: " + (dClass == dClass2));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
