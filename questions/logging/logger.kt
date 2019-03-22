package logging

private val logger = mu.NamedKLogging("log").logger

fun log(msg: String) {
    logger.info(msg)
//    println("[${Thread.currentThread().name}] $msg")
}
