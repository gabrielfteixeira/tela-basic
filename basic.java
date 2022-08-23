package atividade;

import java.util.Scanner;

public class atividade {
	public static void main(String entrada[]) {
		
		Scanner ler = new Scanner(System.in);
		
		//declaracao de variaveis
		int[] idade = new int[20];
		char[] civil = new char[20];
		
		int casados= 0;
		
		int solteiros= 0;
		
		int viuvos = 0;
		int[] idadeViuvos = new int[20];
		int mediaIdadeViuvos = 0;
		
		int separados = 0;
		String msg= "";
		
		
		for (int x = 0; x < 20; x++) {
			//entrada de dados
			System.out.printf("Digite a idade da pessoa:\n");
			idade[x] = ler.nextInt();
			 
			System.out.printf("Digite o estado civil \n c - casado, s - solteiro, v - viúvo e d – desquitado ou separado ");
			civil[x] = ler.next().charAt(0);
			
			
			
			if(civil[x] == 'c') {
				casados = casados+1;
			}
			else if(civil[x] == 's') {
				solteiros= solteiros+1;
			}
			else if(civil[x] == 'v') {
				viuvos = viuvos+1;
				idadeViuvos[x]=idade[x];
			}
			else if(civil[x] == 'd') {
				separados = separados+1;
			}
			
		}
		//calculo dos viuvos
		for (int y = 0; y < 20; y++) {
			mediaIdadeViuvos = mediaIdadeViuvos + idadeViuvos[y];
			
		}
		
		mediaIdadeViuvos = mediaIdadeViuvos / viuvos;
		
		
		//fazer porcentagem
		Double aux;
		aux = (double) ((separados / 20)*100);
		
		
		//saida de resultados
		System.out.println("");
		msg = msg + "Quantidade de casados: "+casados+"\n";
		msg = msg + "Quantidade de solteiros: "+solteiros+"\n";
		msg = msg + "Media da idade dos viuvos: "+mediaIdadeViuvos+"\n";
		msg = msg + "Porcentagem de pessoas desquitadas ou separadas: "+aux+"% \n";
		
		
		System.out.println(msg);
		
	}
}