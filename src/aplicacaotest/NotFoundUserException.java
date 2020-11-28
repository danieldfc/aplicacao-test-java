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
public class NotFoundUserException extends Exception {
  
  private static final long serialVerisonUID = 1L;
  
  public NotFoundUserException(String msg) {
    super(msg);
  }
}
