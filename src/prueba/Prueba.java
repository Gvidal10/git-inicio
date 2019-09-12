/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Genaro Vidal
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        List<Integer> gato = new ArrayList<>(Arrays.asList(1,1,1,0,0,0,0,1));
        List<Integer> gato1 = new ArrayList<>(Arrays.asList(1,0,1,0,0,1,0,1));
        int cont = 0;
        String com, regresa;        
        com = "Primer comenario";
        NewClass e = new NewClass();
        
        
        cont = e.Devuelve(gato);
        regresa = e.Cometario(com);
        System.out.println("Los movimiento hechos para recorrer son="+cont);
        System.out.println("Frase="+regresa);
        System.out.println(e.Devuelve(gato1));
        System.out.println("La suma="+e.Suma(34,56));
        
        }

    
}














































































































































/*

POO
La programación orientada a objetos (POO) es una metodologia de desarrollo de software donde el funcionamiento se abstrae en unidades lógicas llamadas objetos y que trabajan de forma conjunta para cumplir un objetivo o propósito. Los objetos son creados mediante plantillas llamadas Clases, que contienen la definición y el comportamiento de cada objeto.
La programación orientada a objetos se fundamenta en cuatro principios: Encapsulación, Herencia, Polimorfismo y Abstracción.

Objeto: entidad existente en la memoria del ordenador que tiene unas propiedades (atributos o datos sobre sí mismo almacenados por el objeto) y unas operaciones disponibles específicas (métodos).
 
Clase: abstracción que define un tipo de objeto especificando qué propiedades (atributos) y operaciones disponibles va a tener.
1. Abstracción
Intención:
La abstracción significa ocultar detalles de nivel interior o exponer solo los detalles esenciales y relevantes a los usuarios.
public abstract class MiClaseAbstracta {
 
    // una propiedad normal como en cualquier clase
    private int propiedad;
 
    // una constante
    public static final int CONSTANTE = 1;
 
    // un metodo normal como en cualquier clase
    protected int sumar(int argumento1, int argumento2) {
         return argumento1 + argumento2;
    }
 
    // un metodo abstracto que tiene que ser
    // implementado por la clase que herede esta
    // clase abstracta.
    public abstract int restar(int argumento1, int argumento2);
}

2. Encapsulación
Intención:
La encapsulación se refiere a la combinación de datos y funciones asociadas como una sola unidad. En la POO, los datos y las funciones que operan con estos datos se combinan para tomar una sola unidad, lo que se conoce como una clase.

poner geter y seter



3. Herencia
Intención:
La herencia es una relación entre una super clase y sus sub clases.
En consecuencia, este es un proceso donde un objeto adquiere los miembros de otro; además, el mismo puede formar parte de él.

EJEMPLO DE HERENCIA EN JAVA. EXTENDS Y SUPER.

Para declarar la herencia en Java usamos la palabra clave extends. Ejemplo: public class MiClase2 extends Miclase1. Para familiarizarte con la herencia te proponemos que escribas y estudies un pequeño programa donde se hace uso de ella. Escribe el código de las clases que mostramos a continuación.
//Código de la clase profesor, subclase de la clase Persona ejemplo aprenderaprogramar.com

public class Profesor extends Persona {

    //Campos específicos de la subclase.

    private String IdProfesor;

    //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase

    public Profesor (String nombre, String apellidos, int edad) {

        super(nombre, apellidos, edad);

        IdProfesor = "Unknown";   } //Cierre del constructor

    //Métodos específicos de la subclase

    public void setIdProfesor (String IdProfesor) { this.IdProfesor = IdProfesor;   }

    public String getIdProfesor () { return IdProfesor;   }

    public void mostrarNombreApellidosYCarnet() {

        // nombre = "Paco"; Si tratáramos de acceder directamente a un campo privado de la superclase, salta un error

        // Sí podemos acceder a variables de instancia a través de los métodos de acceso públicos de la superclase

        System.out.println ("Profesor de nombre: " + getNombre() + " " +  getApellidos() +

         " con Id de profesor: " + getIdProfesor() ); }

} //Cierre de la clase

4. Polimorfismo
Intención:
El polimorfismo nos permite realizar una misma acción de diferentes maneras
El polimorfismo le permite definir una interfaz y tener múltiples implementaciones
Podemos crear funciones o variables de referencia que se comportan de manera diferente en diferentes contextos programáticos.
El polimorfismo significa muchas formas.

*/
