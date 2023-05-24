/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binaria;

import java.util.concurrent.TimeUnit;

public class BuscaBinaria {
    
    public static void main(String[] args) {
        System.out.println("Busca Binaria");
        System.out.println("Bateria de testes: ");
        
        
        //10 mil números
        System.out.println("Executando testes para 10 mil numeros: ");
            DezMil buscaDezMil = new DezMil();
            long startDezMil = System.nanoTime();
            buscaDezMil.buscaDezMil();
            long endDezMil = System.nanoTime();
            long totalDezMil = endDezMil - startDezMil;
            long convertDezMil = TimeUnit.SECONDS.convert(totalDezMil, TimeUnit.NANOSECONDS);
            System.out.println("Foram gastos " + convertDezMil + " segundos.");
        
        
        //100 mil números
        System.out.println("Executando testes para 100 mil numeros: ");
            CemMil buscaCemMil = new CemMil();
            long startCemMil = System.nanoTime();
            buscaCemMil.buscaCemMil();
            long endCemMil = System.nanoTime();
            long totalCemMil = endCemMil - startCemMil;
            long convertCemMil = TimeUnit.SECONDS.convert(totalCemMil, TimeUnit.NANOSECONDS);
            System.out.println("Foram gastos " + convertCemMil + " segundos.");
            
            
        //1 millhão de números
        System.out.println("Executando testes para 1 milhao de numeros: ");
            UmMilhao buscaUmMilhao = new UmMilhao();
            long startUmMilhao = System.nanoTime();
            buscaUmMilhao.buscaUmMilhao();
            long endUmMilhao = System.nanoTime();
            long totalUmMilhao = endUmMilhao - startUmMilhao;
            long convertUmMilhao = TimeUnit.SECONDS.convert(totalUmMilhao, TimeUnit.NANOSECONDS);
            System.out.println("Foram gastos " + convertUmMilhao + " segundos.");
            
            
        //10 milhões de números
        System.out.println("Executando testes para 10 milhoes de numeros: ");
            DezMilhoes buscaDezMilhoes = new DezMilhoes();
            long startDezMilhoes = System.nanoTime();
            buscaDezMilhoes.buscaDezMilhoes();
            long endDezMilhoes = System.nanoTime();
            long totalDezMilhoes = endDezMilhoes - startDezMilhoes;
            long convertDezMilhoes = TimeUnit.SECONDS.convert(totalDezMilhoes, TimeUnit.NANOSECONDS);
            System.out.println("Foram gastos " + convertDezMilhoes + " segundos.");
        
        
        //100 milhões de números
        System.out.println("Executando testes para 100 milhoes de numeros: ");
            CemMilhoes buscaCemMilhoes = new CemMilhoes();
            long startCemMilhoes = System.nanoTime();
            buscaCemMilhoes.buscaCemMilhoes();
            long endCemMilhoes = System.nanoTime();
            long totalCemMilhoes = endCemMilhoes - startCemMilhoes;
            long convertCemMilhoes = TimeUnit.SECONDS.convert(totalCemMilhoes, TimeUnit.NANOSECONDS);
            System.out.println("Foram gastos " + convertCemMilhoes + " segundos.");
       
        
        
      
        
    }
}
