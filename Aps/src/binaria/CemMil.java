/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binaria;

import java.util.Arrays;
import java.util.Scanner;


public class CemMil {
    public void buscaCemMil(){
        int [] vetor = new int[100000];
        
        for (int i = 0; i < vetor.length; i++) {
           vetor[i] = (int)(Math.random() * 100000);  
        }
        
        Arrays.sort(vetor);
        System.out.println("Qual numero deseja buscar?");
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();
        
        int contador = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        
        while(inicio <= fim){
            meio = (int)((inicio + fim) / 2);
            contador ++;
            if(vetor[meio] == buscado){
                achou = true;
                break;
            }else if(vetor[meio] < buscado){
                inicio = meio + 1;
            }else{
                fim = meio - 1;
            }
            
        }
        System.out.println("Quantidade de testes feitos: " + contador);
        if(achou == true){
            System.out.println("Numero encontrado!");
        }else{
            System.out.println("Numero nao encontrado!");
        }
    }
}
