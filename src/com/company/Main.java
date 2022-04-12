package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcion = 0;
        ArrayList<Nave> naves = new ArrayList<>();
        Scanner leer=new Scanner(System.in);

        System.out.println("Cordial saludo futuro navegante espacial");

        while (opcion != 6) {
            System.out.println(" A continuación te damos la opción de crear diferentes tipos de naves, ¿Cual deseas crear?");
            System.out.println("1. Nave Lanzera");
            System.out.println("2. Nave no Tripulada");
            System.out.println("3. Nave Tripulada");
            System.out.println("4. Estación Espacial");
            System.out.println("5. Ver toda mi flota");
            System.out.println("6. Salir");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    NaveLanzadera n1 = new NaveLanzadera();
                    System.out.println("Para crear tu Nave Lanzadera por favor primero asignale un nombre: ");
                    n1.setNombre(leer.nextLine());
                    System.out.println("Ahora indica la cantidad de motores que posee: ");
                    n1.setMotores(leer.nextInt());
                    leer.nextLine();
                    System.out.println("indica que combustible usará tus motores: ");
                    n1.setCombustible(leer.nextLine());
                    System.out.println("Que potencia genera cada motor: ");
                    n1.setPotencia_por_motor(leer.nextDouble());
                    leer.nextLine();
                    System.out.println("indica el peso total de tu nave en Kg: ");
                    n1.setPeso(leer.nextDouble());
                    leer.nextLine();
                    System.out.println("indica la capacidad de carga de la nave en Kg: ");
                    n1.setCapacidad_carga(leer.nextDouble());
                    naves.add(n1);
                    break;
                case 2:
                    NaveNoTripulada n2 = new NaveNoTripulada();
                    System.out.println("Para crear tu Nave No Tripulada por favor primero asignale un nombre: ");
                    n2.setNombre(leer.nextLine());
                    System.out.println("Ahora indica la cantidad de motores que posee: ");
                    n2.setMotores(leer.nextInt());
                    leer.nextLine();
                    System.out.println("indica que combustible usará tus motores: ");
                    n2.setCombustible(leer.nextLine());
                    System.out.println("Que potencia genera cada motor: ");
                    n2.setPotencia_por_motor(leer.nextDouble());
                    leer.nextLine();
                    System.out.println("indica el peso total de tu nave en Kg: ");
                    n2.setPeso(leer.nextDouble());
                    leer.nextLine();
                    System.out.println("indica el planeta que exploraremos: ");
                    n2.setPlaneta(leer.nextLine());
                    naves.add(n2);
                    break;
                case 3:
                    NaveTripulada n3 = new NaveTripulada();
                    System.out.println("Para crear tu Nave Tripulada por favor primero asignale un nombre: ");
                    n3.setNombre(leer.nextLine());
                    System.out.println("Ahora indica la cantidad de motores que posee: ");
                    n3.setMotores(leer.nextInt());
                    leer.nextLine();
                    System.out.println("indica que combustible usará tus motores: ");
                    n3.setCombustible(leer.nextLine());
                    System.out.println("Que potencia genera cada motor: ");
                    n3.setPotencia_por_motor(leer.nextDouble());
                    leer.nextLine();
                    System.out.println("indica el peso total de tu nave en Kg: ");
                    n3.setPeso(leer.nextDouble());
                    leer.nextLine();
                    System.out.println("Ahora indica la cantidad de pasajeros de la nave: ");
                    n3.setCapacidad_pasajeros(leer.nextInt());
                    leer.nextLine();
                    System.out.println("Indica cual es la misión de los tripulantes: ");
                    n3.setMision(leer.nextLine());
                    naves.add(n3);
                    break;
                case 4:
                    EstacionEspacial n4 = new EstacionEspacial();
                    System.out.println("Para crear tu estación espacial por favor primero asignale un nombre: ");
                    n4.setNombre(leer.nextLine());
                    System.out.println("Ahora indica la cantidad de motores que posee: ");
                    n4.setMotores(leer.nextInt());
                    leer.nextLine();
                    System.out.println("indica que combustible usará tus motores: ");
                    n4.setCombustible(leer.nextLine());
                    System.out.println("Que potencia genera cada motor: ");
                    n4.setPotencia_por_motor(leer.nextDouble());
                    leer.nextLine();
                    System.out.println("indica el peso total de tu nave en Kg: ");
                    n4.setPeso(leer.nextDouble());
                    leer.nextLine();
                    System.out.println("Ahora indica cuantas personas viviran en la estación espacial: ");
                    n4.setCapacidad_pasajeros(leer.nextInt());
                    leer.nextLine();
                    System.out.println("Indica cual es la misión de los tripulantes: ");
                    n4.setMision(leer.nextLine());
                    naves.add(n4);
                    break;
                case 5:

                    if (naves.isEmpty()){
                        System.out.println("Tu flota esta vacia, animo, crea una nave. ");
                        break;
                    }
                    for (int i = 0; i < naves.size(); i++) {

                        System.out.println(i + 1 + ". " + naves.get(i).getNombre() + naves.get(i));

                    }
                    System.out.println("");
                    break;
                default:
                    break;
            }

        }
    }
}
