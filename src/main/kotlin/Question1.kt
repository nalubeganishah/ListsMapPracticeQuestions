fun main() {
    val list = mutableListOf(89, 45, 23, 5, 67, 12, 55, 89, 54, 55)
    val sortedIntegers = list.sorted()
    println("Before sorting: $list")
    println("The ascending order of 10 integers: $sortedIntegers")

    /*for (i in 0 until list.size) {
        for(j in i.plus(1)until list.size) {
            if(list[i] > list[j]){
                val temp = list[i]
                list[i] = list[j]
                list[j] = temp

            }
        }
    }
    println("After sorting: $list")

     */
}