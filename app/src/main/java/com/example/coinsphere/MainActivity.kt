package com.example.coinsphere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinsphere.models.cryptos
import com.example.coinsphere.ui.theme.Background
import com.example.coinsphere.ui.theme.CoinSphereTheme
import com.example.coinsphere.ui.theme.TextMain
import com.example.coinsphere.ui.theme.poppinsFontFamily
import com.example.coinsphere.ui.theme.poppinsTypo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoinSphereTheme {
                MainPage()
            }
        }
    }
}

@Composable
fun MainPage(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {
        Text(
            text = "CoinSphere",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleLarge,
            fontSize = 20.sp,
            color = TextMain,
            modifier = Modifier
                .padding(top = 24.dp, start = 20.dp)
        )

        Boxes()

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            items(cryptos) { coin ->
                CryptoRow(crypto = coin)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    CoinSphereTheme {
        MainPage()
    }
}