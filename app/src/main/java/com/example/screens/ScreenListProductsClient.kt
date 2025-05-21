package com.example.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ScreenListProductsClient(){
    Box(Modifier.fillMaxSize().background(Color(0xFF428289))){
        Image(painter = painterResource(R.drawable.chef),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize())
    }
    Column (modifier = Modifier.padding(top = 20.dp
    )){
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .padding(10.dp)
        ) {
           Column {
               Row(Modifier.padding(10.dp).fillMaxWidth()) {
                   Text("Fecha",
                       Modifier.weight(1f),
                       fontWeight = FontWeight.Bold,
                       fontSize = 20.sp,
                       textAlign = TextAlign.Start )
                   Text("Volver a compar",
                       Modifier.weight(1f),
                       fontSize = 20.sp,
                       color = Color.Blue,
                       textAlign = TextAlign.End)
               }
               Divider(thickness = 2.dp,
                   color = Color.LightGray,
                   modifier = Modifier
                       .padding(start = 10.dp, end = 10.dp)
                       .fillMaxWidth())
               Row (modifier = Modifier.padding(10.dp)) {
                   Column(Modifier.weight(3f)) {
                    Text("Camistas Nike",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold)
                       Text("Camistas nike de diferentes colores ")
                         Text("$3242352",fontSize = 15.sp)
                       Text("3 productos",fontSize = 15.sp)
                   }
                   Image( painter = painterResource(R.drawable.woman),
                       contentScale = ContentScale.Crop,
                       contentDescription = "",
                       modifier =
                           Modifier.size(height = 100.dp, width = 80.dp)
                               .weight(1f)
                   )

               }
           }
        }
    }



}