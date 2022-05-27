package com.sito.sapereaudi.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.halilibo.richtext.ui.RichText
import com.mukesh.MarkDown
import com.sito.sapereaudi.R
import com.sito.sapereaudi.ui.components.header.HeaderRow
import com.sito.sapereaudi.ui.components.layout.MenuColumn
import com.sito.sapereaudi.ui.theme.ButtonSalmon


@Composable
fun LessonPage(navController: NavController, lesson: String = "1") {
    MenuColumn {
        HeaderRow(
            backOn = "lesson_screen",
            navController = navController,
            text = stringResource(id = R.string.lessonsTitle)
        )
        Hola = "**Los verbos irregulares.** \n" +
                "\n" +
                "\n" +
                "**Verbos Irregulares: \"Velle\" / \"Nolle\" / \"Malle\"** \n" +
                "\n" +
                "` `Presente\n" +
                "\n" +
                "\n" +
                "||velle|nolle|malle|\n" +
                "| :- | :- | :- | :- |\n" +
                "|1ra pers. sing.|volo (quiero)|nolo (no quiero)|malo (prefiero)|\n" +
                "|2da pers. sing.|vis|non vis|mavis|\n" +
                "|3ra pers. sing.|vul|non vult|mavult|\n" +
                "|1ra pers. plur.|volumus|nolumus|malumus|\n" +
                "|2da pers. plur.|vultis|non vultis|mavultis|\n" +
                "|3ra pers. plur.|volunt|nolunt|malunt|\n" +
                "\n" +
                "\n" +
                "Pretérito imperfecto\n" +
                "\n" +
                "\n" +
                "||velle|nolle|malle|\n" +
                "| :- | :- | :- | :- |\n" +
                "|1ra pers. sing.|volebam|nolebam|malebam|\n" +
                "|2da pers. sing.|volebas|nolebas|malebas|\n" +
                "|3ra pers. sing.|volebat|nolebat|malebat|\n" +
                "|1ra pers. plur.|volebamus|nolebamus|malebamus|\n" +
                "|2da pers. plur.|volebatis|nolebatis|malebatis|\n" +
                "|3ra pers. plur.|volebant|nolebant|malebant|\n" +
                "\n" +
                "\n" +
                "Futuro imperfecto \n" +
                "\n" +
                "\n" +
                "||velle|nolle|malle|\n" +
                "| :- | :- | :- | :- |\n" +
                "|1ra pers. sing.|volam|nolam|malam|\n" +
                "|2da pers. sing.|voles|noles|males|\n" +
                "|3ra pers. sing.|volet|nolet|malet|\n" +
                "|1ra pers. plur.|volemus|nolemus|malemus|\n" +
                "|2da pers. plur.|voletis|noletis|maletis|\n" +
                "|3ra pers. plur.|volent|nolent|malent|\n" +
                "\n" +
                "\n" +
                "Perfecto: La conjugación del perfecto es regular. \n" +
                "\n" +
                "Subjuntivo \n" +
                "\n" +
                "Presente\n" +
                "\n" +
                "velim - yo quiera \n" +
                "\n" +
                "\n" +
                "||velle|nolle|malle|\n" +
                "| :- | :- | :- | :- |\n" +
                "|1ra pers. sing.|velim|nolim|mailm|\n" +
                "|2da pers. sing.|velis|nolis|malis|\n" +
                "|3ra pers. sing.|velit|nolit|malit|\n" +
                "|1ra pers. plur.|velimus|nolimus|malimus|\n" +
                "|2da pers. plur.|velitis|nolitis|maliti|\n" +
                "|3ra pers. plur.|velint|nolint|malint|\n" +
                "\n" +
                "\n" +
                "Pretérito imperfecto\n" +
                "\n" +
                "vellem - yo quisiera \n" +
                "\n" +
                "\n" +
                "||velle|nolle|malle|\n" +
                "| :- | :- | :- | :- |\n" +
                "|1ra pers. sing.|vellem|nollem|mallem|\n" +
                "|2da pers. sing.|velles|nolles|malles|\n" +
                "|3ra pers. sing.|vellet|nollet|mallet|\n" +
                "|1ra pers. plur.|vellemus|nollemus|mallemus|\n" +
                "|2da pers. plur.|velletis|nolletis|malletis|\n" +
                "|3ra pers. plur.|vellent|nollent|mallent|\n" +
                "\n" +
                "\n" +
                "Imperativo \n" +
                "\n" +
                "Solamente nolle tiene imperativo. Los otros dos verbos, velle y malle, no tienen. \n" +
                "\n" +
                "Presente:\n" +
                "\n" +
                "2ª pers. singular: noli \n" +
                "\n" +
                "2ª pers. plural: nolite\n" +
                "\n" +
                "Futuro: \n" +
                "\n" +
                "2ª pers. singular: nolito\n" +
                "\n" +
                "2ª pers. plural: nolitote\n" +
                "\n" +
                "\n" +
                "\n" +
                "**Verbo Irregular: \"Fieri\" / \"Edere\"** \n" +
                "\n" +
                "\n" +
                "\n" +
                "**Fieri** \n" +
                "\n" +
                "Fio, fis, factus sum \n" +
                "\n" +
                "Infinitivo: fieri Indicativo\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "||presente|imperfecto|futuro I|\n" +
                "| :- | :- | :- | :- |\n" +
                "|1ra pers. sing.|fio|fiebam|fiam|\n" +
                "|2da pers. sing.|fis|fiebas|fies|\n" +
                "|3ra pers. sing.|fit|fiebat|fiet|\n" +
                "|1ra pers. plur.|-|fiebamus|fiemus|\n" +
                "|2da pers. plur.|-|fiebatis|fietis|\n" +
                "|3ra pers. plur.|fiunt|fiebant|fient|\n" +
                "\n" +
                "\n" +
                "\n" +
                "||perfecto|\n" +
                "| :- | :- |\n" +
                "|1ra pers. sing.|factus, a, um, sum|\n" +
                "|2da pers. sing.|es|\n" +
                "|3ra pers. sing.|est|\n" +
                "|1ra pers. plur.|facti, ae, a, sumus|\n" +
                "|2da pers. plur.|estis|\n" +
                "|3ra pers. plur.|sunt|\n" +
                "\n" +
                "\n" +
                "El pluscuamperfecto y el futuro II se construyen según el mismo esquema.\n" +
                "\n" +
                "` `Subjuntivo \n" +
                "\n" +
                "\n" +
                "||presente|imperfecto|\n" +
                "| :- | :- | :- |\n" +
                "|1ra pers. sing.|fiam|fierem|\n" +
                "|2da pers. sing.|fias|fieres|\n" +
                "|3ra pers. sing.|fiat|fieret|\n" +
                "|1ra pers. plur.|fiamus|fieremus|\n" +
                "|2da pers. plur.|fiatis|fieretis|\n" +
                "|3ra pers. plur.|fiant|fierent|\n" +
                "\n" +
                "\n" +
                "El perfecto, el pluscuamperfecto y el futuro II se construyen según el mismo esquema que el indicativo pero con el subjuntivo del verbo \"esse\". \n" +
                "\n" +
                "Imperativo \n" +
                "\n" +
                "Presente\n" +
                "\n" +
                "2ª Pers. Singular: fi       2ª Pers. Plural: fiite    Futuro   \n" +
                "\n" +
                "2ª Pers. Singular: fito    2ª Pers. Plural: fiitote\n" +
                "\n" +
                "\n" +
                "\n" +
                "**Edere (comer)**\n" +
                "\n" +
                "edo, edi, esum \n" +
                "\n" +
                "edo - como \n" +
                "\n" +
                "Indicativo\n" +
                "\n" +
                "\n" +
                "||presente|imperfecto|futuro I|\n" +
                "| :- | :- | :- | :- |\n" +
                "|1ra pers. sing.|edo|edebam|edam|\n" +
                "|2da pers. sing.|edis|edebas|edes|\n" +
                "|3ra pers. sing.|edit|edebat|edet|\n" +
                "|1ra pers. plur.|edimus|edebamus|edemus|\n" +
                "|2da pers. plur.|editis|edebatis|edetis|\n" +
                "|3ra pers. plur.|edunt|edebant|edent|\n" +
                "\n" +
                "\n" +
                "Perfecto: edi (he comido) / edisti... \n" +
                "\n" +
                "Pluscuamperfecto: ederam, ederas... \n" +
                "\n" +
                "Futuro II: edero, ederis \n" +
                "\n" +
                "**Verbo Irregular: \"Ferre\"**\n" +
                "\n" +
                "\n" +
                "\n" +
                "fero, tuli, latum (llevar / portar) \n" +
                "\n" +
                "Indicativo \n" +
                "\n" +
                "\n" +
                "||presente|imperfecto|futuro I|\n" +
                "| :- | :- | :- | :- |\n" +
                "|1ra pers. sing.|fero|ferebam|feram|\n" +
                "|2da pers. sing.|fers|ferebas|feres|\n" +
                "|3ra pers. sing.|fert|ferebat|feret|\n" +
                "|1ra pers. plur.|ferimus|ferebamus|feremus|\n" +
                "|2da pers. plur.|fertis|ferebatis|feretis|\n" +
                "|3ra pers. plur.|ferunt|ferebant|ferent|\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "||perfecto|pluscuamperfecto|futuro II|\n" +
                "| :- | :- | :- | :- |\n" +
                "|1ra pers. sing.|tuli|tuleram|tulero|\n" +
                "|2da pers. sing.|tulisti|tuleras|tuleris|\n" +
                "|3ra pers. sing.|tulit|tulerat|tulerit|\n" +
                "|1ra pers. plur.|tulimus|tuleramus|tulerimus|\n" +
                "|2da pers. plur.|tulistis|tuleratis|tuleritis|\n" +
                "|3ra pers. plur.|tulerunt|tulerant|tulerint|\n" +
                "\n" +
                "\n" +
                "Subjuntivo\n" +
                "\n" +
                "\n" +
                "\n" +
                "||presento|imperfecto|\n" +
                "| :- | :- | :- |\n" +
                "|1ra pers. sing.|feram|ferrem|\n" +
                "|2da pers. sing.|feras|ferres|\n" +
                "|3ra pers. sing.|ferat|ferret|\n" +
                "|1ra pers. plur.|feramus|ferremus|\n" +
                "|2da pers. plur.|feratis|ferretis|\n" +
                "|3ra pers. plur.|ferant|ferrent|\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "||perfecto|pluscuamperfecto|\n" +
                "| :- | :- | :- |\n" +
                "|1ra pers. sing.|tulerim|tulissem|\n" +
                "|2da pers. sing.|tuleris|tulisses|\n" +
                "|3ra pers. sing.|tulerit|tulisset|\n" +
                "|1ra pers. plur.|tulerimus|tulissemus|\n" +
                "|2da pers. plur.|tuleritis|tulissetis|\n" +
                "|3ra pers. plur.|tulerint|tulissent|\n" +
                "\n" +
                "\n" +
                "Imperativo \n" +
                "\n" +
                "Presente: singular: fer     Plural: ferte  \n" +
                "\n" +
                "Futuro : singular: ferto     Plural: fertote / ferunto \n" +
                "\n" +
                "Voz pasiva \n" +
                "\n" +
                "Infinitivo pasivo : ferri \n" +
                "\n" +
                "\n" +
                "\n" +
                "||presente|imperfecto|futuro I|\n" +
                "| :- | :- | :- | :- |\n" +
                "|1ra pers. sing.|ferror|ferebar|ferar|\n" +
                "|2da pers. sing.|ferris|ferebaris|fereris|\n" +
                "|3ra pers. sing.|fertur|ferebatur|feretur|\n" +
                "|1ra pers. plur.|ferimur|ferebamur|feremur|\n" +
                "|2da pers. plur.|ferimini|ferebamini|feremini|\n" +
                "|3ra pers. plur.|feruntur|ferebantur|feruntur|\n" +
                "\n" +
                "**  \n" +
                "\n" +
                "Perfecto: latus, a, um - sum ... \n" +
                "**\n" +
                "` `El pluscuamperfecto y el futuro II se construyen según el mismo esquema. \n" +
                "**\n" +
                "\n" +
                "\n" +
                "2.- Vocabulario\n" +
                "\n" +
                "aferre - llevar \n" +
                "\n" +
                "anteferre - preferir \n" +
                "\n" +
                "auferre : arrebatar, quitar \n" +
                "\n"
        Text(text = R.string.lesson1.toString())
        Text(text = R.string.lesson2.toString())
        Text(text = R.string.lesson3.toString())
        Text(text = R.string.lesson4.toString())
        Text(text = R.string.lesson5.toString())
        RichText(modifier = Modifier.background(ButtonSalmon)) {
            MarkDown(modifier = Modifier.background(ButtonSalmon), text = stringResource(id = R.string.lesson2).trimIndent())
        }
    }
}