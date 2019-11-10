/*
 * Name: Valentin Alexandro Trujillo García
 * Matricula: A01328426
 * Clase: Seguridad informática
 * Titulo: ACTIVIDAD 5 Variacion de VIGENERE
 *
 * */

fun shiftValue(n : Int, text : Char): Char {
    return text + n;
}

fun main (args : Array<String>){
    val KEY = "148"
    val values : ArrayList<Char> = ArrayList<Char>()
    val key : ArrayList<Int> = ArrayList<Int>()
    key.add(1)
    key.add(4)
    key.add(8)
    val text : String = "472313611824446201";
    var iter = 0;
    for (letter in text) {
        if (iter >= key.size) iter = 0;
        values.add(shiftValue(key[iter], letter));
        iter++;
    }
    println("=======================")
    for(single in values){
        println(single)

    }

}

