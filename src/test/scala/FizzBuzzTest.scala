import org.scalatest.{BeforeAndAfterEach, FunSuite}

class FizzBuzzTest extends FunSuite with BeforeAndAfterEach {


  test("Should return number"){
    val fizzBuzz:FizzBuzz = new FizzBuzz

    assert(fizzBuzz.fizzBuzz(1) == 1)
    assert(fizzBuzz.fizzBuzz(7) == 7)
    assert(fizzBuzz.fizzBuzz(13) == 13)
    assert(fizzBuzz.fizzBuzz(16) == 16)
    assert(fizzBuzz.fizzBuzz(83) == 83)
  }


}