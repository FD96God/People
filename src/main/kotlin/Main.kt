fun main() {
    val likes = 50
    val end = likes % 10
    if (end == 0) {
        println("Понравилось $likes человек")
    } else if (end == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}