package view;

import javax.swing.JOptionPane;

import controller.ThreadContaVet;

public class main {

	public static void main(String[] args) {

		int[] vet = new int[1000];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) (Math.random() * 1000 + 1);
		}

	
		int num = 0;
		while (num != 9) {

			 num = Integer.parseInt(JOptionPane
					.showInputDialog("digite um numero par para for e impar para for each \n digite 9 para fim"));

			ThreadContaVet t = new ThreadContaVet(vet, num);
			t.start();
		}
	}

}
