/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazoogit;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class AplicacionZoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        int opcion;
        String nombre = null;
        String paisOrigen = null;
        double peso = 0;
        int edad = 0;
        Animal a = null;
        Zoologico v = null;

        do {
            mostrarMenu();
            System.out.println("Introduce la opcion");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("");
                    System.out.println("Crea el zoologico");
                    v = new Zoologico();
                    break;
                case 1:
                    System.out.println("");
                    System.out.println("1. Añade un animal");
                    teclado.nextLine();
                    System.out.println("Introduce nombre");
                    nombre = teclado.nextLine();

                    System.out.println("Introduce pais de Origen");
                    paisOrigen = teclado.nextLine();
                    System.out.println("Introduce peso");
                    peso = teclado.nextDouble();
                    System.out.println("Introduce edad");
                    edad = teclado.nextInt();

                    a = new Animal(nombre, paisOrigen, peso, edad);
                    v.añadirAnimal(a);
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("2. Comprobar animales del pais");
                    System.out.println("Introduce el pais que deseas comprobar");
                    teclado.nextLine();
                    paisOrigen = teclado.nextLine();
                    if (v.existeAnimaldelPais(paisOrigen)) {
                        System.out.println("Hay animales en este pais");

                    } else {
                        System.out.println("No hay animales en este pais");
                    }
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("3. Promedio de edad");
                    System.out.println("La edad promedio es " + v.edadPromedio());
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("4. Borrar animales del pais");
                    System.out.println("Introduce el pais del que quieres borrar los animales");
                    teclado.nextLine();
                    paisOrigen = teclado.nextLine();
                    v.eliminaAnimalesDe(paisOrigen);
                    System.out.println("Han sido borrados");
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("5. Animales mas pesados que el peso");
                    System.out.println("Indica el peso de referencia");
                    peso = teclado.nextDouble();
                    System.out.println(v.cuantosPesanMas(peso) + " animales pesan mas");
                    break;
                case 6:
                    System.out.println("");
                    System.out.println("6. Comprueba si el animal existe");
                    System.out.println("¿Que animal quieres comprobar?");
                    teclado.nextLine();
                    nombre = teclado.nextLine();

                    if (v.siEsta(nombre)) {
                        System.out.println("Este animal existe");

                    } else {
                        System.out.println("Este animal NO existe");
                    }
                    break;
                case 7:
                    System.out.println("");
                    System.out.println("7. Muestra el primer animal introducido");
                    v.edadDelPrimero();
                    break;
                case 8:
                    System.out.println("");
                    System.out.println("8. Muestra el peso del ultimo animal introducido");
                    v.pesoDelUltimo();
                    break;
                case 9:
                    System.out.println("");
                    System.out.println("9. Sustituye un animal por otro");
                    teclado.nextLine();
                    System.out.println("Introduce nombre");
                    nombre = teclado.nextLine();

                    System.out.println("Introduce pais de Origen");
                    paisOrigen = teclado.nextLine();
                    System.out.println("Introduce peso");
                    peso = teclado.nextDouble();
                    System.out.println("Introduce edad");
                    edad = teclado.nextInt();
                    System.out.println("En que posicion lo quieres");
                    int pos = teclado.nextInt();

                    a = new Animal(nombre, paisOrigen, peso, edad);
                    v.reemplazaAnimal(a, pos);
                    break;
                case 10:
                    System.out.println("");
                    System.out.println("10. Elimina el animal en la posicion");
                    teclado.hasNextLine();
                    System.out.println("¿Cual es la posicion del animal que quieres borrar?");
                    pos = teclado.nextInt();
                    v.eliminaAnimal(pos);
                    break;
                case 11:
                    System.out.println("");
                     System.out.println("11. Inserta animal en la posicion");
                     teclado.nextLine();
                   System.out.println("Introduce nombre");
                    nombre = teclado.nextLine();

                    System.out.println("Introduce pais de Origen");
                    paisOrigen = teclado.nextLine();
                    System.out.println("Introduce peso");
                    peso = teclado.nextDouble();
                    System.out.println("Introduce edad");
                    edad = teclado.nextInt();
                    System.out.println("En que posicion lo quieres");
                    pos = teclado.nextInt();

                    a = new Animal(nombre, paisOrigen, peso, edad);
                    v.insertaAnimal(a, pos);
                    break;
                case 12:
                    System.out.println("");
                    System.out.println("12. Elimina todos los animales");
                    v.clausuraZoo();
                    System.out.println("TODO EL ZOO HA SIDO BORRADO");
                    break;
                case 13:
                    System.out.println("");    
                   System.out.println("13. Comprueba si el zoo esta vacio");
               if( v.zooClausurado()){
                   System.out.println("El ZOO esta cerrado");
               }else{
                   System.out.println("El ZOO sigue abierto");
               }
               break; 
                case 14:
                    System.out.println("");
                    v.mostrarZoo();
                   
                    break;

            }
        } while (opcion <= 14);
    }

    public static void mostrarMenu() {
        System.out.println("");
        System.out.println("**********************");
        System.out.println("0. Crea el zoologico");
        System.out.println("1. Añade un animal");
        System.out.println("2. Comprobar animales del pais");
        System.out.println("3. Promedio de edad");
        System.out.println("4. Borrar animales del pais");
        System.out.println("5. Animales mas pesados que el peso");
        System.out.println("6. Comprueba si el animal existe");
        System.out.println("7. Muestra la edad del primer animal introducido");
        System.out.println("8. Muestra el peso del ultimo animal introducido");
        System.out.println("9. Sustituye el animal en la posicion");
        System.out.println("10. Elimina el animal en la posicion");
        System.out.println("11. Inserta animal en la posicion");
        System.out.println("12. Elimina todos los animales");
        System.out.println("13. Comprueba si el zoo esta vacio");
        System.out.println("14. Listar ZOO");
        System.out.println("***************************************");
        System.out.println("");
    }
}
