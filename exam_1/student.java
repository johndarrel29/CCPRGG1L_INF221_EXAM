public class student {
    String surname;
    String firstname;
    char middleinitial;
    String dateofbirth;
    int studentnumber;
    String studentemailaddress;
    boolean iAmAwesome;

    public void sayMyStudentNumber() {
        System.out.println("Student number: " + studentnumber);
    }
    public void sayMyEmailAddress() {
        System.out.println("Student email address: " + studentemailaddress);
    }
    public void amIAwesome() {
        System.out.println("Am I super duper legendary awesome? " + iAmAwesome);
    }
}
