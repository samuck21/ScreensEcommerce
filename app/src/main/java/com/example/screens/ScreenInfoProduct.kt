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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
fun ScreenInfoProduct(){
    Box(modifier = Modifier
        .background(color = Color.LightGray)
        .fillMaxSize()){
        Image( painter = painterResource(R.drawable.banner_form),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(){
            Box(Modifier.weight(1f).fillMaxWidth(), contentAlignment = Alignment.Center){
                Image(painter = painterResource(R.drawable.image_add), contentDescription = "")
            }
            Card(Modifier
                .weight(2f)
                .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                ),
                shape = RoundedCornerShape(50.dp)

            ) {

                Column {
                    Text(
                        text="CATEGORIA",
                        fontSize = 20.sp,
                        color =Color(0xFF00C8DF) ,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.fillMaxWidth().padding(20.dp, top = 30.dp)
                    )
                    Text(
                        text="Descripcion",
                        fontSize = 20.sp,
                        color =Color(0xFF00C8DF) ,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.fillMaxWidth().padding(20.dp, top = 30.dp)
                    )
                    Text(
                        text="CATEGORIA",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth().padding(20.dp, top = 10.dp)
                    )
                    Text(
                        text="Precio",
                        fontSize = 20.sp,
                        color =Color(0xFF00C8DF) ,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.fillMaxWidth().padding(20.dp, top = 30.dp)
                    )
                    Text(
                        text="CATEGORIA",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth().padding(20.dp, top = 10.dp)
                    )
                    Text(
                        text="Tu orden",
                        fontSize = 20.sp,
                        color =Color(0xFF00C8DF) ,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.fillMaxWidth().padding(20.dp, top = 30.dp)
                    )
                    Text(
                        text="CATEGORIA",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth().padding(20.dp, top = 10.dp)
                    )



                    Row( modifier = Modifier.padding(20.dp)) {
                        Box(modifier = Modifier
                            .background(Color(0xff000000))
                            .height(40.dp)
                            .weight(1f),




                        ){
                             Row(modifier = Modifier.fillMaxSize().padding(start = 15.dp), verticalAlignment = Alignment.CenterVertically) {
                                 Text("-",
                                     modifier = Modifier.weight(1f),
                                     color = Color.White)
                                 Text("0",
                                     modifier = Modifier.weight(1f),
                                     color = Color.White)
                                 Text("+",
                                     modifier = Modifier.weight(1f),
                                     color = Color.White)
                             }
                        }
                        Button(onClick = {

                        }, modifier = Modifier
                            .height(40.dp)
                            .weight(2f)
                            .padding(start = 10.dp)
                            , shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF00C8DF)
                            )

                        ) {
                            Row {
                                Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                                Text("Crear Categoria")
                            }

                        }
                    }




                }




            }

        }
    }

}