package knight.exam;

public class TestExam07 {

	public static void main(String[] args) {

		TestExam07 arrayExam = new TestExam07();
		int array[] = { 100, 5, 2, 7, 4, 6, 1, 3, 10, 11, 12, 9, 8 };

		for (int i : arrayExam.Array(array)) {
			System.out.println(i);

		}
	}

	public int[] Array(int array[]) {
		int a = 0;
		int[] array1 = array;

		for (int i = 0; i < array1.length; i++) {
			for (int j = array1.length - 1; j >= i; j--) {

				if (array1[i] > array1[j]) {
					a = array1[j];

					array1[j] = array1[i];

					array1[i] = a;

				}

			}

		}

		return array1;

	}

}
