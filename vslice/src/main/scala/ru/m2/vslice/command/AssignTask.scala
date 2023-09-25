package ru.m2.vslice.command

import ru.m2.util.Store
import ru.m2.util.IO

object AssignTask {
  type Command = Props => IO[Unit]

  case class Props()
  case class Task()

  def apply(task: Task, props: Props): Task = ???

  def make(store: Store[Task]): Command =
    props =>
      store.update {
        case None       => Some(Task())
        case Some(task) => Some(apply(task, props))
      }

}
