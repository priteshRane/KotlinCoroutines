package basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    repeat(3) {
        launch {
            delay(1000L)
            println(".")
        }
    }
}