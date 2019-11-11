package Cypher

class Vigenere{
    companion object {
        fun shiftValue(n: Int, text: Char): Char {
            return text + n;
        }

        open fun run(text: String, KEY: String) {
            val values: ArrayList<Char> = ArrayList<Char>()
            val key: ArrayList<Int> = ArrayList<Int>()
            for (letter in KEY) {
                key.add(letter.toInt())

            }
            var iter = 0;
            for (letter in text) {
                if (iter >= key.size) iter = 0;
                values.add(shiftValue(key[iter], letter));
                iter++;
            }
            println("=======Vigenere=======")
            println(values.joinToString(
                separator = "",
                prefix = "",
                postfix = ""
            ))
        }
    }

}