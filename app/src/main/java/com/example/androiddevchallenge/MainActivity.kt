/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.common.detailView
import com.example.androiddevchallenge.common.listItem
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {

    val viewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MaterialTheme {
                    Surface(color = MaterialTheme.colors.background) {
                        Box {
                            LazyColumn {
                                items(viewModel.dogs.size) { index ->
                                    listItem(viewModel.dogs.get(index)) {
                                        viewModel.index = index
                                        viewModel.showDetail()
                                    }
                                }
                            }
                            if (viewModel.isShowDetail) {
                                detailView(viewModel.dogs.get(viewModel.index))
                            }
                        }
                    }
                }
            }
        }
    }

    override fun onBackPressed() {

        Log.i("jairus", "viewModel.isShowDetail.value = " + viewModel.isShowDetail)

        if (viewModel.isShowDetail) {
            viewModel.hideDetail()
        } else {
            super.onBackPressed()
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {

    val viewModel: MyViewModel = MyViewModel()
    MaterialTheme {
        Surface(color = MaterialTheme.colors.background) {
            Box {
                LazyColumn {
                    items(viewModel.dogs.size) { index ->
                        listItem(viewModel.dogs.get(index)) {
                            viewModel.index = index
                            viewModel.showDetail()
                        }
                    }
                }
                if (viewModel.isShowDetail) {
                    detailView(viewModel.dogs.get(viewModel.index))
                }
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
//    MyTheme {
//        MyApp()
//    }

    val viewModel: MyViewModel = MyViewModel()
    Box(
        Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {

        Column {
            Text(
                text = "1号小狗", color = Color.Black, fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp, 0.dp, 0.dp, 0.dp)
            )

            Image(
                painterResource(id = R.mipmap.dog_1),
                contentDescription = null,
                alignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)
                    .clip(RoundedCornerShape(20.dp))
                    .padding(20.dp)
            )

            Text(
                text = "这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗这是一条狗", color = Color.DarkGray, fontSize = 14.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 20.dp, 20.dp, 20.dp)
            )
        }
    }
}
