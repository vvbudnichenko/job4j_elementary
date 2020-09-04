package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User i : users) {
            if (login.equals(i.getUsername())) {
                System.out.println("User exists");
                break;
            }
        }
        if (login == null) {
            throw new UserNotFoundException("User not found");
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() || user.getUsername().length() >= 3) {
            System.out.println("User exists as well");
        } else {
            throw new UserInvalidException("UserInvalidException");
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = users[0];
        try {
            findUser(users, "Petr Arsentev");
            validate(user);
        } catch (UserInvalidException ex1) {
            ex1.printStackTrace();
        } catch (UserNotFoundException ex2) {
            ex2.printStackTrace();
        }
    }
}