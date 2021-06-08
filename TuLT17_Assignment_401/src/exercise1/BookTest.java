package exercise1;

public class BookTest {
	public static void main(String[] args) {
		Book obj[] = new Book[30];

		obj[0] = new Book("Xa la nho", "Nguyen Nam", "1234513", "NXB Niem Vui");
		obj[1] = new Book("Mai nho em", "Nguyen Long", "12345987", "NXB Niem Vui");
		obj[2] = new Book("Song nho", "Le Nam", "12345645", "NXB Niem Vui");
		obj[3] = new Book("Muon roi ma", "Kim Anh", "1234543", "NXB Niem Vui");
		obj[4] = new Book("Oke con de", "Hana", "12345432", "NXB Niem Vui");
		obj[5] = new Book("Lai nham", "Kim", "1234542", "NXB Niem Vui");
		obj[6] = new Book("Xa la nho", "Nguyen Nam", "1234513", "NXB Niem Vui");
		obj[7] = new Book("Mai nho em", "Nguyen Long", "12345987", "NXB Niem Vui");
		obj[8] = new Book("Song nho", "Le Nam", "12345645", "NXB Niem Vui");
		obj[9] = new Book("Muon roi ma", "Kim Anh", "1234543", "NXB Niem Vui");
		obj[10] = new Book("Oke con de", "Hana", "12345432", "NXB Niem Vui");
		obj[11] = new Book("Lai nham", "Kim", "1234542", "NXB Niem Vui");
		obj[12] = new Book("Xa la nho", "Nguyen Nam", "1234513", "NXB Niem Vui");
		obj[13] = new Book("Mai nho em", "Nguyen Long", "12345987", "NXB Niem Vui");
		obj[14] = new Book("Song nho", "Le Nam", "12345645", "NXB Niem Vui");
		obj[15] = new Book("Muon roi ma", "Kim Anh", "1234543", "NXB Niem Vui");
		obj[16] = new Book("Oke con de", "Hana", "12345432", "NXB Niem Vui");
		obj[17] = new Book("Lai nham", "Kim", "1234542", "NXB Niem Vui");
		obj[18] = new Book("Xa la nho", "Nguyen Nam", "1234513", "NXB Niem Vui");
		obj[19] = new Book("Mai nho em", "Nguyen Long", "12345987", "NXB Niem Vui");
		obj[20] = new Book("Song nho", "Le Nam", "12345645", "NXB Niem Vui");
		obj[21] = new Book("Muon roi ma", "Kim Anh", "1234543", "NXB Niem Vui");
		obj[22] = new Book("Oke con de", "Hana", "12345432", "NXB Niem Vui");
		obj[23] = new Book("Lai nham", "Kim", "1234542", "NXB Niem Vui");
		obj[24] = new Book("Xa la nho", "Nguyen Nam", "1234513", "NXB Niem Vui");
		obj[25] = new Book("Mai nho em", "Nguyen Long", "12345987", "NXB Niem Vui");
		obj[26] = new Book("Song nho", "Le Nam", "12345645", "NXB Niem Vui");
		obj[27] = new Book("Muon roi ma", "Kim Anh", "1234543", "NXB Niem Vui");
		obj[28] = new Book("Oke con de", "Hana", "12345432", "NXB Niem Vui");
		obj[29] = new Book("Lai nham", "Kim", "1234542", "NXB Niem Vui");

		for (int i = 0; i < 30; i++) {
			System.out.print("Book " + (i + 1) + " : ");
			obj[i].getBookInfo();
		}

	}
}
