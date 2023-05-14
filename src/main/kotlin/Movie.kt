const val MAX_SIZE_OF_SHORT_FILMS = 60
const val MINIMUM_AGE_FOR_R_MOVIES = 18

data class Movie(
    val name: String,
    val director: String,
    private val cast: MutableSet<String> = mutableSetOf(),
    val length: Int,
    var rate: Char
) {
    val classification: String = if (length in 1..MAX_SIZE_OF_SHORT_FILMS) {
        "short"
    } else {
        "long"
    }

    fun addToCast(vararg name: String) {
        cast.addAll(name)
    }

    fun seeCast(): Set<String> = cast

    fun isAllowedToSee(age: Int) {
        if ((rate == 'R') and (age < MINIMUM_AGE_FOR_R_MOVIES)) {
            println("You are not allowed too see!")
        } else {
            println("You are allowed too see!")
        }
    }

    fun changeRate(newRate: Char) {
        rate = newRate
    }
}
