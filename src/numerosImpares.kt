import java.util.Scanner
fun main(args: Array<String>) {
  val userInput = Scanner(System.`in`)  
  var num:Int = userInput.nextInt()  
  for (i in 1..num)
    if(i%2!=0)print("$i "+"\n")
}