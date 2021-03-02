package com.example.androiddevchallenge.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.data.Dog

@Composable
fun listItem(dog: Dog, onClick: () -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.clickable (true) {
        onClick()
    }) {
        Image(
            painterResource(id = dog.headImage),
            contentDescription = null,
            modifier = Modifier.size(56.dp, 56.dp)
                .clip(RoundedCornerShape(4.dp))
                .padding(8.dp)
        )
        Column {
            Text(text = dog.name, color = Color.Black, fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp, 0.dp, 0.dp, 0.dp))
            Text(text =  dog.introduct, color = Color.DarkGray, fontSize = 14.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp, 4.dp, 0.dp, 0.dp))
        }
    }
}