package video_rental;

public class RegularPrice extends Price {

	@Override
	double getCharge(int daysRented) {
		if (daysRented > 2)
			return 2 + (daysRented - 2) * 1.5;
		else
			return 2;
	}

	@Override
	int getFrequentPoints(int daysRented) {
		return 1;
	}

}
