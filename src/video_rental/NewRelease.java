package video_rental;

public class NewRelease extends Price {

	@Override
	double getCharge(int daysRented) {
		return daysRented * 3;
	}

	@Override
	int getFrequentPoints(int daysRented) {
		return 2;
	}

}
