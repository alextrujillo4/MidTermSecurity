package Cypher

import java.math.BigInteger
import kotlin.math.pow

class DiffieHellman{
    companion object  {

        fun run(b: Int, g: BigInteger, p: BigInteger, A: BigInteger) {
            println("=======DIFFIE HELLMAN=======")
            println("The value of b is: ${g.pow(b) * (p)}");
            println("Your shared key is: ${A.pow(b) % p}\n");
        }

    }
}