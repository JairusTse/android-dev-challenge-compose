package com.example.androiddevchallenge.common

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.MyViewModel
import com.example.androiddevchallenge.data.Dog

@Composable
fun detailView(dog: Dog) {

    val viewModel: MyViewModel = MyViewModel()
    Box(Modifier
//        .layout { measurable, constraints ->
//            val placeable = measurable.measure(constraints)
//            layout(placeable.width, placeable.height) {
//                val offset = if(viewModel.isShowDetail) 0 else placeable.width
//                placeable.placeRelative(offset, 0)
//            }
//        }
        .background(Color.White)
        .fillMaxSize()) {

        Column {
            Text(text = dog.name, color = Color.Black, fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp, 0.dp, 0.dp, 0.dp))

            Image(
                painterResource(id = dog.bigImage),
                contentDescription = null,
                alignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .clip(RoundedCornerShape(20.dp))
                    .padding(20.dp)
            )

            Text(text = dog.details, color = Color.DarkGray, fontSize = 14.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 20.dp, 20.dp, 20.dp))
        }


    }


}