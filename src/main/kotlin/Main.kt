package org.example

fun main() {
    ejercicio1()
    ejercicio3()
}

/**
 * Ejercicio 1: Declarar variables en Java y Kotlin
 * En este ejercicio, compararemos cómo se declaran variables en ambos lenguajes y las
 * diferencias en cuanto a la inferencia de tipos.
 * Java:
 * public class Main {
 *  public static void main(String[] args) {
 *      int vida = 100;
 *      String personaje = "Naruto";
 *      System.out.println("El personaje " + personaje + " tiene " + vida + " puntos de vida.");
 *  }
 * }
 *
 */
fun ejercicio1() {
    val vida = 100
    val personaje = "Naruto"
    println("El personaje $personaje tiene $vida puntos de vida")
}

/**
 * Ejercicio 3: Uso de for y while
 * Vamos a practicar con bucles, que en ambos lenguajes se usan mucho, sobre todo en
 * situaciones como recorrer inventarios o colecciones de objetos.
 * Compara el uso del bucle for en ambos lenguajes, haciendo hincapié en cómo Kotlin
 * simplifica la sintaxis.
 * Java:
 * public class Main {
 *  public static void main(String[] args) {
 *      String[] cofres = {"Espada", "Escudo", "Poción"};
 *      for (String cofre : cofres) {
 *          System.out.println("Has encontrado: " + cofre);
 *      }
 *  }
 * }
 */
fun ejercicio3() {
    val cofres = listOf("Espada", "Escudo", "Pocion")
    cofres.forEach { println("Has encontrado: $it") }
}