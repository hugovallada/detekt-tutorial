data class Movie(
    val name: String,
    val director: String,
    private val Cast: MutableSet<String> = mutableSetOf(),
    val length: Int,
    var rate: Char
) {
    val classification: String = if (length in 1..60) {
        "short"
    } else {
        "long"
    }

    fun addToCast(vararg name: String) {
        Cast.addAll(name)
    }

    fun seeCast(): Set<String> = Cast

    fun isAllowedToSee(age: Int) {
        if ((rate == 'R') and (age < 18)) {
            println("You are not allowed too see!")
        } else {
            println("You are allowed too see!")
        }
    }

    fun changeRate(){}

}
