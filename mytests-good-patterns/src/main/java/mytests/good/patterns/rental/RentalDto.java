package mytests.good.patterns.rental;

public class RentalDto {

    public User user;
    public boolean isRented;

    public RentalDto(final User user, final Boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public boolean isRented() {
        return isRented;
    }

    @Override
    public String toString() {
        return user + ", isRented = " + isRented;
    }
}
