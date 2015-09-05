/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author espemi01
 */
public class Complex {
  private Double realpart;
  private Double imagpart;

  public Complex(double realpart, double imaginarypart){

    this.realpart = realpart;
    this.imagpart = imaginarypart;
  }

  public Number add(Complex otherNumber) {

    Complex other = (Complex) otherNumber;
    
    return new Complex(realpart + other.realpart, imagpart + other.imagpart);
  }

  public String toString() {

    return this.realpart + "+" + this.imagpart "i";
  }
}