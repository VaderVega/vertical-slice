package ru.m2.layers

import ru.m2.layers.model._
import ru.m2.util.Task

trait Service {
  def commandExample(command: CommandExampleCommand): Task[Unit]
  def queryExample(query: QueryExampleQuery): Task[QueryExampleData]
  def handlerExample(event: HandlerExampleEvent): Task[Unit]
}

object Service {
  def commandExampleLogic(state: CommandExampleState, command: CommandExampleCommand): CommandExampleState = ???
  def handlerExampleLogic(state: HandlerExampleState, event: HandlerExampleEvent): HandlerExampleState = ???
}
