fun main(args: Array<String>) {
    // Set a and b values
    var a = 105
    var b = 205
    // add a + b
    var ans1 = a + b
    println("a + b =")
    println(ans1)
    // add 1 to a
    var ans2 = a++
    println("a++ =")
    // multiply a * b
    println(ans2)
    var ans3 = a * b
    println("a * b =")
    // subtract 1 from a
    println(ans3)
    var ans4 = a--
    println("a-- =")
    println(ans4)
    // Compare a-- with a*b to see if equal
    var Comparingans = ans4 != ans3
    println("a-- != a * b")
    println(Comparingans)

}