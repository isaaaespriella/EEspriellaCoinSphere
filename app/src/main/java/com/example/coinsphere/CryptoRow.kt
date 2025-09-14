package com.example.coinsphere

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.request.colorSpace
import com.example.coinsphere.models.Crypto
import com.example.coinsphere.ui.theme.Background
import com.example.coinsphere.ui.theme.CoinSphereTheme
import com.example.coinsphere.ui.theme.Surface
import com.example.coinsphere.ui.theme.TextDim
import com.example.coinsphere.ui.theme.TextMain


@Composable
fun CryptoRow(crypto: Crypto) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Surface),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = crypto.rank.toString(),
            color = TextDim,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
        )

        AsyncImage(
            model = crypto.image,
            contentDescription = crypto.name,
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
        )

        Text(
            text = crypto.name,
            color = TextMain,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(start = 10.dp)
                .weight(1f)
        )

        Text(
            text = crypto.price,
            color = TextMain,
            fontSize = 12.sp,
            modifier = Modifier
                .width(150.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CrytoRowPreview() {
    CoinSphereTheme {
        MainPage()
    }
}
