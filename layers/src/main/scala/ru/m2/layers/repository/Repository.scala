package ru.m2.layers.repository

import ru.m2.layers.model._
import ru.m2.util.Task

trait Repository {
  def commandExampleUpdate(f: Option[CommandExampleState] => Option[CommandExampleState]): Task[Unit]
  def queryExampleGet: Task[QueryExampleData]
  def handlerExampleUpdate(f: Option[HandlerExampleState] => Option[HandlerExampleState]): Task[Unit]
}
