package com.example.coinsphere

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinsphere.ui.theme.Background
import com.example.coinsphere.ui.theme.CoinSphereTheme
import com.example.coinsphere.ui.theme.TextMain


@Composable
fun MainPage(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {
        Text(
            text = "CoinSphere",
            style = MaterialTheme.typography.headlineMedium,
            color = TextMain,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(14.dp)
        )

        Boxes()



    }
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    CoinSphereTheme {
        MainPage()
    }
}