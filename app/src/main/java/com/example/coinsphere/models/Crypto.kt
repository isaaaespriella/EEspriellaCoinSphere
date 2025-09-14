package com.example.coinsphere.models

import coil3.Image

data class Crypto(
    val rank: Int,
    val name: String,
    val price: String,
    val image: String
)

val cryptos = listOf(
    Crypto(1, "Bitcoin", "$109,797.37", "https://cdn-icons-png.flaticon.com/128/5968/5968260.png"),
    Crypto(2, "Ethereum", "$4,321.21", "https://cdn-icons-png.flaticon.com/128/4125/4125334.png"),
    Crypto(3, "Tether", "$1.0000", "https://altcoinsbox.com/wp-content/uploads/2023/01/tether-logo-600x600.webp"),
    Crypto(4, "XRP", "$2.8100", "https://static.vecteezy.com/system/resources/previews/044/626/794/non_2x/xrp-logo-on-transparent-background-free-vector.jpg"),
    Crypto(5, "BNB", "$845.0000", "https://vectorseek.com/wp-content/uploads/2023/09/BINANCE-COIN-BNB-Logo-Vector.svg-.png"),
    Crypto(6, "Solana", "$201.8500", "https://uxwing.com/wp-content/themes/uxwing/download/brands-and-social-media/solana-sol-icon.png"),
    Crypto(7, "USDC", "$0.9998", "https://cdn-icons-png.flaticon.com/128/14446/14446284.png"),
    Crypto(8, "Dogecoin", "$0.1320", "https://www.citypng.com/public/uploads/preview/hd-dogecoin-logo-icon-coin-png-701751694779734rtff9rbuve.png"),
    Crypto(9, "TRON", "$0.3630", "https://cdn-icons-png.flaticon.com/128/12870/12870495.png"),
)

