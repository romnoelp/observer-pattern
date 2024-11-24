import java.util.ArrayList;
import java.util.List;

public class BreakingNewsAgency implements NewsAgency {
    private final List<Subscriber> subscribers = new ArrayList<>();
    private String news;

    // Adds a subscriber to the list
    public void addSubscriber(Subscriber subscriber) {
        try {
            if (subscriber == null) {
                throw new IllegalArgumentException("Subscriber cannot be null");
            }
            subscribers.add(subscriber);
            System.out.println("\nSubscriber added successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding subscriber: " + e.getMessage());
        }
    }

    // Removes a subscriber from the list
    public void removeSubscriber(Subscriber subscriber) {
        try {
            if (subscriber == null) {
                throw new IllegalArgumentException("Subscriber cannot be null");
            }
            if (!subscribers.contains(subscriber)) {
                throw new IllegalStateException("Subscriber not found in the list");
            }
            subscribers.remove(subscriber);
            System.out.println("\nSubscriber removed successfully.");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error removing subscriber: " + e.getMessage());
        }
    }

    // Publishes news and notifies all subscribers
    public void setNews(String news) {
        try {
            if (news == null || news.isEmpty()) {
                throw new IllegalArgumentException("News cannot be empty or null");
            }
            this.news = news;
            System.out.println("News Published: " + news);
            notifySubscribers();
        } catch (IllegalArgumentException e) {
            System.out.println("Error setting news: " + e.getMessage());
        }
    }

    // Notifies all subscribers regarding the news
    public void notifySubscribers() {
        try {
            if (subscribers.isEmpty()) {
                throw new IllegalStateException("No subscribers to notify");
            }
            if (news == null || news.isEmpty()) {
                throw new IllegalStateException("No news to notify");
            }
            for (Subscriber subscriber : subscribers) {
                subscriber.update(news);
            }
        } catch (IllegalStateException e) {
            System.out.println("Error notifying subscribers: " + e.getMessage());
        }
    }
}
