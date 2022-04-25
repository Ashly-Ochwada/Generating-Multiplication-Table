fun main(){
  numbers()
  num()
}
fun numbers(){
  var num = 9

  for (b in 1..10) {
    var product = num * b
    println("$num * $b = $product")
  }
}
fun num(){
  var num = 8
  var i = 1

  while (i <= 10) {
    var product = num * i
    println("$num * $i = $product")
    i++
  }
}