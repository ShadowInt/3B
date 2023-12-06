package com.coder1.threeb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.coder1.threeb.ui.theme._3BTheme

class MainActivity : ComponentActivity(), MainContract.View {

    private lateinit var presenter: MainContract.Presenter

    private val textState = mutableStateOf("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setPresenter(MainPresenter(this))
        presenter.onViewCreated()

        setContent {
            _3BTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text(text = "Hello, ${textState.value}!")

                    Button(
                        modifier = Modifier.fillMaxWidth().height(30.dp),
                        onClick = {
                            presenter.onChangeData("Sergey")
                        },
                    ) {
                        Text(
                            text = "Click!",
                        )
                    }
                }
            }
        }
    }

    override fun displayData(s: String) {
        textState.value = s
    }

    override fun setPresenter(presenter: MainContract.Presenter) {
        this.presenter = presenter
    }
}