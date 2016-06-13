import org.scalatest.{BeforeAndAfterEach, FunSuite}

class FizzBuzzTest extends FunSuite with BeforeAndAfterEach {

  var fizzBuzz:FizzBuzz = _

  override def beforeEach() {
    fizzBuzz = new FizzBuzz
  }

  test("Should return number"){
    val fizzBuzz:FizzBuzz = new FizzBuzz

    assert(fizzBuzz.fizzBuzz(1) == 1)
    assert(fizzBuzz.fizzBuzz(7) == 7)
    assert(fizzBuzz.fizzBuzz(13) == 13)
    assert(fizzBuzz.fizzBuzz(16) == 16)
    assert(fizzBuzz.fizzBuzz(83) == 83)
  }

  test("Should return fizz for number three"){
    assert(fizzBuzz.fizzBuzz(3) == "fizz")
  }

  test("Should return buzz for number five"){
    assert(fizzBuzz.fizzBuzz(5) == "buzz")
  }

}