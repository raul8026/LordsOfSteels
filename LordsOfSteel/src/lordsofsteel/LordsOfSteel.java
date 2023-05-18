/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lordsofsteel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rruiz
 */
public class LordsOfSteel {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Personatge normal: pd = (8+5)/4 = 3
        // Nan: pd = (8+6+5)/4 = 4
        // Nan: ps = (8+6) = 14
        //System.out.println("Punts de dany de n1: " + n1.getPd());
        //System.out.println("Punts de salut de n1: " + n1.getPs());

        /* Creació de personatges inicials */
        //Arma arma = new Arma("Daga");
        Nan n1 = new Nan("Tirion", 8, 6, 13, 16, 16, new Arma("Daga"));
        Huma h1 = new Huma("Luis", 13, 16, 6, 10, 6, new Arma("Espasa"));
        Mitja mi1 = new Mitja("Frodo", 9, 7, 7, 15, 16, new Arma("Martell"));
        Maia ma1 = new Maia("Nil", 7, 9, 12, 15, 17, new Arma("Daga"));

        /*Personatge[] personatges = new Personatge[4];
        personatges[0] = n1;
        personatges[1] = h1;*/
        ArrayList<Personatge> personatges = new ArrayList<Personatge>();
        personatges.add(n1);
        personatges.add(h1);
        personatges.add(mi1);
        personatges.add(ma1);
        int opcio = 1;
        while (opcio > 0 && opcio < 5) {
            /* Menú principal */
            System.out.println("");
            System.out.println("** MENÚ PRINCIPAL **");
            System.out.println("1.- Afegir personatge");
            System.out.println("2.- Esborrar personatge");
            System.out.println("3.- Editar personatge");
            System.out.println("4.- Iniciar combat");
            System.out.println("5.- Sortir");
            System.out.println("");
            System.out.print("Tria opció [1-5]: ");

            String entrada = sc.nextLine();

            // Només hem d'arribar aquí si estem segurs
            // que l'opció triada és un enter entre 1-5
            opcio = Integer.parseInt(entrada);

            if (opcio > 0 && opcio < 5) {
                switch (opcio) {
                    case 1:
                        String raza = sc.nextLine();
                        System.out.println("Digues la raza");
                        if (raza.equals("Nan")) {
                            System.out.println("Digues el nom");
                            String nom = sc.nextLine();
                            int max = 60;
                            System.out.println("Puntos de fuerza");
                            int forca = sc.nextInt();
                            System.out.println("Puntos de constitucio");
                            int constitucio = sc.nextInt();
                            System.out.println("Puntos de velocitat");
                            int velocitat = sc.nextInt();
                            System.out.println("Puntos de inteligenia");
                            int inteligencia = sc.nextInt();
                            System.out.println("Puntos de sort");
                            int sort = sc.nextInt();
                            int suma = forca + constitucio + velocitat + inteligencia + sort;

                            while (suma > max) {
                                System.out.println("Te has pasado de 60 puntos");
                                suma = 0;
                                System.out.println("Puntos de fuerza");
                                forca = sc.nextInt();
                                System.out.println("Puntos de constitucio");
                                constitucio = sc.nextInt();
                                System.out.println("Puntos de velocitat");
                                velocitat = sc.nextInt();
                                System.out.println("Puntos de inteligenia");
                                inteligencia = sc.nextInt();
                                System.out.println("Puntos de sort");
                                sort = sc.nextInt();
                                suma = forca + constitucio + velocitat + inteligencia + sort;
                            }
                            System.out.println("Que arma quieres");
                            String arma = sc.nextLine();
                        Nan n2 = new Nan(nom, forca, constitucio, velocitat, inteligencia, sort, new Arma(arma));
                        personatges.add(n2);
                        } else if (raza.equals("Huma")) {
                            System.out.println("Digues el nom");
                            String nom = sc.nextLine();
                            int max = 60;
                            System.out.println("Puntos de fuerza");
                            int forca = sc.nextInt();
                            System.out.println("Puntos de constitucio");
                            int constitucio = sc.nextInt();
                            System.out.println("Puntos de velocitat");
                            int velocitat = sc.nextInt();
                            System.out.println("Puntos de inteligenia");
                            int inteligencia = sc.nextInt();
                            System.out.println("Puntos de sort");
                            int sort = sc.nextInt();
                            int suma = forca + constitucio + velocitat + inteligencia + sort;

                            while (suma > max) {
                                System.out.println("Te has pasado de 60 puntos");
                                suma = 0;
                                System.out.println("Puntos de fuerza");
                                forca = sc.nextInt();
                                System.out.println("Puntos de constitucio");
                                constitucio = sc.nextInt();
                                System.out.println("Puntos de velocitat");
                                velocitat = sc.nextInt();
                                System.out.println("Puntos de inteligenia");
                                inteligencia = sc.nextInt();
                                System.out.println("Puntos de sort");
                                sort = sc.nextInt();
                                suma = forca + constitucio + velocitat + inteligencia + sort;
                            }
                            System.out.println("Que arma quieres");
                            String arma = sc.nextLine();
                        Huma h2 = new Huma(nom, forca, constitucio, velocitat, inteligencia, sort, new Arma(arma));
                        } else if (raza.equals("Mitja")) {
                            System.out.println("Digues el nom");
                            String nom = sc.nextLine();
                            int max = 60;
                            System.out.println("Puntos de fuerza");
                            int forca = sc.nextInt();
                            System.out.println("Puntos de constitucio");
                            int constitucio = sc.nextInt();
                            System.out.println("Puntos de velocitat");
                            int velocitat = sc.nextInt();
                            System.out.println("Puntos de inteligenia");
                            int inteligencia = sc.nextInt();
                            System.out.println("Puntos de sort");
                            int sort = sc.nextInt();
                            int suma = forca + constitucio + velocitat + inteligencia + sort;

                            while (suma > max) {
                                System.out.println("Te has pasado de 60 puntos");
                                suma = 0;
                                System.out.println("Puntos de fuerza");
                                forca = sc.nextInt();
                                System.out.println("Puntos de constitucio");
                                constitucio = sc.nextInt();
                                System.out.println("Puntos de velocitat");
                                velocitat = sc.nextInt();
                                System.out.println("Puntos de inteligenia");
                                inteligencia = sc.nextInt();
                                System.out.println("Puntos de sort");
                                sort = sc.nextInt();
                                suma = forca + constitucio + velocitat + inteligencia + sort;
                            }
                            System.out.println("Que arma quieres");
                            String arma = sc.nextLine();
                            Mitja mi2 = new Mitja(nom, forca, constitucio, velocitat, inteligencia, sort, new Arma(arma));
                        } else if (raza.equals("Maia")) {
                            System.out.println("Digues el nom");
                            String nom = sc.nextLine();
                            int max = 60;
                            System.out.println("Puntos de fuerza");
                            int forca = sc.nextInt();
                            System.out.println("Puntos de constitucio");
                            int constitucio = sc.nextInt();
                            System.out.println("Puntos de velocitat");
                            int velocitat = sc.nextInt();
                            System.out.println("Puntos de inteligenia");
                            int inteligencia = sc.nextInt();
                            System.out.println("Puntos de sort");
                            int sort = sc.nextInt();
                            int suma = forca + constitucio + velocitat + inteligencia + sort;

                            while (suma > max) {
                                System.out.println("Te has pasado de 60 puntos");
                                suma = 0;
                                System.out.println("Puntos de fuerza");
                                forca = sc.nextInt();
                                System.out.println("Puntos de constitucio");
                                constitucio = sc.nextInt();
                                System.out.println("Puntos de velocitat");
                                velocitat = sc.nextInt();
                                System.out.println("Puntos de inteligenia");
                                inteligencia = sc.nextInt();
                                System.out.println("Puntos de sort");
                                sort = sc.nextInt();
                                suma = forca + constitucio + velocitat + inteligencia + sort;
                            }
                            System.out.println("Que arma quieres");
                            String arma = sc.nextLine();
                            Maia ma2 = new Maia(nom, forca, constitucio, velocitat, inteligencia, sort, new Arma(arma));
                        }
                        break;
                    case 2:
                        raza = sc.nextLine();
                        System.out.println("Digues la raza");
                        if (raza.equals("Nan")) {
                            System.out.println("Digues el nom");
                            String nom = sc.nextLine();
                            if(n1.getNom().equals(nom)){
                                n1 = null;
                            }
                        }else if(raza.equals("Huma")) {
                            
                        }else if(raza.equals("Mitja")) {
                            
                        }else if(raza.equals("Maia")) {
                            
                        }
                        break;
                    case 3:
                        break;
                    case 4:
                        iniciarCombat(personatges);
                        break;
                    case 5:
                        break;
                }
            }

        }

    }

    public static void iniciarCombat(ArrayList<Personatge> personatges) {

        boolean[] seleccionats = new boolean[personatges.size()];
        Personatge[] lluitadors = new Personatge[2];
        //for (Personatge p : personatges)
        for (int selec = 1; selec <= 2; selec++) {
            for (int i = 0; i < personatges.size(); ++i) {
                if (!seleccionats[i]) {
                    String tipus = "";
                    if (personatges.get(i) instanceof Nan) {
                        tipus = "Nan";
                    } else if (personatges.get(i) instanceof Huma) {
                        tipus = "Huma";
                    } else if (personatges.get(i) instanceof Mitja) {
                        tipus = "Mitja";
                    } else if (personatges.get(i) instanceof Maia) {
                        tipus = "Maia";
                    }

                    System.out.printf("%d %s (%s)\n", (i + 1), personatges.get(i).getNom(),
                            tipus);
                }
            }
            System.out.print("\nTria un personatge " + selec + ": ");
            int opcio = sc.nextInt();
            seleccionats[opcio - 1] = true;
            lluitadors[selec - 1] = personatges.get(opcio - 1);
            System.out.println("Personatge triat: "
                    + personatges.get(opcio - 1).getNom());
        }

        // Inici combat
        Personatge atacant = lluitadors[0];
        Personatge defensor = lluitadors[1];

        Dau dau1 = new Dau();
        Dau dau2 = new Dau();
        Dau dau3 = new Dau();

        int valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
        //System.out.println("Valor daus: " + valor);

        if (valor <= atacant.getPa()) { // Atacant ataca
            valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
            if (valor > defensor.getPe()) { // No aconsegueix esquivar
                defensor.setPs(defensor.getPs() - atacant.getPd());
            }
        }

        // Final ronda
        Personatge aux = atacant;
        atacant = defensor;
        defensor = aux;
    }

}
