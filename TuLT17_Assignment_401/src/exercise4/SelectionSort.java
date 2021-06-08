package exercise4;

import java.util.List;

public class SelectionSort extends NumberList implements Sort {



	@Override
	public void sort() {
		List<Integer> listNumber = input();
		System.out.print("Original List: ");
		print(listNumber);
		int n = listNumber.size();
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (listNumber.get(j) < listNumber.get(min_idx)) {
					min_idx = j;
				}
			}
			int temp = listNumber.get(min_idx);
			listNumber.set(min_idx, listNumber.get(i));
			listNumber.set(i, temp);
		}

		System.out.print("\nSelection sort: ");
		print(listNumber);
	}
}
