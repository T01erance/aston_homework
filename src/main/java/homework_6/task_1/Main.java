package homework_6.task_1;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println(checkLoginPassword("qwert", "asdfg", "asdfg1"));
    }

    private static boolean checkLoginPassword(String login, String password, String confirmPassword) {
        boolean allCorrect = true;
        try {
            if (login.length() >= 20 || isContainSpace(login)) {
                allCorrect = false;
                throw new WrongLoginException();
            }
        } catch (WrongLoginException e) {
            System.out.println(e);
        }
        try {
            if (password.length() >= 20 || isContainSpace(password)
                    || !isContainNumber(password) || !password.equals(confirmPassword)) {
                allCorrect = false;
                throw new WrongPasswordException();
            }
        } catch (WrongPasswordException e) {
            System.out.println(e);
        }

        return allCorrect;
    }

    private static boolean isContainNumber(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                return true;
            }
        }
        return false;
    }

    private static boolean isContainSpace(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                return true;
            }
        }
        return false;
    }
}
