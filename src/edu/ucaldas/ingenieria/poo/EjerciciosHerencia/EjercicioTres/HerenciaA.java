package edu.ucaldas.ingenieria.poo.EjerciciosHerencia.EjercicioTres;

public class HerenciaA {

    public static void main(String[] args) {

        Gato gato = new Gato();
        Perro perro = new Perro();
        Ave ave = new Ave();
        Mascota mascota = new Mascota();
        
        gato.dormir();

        //ave.dormir();
        
        /*
        Gato gato = new Gato("gato", "raza", 2);
        Perro perro = new Perro("perro", "raza", 2);
        

        /*
        System.out.println(gato);
        System.out.println(perro);
        */
    }
    
}
