package com.adrian.refreshalist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.adrian.refreshalist.ui.theme.RefreshAListTheme
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.SwipeRefreshIndicator
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RefreshAListTheme {
                val viewModel = viewModel<MainViewModel>()
                val isLoading by viewModel.isLoading.collectAsState()
                val swiperRefreshState = rememberSwipeRefreshState(isRefreshing = isLoading)

                SwipeRefresh(state = swiperRefreshState, onRefresh = viewModel::loadStuff,
                indicator = {
                    state, refreshTrigger ->  SwipeRefreshIndicator(
                    state = state,
                    refreshTriggerDistance = refreshTrigger,
                    //backgroundColor = Color.Green ,
                contentColor = Color.DarkGray
                )
                }) {
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        items(100) {
                            Text(
                                text = "Test",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(32.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

