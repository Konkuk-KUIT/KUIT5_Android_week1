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
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kuit_1th_weeks.ui.theme.KUIT_1th_weeksTheme
import org.w3c.dom.Text
import java.time.format.TextStyle

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
fun Sample() {
    Column {
        Box(
            modifier = Modifier
                .padding(
                    top = 27.dp,
                    start = 29.dp
                )
                .size(60.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(color = Color.Black)
        )
        Box(
            modifier = Modifier
                .padding(
                    top = 20.dp,
                    start = 29.dp
                )
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
                .padding(
                    top = 20.dp,
                    start = 29.dp
                )
                .size(76.dp)
                .border(
                    width = 2.dp,
                    color = Color.Black
                )
                .padding(8.dp)
                .size(60.dp)
                .background(color = Color.Red)
        )
        Image(
            painter = painterResource(R.drawable.image),
            contentDescription = "dog image",
            modifier = Modifier
                .padding(top = 20.dp, start = 29.dp)
                .size(60.dp)
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
                .size(60.dp)
                .clip(CircleShape)
                .background(color = Color.Black)
        )
        Box(
            modifier = Modifier
                .padding(
                    top = 20.dp,
                    start = 29.dp
                )
                .size(60.dp)
                .clip(CircleShape)
                .border(
                    width = 2.dp,
                    color = Color.Black,
                    shape = CircleShape
                )
        )
        Box(
            modifier = Modifier
                .padding(
                    top = 20.dp,
                    start = 29.dp
                )
                .size(76.dp)
                .border(
                    width = 2.dp,
                    color = Color.Black
                )
                .padding(8.dp)
                .size(60.dp)
                .clip(CircleShape)
                .background(color = Color.Red)
        )
        Image(
            painter = painterResource(R.drawable.image),
            contentDescription = "dog image",
            modifier = Modifier
                .padding(top = 20.dp, start = 29.dp)
                .size(60.dp)
                .clip(CircleShape)
        )
    }

}

@Composable
fun Profile() {
    Box(
        modifier = Modifier
            .padding(
                top = 45.dp,
                start = 45.dp
            )
            .size(140.dp)
            .clip(RoundedCornerShape(20.dp))
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(20.dp)
            )
    )
    Column{
        Image(
            painter = painterResource(R.drawable.image),
            contentDescription = "내 사진",
            modifier = Modifier
                .padding(top = 55.dp, start = 55.dp)
                .size(40.dp)
                .clip(RoundedCornerShape(10.dp))
        )
        Text(
            text = "이름: 범시우",
            fontSize = 8.sp,
            style = androidx.compose.ui.text.TextStyle(
                platformStyle = PlatformTextStyle(includeFontPadding = false)
            ),
            modifier = Modifier.
            padding(
                top = 5.dp,
                start = 55.dp
            )
        )
        Text(
            text = "학번 : 202412950",
            fontSize = 8.sp,
            style = androidx.compose.ui.text.TextStyle(
                platformStyle = PlatformTextStyle(includeFontPadding = false)
            ),
            modifier = Modifier.
            padding(
                top = 5.dp,
                start = 55.dp
            )
        )
        Text(
            text = "학과: 수의예과",
            fontSize = 8.sp,
            style = androidx.compose.ui.text.TextStyle(
                platformStyle = PlatformTextStyle(includeFontPadding = false)
            ),
            modifier = Modifier.
            padding(
                top = 5.dp,
                start = 55.dp
            )
        )
        Text(
            text = "생년월일 : 2005/09.15",
            fontSize = 8.sp,
            style = androidx.compose.ui.text.TextStyle(
                platformStyle = PlatformTextStyle(includeFontPadding = false)
            ),
            modifier = Modifier.
            padding(
                top = 5.dp,
                start = 55.dp
            )
        )
    }

}

@Composable
fun ProfileCard(modifier: Modifier = Modifier) {
}

@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {
    KUIT_1th_weeksTheme {
        Profile()
    }
}