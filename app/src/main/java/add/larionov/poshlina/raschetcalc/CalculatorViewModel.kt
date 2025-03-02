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
        private const val MAX_NUM_LENGHT = 8
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
    private fun performCalculation() {}
    private fun performDeletion() {
        when{
            state.number1.isNotBlank() -> state = state.copy(
                number1 = state.number1.drop(1)
            )
        }
    }
}