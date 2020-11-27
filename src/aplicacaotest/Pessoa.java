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
public class Pessoa {

  private String nome;
  private String sobrenome;
  private int idade;
  private double altura;

  public Pessoa() {
    this("", "", 0, 0.0);
  }

  public Pessoa(String nome, String sobrenome, int idade, double altura) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.idade = idade;
    this.altura = altura;
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return the sobrenome
   */
  public String getSobrenome() {
    return sobrenome;
  }

  /**
   * @param sobrenome the sobrenome to set
   */
  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  /**
   * @return the idade
   */
  public int getIdade() {
    return idade;
  }

  /**
   * @param idade the idade to set
   */
  public void setIdade(int idade) {
    this.idade = idade;
  }

  /**
   * @return the altura
   */
  public double getAltura() {
    return altura;
  }

  /**
   * @param altura the altura to set
   */
  public void setAltura(double altura) {
    this.altura = altura;
  }
  
  /**
   * Clica com o botão direito, do mouse e clica em "Insert code"
   * logo depois clicar em "toString()..."
   * @return 
   */
  @Override
  public String toString() {
    return "Pessoa{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + ", altura=" + altura + '}';
  }

  /**
   * Clica com o botão direito, do mouse e clica em "Insert code"
   * logo depois clicar em "equals() and hashCode()..."
   * @return 
   */
  @Override
  public int hashCode() {
    int hash = 5;
    hash = 47 * hash + Objects.hashCode(this.nome);
    hash = 47 * hash + Objects.hashCode(this.sobrenome);
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
    final Pessoa other = (Pessoa) obj;
    if (!Objects.equals(this.nome, other.nome)) {
      return false;
    }
    if (!Objects.equals(this.sobrenome, other.sobrenome)) {
      return false;
    }
    return true;
  }
}
