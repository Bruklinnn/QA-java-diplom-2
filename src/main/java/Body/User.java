package Body;

public class User {
    private String email;
    private String name;

    public User(String email, String name) {
        this.email=email;
        this.name=name;
    }

    public String getEMail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEMail(String eMail) {
        this.email = eMail;
    }

    public void setName(String name) {
        this.name = name;
    }
}

