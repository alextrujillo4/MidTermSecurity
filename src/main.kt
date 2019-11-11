import Cypher.DiffieHellman
import Cypher.Multiplicative
import Cypher.RSA
import Cypher.Vigenere
import java.math.BigInteger

/*
 * Team: Ricardo Acosta, Valentin Trujillo, Ivan Muniz
 * Matricula: A01328426
 * Clase: Seguridad informática
 * Titulo: ACTIVIDAD 5 Variacion de VIGENERE
 *
 * */



fun main (args : Array<String>){

    val b : Int = 69;
    val g  = BigInteger("653");
    val p= BigInteger("571494109");
    val A = BigInteger("240802908");
    DiffieHellman.run(b,g,p,A);

    val text : String = "472313611824446201";
    val KEY = "63639021"
    Vigenere.run(text, KEY);

    val key = 7
    val word = "MAY THE FORCE BE WITH YOU";
    Multiplicative.run(word, key)
    Multiplicative.decrypt(key)


    val n  = BigInteger("841759710990034217299")
    val e =  BigInteger ("65537")
    val plain = "Hello";
    RSA.run(n,e,plain)
    val p = 0;
    val q = 0;
    RSA.run2(p,q,"ILLBEBACK")
}
