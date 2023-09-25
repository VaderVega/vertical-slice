package ru.m2.util

trait Store[A] {
  def update(f: Option[A] => Option[A]): IO[Unit]
}
