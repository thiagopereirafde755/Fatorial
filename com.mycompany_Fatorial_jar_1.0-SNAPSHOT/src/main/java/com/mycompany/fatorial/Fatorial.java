package com.mycompany.fatorial;

import javax.swing.JOptionPane;

public class Fatorial {
    public static void main(String[] args) {
        
        double numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial:"));
        
    
        long fatorial = 1;
        int contador = (int) numero;
        
       
        while (contador > 1) {
            fatorial *= contador;
            contador--;
        }
        
        
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
    }
}
