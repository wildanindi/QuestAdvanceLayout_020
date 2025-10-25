package com.example.questadvancelayout_020

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileWildan(modifier: Modifier) {
    Column(
        modifier = Modifier
            .background(color = colorResource(id = R.color.napi))
            .padding(top = 25.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.spacedBy(1.dp)

    ) {
        val gambar = painterResource(id = R.drawable.poto)
        Image(
            painter = gambar,
            contentDescription = null,
            modifier = Modifier
                .size(size = 150.dp)
                .clip(CircleShape)
                .border(width = 3.dp, colorResource(id = R.color.UntukCard), CircleShape)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(id = R.drawable.insta),
                contentDescription = null,
                modifier = Modifier
                    .size(size = 40.dp)
                    .padding(all = 5.dp)

            )
            Image(
                painter = painterResource(id = R.drawable.twitt),
                contentDescription = null,
                modifier = Modifier
                    .size(size = 40.dp)
                    .padding(all = 5.dp)

            )
            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = null,
                modifier = Modifier
                    .size(size = 40.dp)
                    .padding(all = 5.dp)

            )
            Image(
                painter = painterResource(id = R.drawable.linkedin),
                contentDescription = null,
                modifier = Modifier
                    .size(size = 40.dp)
                    .padding(all = 5.dp)

            )
        }

        Spacer(modifier = Modifier.height(height = 15.dp))

        Text(
            text = stringResource(id = R.string.nama2),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White

        )

        Spacer(modifier = Modifier.height(height = 5.dp))

        Text(
            text = stringResource(id = R.string.nick),
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(height = 15.dp))

        Text(
            text = stringResource(id = R.string.bio),
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .height(height = 70.dp)
                .fillMaxWidth()
                .padding(horizontal =  16.dp),
            shape = RoundedCornerShape(100.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.UntukCard)
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(all = 10.dp)
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.insta),
                    contentDescription = null,
                    modifier = Modifier
                        .size(size = 70.dp)
                        .padding(all = 1.dp)

                )

                Spacer(modifier = Modifier.width(70.dp))

                Column () {
                    Text(
                        text = stringResource(id = R.string.nick),
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black,
                        modifier = Modifier.padding(vertical = 15.dp)
                    )

                }


            }


        }

    }


}


