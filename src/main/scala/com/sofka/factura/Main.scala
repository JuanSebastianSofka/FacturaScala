package com.sofka.factura

object Main {
  def main(args: Array[String]): Unit = {
    val a: List[Int] = List(5, 10, 15, 20, 20)

    println(Factura.mostrarBruto(a))
    println(Factura.mostrarTotalIvaConsumo(a, consumoBoolean = false))
    println(Factura.mostrarTotalIvaConsumo(a, consumoBoolean = true))
  }
}
