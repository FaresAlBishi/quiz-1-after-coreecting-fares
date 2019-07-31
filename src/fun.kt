fun toDouble(input: RationalNumber):Double{

    return input.numerator.toDouble() / input.denominator.toDouble()
}

fun add(input1:RationalNumber,input2:RationalNumber):RationalNumber{

    if (input1.denominator == input2.denominator){

        var input3Numerator = input1.numerator + input2.numerator
        var input3Denominator3 = input1.denominator
        var final = input3Numerator / input3Denominator3
        return (RationalNumber(numerator = input3Numerator , denominator = input3Denominator3 ))
    } else {
        var input3Denominator3 = input1.denominator * input2.denominator
        var input3Numerator = (input1.denominator * input2.numerator) + (input2.denominator * input1.numerator)
        return RationalNumber(input3Numerator, input3Denominator3)
    }
}








