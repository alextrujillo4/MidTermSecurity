import Cypher.DiffieHellman

/*
 * Team: Ricardo Acosta, Valentin Trujillo, Ivan Muniz
 * Matricula: A01328426
 * Clase: Seguridad informática
 * Titulo: ACTIVIDAD 5 Variacion de VIGENERE
 *
 * */

<<<<<<< HEAD

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

=======
fun diffieHellman() {
    print("Enter private Bob Private Key: ");
    val b_private = readLine()!!
    val shared_key = DiffieHellman.getSharedKey(b_private.toDouble(), 571494109.0, 240802908.0);
    val b_partial = DiffieHellman.getPartial(653.0, b_private.toDouble(),571494109.0);
    println("The value of b is: ${b_partial}");
    println("Your shared key is: ${shared_key}");
}

fun main (args : Array<String>){
    diffieHellman();
    val text : String = "472313611824446201";
    val KEY = "148"
    //Vigenere.run(text, KEY);
}
>>>>>>> 9bef957958a532d6d5177b15f3c386f4b68186f3
