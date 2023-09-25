package ru.m2.vslice.handler

import ru.m2.util.Store
import ru.m2.util.IO

object MortgageDocumentChanged {
  type Handler = Event => IO[Unit]

  case class Event()
  case class Task()

  def apply(task: Task, event: Event): Task = ???

  def make(store: Store[Task]): Handler =
    event =>
      store.update {
        case None       => Some(Task())
        case Some(task) => Some(apply(task, event))
      }
}
