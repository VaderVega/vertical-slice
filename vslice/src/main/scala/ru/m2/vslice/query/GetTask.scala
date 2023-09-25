package ru.m2.vslice.query

import ru.m2.util.IO

object GetTask {
  type Query = Props => IO[Task]

  case class Props()
  case class Task()

  def make: Query =
    props => {
      // SQL/Mongo/GraphDB query
      ???
    }

}
