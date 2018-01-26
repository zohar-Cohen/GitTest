package Test;

public class InsertationArray {

	int[] theArray = { 2, 3, 4, 5, 6, 7, 8, 1 };
	int arraySize = 8;

	public void insertionSort() {

		for (int i = 1; i < arraySize; i++) {
			int j = i;
			int toInsert = theArray[i];
			while ((j > 0) && (theArray[j - 1] > toInsert)) {
				theArray[j] = theArray[j - 1];
				j--;

				// printHorzArray(i, j);

			}
			theArray[j] = toInsert;

			// printHorzArray(i, j);

			System.out.println(
					"\nArray[i] = " + theArray[i] + " Array[j] = " + theArray[j] + " toInsert = " + toInsert + "\n");

		}

	}

	public static void main(String[] args) {

		InsertationArray a = new InsertationArray();
		a.insertionSort();

	}

}
