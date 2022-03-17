package edu.tecnocampus.rest.youtube;

import java.util.UUID;

public class User {
    private int MIN_CHARACTERS_PASSWORD = 7;
    private String id = UUID.randomUUID().toString();
    private String email;
    private String user;
    private String password;

    public User(String email, String user, String password) throws Exception {
        checkEmail(email);
        checkPassword(password);
        this.email = email;
        this.user = user;
        this.password = password;
    }

    private void checkPassword(String password) throws Exception {
        if(password.length()<MIN_CHARACTERS_PASSWORD) throw new Exception("Contraseña muy corta");
        if(password.matches(".*\\d.*")) throw new Exception("Contraseña no tiene numero");
    }

    private void checkEmail(String email) throws Exception {
        if(!email.contains("@")) throw new Exception("Email incorrecto");
    }
}
