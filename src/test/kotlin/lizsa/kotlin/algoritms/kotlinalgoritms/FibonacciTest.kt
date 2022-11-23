package lizsa.kotlin.algoritms.kotlinalgoritms

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FibonacciTest(@Autowired private val fibonacci: Fibonacci) {


    @Test
    fun getFibonacci() {
        val randomN = (2..1000).random()
        val f = fibonacci.findFibonacci(randomN)
        print("n = $randomN, value n = $f")
    }

    @Test
    fun getLastFigureOfFibonacci() {
        val randomN = (1..90).random()
        val f = fibonacci.findLastFigureOfFibonacci(randomN)
        print("n = $randomN, last figure of Fibonacci = $f")
    }
}