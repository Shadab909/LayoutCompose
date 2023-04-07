package com.example.layoutcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.layoutcompose.composables.BasicColumn
import com.example.layoutcompose.composables.Content
import com.example.layoutcompose.composables.MyConstrainedLayout
import com.example.layoutcompose.composables.SimpleLayoutModifier
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
    heightDp = 300 ,
    widthDp = 200

)
@Composable
fun DefaultPreview() {
    LayoutComposeTheme {
       MyConstrainedLayout()
    }
}