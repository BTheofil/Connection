package hu.tb.connection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hu.tb.connection.databinding.ActivityMainBinding
import hu.tb.connection.presentation.welcome.WelcomeFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //set back to app theme
        setTheme(R.style.Theme_Connection)
        setContentView(binding.root)
    }
}