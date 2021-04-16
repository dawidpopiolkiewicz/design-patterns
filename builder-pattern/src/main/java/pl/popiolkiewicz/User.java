package pl.popiolkiewicz;

/**
 * @author Dawid Popiołkiewicz
 */
public class User {

    private String name;
    private String surname;
    private String email;
    private String phone;

    private User(){}

    public static final class Builder {

        private String name;
        private String surname;
        private String email;
        private String phone;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public User build(){
            User user = new User();
            user.name = this.name;
            user.surname = this.surname;
            user.email = this.email;
            user.phone = this.phone;
            return user;
        }
    }
    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "main.pl.popiolkiewicz.User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
