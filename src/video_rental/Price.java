package video_rental;

public abstract class Price {
	abstract double getCharge(int daysRented);
	abstract int getFrequentPoints(int daysRented);
}
