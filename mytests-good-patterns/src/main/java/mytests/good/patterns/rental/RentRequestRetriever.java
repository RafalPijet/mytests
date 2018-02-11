package mytests.good.patterns.rental;

import java.time.LocalDateTime;

public class RentRequestRetriever {

    public RentRequest retrieve() {
        User user = new User("David", "Gahan");

        LocalDateTime rentFrom = LocalDateTime.of(2017, 10, 1, 12, 0);
        LocalDateTime rentTo = LocalDateTime.of(2017, 10, 21, 15, 23);

        return new RentRequest(user, rentFrom, rentTo);
    }
}
