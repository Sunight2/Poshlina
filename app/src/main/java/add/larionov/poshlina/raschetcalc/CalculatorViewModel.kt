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
            is CalculatorActions.Calculate2 -> performCalculation2()
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
        val result1 = when(number1){
            in 1.00..100000.00 -> 4000.0
            in 100000.01..300000.00 -> 4000.0+((number1-100000)/100*3)
            in 300000.01..500000.00 -> 10000.0+((number1-300000)/100*2.5)
            in 500000.01..1000000.00 -> 15000+((number1-500000)/100*2)
            in 1000000.01..3000000.00 -> 25000+((number1-1000000)/100*1)
            in 3000000.01..8000000.00 -> 45000+((number1-3000000)/100*0.7)
            in 8000000.01..24000000.00 -> 80000+((number1-8000000)/100*0.35)
            in 24000000.01..50000000.00 -> 136000+((number1-24000000)/100*0.3)
            in 50000000.01..100000000.00 -> 214000+((number1-50000000)/100*0.2)
            in 100000000.01..10000000000.00 -> 314000+((number1-100000000)/100*0.15)
            else -> 0
        }

state = state.copy(
    number = result1.toString()
)
        return
    }

    private fun performCalculation2() {
        val number1 = state.number1.toDouble()
        val result1 = when(number1){
            in 1.00..100000.00 -> 4000.0/100*30
            in 100000.01..300000.00 -> (4000.0+((number1-100000)/100*3))/100*300
            in 300000.01..500000.00 -> (10000.0+((number1-300000)/100*2.5))/100*30
            in 500000.01..1000000.00 -> (15000+((number1-500000)/100*2))/100*30
            in 1000000.01..3000000.00 -> (25000+((number1-1000000)/100*1))/100*30
            in 3000000.01..8000000.00 -> (45000+((number1-3000000)/100*0.7))/100*30
            in 8000000.01..24000000.00 -> (80000+((number1-8000000)/100*0.35))/100*30
            in 24000000.01..50000000.00 -> (136000+((number1-24000000)/100*0.3))/100*30
            in 50000000.01..100000000.00 -> (214000+((number1-50000000)/100*0.2))/100*30
            in 100000000.01..10000000000.00 -> (314000+((number1-100000000)/100*0.15))/100*30
            else -> 0
        }

        state = state.copy(
            number = result1.toString()
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