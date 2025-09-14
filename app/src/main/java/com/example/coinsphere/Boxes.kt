package com.example.coinsphere

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinsphere.ui.theme.Surface
import com.example.coinsphere.ui.theme.TextDim
import com.example.coinsphere.ui.theme.TextMain

@Composable
fun Boxes() {Column(
    modifier = Modifier
        .padding(16.dp)
) {
    // Global Market Cap
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 4.dp)
            .background(
                color = Surface,
                shape = RoundedCornerShape(17.dp)
            )
            .padding(16.dp)
    ) {
        Column {
            Text(
                text = "Global Market Cap",
                color = TextDim,
                fontSize = 14.sp
            )
            Text(
                text = "$2.18T",
                color = TextMain,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }

    // Fear & Greed
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .background(
                color = Surface,
                shape = RoundedCornerShape(17.dp)
            )
            .padding(16.dp)
    ) {
        Column {
            Text(
                text = "Fear & Greed",
                color = TextDim,
                fontSize = 14.sp
            )
            Text(
                text = "Neutral (54)",
                color = TextMain,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }

    // Altcoin Season
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .background(
                color = Surface,
                shape = RoundedCornerShape(17.dp)
            )
            .padding(16.dp)
    ) {
        Column {
            Text(
                text = "Altcoin Season",
                color = TextDim,
                fontSize = 14.sp
            )
            Text(
                text = "No",
                color = TextMain,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}
}
