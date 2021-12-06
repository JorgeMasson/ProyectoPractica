package masson.jorge.proyectopractica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class IngresarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar)

        val enlace_crear_cuenta: TextView = findViewById(R.id.link_crear_cuenta) as TextView

        enlace_crear_cuenta.setOnClickListener {
            var i = Intent(this, RegistrarActivity::class.java)
            startActivity(i)
        }

    }
}