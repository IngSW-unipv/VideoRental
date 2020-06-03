package video_rental;

public class VideoRental {

	public static void main(String[] args) {
		Customer customer = new Customer("Donald Duck");
		customer.addRental(new Rental(new Movie("The GodFather", new RegularPrice()), 3));
		customer.addRental(new Rental(new Movie("Finding Nemo", new ChildrensPrice()), 4));
		customer.addRental(new Rental(new Movie("Star Wars XXIII", new NewRelease()), 2));
		
		String stmt = customer.statement();
		System.out.println(stmt);
	}
}
