package com.adrian.fullguidetojetpackcomposeanimations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.adrian.fullguidetojetpackcomposeanimations.ui.theme.FullGuideToJetpackComposeAnimationsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FullGuideToJetpackComposeAnimationsTheme {
                Column(modifier = Modifier.fillMaxSize()) {
                    var isVisible by remember { mutableStateOf(false) }
                    Button(onClick = {
                        isVisible = !isVisible
                    }) {
                        Text(text = "Toggle")
                    }
                    AnimatedVisibility(visible = isVisible ,
                        enter = slideInHorizontally () + fadeIn(),
                    modifier = Modifier.fillMaxWidth().weight(1f)) {
                        Box(modifier = Modifier.background(Color.Red))

                    }
                }
            }
        }
    }
}

