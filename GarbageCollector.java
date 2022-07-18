package com.java;

public class GarbageCollector {

	public static void main(String[] args) throws InterruptedException {
		GarbageCollector gc = new GarbageCollector();
		System.out.println(gc.hashCode());
		gc = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(gc.hashCode());
		gc = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("End of Main");

	}

	public void finalize() {
		System.out.println("Finalize method ");
	}

}
