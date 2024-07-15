package com.example.passwordgenerator;

public class PasswordGeneratorTest {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
            .useLower(true)
            .useUpper(true)
            .useDigits(true)
            .usePunctuation(true)
            .build();

        String password = passwordGenerator.generate(12);
        System.out.println("Generated Password: " + password);
    }
}
