/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazoogit;

import java.util.ArrayList;

/**
 *
 * @author mati
 */
public class Zoologico {

    ArrayList<Animal> listaAnimal;

    Zoologico() {
        this.listaAnimal = new ArrayList<Animal>();
    }

    public Zoologico(ArrayList<Animal> listaAnimal) {
        this.listaAnimal = listaAnimal;
    }

    public void añadirAnimal(Animal a) {
        this.listaAnimal.add(a);
    }
    public void mostrarZoo(){
        System.out.println("ANIMALITOS");
        for(Animal a: listaAnimal){
            a.mostrarAnimal();
        }
    }
    public boolean existeAnimaldelPais(String p) {
        for (int i = 0; i < this.listaAnimal.size(); i++) {
            if (this.listaAnimal.get(i).paisOrigen.equalsIgnoreCase(p)) {
                return true;
            }
        }
        return false;
    }

    public int edadPromedio() {
        int media;
        int suma = 0;
        for (int i = 0; i < this.listaAnimal.size(); i++) {

            suma += this.listaAnimal.get(i).edad;
        }
        media = suma / this.listaAnimal.size();
        return media;
    }

    public void eliminaAnimalesDe(String p) {
        for (int i = 0; i < this.listaAnimal.size(); i++) {
            if (this.listaAnimal.get(i).getPaisOrigen().equals(p)) {
                this.listaAnimal.remove(i);
                i--;
            }
        }
    }

    public int cuantosPesanMas(double p) {
        int suma = 0;
        for (int i = 0; i < this.listaAnimal.size(); i++) {
            if (this.listaAnimal.get(i).peso > p) {
                suma++;
            }

        }
        return suma;
    }

    public boolean siEsta(String a) {
        for (int i = 0; i < this.listaAnimal.size(); i++) {
            System.out.println(this.listaAnimal.get(i).getNombre());
            if (this.listaAnimal.get(i).nombre.equalsIgnoreCase(a)) {
                System.out.println("encontrado");
                return true;
            }
        }
        return false;
    }
    
    public void edadDelPrimero(){
        System.out.println("La edad del primer animal es "+this.listaAnimal.get(0).edad);
    } 
    
    public void pesoDelUltimo(){
        System.out.println("El peso del ultimo animal es "+this.listaAnimal.get(this.listaAnimal.size()-1).peso);
    }

    public void reemplazaAnimal(Animal a, int pos){
        this.listaAnimal.set(pos, a);
            
    }
    
    public void eliminaAnimal(int pos){
        this.listaAnimal.remove(pos);
    }
    
    public void insertaAnimal(Animal a, int pos){
        this.listaAnimal.add(pos, a);
       
    }
    
    public void clausuraZoo(){
        this.listaAnimal.removeAll(listaAnimal);
    }
    
    public boolean zooClausurado(){
        return this.listaAnimal.isEmpty();
}
    //GETTERS Y SETTERS
    public ArrayList<Animal> getListaAnimal() {
        return listaAnimal;
    }

    public void setListaAnimal(ArrayList<Animal> listaAnimal) {
        this.listaAnimal = listaAnimal;
    }

}
