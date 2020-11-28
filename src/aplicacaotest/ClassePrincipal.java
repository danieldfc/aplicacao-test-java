/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaotest;

import java.util.Scanner;

/**
 *
 * @author danielfelizardo
 */
public class ClassePrincipal {
  
  public static int menu(Scanner sc) {
    System.out.println("--- Sistema gerenciameto de usuários ---");
    System.out.println("1 - Adicionar usuário");
    System.out.println("2 - Remover usuário");
    System.out.println("3 - Atualizar usuário");
    System.out.println("4 - Procurar usuário");
    System.out.println("5 - Sair");
    System.out.print("\nOpção: ");
    
    int opcao = sc.nextInt();
    
    return opcao;
  }
  
  public static void main(String[] args) {
    UserImplements principalUsers = new UserImplements();

    Scanner leitor = new Scanner(System.in);

    int op = menu(leitor);

    while(op != 5) {
      if (op == 1) {
        try {
          System.out.println("Adicionando novo usuário\n");

          System.out.print("Username: ");
          String username = leitor.next();

          System.out.print("Email: ");
          String email = leitor.next();
          
          System.out.print("Password: ");
          String password = leitor.next();
          
          System.out.print("Nome: ");
          String nome = leitor.next();
          
          System.out.print("Sobrenome: ");
          String sobrenome = leitor.next();
          
          System.out.print("Idade: ");
          int idade = leitor.nextInt();

          System.out.print("Altura: ");
          double altura = leitor.nextDouble();

          principalUsers.add(username, email, password, nome, sobrenome, idade, altura);
        } catch(UserAlreadyExistsException error) {
          System.out.println(error.getMessage());
        }
      } else if (op == 2) {
        try {
          System.out.print("Email: ");
          String email = leitor.next();
          principalUsers.delete(email);
          System.out.println("Usuário deletado.");
        } catch(NotFoundUserException error) {
          System.out.println(error.getMessage());
        }
      } else if (op == 3) {
        try {
          System.out.println("Atualizando usuário");
          System.out.println("Qual o email do usuário?");
          String emailOldUser = leitor.next();
          User oldUser = principalUsers.findbyEmail(emailOldUser);

          System.out.print("Username: ");
          String username = leitor.next();
          System.out.print("Email: ");
          String email = leitor.next();
          System.out.print("Password: ");
          String password = leitor.next();
          System.out.print("Nome: ");
          String nome = leitor.next();
          System.out.print("Sobrenome: ");
          String sobrenome = leitor.next();
          System.out.print("Idade: ");
          int idade = leitor.nextInt();
          System.out.print("Altura: ");
          double altura = leitor.nextDouble();

          User user = new User(username, email, password, nome, sobrenome,idade, altura);

          principalUsers.update(oldUser, user);
        } catch (NotFoundUserException error) {
          System.out.println(error.getMessage());
        }
      } else if (op == 4) {
        try {
          System.out.print("Email: ");
          String email = leitor.next();
          
          User user = principalUsers.findbyEmail(email);
          
          System.out.println(user.toString());
        } catch(NotFoundUserException error) {
          System.out.println(error.getMessage());
        }
      } else if (op <= 0 && op > 5) {
        System.out.println("Opção inválida, tente novamente!");
      }
      op = menu(leitor);
    }
    
    System.out.println("Volte sempre :) ");
    
    
    leitor.close();
  }
}
