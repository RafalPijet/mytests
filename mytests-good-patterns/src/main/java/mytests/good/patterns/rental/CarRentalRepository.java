package mytests.good.patterns.rental;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {
    public boolean createRental(User user, LocalDateTime from, LocalDateTime to) {
        System.out.println("zapisano w bazie danych:)");
        return true;
    }
}
