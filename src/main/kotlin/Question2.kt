fun main() {
    val groupA = mutableListOf("a", "b", "c", "d", "e", "a", "g", "r", "f")
    val groupB = mutableListOf("ant", "bee", "cat", "dog", "elephant")
    val linkGroups: List<Pair<String, String>> = groupA.zip(groupB)
    println(linkGroups)

}