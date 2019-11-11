package Cypher

import kotlin.math.pow

class Multiplicative{
    companion object  {
        public fun getSharedKey(b_private: Double, p_param: Double, a_partial: Double) : Long {
            return (a_partial.pow(b_private)).toLong() % (p_param.toLong());
        }

        public fun getPartial(g_param: Double, b_private: Double, p_param: Double) : Int {
            return ((g_param.pow(b_private).toLong()) % p_param).toInt();
        }
    }
}