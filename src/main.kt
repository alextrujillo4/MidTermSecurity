import Cypher.Multiplicative
import Cypher.Vigenere

/*
 * Team: Ricardo Acosta, Valentin Trujillo, Ivan Muniz
 * Matricula: A01328426
 * Clase: Seguridad informática
 * Titulo: ACTIVIDAD 5 Variacion de VIGENERE
 *
 * */


fun main (args : Array<String>){
    val g = 653
    val p = 571494109
    val A = 240802908


    val text : String = "472313611824446201";
    val KEY = "63639021"
    Vigenere.run(text, KEY);

    val key = 7
    val word = "MAY THE FORCE BE WITH YOU";
    Multiplicative.run(word, key)
    Multiplicative.decrypt(key)

}

