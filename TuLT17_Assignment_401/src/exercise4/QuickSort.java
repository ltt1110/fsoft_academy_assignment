package exercise4;

import java.util.List;

public class QuickSort extends NumberList implements Sort {


	@Override
	public void sort() {
		List<Integer> listNumber = input();
		System.out.print("Original List: ");
		print(listNumber);
		int n = listNumber.size();
		quickSort(listNumber, 0, n - 1);

		System.out.print("\nQuick sort: ");
		print(listNumber);
	}

	int partition(List<Integer> listNumber, int low, int high) {
		int pivot = listNumber.get(high);
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (listNumber.get(j) <= pivot) {
				i++;

				int temp = listNumber.get(i);
				listNumber.set(i, j);
				listNumber.set(j, temp);
			}
		}

		int temp = listNumber.get(i + 1);
		listNumber.set(i + 1, listNumber.get(high));
		listNumber.set(high, temp);
		return i + 1;
	}

	void quickSort(List<Integer> listNumber, int low, int high) {
		if (low < high) {

			int pi = partition(listNumber, low, high);

			quickSort(listNumber, low, pi - 1);
			quickSort(listNumber, pi + 1, high);
		}
	}

}
