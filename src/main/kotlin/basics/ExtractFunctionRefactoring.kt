package basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch { doWork() }
    println("Hello, ")
}

suspend fun doWork() {
    delay(1000L)
    println("World!")
}