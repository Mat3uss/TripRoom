package br.senai.sp.jandira.mytrips

import android.os.Bundle
import android.renderscript.ScriptGroup.Input
import android.view.inputmethod.RemoveSpaceGesture
import androidx.activity.ComponentActivity
import androidx.activity.R
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.InsertEmoticon
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PhoneAndroid
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripRoomTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Login()
                        SignUp()
                    }
                }
            }
        }
    }
}

@Composable
fun Login() {
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            horizontalArrangement = Arrangement.End
        ){
            Box(modifier = Modifier
                .width(120.dp)
                .height(40.dp)
                .background(
                    color = Color(0xFFCF06F0),
                    shape = RoundedCornerShape(
                        bottomStart = 16.dp
                    )
                )
            ){}
        }


        Column (modifier = Modifier
            .padding(22.dp)
        ){
            Text(text = "Login",
                color = Color(0xffCF06F0),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(text = "Please sign in to continue.",
                color = Color(0xFFA09C9C)
            )
        }

        // color = card defuls.card.color


        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        ){

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "E-mail")
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Lock,
                        contentDescription = "oi",
                        tint = Color(0xffCF06F0),
                    )
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffCF06F0),
                        unfocusedBorderColor = Color(0xffCF06F0),
                    ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .width(327.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "Password")
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Email,
                        contentDescription = "oi",
                        tint = Color(0xffCF06F0),)
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffCF06F0),
                        unfocusedBorderColor = Color(0xffCF06F0)
                    ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .width(327.dp)
            )


        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
                .padding(28.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.End
        ){
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color((0xffCF06F0)))
            ) {
                Row (
                    modifier = Modifier
                        .width(134.dp)
                        .height(48.dp)
                    ,
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    Text(text = "Sing in",
                        fontSize = 26.sp)
                    Icon(imageVector = Icons.Default.ArrowForward,
                        contentDescription = "oi",
                        tint = Color(0xFFFFFFFF),
                    )
                }
            }
            Row {
                Text(text = "Don’t have an account?",
                    color = Color(0xFFFA09C9C))
                Text(text = "Sign in",
                    color = Color(0xFFCF06F0),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = 6.dp)
                )
            }
        }

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Bottom
        ){
            Box(modifier = Modifier
                .width(120.dp)
                .height(40.dp)
                .background(
                    color = Color(0xFFCF06F0),
                    shape = RoundedCornerShape(
                        topEnd = 16.dp
                    )
                )
            ){}
        }
    }
}
@Composable
fun SignUp() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ){
            Box(modifier = Modifier
                .width(120.dp)
                .height(40.dp)
                .background(
                    color = Color(0xFFCF06F0),
                    shape = RoundedCornerShape(
                        bottomStart = 16.dp
                    )
                )
            ){}
        }

        Column (modifier = Modifier
            .fillMaxWidth()
            .padding(22.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(text = "Sign Up",
                color = Color(0xffCF06F0),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(text = "Create a new account",
                color = Color(0xFFA09C9C)
            )
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Box(modifier = Modifier
                .width(100.dp)
                .height(100.dp),
            ){
                Box(modifier = Modifier){
                Image(
                    painter = painterResource(id = br.senai.sp.jandira.triproom.R.drawable.perfil),
                    contentDescription = "",
                    modifier = Modifier.size(100.dp),

                    )
            }

                Box(modifier = Modifier){

                }

                Icon(imageVector = Icons.Default.Person,
                    contentDescription = "Icone de Pessoa",
                    tint = Color(0xffCF06F0),
                    modifier = Modifier
                        .size(90.dp)
                        .offset(y = 0.dp, x = 5.dp)
                )
                Image(
                    painter = painterResource(id = br.senai.sp.jandira.triproom.R.drawable.camera),
                    contentDescription = "Mudar foto de perfil",
                    modifier = Modifier
                        .size(28.dp)
                        .offset(y = 80.dp, x = 80.dp)
                )


            }
        }


        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        ){

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "Username")
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Person,
                        contentDescription = "Telefone",
                        tint = Color(0xffCF06F0),
                    )
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffCF06F0),
                        unfocusedBorderColor = Color(0xffCF06F0),
                    ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .width(327.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "Phone")
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.PhoneAndroid,
                        contentDescription = "Email",
                        tint = Color(0xffCF06F0),)
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffCF06F0),
                        unfocusedBorderColor = Color(0xffCF06F0)
                    ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .width(327.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "E-mail")
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Email,
                        contentDescription = "Email",
                        tint = Color(0xffCF06F0),)
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffCF06F0),
                        unfocusedBorderColor = Color(0xffCF06F0)
                    ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .width(327.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "Password")
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Lock,
                        contentDescription = "Cadeado",
                        tint = Color(0xffCF06F0),)
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffCF06F0),
                        unfocusedBorderColor = Color(0xffCF06F0)
                    ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .width(327.dp)
            )

        }
        Row (
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
                .padding(start = 37.dp),
            verticalAlignment = Alignment.CenterVertically,

            ){


            Checkbox(
                checked = false,
                onCheckedChange  = {},
                colors = CheckboxDefaults
                    .colors(
                        checkedColor = Color(0xffCF06F0),
                        uncheckedColor = Color(0xffCF06F0)
                    )
            )
            Text(text = "Over 18?")
        }

        Column (

            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color((0xffCF06F0)))
            ) {
                Row(
                    modifier = Modifier
                        .width(295.dp)
                        .height(48.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        text = "Create Account",
                        fontSize = 26.sp
                    )
                }
            }
        }

        Row (modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(end = 32.dp),
            horizontalArrangement = Arrangement.End

        ){
            Text(text = "Already have an account?",
                color = Color(0xFFFA09C9C))
            Text(text = "Login",
                color = Color(0xFFCF06F0),
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 6.dp)
            )
        }
    }

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.Bottom
    ){
        Box(modifier = Modifier
            .width(120.dp)
            .height(40.dp)
            .background(
                color = Color(0xFFCF06F0),
                shape = RoundedCornerShape(
                    topEnd = 16.dp
                )
            )
        ){}
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
    TripRoomTheme {
        Login()
    }
}
@Preview(showBackground = true)
@Composable
fun SignUpPreview() {
    TripRoomTheme {
        SignUp()
    }
}