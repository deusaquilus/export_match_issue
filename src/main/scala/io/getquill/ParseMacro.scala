package io.getquill

import scala.quoted._
import mytest.Dsl

object ParseMacro:
  inline def parse(inline any: Any): Unit = ${ parseImpl('any) }
  def parseImpl(any: Expr[Any])(using Quotes): Expr[Unit] =
    import quotes.reflect._
    any match
      case '{ Dsl.stuff } => println("Matched!")
      case _ => println("Did not match")
    '{ () }