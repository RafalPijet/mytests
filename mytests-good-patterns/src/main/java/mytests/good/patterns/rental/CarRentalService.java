package mytests.good.patterns.rental;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService{

    public boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
        System.out.println("Wynajem samochodu dla: " + user.getName() + " " + user.getSurname() + " od: " + carRentFrom.toString() + " do: " + carRentTo.toString());
        return true;
    }
}
