package com.example.kuit_1th_weeks

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kuit_1th_weeks.ui.theme.KUIT_1th_weeksTheme

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
    Box(
        modifier = Modifier
            .padding(top = 45.dp, start = 45.dp, end = 87.dp, bottom = 70.dp)
            .size(140.dp)
            .border(width = 1.dp, shape = RoundedCornerShape(10.dp), color = Color.Black)
    )
    Column {
        Image(
            painter = painterResource(R.drawable.image_profile),
            contentDescription = "profile image",
            modifier = Modifier
                .padding(top = 55.dp, start = 55.dp)
                .size(40.dp)
                .clip(RoundedCornerShape(10.dp))
        )
        Text(
            text = "이름 : 최지현",
            fontSize = 8.sp,
            style = TextStyle(lineHeight = 10.sp),
            modifier = Modifier
                .padding(top = 10.dp, start = 55.dp)
        )
        Text(
            text = "학번 : 202411390",
            fontSize = 8.sp,
            style = TextStyle(lineHeight = 10.sp),
            modifier = Modifier
                .padding(top = 5.dp, start = 55.dp)
        )
        Text(
            text = "학과 : 컴퓨터공학부",
            fontSize = 8.sp,
            style = TextStyle(lineHeight = 10.sp),
            modifier = Modifier
                .padding(top = 5.dp, start = 55.dp)
        )
        Text(
            text = "생년월일 : 2005/05/11",
            fontSize = 8.sp,
            style = TextStyle(lineHeight = 10.sp),
            modifier = Modifier
                .padding(top = 5.dp, start = 55.dp)
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
fun Sample() {
    Column {
        Box(
            modifier = Modifier
                .padding(
                    top = 27.dp,
                    start = 29.dp
                )
                .width(60.dp)
                .height(60.dp)
                .clip(RoundedCornerShape(20.dp))
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
            painter = painterResource(R.drawable.image_dog),
            contentDescription = "dog image",
            modifier = Modifier
                .padding(top = 20.dp, start = 29.dp)
                .size(80.dp)
        )
    }

}

@Composable
fun CircleSample() {

    Column {
        Box(
            modifier = Modifier
                .padding(
                    top = 27.dp,
                    start = 29.dp
                )
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
            painter = painterResource(R.drawable.image_dog),
            contentDescription = "dog image",
            modifier = Modifier
                .padding(top = 20.dp, start = 29.dp)
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
    ) {
//        Sample()
        CircleSample()
    }
}