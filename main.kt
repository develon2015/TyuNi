class Lover()
data class Couple(val 彼氏: String, val 彼女: String)
infix fun Any.love(彼: String) = "$this は $彼 を深く愛してる"
fun 天に誓う(誓い: (lover: Lover) -> String) = println("神樣：分かった，${ 誓い(Lover()) }")

fun main() {

  var ( I , You ) = Couple( "Develon" , "Kasumi Arimura" )
  
  天に誓う {
    dear: Lover -> I love You
  }
  
}

