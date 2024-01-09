package org.example;

public class Registration_Q14 {
//    Create Registration Class in which you would have variables such as email,
//userName and password that have an access scope only within its own class.
//After creating an object of the class, the user should be able to call methods
//and in each method separately pass values to set users email, username and
//password.
//Requirements:
//● Valid email consider to be only yahoo
//● Valid userName and password cannot be empty and should be of
//length larger than 6 characters. Also valid passwords cannot contain
//userName.
    private String email;
    private String username;
    private String password;
    public void setEmail(String email){
        if (email.endsWith("@yahoo.com")){
        this.email=email;}
    }
    public void setUsername(String username){
        if (username.length()>6){
        this.username=username;}
    }
    public void setPassword(String password){
        if (password.length()>6 && !password.contains(username)){
        this.password=password;}
    }
    public String getEmail(){
        return email;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

public static void main(String[] args) {
Registration_Q14 obj = new Registration_Q14();
    obj.setEmail("abcde123@yahoo.com");
    obj.setUsername("Ricky_Tang888");
    obj.setPassword("kamisamasensei111");
    System.out.println(obj.getEmail());
    System.out.println(obj.getUsername());
    System.out.println(obj.getPassword());
}
}
