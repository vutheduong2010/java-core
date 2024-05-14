import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private String groupName;
    private Account creator;
    private Account[] accounts;
    private LocalDate createDate;

    // Constructor không có parameters
    public Group() {
        this.createDate = LocalDate.now();
    }

    // Constructor có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
    public Group(String groupName, Account creator, Account[] accounts, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    // Constructor có các parameter là GroupName, Creator, array String[] usernames, CreateDate
    public Group(String groupName, Account creator, String[] usernames, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            this.accounts[i] = new Account(0, null, usernames[i], null, null);
        }
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", accounts=" + Arrays.toString(accounts) +
                ", createDate=" + createDate +
                '}';
    }
}
