fun main() {
    val likes = 101
    val end = likes % 10
    val exception = likes % 100
    if (exception == 11 || end != 1) {
        println("Понравилось $likes людям")
    } else {
        println("Понравилось $likes человеку")
    }
}