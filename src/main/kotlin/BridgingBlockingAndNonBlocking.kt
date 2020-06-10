import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello, ")
    runBlocking {
        delay(2000L)
    }

    /*
    Note:
    1. The main thread invoking runBlocking blocks until the coroutine inside runBlocking completes
     */
}