/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaotest;

/**
 *
 * @author danielfelizardo
 */
public interface UserInterface {
  
  public boolean add(
    String username,
    String email,
    String password,
    String nome,
    String sobrenome,
    int idade,
    double altura
  ) throws UserAlreadyExistsException;
  public User findbyEmail(String email) throws NotFoundUserException;
  public boolean update(User oldUser, User user) throws NotFoundUserException;
  public boolean delete(String email) throws NotFoundUserException;

}
