package Cypher

import java.math.BigInteger
import java.util.*
import kotlin.math.pow

class RSA {
    companion object  {


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


        fun run2(p : BigInteger, q : BigInteger , e : BigInteger, plainText : String){
            println("\nBob:")
            println("Plain: $plainText")

            val c = Charsets.UTF_8

            val bytes = plainText.toByteArray(c)
            val plainNumber = BigInteger(bytes)

            val n = p*q
            println("n: $n")

            val phi : BigInteger = (p - 1.toBigInteger())*( q - 1.toBigInteger())
            println("Phi: $phi")

            val d =  e.modInverse(phi)
            println("d: $d")


            val enc = plainNumber.modPow(e, n)
            println("Encoded:")
            println(enc)

            println("Decoded:")
            val dec = enc.modPow(d, n)
            println(dec)

            println("Text:")
            val decText = dec.toByteArray().toString(c)
            println(decText)
            }

    }

}