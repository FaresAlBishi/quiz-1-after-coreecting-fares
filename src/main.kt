fun main (){
    val rationalNumberTwo :RationalNumber = RationalNumber(2,5)

    val rationalNumberOne :RationalNumber = RationalNumber(4,6)

    var rationalNumberThree = add(rationalNumberOne, rationalNumberTwo)

    println(rationalNumberThree)

    val rationalNumberString: String = toDouble(rationalNumberOne).toString()
    println(rationalNumberString)

    return
}