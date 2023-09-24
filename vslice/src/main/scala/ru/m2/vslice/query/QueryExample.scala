package ru.m2.vslice.query

import ru.m2.util.Task

object QueryExample {
  type QueryExample = Query => Task[Data]

  case class Query()
  case class Data()

  def make: QueryExample =
    query => {
      // SQL/Mongo/GraphDB query
      ???
    }

}
