package com.sito.sapereaudi.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sito.sapereaudi.ui.navigation.Navigation
import com.sito.sapereaudi.ui.theme.SapereAudiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SapereAudiTheme {
                Navigation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SapereAudiTheme {
       // MainMenu(mainMenuClickHandler())
    }
}