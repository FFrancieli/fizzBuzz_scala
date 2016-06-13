import org.scalatest.{BeforeAndAfterEach, FunSuite}

class FizzBuzzTest extends FunSuite with BeforeAndAfterEach {

  test("should return number"){
    assert(FizzBuzz.fizzBuzz(1) == 1)
    assert(FizzBuzz.fizzBuzz(7) == 7)
    assert(FizzBuzz.fizzBuzz(13) == 13)
    assert(FizzBuzz.fizzBuzz(16) == 16)
    assert(FizzBuzz.fizzBuzz(83) == 83)
  }

  test("should return fizz for number three"){
    assert(FizzBuzz.fizzBuzz(3) == 'fizz)
  }

  test("should return buzz for number five"){
    assert(FizzBuzz.fizzBuzz(5) == 'buzz)
  }

  test("should return fizzBuzz for number 15"){
    assert(FizzBuzz.fizzBuzz(15) == 'fizzBuzz)
  }

  test("should return fizz for any multiple of three"){
    assert(FizzBuzz.fizzBuzz(3) == 'fizz)
    assert(FizzBuzz.fizzBuzz(6) == 'fizz)
    assert(FizzBuzz.fizzBuzz(9) == 'fizz)
    assert(FizzBuzz.fizzBuzz(27) == 'fizz)
    assert(FizzBuzz.fizzBuzz(99) == 'fizz)
  }

  test("should return buzz for any multiple of 5"){
    assert(FizzBuzz.fizzBuzz(5) == 'buzz)
    assert(FizzBuzz.fizzBuzz(10) == 'buzz)
    assert(FizzBuzz.fizzBuzz(20) == 'buzz)
    assert(FizzBuzz.fizzBuzz(80) == 'buzz)
  }

  test("should return fizzBuzz for any multiple of 3 and 5"){
    assert(FizzBuzz.fizzBuzz(15) == 'fizzBuzz)
    assert(FizzBuzz.fizzBuzz(30) == 'fizzBuzz)
    assert(FizzBuzz.fizzBuzz(45) == 'fizzBuzz)
    assert(FizzBuzz.fizzBuzz(60) == 'fizzBuzz)
    assert(FizzBuzz.fizzBuzz(75) == 'fizzBuzz)
  }

}