package Nov_ex09112024;

public class Lab_138 {
        public static void main(String[] args) {
            // Creating an object of the Login class using the parameterized constructor
            Login user1 = new Login("user123", "pass456");
            System.out.println("Username: " + user1.getUsername());
            System.out.println("Password: " + user1.getPassword());

            // Creating an object of the Login class using the default constructor
            Login user2 = new Login();
            user2.setUsername("defaultUser");
            user2.setPassword("defaultPass");
            System.out.println("Username: " + user2.getUsername());
            System.out.println("Password: " + user2.getPassword());
        }
    }

    class Login {
        // Private fields for encapsulation
        private String username;
        private String password;

        // Parameterized constructor
        public Login(String username, String password) {
            this.username = username;
            this.password = password;
        }

        // Default constructor
        public Login() {
            this.username = "";
            this.password = "";
        }

        // Getter and Setter for Username
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        // Getter and Setter for Password
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }


