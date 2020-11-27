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
  public boolean findbyEmail(String email) throws NotFoundUserException {
    User user = new User("", email, "", "", "", 0, 0.0);
    
    for (User each: this.users) {
      if (each.equals(user)) {
        return true;
      }
    }
    
    throw new NotFoundUserException("Usuário não encontrado.");
  }

  @Override
  public boolean update(User user) throws NotFoundUserException {
    int index = this.users.indexOf(user);

    if (index < 0) {
      throw new NotFoundUserException("User not found.");
    }

    this.users.set(index, user);

    return true;
  }

  @Override
  public boolean delete(String email) throws NotFoundUserException {
    User user = new User("", email, "", "", "", 0, 0.0);
    
    for (User each: this.users) {
      if (each.equals(user)) {
        return this.users.remove(each);
      }
    }
    
    throw new NotFoundUserException("Usuário não encontrado.");
  }

}
