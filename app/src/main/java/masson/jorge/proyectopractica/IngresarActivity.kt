package masson.jorge.proyectopractica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IngresarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar)

        val button: Button = findViewById(R.id.btn_ing_empezar) as Button

        button.setOnClickListener {
            var i = Intent(this, Navegador::class.java)
            startActivity(i)
        }

    }
}