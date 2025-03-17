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
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
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
            .padding(
                start = 45.dp,
                top = 45.dp,
                end = 87.dp,
                bottom = 70.dp,

                )
            .size(145.dp)
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(10.dp)
            )

    ) {
        Column(Modifier.padding(start = 10.dp, top = 10.dp)) {

            Image(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(R.drawable.image_cat),
                contentDescription = "a cat image"
            )
            Text(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .size(width = 44.dp, height = 10.dp),
                text = "이름 : 이성준",
                fontSize = 8.sp,
                fontWeight = FontWeight.W400,
                style = TextStyle(
                    lineHeightStyle = LineHeightStyle(
                        alignment = LineHeightStyle.Alignment.Center,
                        trim = LineHeightStyle.Trim.None
                    )
                )
            )


            Text(
                modifier = Modifier
                    .padding(top = 5.dp)
                    .size(width = 63.dp, height = 10.dp),
                text = "학번 : 202511007",
                fontSize = 8.sp,
                fontWeight = FontWeight.W400,
                style = TextStyle(
                    lineHeightStyle = LineHeightStyle(
                        alignment = LineHeightStyle.Alignment.Center,
                        trim = LineHeightStyle.Trim.None
                    )
                )

            )
            Text(
                modifier = Modifier
                    .padding(top = 5.dp)
                    .size(width = 66.dp, height = 10.dp),
                text = "학과 : 컴퓨터공학부",
                fontSize = 8.sp,
                fontWeight = FontWeight.W400,
                style = TextStyle(
                    lineHeightStyle = LineHeightStyle(
                        alignment = LineHeightStyle.Alignment.Center,
                        trim = LineHeightStyle.Trim.None
                    )
                )

            )
            Text(
                modifier = Modifier
                    .padding(top = 5.dp)
                    .size(width = 79.dp, height = 10.dp),
                text = "생년월일 : 2006/11/29",
                fontSize = 8.sp,
                fontWeight = FontWeight.W400,
                style = TextStyle(
                    lineHeightStyle = LineHeightStyle(
                        alignment = LineHeightStyle.Alignment.Center,
                        trim = LineHeightStyle.Trim.None
                    )
                )

            )


        }
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
    Column(Modifier.padding(top = 27.dp)) {
        Row {
            Box(
                modifier = Modifier
                    .padding(
                        start = 29.dp,
                    )
                    .width(60.dp)
                    .height(60.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(color = Color.Black)

            )
            Box(
                modifier = Modifier
                    .padding(start = 53.dp)
                    .size(60.dp)
                    .clip(CircleShape)
                    .background(color = Color.Black)
            )
        }

        Row {
            Box(
                modifier = Modifier
                    .padding(
                        top = 20.dp,
                        start = 29.dp
                    )
                    .size(60.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(20.dp)

                    )
            )
            Box(
                modifier = Modifier
                    .padding(start = 53.dp, top = 20.dp)
                    .size(60.dp)
                    .border(color = Color.Black, width = 3.dp, shape = CircleShape)
            )
        }
        Row {
            Box(
                modifier = Modifier
                    .padding(
                        top = 20.dp,
                        start = 29.dp
                    )
                    .size(76.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                    )
                    .padding(all = 8.dp)
                    .background(color = Color.Red)

            )
            Box(
                modifier = Modifier
                    .padding(
                        top = 20.dp,
                        start = 37.dp
                    )
                    .size(76.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                    )
                    .padding(all = 8.dp)
                    .clip(CircleShape)
                    .background(color = Color.Blue)

            )
        }

        Row {
            Image(
                painter = painterResource(R.drawable.image),
                contentDescription = "a dog image",
                modifier = Modifier
                    .padding(top = 20.dp, start = 29.dp)
                    .size(80.dp)
            )
            Image(
                painter = painterResource(R.drawable.image),
                contentDescription = "a dog image",
                modifier = Modifier
                    .padding(top = 20.dp, start = 33.dp)
                    .size(80.dp)
                    .clip(shape = RoundedCornerShape(50.dp))
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
        Sample()

    }
}