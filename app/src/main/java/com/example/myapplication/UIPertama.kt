package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questadvancelayout.R

@Composable
fun AktivitasPertama(modifier: Modifier) {
    Column(
        modifier = Modifier.padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(25.dp))

        // --- Kartu 1
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ) {
            Row {
                val gambar = painterResource(id = R.drawable.logo)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(all = 5.dp)
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column {
                    Text(
                        text = stringResource(id = R.string.name),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.NoHp),
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                    )
                }
            }
        }

        // --- Kartu 2
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Blue
            )
        ) {
            Row {
                val gambar = painterResource(id = R.drawable.logo)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding( all = 5.dp)
                )
