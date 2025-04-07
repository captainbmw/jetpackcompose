package com.bmw.captainbmw.ui.theme.screens.register


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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bmw.captainbmw.navigation.routes.ROUTE_HOME
import com.bmw.captainbmw.navigation.routes.ROUTE_LOGIN
import com.bmw.captainbmw.navigation.routes.ROUTE_REGISTER

@Composable
fun Register_Screen(navController: NavHostController) {
    var firstname by remember { mutableStateOf(TextFieldValue("")) }
    var lastname by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
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
        Text("Register",
            color = Color.Black,
            fontFamily = FontFamily.Serif,
            fontSize = 35.sp)
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(value = firstname,
            onValueChange = {firstname=it},
            label = { Text("Enter First Name",
                fontFamily = FontFamily.Serif
            ) },
            leadingIcon = {Icon(Icons.Default.Person, contentDescription = "Person")},
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)

        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = lastname,
            onValueChange = {lastname=it},
            label = { Text("Enter Last Name") },
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "Person") },
            shape = RoundedCornerShape(20.dp),
            modifier=Modifier.padding(16.dp)

        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = email,
            onValueChange = {email=it},
            label = { Text("Enter Email") },
            leadingIcon = { Icon(Icons.Default.Email, contentDescription = "Email") },
            shape = RoundedCornerShape(20.dp),
            modifier=Modifier.padding(16.dp)

        )

        Spacer(modifier = Modifier.height(
            20.dp)
        )
        OutlinedTextField(value = password, onValueChange = {password=it},
            label = { Text("Enter Password",
            ) },
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "Password") },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )
        Text("I have an account",
            modifier = Modifier.clickable { navController.navigate(ROUTE_LOGIN)},
            color = Color.Blue)

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {navController.navigate(ROUTE_HOME)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)){
            Text("Register",
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif
            )
        }
    }

}

@Preview
@Composable
private fun login() {

    Register_Screen(rememberNavController())

}