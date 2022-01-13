package com.example.layoutcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutcompose.composables.BodyContent
import com.example.layoutcompose.composables.Content
import com.example.layoutcompose.composables.SimpleLayout
import com.example.layoutcompose.ui.theme.LayoutComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutComposeTheme {
                Content()
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