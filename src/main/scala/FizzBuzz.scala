class FizzBuzz {

  def fizzBuzz(number:Int) = {
    if(isMultipleOfFive(number) && isMultipleOfThree(number)){
      "fizzBuzz"
    } else if ( isMultipleOfThree(number) ){
      "fizz"
    } else if (isMultipleOfFive(number)){
      "buzz"
    } else number
  }

  def isMultipleOfThree(number: Int) = number % 3 == 0

  def isMultipleOfFive(number: Int) = number % 5 == 0
}
