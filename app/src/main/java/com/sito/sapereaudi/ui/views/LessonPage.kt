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
        Hola = "**Técnicas para la traducción de un texto**\n" +
                "\n" +
                "Un texto latino nunca debe traducirse palabra por palabra, pues las estructuras gramaticales pueden ser muy diferentes entre el latín y el español, y es necesario fijarse en ellas antes de pasar a descubrir el significado semántico de las palabras latinas. Para traducir bien, sigue estas normas:\n" +
                "\n" +
                "a)  LECTURA PREVIA DEL TEXTO\n" +
                "\n" +
                "La primera toma de contacto podemos reconocer muchas palabras (tiempos verbales, nexos, palabras cuyo significado conocemos, preposiciones, etc.). De esta manera se obtiene una visión global de lo que se va a traducir.\n" +
                "\n" +
                "b)  IDENTIFICACIÓN DE VERBOS\n" +
                "\n" +
                "Es importante detectar todas las formas verbales que tiene el texto, incluidos participios e infinitivos, pues por cada forma verbal tendremos una oración distinta. De paso podemos realizar el análisis morfológico de dichas formas.\n" +
                "\n" +
                "c)  IDENTIFICACIÓN DE ORACIONES\n" +
                "\n" +
                "Por cada verbo tendremos una oración. En ese caso se trata de una oración compuesta. \n" +
                "\n" +
                "Ahora debemos confirmar la relación sintáctica entre las mismas, si son coordinadas, yuxtapuestas o subordinadas. La clave nos la darán los nexos.\n" +
                "\n" +
                "d)  RÉGIMEN SINTÁCTICO DE CADA ORACIÓN\n" +
                "\n" +
                "Una vez tenemos delimitados los períodos, es hora de analizar oración por oración. Lo primero que debemos hacer es saber qué tipo de verbo tenemos:\n" +
                "\n" +
                "\\-  Verbo transitivo: siempre lleva CD,por tanto buscaremos un Acusativo sin preposición.\n" +
                "\n" +
                "\\-  Verbo copulativo: siempre lleva Atributo, buscaremos un nominativo\n" +
                "\n" +
                "\\-  Verbo pasivo: nunca lleva CD, y a veces un C. Agente.\n" +
                "\n" +
                "\\-  Verbo intransitivo: nunca lleva CD, y normalmente lleva un CCT(preposición )\n" +
                "\n" +
                "e)  BÚSQUEDA DEL SUJETO\n" +
                "\n" +
                "El sujeto, si lo hay (no es obligatorio), siempre estará en el mismo número que el verbo (singular o plural), y normalmente está en nominativo (salvo en una oración de infinitivo).\n" +
                "\n" +
                "f)  OTROS COMPLEMENTOS\n" +
                "\n" +
                "Analizamos aquello que quede: preposiciones + ac. o abl. (CC), dativos, genitivos, etc.\n" +
                "\n" +
                "g)  TRADUCCIÓN\n" +
                "\n" +
                "Es el momento más importante, ya que si no traducimos bien, a pesar de tener el análisis correcto, no hacemos nada. Para esta ardua tarea, ten en cuenta varios consejos:\n" +
                "\n" +
                "\\1. Corroborar que hemos traducido bien los tiempos verbales y los números (sing./pl.)\n" +
                "\n" +
                "\\2. Traducir cada período oracional por separado.\n" +
                "\n" +
                "\\3. Fijarse muy bien en el régimen sintáctico: el CD, el sujeto, los circunstanciales.\n" +
                "\n" +
                "\\4. Emplear la estructura sujeto – verbo – predicado.\n" +
                "\n" +
                "\\5. Tener cuidado si está en voz pasiva o es una oración de infinitivo o ablativo absoluto.\n" +
                "\n" +
                "\\6. La traducción debe tener un sentido lógico, tenga que ver con el contexto planteado.\n"
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