/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaotest;

import java.util.ArrayList;

/**
 *
 * @author danielfelizardo
 */
public class UserImplements implements UserInterface {

  private ArrayList<User> users;
  
  public UserImplements() {
    this.users = new ArrayList();
  }
  
  @Override
  public boolean add(
    String username,
    String email,
    String password,
    String nome,
    String sobrenome,
    int idade,
    double altura
  ) throws UserAlreadyExistsException {
    User user = new User(username, email, password, nome, sobrenome, idade, altura);
    
    for (User each: this.users) {
      if (user.equals(each)) {
        throw new UserAlreadyExistsException("Usuário existente.");
      }
    }

    return this.users.add(user);
  }

  @Override
  public User findbyEmail(String email) throws NotFoundUserException {
    User user = new User("", email, "", "", "", 0, 0.0);
    
    for (User each: this.users) {
      if (each.equals(user)) {
        return each;
      }
    }
    
    throw new NotFoundUserException("User not found.");
  }

  @Override
  public boolean update(User oldUser, User user) throws NotFoundUserException {
    for (int i = 0; i < this.users.size(); i++) {
      if (oldUser.equals(this.users.get(i))) {
        this.users.set(i, user);

        return true;
      }
    } 
    
    throw new NotFoundUserException("User not found.");
  }

  @Override
  public boolean delete(String email) throws NotFoundUserException {
    User user = new User("", email, "", "", "", 0, 0.0);
    
    for (User each: this.users) {
      if (each.equals(user)) {
        return this.users.remove(each);
      }
    }
    
    throw new NotFoundUserException("User not found.");
  }

}
