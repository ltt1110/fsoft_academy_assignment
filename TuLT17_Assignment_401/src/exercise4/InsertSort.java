package exercise4;

import java.util.List;

public class InsertSort extends NumberList implements Sort {


	@Override
	public void sort() {
		List<Integer> listNumber = input();
		System.out.print("Original List: ");
		print(listNumber);
		int n = listNumber.size();
		for (int i = 1; i < n; ++i) {
			int key = listNumber.get(i);
			int j = i - 1;

			while (j >= 0 && listNumber.get(j) > key) {
				listNumber.set(j + 1, listNumber.get(j));
				j = j - 1;
			}
			listNumber.set(j + 1, key);
		}

		System.out.print("\nInsert Sort: ");
		print(listNumber);

	}

}
