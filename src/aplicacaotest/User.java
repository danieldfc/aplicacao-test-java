/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaotest;

import java.util.Objects;

/**
 *
 * @author danielfelizardo
 */
public class User extends Pessoa {
  
  private String username;
  private String email;
  private String password;
  
  public User(
    String username,
    String email,
    String password,
    String nome,
    String sobrenome,
    int idade,
    double altura
  ) {
    super(nome, sobrenome, idade, altura);
    
    this.email = email;
    this.password = password;
    this.username = username;
  }

  /**
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * @param username the username to set
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" + "username=" + username + ", email=" + email + '}';
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + Objects.hashCode(this.email);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final User other = (User) obj;
    if (!Objects.equals(this.email, other.email)) {
      return false;
    }
    return true;
  }
}
