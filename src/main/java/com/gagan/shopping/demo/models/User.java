package com.gagan.shopping.demo.models;

import com.gagan.shopping.demo.api.PasswordEncrypter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.security.spec.InvalidKeySpecException;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
@NoArgsConstructor@Setter@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name")
    private String fname;
    @Column(name = "last_name")
    private String lname;
    private String password;
    @Column(unique = true)
    private String email;
    private String gender;
    @Column(unique = true)
    private String uuid;
    private Long phone;

    @ManyToMany
    private Set<Role> roles = new HashSet<Role>();

    public String getPassword() {
        PasswordEncrypter passwordEncrypter = null;
        try {
            passwordEncrypter = new PasswordEncrypter("password");
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return passwordEncrypter.decrypt(this.password);
    }

    public void setPassword(String password) throws InvalidKeySpecException {
        PasswordEncrypter passwordEncrypter = new PasswordEncrypter("password");
        this.password = passwordEncrypter.encrypt(password);
    }
}
