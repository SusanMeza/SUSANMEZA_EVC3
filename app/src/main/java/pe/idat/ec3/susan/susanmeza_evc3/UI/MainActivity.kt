package pe.idat.ec3.susan.susanmeza_evc3.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import pe.idat.ec3.susan.susanmeza_evc3.R
import pe.idat.ec3.susan.susanmeza_evc3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtHello.text = "Hola Kotlin"

        val fragmentView =
            supportFragmentManager.findFragmentById(R.id.fav_navigation) as NavHostFragment
        val navController = fragmentView.navController
        binding.bnvStore.setupWithNavController(navController)
    }


}