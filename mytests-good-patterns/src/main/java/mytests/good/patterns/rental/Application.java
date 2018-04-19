package mytests.good.patterns.rental;

public class Application {

    public static void main(String[] args) {
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(new MailService(), new CarRentalService(), new CarRentalRepository());
        System.out.println("Status klienta --> " + rentalProcessor.process(rentRequest));
    }
}
