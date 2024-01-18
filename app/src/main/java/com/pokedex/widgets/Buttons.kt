package com.pokedex.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pokedex.ui.theme.TypeBug
import com.pokedex.ui.theme.TypeDark
import com.pokedex.ui.theme.TypeDragon

@Composable
fun MyButtonModular(text: String, function: () -> Unit) = Button(
    onClick = function, colors = ButtonDefaults.buttonColors(
        containerColor = TypeBug,
    ),
    border = BorderStroke(1.dp, Color.Black),
) {
    Text(
        text = text,
        textAlign = TextAlign.Center,
        fontFamily = FontFamily.Monospace,
        fontSize = 12.sp,
        fontWeight = FontWeight.Light,
        color = TypeDark
    )
}


@Preview(showBackground = true)
@Composable
fun ViewButton() {
    MyButtonModular(text = "".firstString("teste")) {
        println("Cliquei")
    }
}


fun String.firstString(value: String): String {
    return value
}

fun Int.firstNumber() {

}
