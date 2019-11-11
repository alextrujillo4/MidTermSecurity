package Cypher

class Multiplicative{

    companion object  {
        var encyptedWord = "";


        fun modInverse(a: Int, m: Int): Int {
            var a = a
            a = a % m
            for (x in 1 until m)
                if (a * x % m == 1)
                    return x
            return 1
        }

        /*
        El código encriptado fué @encyptedWord
        a partir de la llave desencriptataremos
        con ayuda de la cunción -> decrypt()
         */
        fun decrypt(key : Int) {
            val desencripted_word: ArrayList<Char> = ArrayList<Char>()
            //1.Iteramos cada valor del texto encriptado
            for ( character in encyptedWord) {
                //2. Si el valor es vacío lo agregamos difectamente a la lista, si no, aplicamos el desencriptado
                if (character != ' '){
                    //3.Al igual que la encriptación, restamos 65 al valor Char del caracter
                val position : Int = character.toInt() - 65;
                    //3.ya que tenemos la opcición, la multiplicamos por el inversi multiplicativo de 26(numero de caracteres del abcedario inglés)
                    //4.El resultado, obtenemos el módulo de 26
                    val operation : Int = (position * modInverse(key,26)) % 26;
                    //5. Agregamos la letra desencriptada al arreglo de caracteres de la palabra desencriptada
                desencripted_word.add((65 +operation).toChar());
                }else{
                    desencripted_word.add(' ')
                }
            }
            println("=======Decryption=======")
            print( desencripted_word.joinToString(
                separator = "",
                prefix = "",
                postfix = ""
            ))
        }

        private fun encript(word_nospaces : String, key : Int) {
            val encripted_word: ArrayList<Char> = ArrayList<Char>()
            for ( character in word_nospaces) {
                if(character!=' '){
                    val position : Int = character.toInt() - 65;
                    val operation : Int = (position * key) %26;
                    encripted_word.add((65 +operation).toChar());
                }else{
                    encripted_word.add(' ')
                }
            }
            println("=======Multiplicative=======")
            encyptedWord = encripted_word.joinToString(
                separator = "",
                prefix = "",
                postfix = ""
            )
            println(encyptedWord)
        }

        fun run(word: String, key: Int) {
            println("\n${word}");
            encript(word, key)
        }
    }
}



