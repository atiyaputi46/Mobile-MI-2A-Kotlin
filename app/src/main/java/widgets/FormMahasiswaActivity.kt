package widgets

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import atiya.puti.b.kotlin.R

class FormMahasiswaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_form_mahasiswa)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //tambahkan variable
        val etNIM = findViewById<EditText>(R.id.etNIM)
        val etNama = findViewById<EditText>(R.id.etNama)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etNoTelp = findViewById<EditText>(R.id.etNoTelp)
        val btnKirim = findViewById<Button>(R.id.btnKirim)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        //Event ketika button di klik
        btnKirim.setOnClickListener {
            //Tampilkan ke tvHasil
            tvHasil.text = "Nim : ${etNIM.text}\n" +
                    "Nama : ${ etNama.text }\n" +
                    "Email :  ${ etEmail.text }\n" +
                    "NoTelp : ${ etNoTelp.text }\n"
        }
    }
}