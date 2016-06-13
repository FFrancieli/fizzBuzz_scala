import org.scalatest.{BeforeAndAfterEach, FunSuite}

class FizzBuzzTest extends FunSuite with BeforeAndAfterEach {

  var fizzBuzz:FizzBuzz = _

  override def beforeEach() {
    fizzBuzz = new FizzBuzz
  }

  test("should return number"){
    val fizzBuzz:FizzBuzz = new FizzBuzz

    assert(fizzBuzz.fizzBuzz(1) == 1)
    assert(fizzBuzz.fizzBuzz(7) == 7)
    assert(fizzBuzz.fizzBuzz(13) == 13)
    assert(fizzBuzz.fizzBuzz(16) == 16)
    assert(fizzBuzz.fizzBuzz(83) == 83)
  }

  test("should return fizz for number three"){
    assert(fizzBuzz.fizzBuzz(3) == "fizz")
  }

  test("should return buzz for number five"){
    assert(fizzBuzz.fizzBuzz(5) == "buzz")
  }

  test("should return fizzBuzz for number 15"){
    assert(fizzBuzz.fizzBuzz(15) == "fizzBuzz")
  }

  test("should return fizz for any multiple of three"){
    assert(fizzBuzz.fizzBuzz(3) == "fizz")
    assert(fizzBuzz.fizzBuzz(6) == "fizz")
    assert(fizzBuzz.fizzBuzz(9) == "fizz")
    assert(fizzBuzz.fizzBuzz(27) == "fizz")
    assert(fizzBuzz.fizzBuzz(99) == "fizz")
  }

  test("should return buzz for any multiple of 5"){
    assert(fizzBuzz.fizzBuzz(5) == "buzz")
    assert(fizzBuzz.fizzBuzz(10) == "buzz")
    assert(fizzBuzz.fizzBuzz(20) == "buzz")
    assert(fizzBuzz.fizzBuzz(80) == "buzz")
  }

  test("should return fizzBuzz for any multiple of 3 and 5"){
    assert(fizzBuzz.fizzBuzz(15) == "fizzBuzz")
    assert(fizzBuzz.fizzBuzz(30) == "fizzBuzz")
    assert(fizzBuzz.fizzBuzz(45) == "fizzBuzz")
    assert(fizzBuzz.fizzBuzz(60) == "fizzBuzz")
    assert(fizzBuzz.fizzBuzz(75) == "fizzBuzz")
  }

}