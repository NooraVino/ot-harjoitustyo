/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nooran.giftwish.domain;

/**
 *
 * Yksittäistä käyttäjää kuvaava luokka.
 */
public class User {

    private String userName;
    private String passWord;

    public User(String username, String password) {
        this.userName = username;
        this.passWord = password;

    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.passWord;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) {
            return false;
        }

        User other = (User) obj;
        return this.userName.equals(other.userName);
    }

}
