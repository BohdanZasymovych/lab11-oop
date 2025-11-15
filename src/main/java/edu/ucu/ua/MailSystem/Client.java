package edu.ucu.ua.MailSystem;

import org.jetbrains.annotations.NotNull;

import lombok.Builder;
import lombok.Getter;

enum Sex {
    MALE, FEMALE
} 

@Builder
@Getter
public class Client {
    private static int idCounter = 0;

    private int id;
    private String name;
    private int age;
    private Sex sex;

    @NotNull
    private String email;

    public static class ClientBuilder {
        public  Client build() {
            this.id = ++idCounter;

            return new Client(id, name, age, sex, email);
        }
    
    }
}