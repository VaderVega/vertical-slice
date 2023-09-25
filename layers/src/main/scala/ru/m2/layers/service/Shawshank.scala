package ru.m2.layers.service

import ru.m2.layers.model._
import ru.m2.util.IO

trait Shawshank {
  def assignTask(task: Task, props: AssignTaskProps): IO[Unit]
  def getTask(pros: GetTaskProps): IO[Task]
  def handleMortgageDocumentChangeEvent(event: MortgageDocumentChanged): IO[Unit]
}

object Shawshank {
  def assignTasksLogic(props: AssignTaskProps): Unit                               = ???
  def getTaskLogic(props: GetTaskProps): Task                                      = ???
  def handleMortgageDocumentChangeEventLogic(event: MortgageDocumentChanged): Unit = ???
}
