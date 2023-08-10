fun main() {
    val groupA = mutableListOf("a", "b", "c", "d", "e", "a", "g", "r", "f")
    val groupB = mutableListOf("ant", "bee", "cat", "dog", "elephant")

    groupB.add("antelope")
    groupB.add("goat")
    groupB.add("rabbit")
    groupB.add("frog")

    for (n in groupB) {
        println(n)
    }
    val linkGroups: List<Pair<String, String>> = groupA.zip(groupB)
    println("The link of two groups: $linkGroups")

}
