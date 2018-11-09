public class Contact {private String firstName, lastName, phone;

    public Contact(String firstName, String lastName, String phone)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String toString()
    {
        return String.format("%s %s phone: %s", firstName, lastName, phone);
    }
}
