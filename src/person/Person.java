package person;

public class Person {
    private String first_name,last_name,email_id;
    private String contact_number;

    public Person(String first_name, String last_name, String email_id, String contact_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_id = email_id;
        this.contact_number = contact_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

}
