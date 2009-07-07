package literaljson

import org.scalatest._

class ExampleSuite extends FunSuite {
  import JsonAST._
  import JsonDSL._
  import JsonParser._

  test("Lotto example") {
    val lottoAST = parse(lotto)
    val renderedLotto = compact(render(lottoAST))
    assert(lottoAST == parse(renderedLotto))    
  }

  val lotto = """
{
  "lotto":{
    "lotto-id":5,
    "winning-numbers":[2,45,34,23,7,5,3],
    "winners":[{
      "winner-id":23,
      "numbers":[2,45,34,23,3,5]
    },{
      "winner-id":54,
      "numbers":[52,3,12,11,18,22]
    }]
  }
}
"""
}

