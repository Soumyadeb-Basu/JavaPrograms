package DesignPatterns.Builder;

public class User {

    private final int id;

    private final String name;

    private final String email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    User(UserBuilder userBuilder) {

        this.id=userBuilder.id;
        this.name=userBuilder.name;
        this.email=userBuilder.email;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    static class UserBuilder {

        private  int id;

        private  String name;

        private String email;

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder() {

        }

        public static UserBuilder builder() {
            return new UserBuilder();
        }

        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            User user= new User(this);
            return user;
        }
    }
}
