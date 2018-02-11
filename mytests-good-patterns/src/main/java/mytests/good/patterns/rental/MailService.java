package mytests.good.patterns.rental;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Informacja o wynajmie została wysłana do " + user);
    }
}
