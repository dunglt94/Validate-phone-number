public class Main {
    public static final String[] validPhoneNo = new String[]{"(84)-(123456789)"};
    public static final String[] invalidPhoneNo  = new String[]{"(a8)-(22222222)",
            "(84)-(22b222222)", "(84)-(9978489648)"};


    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String phoneNo : validPhoneNo) {
            boolean valid = phoneNumber.validate(phoneNo);
            System.out.println("Phone number: " + phoneNo + " is valid: " + valid);
        }
        for (String phoneNo : invalidPhoneNo) {
            boolean valid = phoneNumber.validate(phoneNo);
            System.out.println("Phone number: " + phoneNo + " is valid: " + valid);
        }

    }
}
