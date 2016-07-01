package buoi4;

public class XayDungHamReverseArray {
	public static String[] reverseArray(String[] arr) {
		int n = arr.length;
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			result[i] = arr[n - i - 1];
		}
		return result;
	}

	public static void main(String[] args) {
		String[] array = { "foo", "bar", "test", "dump" };
		String[] array2 = reverseArray(array);
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}

}
