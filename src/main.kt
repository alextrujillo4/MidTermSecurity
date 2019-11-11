import Cypher.Multiplicative
import Cypher.Vigenere

/*
 * Team: Ricardo Acosta, Valentin Trujillo, Ivan Muniz
 * Matricula: A01328426
 * Clase: Seguridad informática
 * Titulo: ACTIVIDAD 5 Variacion de VIGENERE
 *
 * */

fun diffieHellman() {
    print("Enter private Bob Private Key: ");
    val b_private = readLine()!!
    val shared_key = Multiplicative.getSharedKey(b_private.toDouble(), 571494109.0, 240802908.0);
    println(shared_key);
}

fun main (args : Array<String>){
    diffieHellman();
    val text : String = "472313611824446201";
    val KEY = "148"
    //Vigenere.run(text, KEY);
}