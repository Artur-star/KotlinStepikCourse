package introduction

fun main() {
    fun joinOptions(options: Collection<String>) = options.joinToString(", ", "[", "]")
}