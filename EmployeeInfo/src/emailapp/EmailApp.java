package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("John", "Snow");
        /**
         * em1.setAlternateEmail("aubin@deloitte.com");
         * System.out.println("Your alternate email is:" + em1.getAlternateEmail());
         */
        System.out.println(em1.showInfo());


    }
}
