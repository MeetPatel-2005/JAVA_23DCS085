import Project.Library;
import Project.User;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        User user = new User(library);
        user.start();
    }
}
