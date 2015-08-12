    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB;

import java.util.Scanner;

/**
 *
 * @author 31411525
 */
public class EX2 {

    private int op;

    public EX2() {
        Scanner ent = new Scanner(System.in);
        System.out.println(" 1-Solteiro(a)\n 2-Desquitado(a)\n 3-Casado\n 4-Divorciado(a)\n 5-Viuvo(a)");
        System.out.println("Digite uma opção valida: ");
        op = Integer.parseInt(ent.nextLine());

        switch (op) {
            case 1:
                System.out.println("Solteiro");
                break;
            case 2:
                System.out.println("Desquitado");
                break;
            case 3:
                System.out.println("Casado");
                break;
            case 4:
                System.out.println("Divorciado");
                break;
            case 5:
                System.out.println("Viuvo");
                break;
            default:
                System.out.println("Opção Invalida");
                
        }
    }

}
