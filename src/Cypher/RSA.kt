package Cypher

import java.math.BigInteger
import kotlin.math.pow

class RSA {
    companion object  {

        //d = inverse of e mod phi)
        //phi = (p-1)*(q-1)
        fun modInverse(a: Int, m: Int): String {
            var a = a
            a = a % m
            for (x in 1 until m)
                if (a * x % m == 1)
                    return x.toString()
            return 1.toString()
        }

        fun run(n : BigInteger, e : BigInteger, plainText : String){
            println("\n\n=======RSA=======")
            println("Plain: $plainText")

            val c = Charsets.UTF_8

            val bytes = plainText.toByteArray(c)
            val plainNumber = BigInteger(bytes)


            val enc = plainNumber.modPow(e, n)
            println("Encriptado::")
            println(enc)//Punto 1

        }


        fun run2(p : Int, q : Int ,plainText : String){
            println("\nBob:")


        }

    }

}