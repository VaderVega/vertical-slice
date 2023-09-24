package ru.m2.vslice.command

import ru.m2.util.{Store, Task}

object CommandExample {
  type CommandExample = Command => Task[Unit]

  case class Command()
  case class State()

  def apply(state: State, command: Command): State = ???

  def make(store: Store[State]): CommandExample =
    command => store.update {
      case None => Some(State())
      case Some(state) => Some(apply(state, command))
    }

}
