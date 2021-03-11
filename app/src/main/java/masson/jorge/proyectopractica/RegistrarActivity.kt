package masson.jorge.proyectopractica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegistrarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        val enlace: TextView = findViewById(R.id.existe_cuenta) as TextView

        enlace.setOnClickListener {
            var i = Intent(this, IngresarActivity::class.java)
            startActivity(i)
        }

    }
}