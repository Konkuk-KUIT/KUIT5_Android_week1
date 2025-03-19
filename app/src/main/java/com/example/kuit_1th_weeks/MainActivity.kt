package com.example.kuit_1th_weeks

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kuit_1th_weeks.ui.theme.KUIT_1th_weeksTheme

import androidx.compose.ui.unit.dp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.border
import androidx.compose.ui.draw.clip

import androidx.compose.ui.graphics.Color

import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.graphics.painter.Painter

import androidx.compose.foundation.background

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "onCreate")
        enableEdgeToEdge()
        setContent {
            KUIT_1th_weeksTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProfileCard(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ProfileCard(modifier: Modifier = Modifier) {
    Column{
        Image(
            painter = painterResource(R.drawable.image1),
            contentDescription = "자료",
            modifier = Modifier
                .padding(top =55.dp, start = 55.dp)
                .size(40.dp)
                .clip(RoundedCornerShape(10.dp))
        )
        Text(
            text = "이름 : 정해찬",
            color = Color.Black
        )
        Text(
            text = "학과 : 컴퓨터공학부",
            color = Color.Black
        )
        Text(
            text = "학번: 202411377",
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {
    KUIT_1th_weeksTheme {
        ProfileCard()
    }
}

@Composable
fun Sample(){
    Column {
        Box(
            modifier = Modifier
                .padding(top = 27.dp, start = 29.dp)
                .width(60.dp)
                .height(60.dp)
                .clip(RoundedCornerShape((20.dp)))
                .background(color = Color.Black)
        )
        Box(
            modifier = Modifier
                .padding(top = 20.dp, start = 29.dp)
                .size(60.dp)
                .border(
                    width = 2.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(20.dp)
                )
        )
        Box(
            modifier = Modifier
                .padding(top = 20.dp, start = 29.dp)
                .size(76.dp)
                .border(
                    width = 1.dp,
                    color = Color.Black
                )
                .padding(8.dp)
                .background(color = Color.Red)
        )
        Image(
            painter = painterResource(R.drawable.image2),
            contentDescription = "dog",
            modifier = Modifier
                .padding(top =20.dp, start = 29.dp)
                .size(80.dp)
        )
    }
}

@Composable
fun CircleSample(){
    Column {
        Box(
            modifier = Modifier
                .padding(top = 27.dp, start = 29.dp)
                .width(60.dp)
                .height(60.dp)
                .clip(CircleShape)
                .background(color = Color.Black)
        )
        Box(
            modifier = Modifier
                .padding(top = 20.dp, start = 29.dp)
                .size(60.dp)
                .border(
                    width = 3.dp,
                    color = Color.Black,
                    shape = CircleShape
                )
        )
        Box(
            modifier = Modifier
                .padding(top = 20.dp, start = 29.dp)
                .size(76.dp)
                .border(
                    width = 1.dp,
                    color = Color.Black
                )
                .padding(8.dp)
                .clip(CircleShape)
                .background(color = Color.Blue)
        )
        Image(
            painter = painterResource(R.drawable.image2),
            contentDescription = "dog",
            modifier = Modifier
                .padding(top =20.dp, start = 29.dp)
                .size(80.dp)
                .clip(CircleShape)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SamplePreview() {
    Box(
        modifier = Modifier.fillMaxSize()
    ){
//        Sample()
        CircleSample()
    }
}