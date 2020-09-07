package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User i : users) {
            if (i.getUsername().equals(login)) {
                user = i;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("User not found");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("UserInvalidException");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("EEEEEEEEEEEE");
              }
            } catch(UserInvalidException ex1){
                ex1.printStackTrace();
            } catch(UserNotFoundException ex2){
                ex2.printStackTrace();
        }
    }
}