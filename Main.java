public class Main {
    public static void main(String[] args) {
        // Subscriber instantiation
        User lourie = new User("Lourie");
        User rich = new User("Richmond");
        User kebs = new User("Kevin");

        // Agency instantiation
        BreakingNewsAgency newsAgency = new BreakingNewsAgency();

        // Subscribe users to agency
        newsAgency.addSubscriber(lourie);
        newsAgency.addSubscriber(rich);
        newsAgency.addSubscriber(kebs);

        // Create news for the users
        System.out.println("\nBreaking News Published:");
        newsAgency.setNews("License renewal fee, lessen 2 times off its original price!");

        // User removal before creating news
        newsAgency.removeSubscriber(rich);
        System.out.println("\nAfter removing Richmond from the subscriber list:");
        newsAgency.setNews("Arcanum, a New Era University Library web app, officially launched!");

        // Adding a new subscriber
        User professorJerry = new User("Professor Jerry");
        newsAgency.addSubscriber(professorJerry);
        System.out.println("\nAfter adding the professor to the subscriber list:");
        newsAgency.setNews("Overall salary for Professor Jerry, doubled due to his teaching diligence!");
    }
}