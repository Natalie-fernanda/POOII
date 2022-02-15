//Programa que a partir de um valor e um limite calcula os conjuntos, união, interseção e diferença.


import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


class Main {
	public static void main(String[] args) {
		Random ger;
		int seed;
		int qtdeMax;
		int limiteValor;
		Scanner sc;		
		Set<Integer> conj1;
		Set<Integer> conj2;
		Set<Integer> uniao;
		Set<Integer> intersecao;
		Set<Integer> diferenca;

		sc = new Scanner(System.in);
		seed = sc.nextInt();
		limiteValor = sc.nextInt();
		qtdeMax = sc.nextInt();
		ger = new Random(seed);
		sc.close();
		
		conj1 = new TreeSet<>();
		for (int i=0; i<qtdeMax; ++i) {
			conj1.add(ger.nextInt(limiteValor));
		}
		
		System.out.print("Conjunto 1:");
		for (Integer elem1 : conj1) 
			System.out.print(" " + elem1);
		System.out.println();
		
		conj2 = new TreeSet<>();
		for (int i=0; i<qtdeMax; ++i) {
			conj2.add(ger.nextInt(limiteValor));
		}

		System.out.print("Conjunto 2:");
		for (Integer elem2 : conj2) 
			System.out.print(" " + elem2);
		System.out.println();
		
		uniao = new TreeSet<>(conj1);
		uniao.addAll(conj2);
		
		System.out.print("Uniao:");
		for (Integer elem3 : uniao) 
			System.out.print(" " + elem3);
		System.out.println();
		
		intersecao = new TreeSet<>(conj1);
		intersecao.retainAll(conj2);
		
		System.out.print("Intersecao:");
		for (Integer elem4 : intersecao) 
			System.out.print(" " + elem4);
		System.out.println();
		
		diferenca = new TreeSet<>(conj2);
		diferenca.removeAll(conj1);
		
		System.out.print("Diferenca 2-1:");
		for (Integer elem5 : diferenca) 
			System.out.print(" " + elem5);
		System.out.println();
		
		diferenca = new TreeSet<>(conj1);
		diferenca.removeAll(conj2);
		System.out.print("Diferenca 1-2:");
		for (Integer elem6 : diferenca) 
			System.out.print(" " + elem6);
		System.out.println();
	}
}
