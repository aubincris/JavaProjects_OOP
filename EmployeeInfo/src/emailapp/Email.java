package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private int passwordLength = 10;
    private String companySuffix = "sfsb.com";

    //constructor to receive the firstName and lastName
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New Employee: " + firstName + " " + lastName);

        //call method asking for the department and return this department
        department = setDepartment();
        System.out.println("Department:" +department);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is:" +email);
        //call a method that returns a password
        password = randomPassword(passwordLength);
        System.out.println("Your password is:" +password);
    }
    //Ask for the department
    private String setDepartment(){
        System.out.println("Department Codes: \n1 for Sales \n2 for Dev \n3 for Accounting" +
                "\n0 for none\nEnter the department:");
        Scanner sc = new Scanner(System.in);
        int depId = sc.nextInt();
        if(depId==1){
            return "Sales";
        }else if(depId==2){
            return "Dev";
        }else if(depId==3){
            return "Accounting";
        }else{
            return "";
        }
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i<length; i++){
            int random = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    //set the mail box capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }
    //set the alternate email

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    //change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME:" + firstName + " " + lastName + "\n" +
                "COMPANY EMAIL:" +email + "\n" +
                "MAILBOX CAPACITY:" +mailBoxCapacity + "MB";
    }
}
