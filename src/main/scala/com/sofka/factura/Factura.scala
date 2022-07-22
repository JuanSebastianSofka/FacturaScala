package com.sofka.factura

object Factura {

  val iva = 0.19
  val consumo = 0.16

  /**
   *
   * @param lista
   * @return Devuelve la suma de los valores ingresados
   */
  def mostrarBruto(lista: List[Int]): String = {
    "El precio total bruto es: " + lista.sum + " y el total de productos comprados es de: " + lista.size
  }

  /**
   *
   * @param lista
   * @param consumoBoolean
   * @return Devuelve el total sólo con iva o el total sobre el consumo y el iva, dependiendo del estado de
   *         el parámetro consumoBoolean
   */
  def mostrarTotalIvaConsumo(lista: List[Int], consumoBoolean: Boolean): String = {
    consumoBoolean match {
      case true => "El total con impuesto al consumo es de: " + lista.sum * (iva + 1 + consumo)
      case false => "El total es: " + lista.sum * (iva + 1)
    }
  }
}
