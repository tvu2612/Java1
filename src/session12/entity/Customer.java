package session12.entity;

public class Customer extends Entity<Integer> {
    private String first_name;
    private String last_name;
    private String address;
    private String phone;
    private String email;

    public Customer(Integer id, String first_name, String last_name, String address, String phone, String email) {
        super(id);
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Customer(Integer id) {
        super(id);
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

