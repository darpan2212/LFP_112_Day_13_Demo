package com.bridgelabz;

public class PrintArray {

	public static <E> E toPrint(E[] arr) {
		for (E e : arr) {
			System.out.print(e+"  ");
		}
		System.out.print("\n");
		return arr[0];
	}

	/*
	 * public static void toPrint(double[] arr) { for (int i = 0; i < arr.length;
	 * i++) { System.out.print(arr[i] + "  "); } System.out.print("\n"); }
	 * 
	 * public static void toPrint(String[] arr) { for (int i = 0; i < arr.length;
	 * i++) { System.out.print(arr[i] + "  "); } System.out.print("\n"); }
	 */

	public static void main(String[] args) {

		Integer[] intArr = new Integer[] { 1, 2, 3, 6, 8, 9,
				11, 32 };
		toPrint(intArr);

		Double[] doubleArr = new Double[] { 1.1, 2.4, 3.6,
				6.1, 8.2, 9.3, 11.3, 32.7 };
		toPrint(doubleArr);

		String[] stringArr = new String[] { "hello",
				"world", "how are you?", "Hey!!" };
		toPrint(stringArr);
	}

}