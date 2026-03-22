package add.larionov.poshlina.raschetcalc

sealed class CalculatorActions {
    data class Number(val number: Int): CalculatorActions()
    object Clear: CalculatorActions()
    object Delete: CalculatorActions()
    object Decimal: CalculatorActions()
    object Calculate: CalculatorActions()
    object Calculate2: CalculatorActions()
    object Calculate3: CalculatorActions()
    object CalculateA: CalculatorActions()
    object CalculateASPrikaz: CalculatorActions()
    object CalculateAList: CalculatorActions()

}