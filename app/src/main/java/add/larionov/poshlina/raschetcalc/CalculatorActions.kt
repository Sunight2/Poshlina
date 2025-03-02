package add.larionov.poshlina.raschetcalc

sealed class CalculatorActions {
    data class Number(val number: Int): CalculatorActions()
    object Clear: CalculatorActions()
    object Delete: CalculatorActions()
    object Decimal: CalculatorActions()
    object Calculate: CalculatorActions()

}