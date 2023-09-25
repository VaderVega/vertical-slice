package ru.m2.layers.repository

import ru.m2.layers.model._
import ru.m2.util.IO

trait Repository {
  def createTask(f: MortgageDocumentChanged => Option[Task]): IO[Unit]
  def updateTask(f: Option[Task] => Option[Task]): IO[Unit]
  def getTask: IO[Task]
}
