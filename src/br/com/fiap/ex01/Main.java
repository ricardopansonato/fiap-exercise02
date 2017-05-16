package br.com.fiap.ex01;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		CalculadoraBasica calculadoraBasica = new CalculadoraImpl();
		Float valor1 = Float.valueOf(JOptionPane.showInputDialog("Valor 1:"));
		Float valor2 = Float.valueOf(JOptionPane.showInputDialog("Valor 2:"));
		String operator = JOptionPane.showInputDialog("Operação:");
		
		Float resultado = 0f;
		switch (operator) {
		case "+":
			resultado = calculadoraBasica.somar(valor1, valor2);
			break;
		case "-":
			resultado = calculadoraBasica.subtrair(valor1, valor2);
			break;
		case "/":
			resultado = calculadoraBasica.dividir(valor1, valor2);
			break;
		case "*":
			resultado = calculadoraBasica.multiplicar(valor1, valor2);
			break;
		}
		
		System.out.println("Resultado: " + resultado);
	}
}
