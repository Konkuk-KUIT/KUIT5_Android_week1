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
import androidx.compose.ui.text.font.FontVariation.width
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

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart")
    }
}

@Composable
fun ProfileCard(modifier: Modifier = Modifier) {
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
            modifier = Modifier //위에서부터 차례대로 실행. (순서가 중요)
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
            modifier = Modifier //위에서부터 차례대로 실행. (순서가 중요)
                .padding(
                    top = 20.dp,
                    start = 29.dp
                )
                .width(60.dp)
                .height(60.dp)
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
            modifier = Modifier //위에서부터 차례대로 실행. (순서가 중요)
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
            modifier = Modifier //위에서부터 차례대로 실행. (순서가 중요)
                .padding(
                    top = 20.dp,
                    start = 29.dp
                )
                .width(60.dp)
                .height(60.dp)
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

@Composable
fun Mission() {
    Box(
        modifier = Modifier
            .padding(
                top = 45.dp,
                start = 45.dp
            )
            .width(140.dp)
            .height(140.dp)
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(10.dp)
            )
    ) {
        Column {
            Image(
                painter = painterResource(R.drawable.sweet_potato),
                contentDescription = "sweet potato image",
                modifier = Modifier
                    .padding(top = 10.dp, start = 10.dp)
                    .size(40.dp)
                    .clip(RoundedCornerShape(10.dp))
            )
            Text(
                text = "이름 : 고현규",
                fontSize = 8.sp,
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        start = 10.dp
                    )
                    .height(10.dp)
            )
            Text(
                text = "학번 : 202111242",
                fontSize = 8.sp,
                modifier = Modifier
                    .padding(
                        top = 5.dp,
                        start = 10.dp
                    )
                    .height(10.dp)
            )
            Text(
                text = "학과 : 컴퓨터공학부",
                fontSize = 8.sp,
                modifier = Modifier
                    .padding(
                        top = 5.dp,
                        start = 10.dp
                    )
                    .height(10.dp)
            )
            Text(
                text = "생년월일 : 2002/02/09",
                fontSize = 8.sp,
                modifier = Modifier
                    .padding(
                        top = 5.dp,
                        start = 10.dp
                    )
                    .height(10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SamplePreview() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        //Sample()
        //CircleSample()
        Mission()
    }
}