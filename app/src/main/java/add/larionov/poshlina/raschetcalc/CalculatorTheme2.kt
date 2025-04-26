package add.larionov.poshlina.raschetcalc

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CalculatorTheme2() {
    val viewModel = viewModel<CalculatorViewModel>()
    val state = viewModel.state
    val buttonSpacing = 8.dp

    Calculator2(
        state = state,
        onAction = viewModel::onAction,
        buttonSpacing = buttonSpacing,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    )
}