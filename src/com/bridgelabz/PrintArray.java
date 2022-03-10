package com.bridgelabz;

public class PrintArray<T> {

	public void toPrint(T[] arr) {
		for (T t : arr) {
			System.out.print(t + "  ");
		}
		System.out.print("\n");
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
		PrintArray<Integer> intPrintArr = new PrintArray<Integer>();
		intPrintArr.toPrint(intArr);

		Double[] doubleArr = new Double[] { 1.1, 2.4, 3.6,
				6.1, 8.2, 9.3, 11.3, 32.7 };
		PrintArray<Double> doublePrintArr = new PrintArray<>();
		doublePrintArr.toPrint(doubleArr);

		String[] stringArr = new String[] { "hello",
				"world", "how are you?", "Hey!!" };
		PrintArray<String> strPrintArr = new PrintArray<>();
		strPrintArr.toPrint(stringArr);
	}

}