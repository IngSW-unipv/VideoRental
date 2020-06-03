package video_rental;

public class ChildrensPrice extends Price {

	@Override
	double getCharge(int daysRented) {
		if (daysRented > 3)
			return 1.5 + (daysRented - 3) * 1.5;
		else
			return 1.5;
	}

	@Override
	double getFrequentPoints(int daysRented) {
		return 1;
	}

}
