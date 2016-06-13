class FizzBuzz {

  def fizzBuzz(number:Int) = {
    if(number == 15){
      "fizzBuzz"
    } else if ( isMultipleOfTrhee(number) ){
      "fizz"
    } else if (number == 5){
      "buzz"
    } else number
  }

  def isMultipleOfTrhee(number: Int) = number % 3 == 0
}
