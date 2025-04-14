package add.larionov.poshlina.raschetcalc

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set

    fun onAction(action: CalculatorActions) {
        when(action) {
            is CalculatorActions.Number -> enterNumber(action.number)
            is CalculatorActions.Decimal -> enterDecimal()
            is CalculatorActions.Clear -> state = CalculatorState()
            is CalculatorActions.Calculate -> performCalculation()
            is CalculatorActions.Delete -> performDeletion()
        }
    }
    private fun enterNumber(number: Int) {
        if (state.number1.length >= MAX_NUM_LENGHT) {
            return
        }
        state = state.copy(
            number1 = state.number1 + number
        )
    }
    companion object{
        private const val MAX_NUM_LENGHT = 9
    }
    private fun enterDecimal() {
        if (!state.number1.contains(".")
            && state.number1.isNotBlank()
            ){
            state = state.copy(
                number1 = state.number1 + "."
            )
            return
        }
    }
    private fun performCalculation() {
       val number1 = state.number1.toDouble()
        val result = if(number1 <= 100000) 4000
        else if (number1 > 100000 && number1 <= 300000) {4000+((number1-100000)/100*3)}
        else if (number1 > 300000 && number1 <= 500000) {10000+((number1-300000)/100*2.5)}
        else if (number1 > 500000 && number1 <= 1000000) {15000+((number1-500000)/100*2)}
        else if (number1 > 1000000 && number1 <= 3000000) {25000+((number1-1000000)/100*1)}
        else if (number1 > 3000000 && number1 <= 8000000) {45000+((number1-3000000)/100*0.7)}
        else if (number1 > 8000000 && number1 <= 24000000) {80000+((number1-8000000)/100*0.35)}
        else if (number1 > 24000000 && number1 <= 50000000) {136000+((number1-24000000)/100*0.3)}
        else if (number1 > 50000000 && number1 <= 100000000) {214000+((number1-50000000)/100*0.2)}
        else if (number1 > 100000000 && number1 <= 1000000000) {314000+((number1-100000000)/100*0.15)}


        else 000111.00

state = state.copy(
    number1 = result.toString()
)
        return
    }

    private fun performDeletion() {
        when{
            state.number1.isNotBlank() -> state = state.copy(
                number1 = state.number1.dropLast(1)
            )
        }
    }
}