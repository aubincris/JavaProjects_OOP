package bankaccountapp;

public class Savings extends Account {
    //List properties specific to the savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //Constructor to initialize settings for the savings properties
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositedBox();
        //System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
    }

    @Override
    public void setRate(){
        rate = getBaseRate() - .25;


    }

    private void setSafetyDepositedBox(){
        safetyDepositBoxID = (int)(Math.random()* Math.pow(10,3));
        //System.out.println(safetyDepositBoxID);
        safetyDepositBoxKey = (int)(Math.random()* Math.pow(10,4));
    }
    //list any methods specific to savings account

    @Override
    public void showInfo() {

        //System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println("Your Savings Account Features" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
    }


}
