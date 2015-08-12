/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 31411525
 */
public class EX3 {
    private String nome;
    private double distancia;
    public EX3() {
       List praia= new ArrayList();
       Scanner ent = new Scanner(System.in);
       System.out.println("Digite o nome da praia: ");
       nome = ent.next();
       praia.add(nome);
       System.out.println("Digite a distancia: ");
       distancia = ent.nextDouble();
       praia.add(distancia);
       
//        for (Object a : praia) {
//            System.out.println(a);
        }

    public String getNome() {
        return nome;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    
    
}
