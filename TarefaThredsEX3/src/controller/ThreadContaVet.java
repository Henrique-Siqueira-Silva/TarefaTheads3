package controller;

public class ThreadContaVet extends Thread  {
		
	int[] vet;
	int num;
	
	
	public ThreadContaVet(int[]vetor , int num) {
		this.vet = vetor;
		this.num = num;
	}

	@Override
	public void run() {
		if (num % 2 == 0) {
			TempoFor(vet);
		}else {	
			TempoForErach(vet);
		}
		
	}
	

	
	private void TempoForErach(int[] vet) {
		
		double TempoI = System.nanoTime();
		for (int i : vet) {
			
		}
		double TempoF = System.nanoTime();
		double TempoT = (TempoI - TempoF) / Math.pow(10, 9);
		System.out.println(TempoT);
	}

	private void TempoFor(int[] vet) {
		
		double TempoI = System.nanoTime();
		for ( int i = 0; i < vet.length; i ++) {
			
		}
		double TempoF = System.nanoTime();
		double TempoT = (TempoI - TempoF) / Math.pow(10, 9);
		System.out.println(TempoT);
	}





}
