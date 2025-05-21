package com.example.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScreenCategoryClient(){

    Column {
        Row {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier.height(250.dp).weight(1f).padding(start = 10.dp, end = 5.dp, top = 5.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize()){
                    Image( painter = painterResource(R.drawable.city)
                        , contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize())

                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter){
                        Column (horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("Tenis",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp

                                )
                            Divider(thickness = 3.dp, color = Color.White, modifier = Modifier.padding(start = 35.dp, end = 35.dp))
                            Text("Descripcion",
                                color = Color.White,)
                        }
                    }


                }


            }
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier.height(250.dp).weight(1f).padding(start = 5.dp, end = 10.dp, top = 5.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize()){
                    Image( painter = painterResource(R.drawable.category)
                        , contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize())

                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter){
                        Column (horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("Tenis",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp

                            )
                            Divider(thickness = 3.dp, color = Color.White, modifier = Modifier.padding(start = 35.dp, end = 35.dp))
                            Text("Descripcion",
                                color = Color.White,)
                        }
                    }


                }


            }




        }



        Row {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier.height(250.dp).weight(1f).padding(start = 10.dp, end = 5.dp, top = 5.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize()){
                    Image( painter = painterResource(R.drawable.delivery)
                        , contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize())

                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter){
                        Column (horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("Tenis",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp

                            )
                            Divider(thickness = 3.dp, color = Color.White, modifier = Modifier.padding(start = 35.dp, end = 35.dp))
                            Text("Descripcion",
                                color = Color.White,)
                        }
                    }


                }


            }
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier.height(250.dp).weight(1f).padding(start = 5.dp, end = 10.dp, top = 5.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize()){
                    Image( painter = painterResource(R.drawable.banner_form)
                        , contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize())

                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter){
                        Column (horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("Tenis",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp

                            )
                            Divider(thickness = 3.dp, color = Color.White, modifier = Modifier.padding(start = 35.dp, end = 35.dp))
                            Text("Descripcion",
                                color = Color.White,)
                        }
                    }


                }


            }




        }




    }


}