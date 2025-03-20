package principal;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Perro objPerro = new Perro(5, "Pastor", "Laika");
        Animal objAnimal;

        objAnimal = objPerro;

        System.out.println(objAnimal.getEdad());
        System.out.println(objAnimal.nombreCientifico);
        // Hacemos casting a perro para que este animal en concreto pueda ladrar,
        // conocer su raza...
        // 1º Forma Instanciando objeto casteado
        Perro p = (Perro) objAnimal;
        System.out.println(p.raza);
        p.ladrar();
        // 2º Forma sin instanciar nada, casteamos en cada llamada
        System.out.println(((Perro) objAnimal).raza);
        ((Perro) objAnimal).ladrar();

        ((Mosca) objAnimal).muestraDatos();

        Animal[] bichos = new Animal[3];
        bichos[0] = new Perro(5, "Pastor", "Laika");
        bichos[1] = new Mosca();
        bichos[2] = new Ardilla();
        // Recorremos el ARRAY bichos
        for (Animal animal : bichos) {
            // Metemos condiciones para que dependiendo de la clase de cada objeto se ejecute una opcion en concreto
            
            if (animal.getClass() == Perro.class) {
                System.out.println(((Perro) animal).nombreHumano);
            } else {
                if (animal.getClass() == Mosca.class) {
                    animal.muestraDatos();
                } else {
                    System.out.println(animal.nombreCientifico);
                }
            }

            System.out.println(animal.nombreCientifico);
        }

        ArrayList<Object> cosas = new ArrayList<>();
        cosas.add("hola");
        cosas.add(4);
        cosas.add(new Perro());
        cosas.add(bichos);
    }
}
