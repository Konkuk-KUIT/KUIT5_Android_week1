package com.example.kuit_1th_weeks

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
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
    Column {


        Box(
            modifier = Modifier
                .padding(top = 45.dp, start = 45.dp)
                .size(width = 140.dp, height = 160.dp)
                .clip(RoundedCornerShape(10.dp))
                .border(1.dp, Color.Black, RoundedCornerShape(10.dp))

        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                verticalArrangement = Arrangement.Top, //위쪽으로 정렬
                horizontalAlignment = Alignment.Start //왼쪽으로 정렬
            ) {
                     Image(
                        painter = painterResource(R.drawable.image_cat),
                        contentDescription = "cat image",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(bottom = 4.dp) // ✅ 이미지와 텍스트 사이 간격 추가
                    )

                    Text(text = "이름 : 강민희", fontSize = 8.sp, color = Color.Black,)
                    Text(text = "학번 : 202212342", fontSize = 8.sp, color = Color.Black)
                    Text(text = "학과 : 스마트ICT융합공학과", fontSize = 8.sp, color = Color.Black)
                    Text(text = "생년월일 : 2003/09/01", fontSize = 8.sp, color = Color.Black)
                }
            }
        }


    }

@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {
    KUIT_1th_weeksTheme {
        Box(
            modifier = Modifier
            .size(width = 272.dp, height = 255.dp)
        )
        ProfileCard()
    }
}



@Composable
fun Sample(){
    Column{
       Box (
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
                .padding(top=20.dp, start=29.dp)
                .size(60.dp)
                .clip(RoundedCornerShape(20.dp))
                .border(
                    width = 2.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(20.dp)
                )
        )

        Box(
            modifier = Modifier
                .padding(top=20.dp, start=29.dp)
                .size(76.dp)
                .border(
                    width = 1.dp,
                    color = Color.Black
                )
                .padding(8.dp)
                .background(color=Color.Red)
        )

        Image(
            painter = painterResource(R.drawable.image_dog),
            contentDescription = "dog image",
            modifier = Modifier
                .padding(top=20.dp, start=29.dp)
                .size(80.dp)
        )
    }
}

@Composable
fun CircleSample(){
    Column{
        Box (
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
                .padding(top=20.dp, start=29.dp)
                .size(60.dp)
                .clip(RoundedCornerShape(20.dp))
                .border(
                    width = 3.dp,
                    color = Color.Black,
                    shape = CircleShape
                )
        )

        Box(
            modifier = Modifier
                .padding(top=20.dp, start=29.dp)
                .size(76.dp)
                .border(
                    width = 1.dp,
                    color = Color.Black
                )
                .padding(8.dp)
                .clip(CircleShape)
                .background(color=Color.Blue)
        )

        Image(
            painter = painterResource(R.drawable.image_dog),
            contentDescription = "dog image",
            modifier = Modifier
                .padding(top=20.dp, start=29.dp)
                .size(80.dp)
                .clip(CircleShape)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SamplePreview(){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
       // Sample()
        CircleSample()
    }
}