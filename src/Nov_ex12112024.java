class Nov_ex11112024 {
    public static void main(String[] args) {
        login l = new login("sai");
        System.out.println(l);
    }
}
class login {
    private String Username;
    private String Password;

    public login(String sai) {
        System.out.println("sai");
    }


    public String login(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
        return (Username);
    }
}