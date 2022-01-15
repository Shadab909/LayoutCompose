package com.example.layoutcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.layoutcompose.composables.Content
import com.example.layoutcompose.composables.SimpleLayout
import com.example.layoutcompose.ui.theme.LayoutComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutComposeTheme {
                Column {
                    Content()
                    Text(text = "NewCommit")
                    bloody hell
                    i want to revert
                }
                
            }
        }
    }
}





@Preview(
    showBackground = true,
    heightDp = 300,
    widthDp = 100
)
@Composable
fun DefaultPreview() {
    LayoutComposeTheme {
       SimpleLayout()
    }
}