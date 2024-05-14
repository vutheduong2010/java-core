import java.time.LocalDate;

public class Account {
    private int id;
    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private String fullName;
    private String position;
    private LocalDate createDate;

    // Constructor không có parameters
    public Account() {
        this.createDate = LocalDate.now();
    }

    // Constructor có các parameter là id, Email, Username, FirstName, LastName
    public Account(int id, String email, String username, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.createDate = LocalDate.now();
    }

    // Constructor có các parameter là id, Email, Username, FirstName, LastName và Position của User, default createDate = now
    public Account(int id, String email, String username, String firstName, String lastName, String position) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = LocalDate.now();
    }

    // Constructor có các parameter là id, Email, Username, FirstName, LastName, Position của User và createDate
    public Account(int id, String email, String username, String firstName, String lastName, String position, LocalDate createDate) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
