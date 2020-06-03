package video_rental;

public class VideoRental {

	public static void main(String[] args) {
		Customer customer = new Customer("Donald Duck");
		customer.addRental(new Rental(new Movie("The GodFather", Movie.REGULAR), 3));
		customer.addRental(new Rental(new Movie("Finding Nemo", Movie.CHILDREN), 4));
		customer.addRental(new Rental(new Movie("Star Wars XXIII", Movie.NEW_RELEASE), 2));
		
		String stmt = customer.statement();
		System.out.println(stmt);
	}
}
