import java.time.LocalDate;

public class Exercise01c {
    // Question 3a: Constructor không có parameters
    public void question3a() {
        Group group1 = new Group();
        System.out.println(group1);
    }

    // Question 3b: Constructor có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
    public void question3b() {
        Account creator = new Account(1, "creator@example.com", "creator", "John", "Doe");
        Account[] accounts = {
                new Account(2, "member1@example.com", "member1", "Alice", "Smith"),
                new Account(3, "member2@example.com", "member2", "Bob", "Johnson")
        };
        Group group2 = new Group("Group A", creator, accounts, LocalDate.of(2023, 1, 1));
        System.out.println(group2);
    }

    // Question 3c: Constructor có các parameter là GroupName, Creator, array String[] usernames, CreateDate
    public void question3c() {
        Account creator = new Account(4, "creator2@example.com", "creator2", "Jane", "Doe");
        String[] usernames = {"user1", "user2", "user3"};
        Group group3 = new Group("Group B", creator, usernames, LocalDate.EPOCH.of(2023, 1, 1));
        System.out.println(group3);
    }

    public static void main(String[] args) {
        Exercise01c exercise01c  = new Exercise01c();
        exercise01c.question3a();
        exercise01c.question3b();
        exercise01c.question3c();
    }
}
