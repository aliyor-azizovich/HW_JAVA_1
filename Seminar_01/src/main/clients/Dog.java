package main.clients;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);

    }
    @Override
    public void fly() {
        System.out.println("Dogs can't fly");
    }

    }

