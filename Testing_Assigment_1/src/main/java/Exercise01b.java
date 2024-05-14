import java.time.LocalDate;

public class Exercise01b {
    public void question2a() {
        Account account1 = new Account();
        System.out.println(account1);
    }

    // Question 2b: Constructor có các parameter là id, Email, Username, FirstName, LastName
    public void question2b() {
        Account account2 = new Account(1, "email@example.com", "username", "John", "Doe");
        System.out.println(account2);
    }

    // Question 2c: Constructor có các parameter là id, Email, Username, FirstName, LastName và Position của User, default createDate = now
    public void question2c() {
        Account account3 = new Account(2, "email2@example.com", "username2", "Jane", "Doe", "Manager");
        System.out.println(account3);
    }

    // Question 2d: Constructor có các parameter là id, Email, Username, FirstName, LastName và Position của User, createDate
    public void question2d() {
        Account account4 = new Account(3, "email3@example.com", "username3", "Alice", "Smith", "Developer", LocalDate.of(2023, 1, 1));
        System.out.println(account4);
    }

    public static void main(String[] args) {
        Exercise01b exercise01b = new Exercise01b();
        exercise01b.question2a();
        exercise01b.question2b();
        exercise01b.question2c();
        exercise01b.question2d();
    }
}
