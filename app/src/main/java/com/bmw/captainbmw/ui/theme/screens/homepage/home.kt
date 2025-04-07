package com.bmw.captainbmw.ui.theme.screens.homepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bmw.captainbmw.R
import com.bmw.captainbmw.navigation.routes.ROUTE_HOME
import com.bmw.captainbmw.navigation.routes.ROUTE_LOGIN
import com.bmw.captainbmw.navigation.routes.ROUTE_REGISTER

@Composable
fun Home(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .padding(20.dp)) {
            Text("Home",
                color = Color.Black,
                modifier = Modifier.clickable { navController.navigate(ROUTE_HOME) })
            Text("Login",
                color = Color.Black,
                modifier = Modifier.clickable { navController.navigate(ROUTE_LOGIN) })
            Text("Register",
                color = Color.Black,
                modifier = Modifier.clickable { navController.navigate(ROUTE_REGISTER) })
        }
        Text(
            "Welcome to BMW",
            color = Color.Black,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(40.dp))
        Image(painter = painterResource(id = R.drawable.bmw6),
            contentDescription = "bmw6",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                )


        Spacer(modifier = Modifier.height(20.dp))
        Text("The best car in the world with the best engine power. It can go 200km/hr.",
            color = Color.Black,
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {navController.navigate(ROUTE_LOGIN)},
            modifier = Modifier.width(400.dp)) {
            Text("Login",
                fontSize = 20.sp)

            }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {navController.navigate(ROUTE_REGISTER)},
            modifier = Modifier.width(400.dp)) {
            Text("Register",
                fontSize = 20.sp)
        }
        }


    }


@Preview
@Composable
private fun Screen() {
    Home(rememberNavController())

}
