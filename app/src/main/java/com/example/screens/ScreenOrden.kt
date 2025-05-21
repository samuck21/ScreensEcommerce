package com.example.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun ScreenOrden(){
    Box(modifier = Modifier.fillMaxSize()){

        Image(
            painter = painterResource(id = R.drawable.city),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color(0xFFFFFFFF))
            .align(Alignment.BottomCenter),

            ){

                Row (modifier = Modifier
                    .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Column (modifier = Modifier.weight(1f).padding(20.dp)) {
                        Text("Total",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                        Text("3040349.0$")
                    }
                    Button(onClick = {

                    },
                        modifier = Modifier.weight(2f).padding(20.dp).fillMaxSize(),
                        shape = RoundedCornerShape( 10.dp)
                        ) {
                        Icon(imageVector = Icons.Default.ArrowForward,
                            contentDescription = "")
                        Text("Confirmar orden")
                    }
                }




        }
        Column {

            ElevatedCard (
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier.fillMaxWidth().height(140.dp).padding(10.dp)
            ) {

                Row( verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxSize() ) {
                    Image(painter = painterResource(R.drawable.woman),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(height = 80.dp, width = 70.dp).padding(start = 15.dp)
                        )
                    Column (modifier = Modifier.weight(2f)
                        .padding(20.dp)) {
                        Text("Camista Adidas")
                        Card (
                            modifier = Modifier
                                .size(height = 40.dp, width = 120.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Black
                            )

                        ) {
                            Row (modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                                Box(modifier = Modifier
                                    .size(30.dp),
                                    contentAlignment = Alignment.Center
                                ){
                                    Text("-",
                                        color = Color.White
                                    )
                                }
                                Box(modifier = Modifier
                                    .size(40.dp),
                                    contentAlignment = Alignment.Center

                                ) {
                                    Text(
                                        "8",

                                        color = Color.White
                                    )
                                }
                                Box(modifier = Modifier
                                    .size(30.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        "+",
                                        color = Color.White
                                    )
                                }

                            }

                        }
                    }
                    Column (modifier = Modifier.weight(1f)) {
                        Text("300000")
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = ""
                        )


                    }


                }

            }

        }

    }
}