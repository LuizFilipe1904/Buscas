/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sequencial;

import java.util.Scanner;

public class DezMilhoes {
    public void buscaDezMilhoes(){
        int [] vetor = new int [10000000];
        
        
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random() * 10000000);
            
        }
        
        System.out.println("Qual valor deseja buscar?");
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();
        
        boolean achou = false;
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] == buscado){
                achou = true;
                break;
            }
        }
        if (achou){
            System.out.println("Numero encontrado!");
        }else{
            System.out.println("Numero nao encontrado!");
        }
        
    }
}
