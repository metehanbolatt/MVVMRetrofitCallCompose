package com.metehanbolat.mvvmretrofitcallcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.mvvmretrofitcallcompose.ui.theme.MVVMRetrofitCallComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVMRetrofitCallComposeTheme {

            }
        }
    }
}
