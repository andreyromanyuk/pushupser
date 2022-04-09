package romanyuk.pushupser.android


import android.os.Bundle
import romanyuk.pushupser.Greeting
import android.widget.TextView
import androidx.activity.ComponentActivity

@Composable
fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setCon {

        }
    }
}
