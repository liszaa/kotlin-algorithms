package lizsa.kotlin.algoritms.kotlinalgoritms

import org.springframework.stereotype.Component
import java.math.BigDecimal

@Component
class Fibonacci {

    fun findFibonacci(n: Int): BigDecimal {
        val fibSequence = arrayOfNulls<BigDecimal>(size = n + 1)
        fibSequence[0] = BigDecimal.valueOf(1)
        fibSequence[1] = BigDecimal.valueOf(1)
        for (i in 2 until n) {
            fibSequence[i] = fibSequence[i - 1]!!.plus(fibSequence[i - 2]!!)
        }
        return fibSequence[n - 1]!!
    }
}