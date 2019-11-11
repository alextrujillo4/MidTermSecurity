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

}


fun shiftValue(n : Int, text : Char): Char {
    return text + n;
}

fun main (args : Array<String>){
    diffieHellman();


    val KEY = "148"
    val values : ArrayList<Char> = ArrayList<Char>()
    val key : ArrayList<Int> = ArrayList<Int>()

    for (letter in KEY) {
        key.add(letter.toInt())
    }

    val text : String = "472313611824446201";
    var iter = 0;
    for (letter in text) {
        if (iter >= key.size) iter = 0;
        values.add(shiftValue(key[iter], letter));
        iter++;
    }
    
    println("=======RESULT=======")
    for(single in values){
        print(single)
    }

}

