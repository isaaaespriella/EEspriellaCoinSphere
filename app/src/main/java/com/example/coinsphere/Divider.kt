package com.example.coinsphere

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.coinsphere.ui.theme.TextDim
import androidx.compose.material3.Divider
import androidx.compose.ui.unit.sp

@Composable
fun Divider() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 6.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                Text(
                    text = "#",
                    color = TextDim,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(end = 12.dp)
                )
                Text(
                    text = "Name",
                    color = TextDim,
                    fontSize = 12.sp,
                )
            }

            Text(
                text = "Price",
                color = TextDim,
                fontSize = 12.sp,
                modifier = Modifier
                    .width(140.dp)
            )
        }

        Divider(
            color = TextDim.copy(alpha = 0.3f),
            thickness = 1.dp,
        )
    }
}