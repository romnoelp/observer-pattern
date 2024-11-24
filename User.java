public class User implements Subscriber {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        try {
            if (news == null || news.isEmpty()) {
                throw new IllegalArgumentException("The agency can't give an empty handed news to its subscribers.");
            }
            System.out.println(name + " received news: " + news);
        } catch (IllegalArgumentException e) {
            System.out.println("Error updating user: " + e.getMessage());
        }
    }
}