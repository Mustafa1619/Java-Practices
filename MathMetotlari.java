/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathmetotlari;

import java.util.Scanner;

/**
 *
 * @author Gaming-3
 */
public class MathMetotlari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x;
        Scanner input= new Scanner(System.in);
        x = input.nextDouble();
        if(x < 0)
        {
            System.out.println((2*Math.abs(x-1))/3);
        }
        if(x == 0)
        {
            System.out.println(Math.sqrt(2)/Math.sqrt(3));
        }
        if(x > 0)
        {
            System.out.println((2*(Math.abs(x+1))/3));
        }    }
    
}
