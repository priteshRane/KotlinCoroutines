import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    Thread.sleep(2000L)

    /*
    Note:
    1. are light-weight threads
    2. launched with launch coroutine builder
    3. delay is a special suspending function that does not block a thread
    4. but suspends the coroutine and it can be only used from a coroutine
     */
}