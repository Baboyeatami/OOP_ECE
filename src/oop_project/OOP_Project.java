/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import javax.swing.JOptionPane;

/**
 *
 * @author Jamie Eduardo Rosal <Jamiewertalmighty@gmail.com>
 */
public class OOP_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int A = Integer.parseInt(JOptionPane.showInputDialog("Enter Value"));

        System.out.println(A);

        JOptionPane.showMessageDialog(null, "value is entered is  " + A);

    }

}
