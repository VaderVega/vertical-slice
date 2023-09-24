package ru.m2.vslice.handler

import ru.m2.util.{Store, Task}

object HandlerExample {
  type HandlerExample = Event => Task[Unit]

  case class Event()
  case class State()

  def apply(state: State, event: Event): State = ???

  def make(store: Store[State]): HandlerExample =
    event => store.update {
      case None => Some(State())
      case Some(state) => Some(apply(state, event))
    }
}
