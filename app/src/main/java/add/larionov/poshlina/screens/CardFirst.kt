package add.larionov.poshlina.screens

import add.larionov.poshlina.HomeScreen
import add.larionov.poshlina.NamePoshlina
import add.larionov.poshlina.screens2.Card1
import add.larionov.poshlina.screens2.DataScreen
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun CardFirst() {
    //список пошлин текст и выбор
    val poshlinaText = listOf(
        "Подача искового заявления",
        "Подача заявления о вынесении судебного приказа",
        "Подача искового заявления о разделе имущества, находящегося в общей собственности",
        "Подача искового заявления о выделе доли из имущества, находящегося " +
                "в общей собственности",
        "Подача искового заявления о признании права на долю в имуществе, " +
                "находящемся в общей собственности",
        "Подача искового заявления по спорам, возникающим при заключении, " +
                "изменении или расторжении договоров, не содержащего требования" +
                " о возврате исполненного по сделке или о присуждении имущества",
        "Подача искового заявления по спорам о признании сделок недействительными, " +
                "не содержащего требования о применении последствий недействительности сделок",
        "Подача искового заявления, содержащего требования об обращении взыскания на заложенное имущество",
        "Подача искового заявления, содержащего требования об обращении взыскания на заложенное имущество " +
                "и денежное требование по солидарному обязательству, по которому уплачена государственная " +
                "пошлина, установленная для исковых заявлений имущественного характера",
        "Подача искового заявления об истребовании наследниками принадлежащей им доли имущества " +
                "при условии, что спор о признании права собственности на это имущество судом ранее был разрешен",
        "Подача искового заявления, содержащего требования о применении последствий недействительности сделок",
        "Подача искового заявления о расторжении брака",
        "Подача заявления по делам особого производства",
        "Подача заявления об оспаривании (полностью или частично) нормативных правовых актов органов" +
                " государственной власти, органов местного самоуправления или должностных лиц",
        "Подача административного искового заявления о признании ненормативного правового акта недействительным и " +
                "о признании решений и действий (бездействия) государственных органов, органов " +
                "местного самоуправления, иных органов, должностных лиц",
        "Подача заявления о правопреемстве, кроме случаев универсального правопреемства",
        "Подача заявления о выдаче исполнительных листов на принудительное исполнение решений " +
                "третейского суда, заявлений о признании и об исполнении решения иностранного суда, " +
                "иностранных третейских судов (арбитражей)",
        "Подача заявления об отмене решения третейского суда",
        "Подача заявления о выдаче дубликата исполнительного листа",
        "Подача заявления о пересмотре заочного решения судом, вынесшим это решение",
        "Подача заявления о восстановлении пропущенного срока для предъявления исполнительного листа" +
                " к исполнению, об отсрочке или рассрочке исполнения судебного постановления, " +
                "изменении способа и порядка его исполнения, о повороте исполнения судебного " +
                "постановления, о разъяснении судебного постановления",
        "Подача заявления о пересмотре судебных постановлений по новым или вновь открывшимся обстоятельствам",
        "Подача заявления об обеспечении иска, в том числе иска, рассматриваемого в третейском суде," +
                " о замене обеспечительной меры, об отмене обеспечения (за исключением заявлений о " +
                "принятии предварительных обеспечительных мер защиты авторских и (или) смежных прав" +
                " в информационно-\nтелекоммуникационных сетях, в том числе в сети \"Интернет\")",
        "Подача заявления по делам о взыскании алиментов",
        "Подача административного искового заявления о присуждении компенсации за нарушение права " +
                "на судопроизводство в разумный срок или права на исполнение судебного акта в разумный срок",
        "Подача административного искового заявления о присуждении компенсации за нарушение условий " +
                "содержания под стражей, содержания в исправительном учреждении",
        "Подача апелляционной жалобы",
        "Подача частной жалобы",
        "Подача кассационной жалобы на судебный приказ",
        "Подача кассационной жалобы",
    )
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(poshlinaText[0]) }
    //скролл пошлин текст
    val scrollState = rememberScrollState()

    Column(
        Modifier
            .selectableGroup()
            .verticalScroll(scrollState)
    ) {
        poshlinaText.forEach { text ->
            Card(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp)
                    .selectable(
                        selected = (text == selectedOption),
                        onClick = { onOptionSelected(text) })
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(vertical = 2.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    RadioButton(
                        selected = (text == selectedOption),
                        onClick = {
                            onOptionSelected(text)

                        }
                    )
                    Text(
                        text = text,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(2.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun CardFirst1(
    namePoshlina: NamePoshlina,
    modifier: Modifier = Modifier,
    names: Array<String>,
    navController: NavController
) {
    //список пошлин текст и выбор
    val poshlinaText = namePoshlina.poshlinaText

    LazyColumn {
        //размер списка
        val itemCount = poshlinaText.size
        items(itemCount) {
            ColumItem(
                namePoshlina,
                modifier,
                itemIndex = it,
                title = names,
                navController = navController
            )
        }
    }
}

@Composable
fun ColumItem(
    namePoshlina: NamePoshlina,
    modifier: Modifier,
    title: Array<String>,
    itemIndex: Int,
    navController: NavController
) {
    Column {
        Card(
            modifier
                .fillMaxWidth()
                .padding(horizontal = 2.dp, vertical = 4.dp)
                .clickable {
                    navController.navigate(HomeScreen)
                }
        ) {
            Text(
                text = title[itemIndex],
                fontSize = 20.sp,
                modifier = Modifier.padding(horizontal = 4.dp, vertical = 4.dp)
            )
        }
    }
}
