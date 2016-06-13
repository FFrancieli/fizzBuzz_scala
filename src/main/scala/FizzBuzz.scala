class FizzBuzz {


  def fizzBuzz(number:Int) = (isMultipleOfThree(number), isMultipleOfFive(number)) match {
    case (true, true) => 'fizzBuzz
    case (true, false) => 'fizz
    case (false, true) => 'buzz
    case _ => number
  }

  def isMultipleOfThree(number: Int) = number % 3 == 0

  def isMultipleOfFive(number: Int) = number % 5 == 0
}
