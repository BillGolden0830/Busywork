fun main()
{
    val input:String = "aaba"
    var output:String = input.reversed()
    println(output)

    var Example1:String = " "
    var Example2:String = "some random string @test challenge @okay"
    val subIn1:String = "laptop"
    val subIn2:String = "gone"

    Example1 = Example2.replace("@test", subIn1)
    Example2 = Example1.replace("@okay", subIn2)
    print(Example2)

    val isGood1:Boolean = ValidateCard("1111-2222-3333-4444", "13/24")
    val isGood2:Boolean = ValidateCard("1111-2222-3333-4444", "03/23")

    println("$isGood1 $isGood2")

}

fun ValidateCard(CardNum:String, CardExp:String):Boolean{

    val newCard = CardNum.replace("-", "")
    val newExp = CardExp.replace("/", "")

    println("$newCard $newExp\n")

    val ccPattern:String = "^(1111|1232|5627|8121)[0-9]{12}(?:[0-9]{3})?\$"
    val ccExpPattern = "(0[1-9]|1[0-2])?([0-9]{2})\$"

    //println((newCard.matches(ccPattern.toRegex())))

    return ((newCard.matches(ccPattern.toRegex()))&&(newExp.matches(ccExpPattern.toRegex())))
}