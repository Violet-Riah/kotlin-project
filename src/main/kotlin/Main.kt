fun main() {
word("violetta")
  name("Violet")
    var v=number(4,4.2,9,20.2)
    println(v)
    var r=fact("I love Bananas")
    println(r)
}
fun word(name:String){
    print(name[0])
    print(name[2])
    print(name[3])
}
fun name(name:String,){
    var greeting = "Hell ${name}"
    println(greeting)

}
fun number(num1:Int, num2:Double,num3:Int, num5:Double):Double{
    var result= num1+num2+num3+num5
    return result

}
fun fact(funFact:String):String{
    var text= funFact
    return text
}


