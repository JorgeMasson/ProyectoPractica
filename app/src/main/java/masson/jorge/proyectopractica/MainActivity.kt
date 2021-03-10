package masson.jorge.proyectopractica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_ingresar) as Button
        val enlace: TextView = findViewById(R.id.crear_cuenta) as TextView

        button.setOnClickListener {
            var i = Intent(this, IngresarActivity::class.java)
            startActivity(i)
        }

        enlace.setOnClickListener {
            var i = Intent(this, RegistrarActivity::class.java)
        }

    }
}