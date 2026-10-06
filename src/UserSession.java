protected class UserSession {
    private String username;

    public void UserSession(String name) {
        username = name;
    }

    public static void printUser() {
        System.out.println("Current user: " + username);
    }
}
