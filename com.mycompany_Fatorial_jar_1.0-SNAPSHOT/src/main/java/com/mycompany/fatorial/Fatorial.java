package com.mycompany.fatorial;

import javax.swing.JOptionPane;

public class Fatorial {
    public static void main(String[] args) {
        // Get the input from the user
        double numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial:"));
        
        // Initialize variables
        long fatorial = 1;
        int contador = (int) numero;
        
        // Calculate the factorial
        while (contador > 1) {
            fatorial *= contador;
            contador--;
        }
        
        // Display the result
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
    }
}
