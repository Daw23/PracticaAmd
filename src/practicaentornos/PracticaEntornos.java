/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaentornos;

import java.util.ArrayList;
import java.util.List;


public class PracticaEntornos {

  
  public static void main(String[] args) {
    System.out.println("Practica entornos ");
    
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
    
    List<String> frutas = new ArrayList<>();
    frutas.add("patata");
    frutas.add("pepinillos");
    frutas.add("tomates");
    
    for (String s : frutas) {
      System.out.println(s);
    }
    
    
  }
  
}
