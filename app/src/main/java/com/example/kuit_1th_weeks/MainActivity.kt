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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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


       Box(
           modifier = Modifier
               .padding( top = 45.dp, start = 45.dp)
               .size(140.dp)

               .clip(RoundedCornerShape(10.dp))

               .border(
                   width = 1.dp,
                   color = Color.Black,
                   shape = RoundedCornerShape(10.dp)

               )
       ){
           Image (
               painter = painterResource(R.drawable.img_cat),
               contentDescription = "cat image",
               modifier = Modifier

                   .padding( top = 10.dp, start = 10.dp)
                   .size(40.dp)
                )
           Text(
               text = "이름 : 조익성",
               modifier = Modifier
                   .padding( top = 60.dp, start = 10.dp),
                   fontSize = 8.sp,
                   color = Color.Black
           )
           Text(
               text = "학번 : 202011375",
               modifier = Modifier
                   .padding( top = 75.dp, start = 10.dp),
                    fontSize = 8.sp,
                    color = Color.Black
           )
           Text(
               text = "학과 : 컴퓨터공학부",
               modifier = Modifier
                   .padding( top = 90.dp, start = 10.dp),
               fontSize = 8.sp,
               color = Color.Black
           )

           Text(
               text = "생년월일 : 2000/11/22",
               modifier = Modifier
                   .padding( top = 105.dp, start = 10.dp),
               fontSize = 8.sp,
               color = Color.Black
           )


       }

   }



@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {

    KUIT_1th_weeksTheme {
        Box(
            modifier = Modifier
                .width(272.dp)
                .height(255.dp)

        )
        {
        ProfileCard()
    }
    }
}
