package DesignPatterns.Builder;

public class Main {

    public static void main(String[] args) {

        User user=User
                .UserBuilder
                .builder()
                .setId(1)
                .setName("Johnson")
                .setEmail("John.johnson@mail.com")
                .build();

        System.out.println(user.toString());

    }
}
