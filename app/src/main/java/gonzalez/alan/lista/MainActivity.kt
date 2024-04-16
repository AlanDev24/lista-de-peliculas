package gonzalez.alan.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var peliculas = listOf(
            Pelicula( R.drawable.it, "it", "Pelicula de un payaso asesino"),
            Pelicula( R.drawable.jak, "El extraño mundo de jack", "Pelicula de terror navideña"),
            Pelicula( R.drawable.ironman, "IronMan", "Pelicula de un super heroe"),
            Pelicula( R.drawable.shrek, "Shrek", "Pelicula de un ogro verde"),            Pelicula( R.drawable.it, "it", "Pelicula de un payaso asesino"),
            Pelicula( R.drawable.jak, "El extraño mundo de jack", "Pelicula de terror navideña"),
            Pelicula( R.drawable.ironman, "IronMan", "Pelicula de un super heroe"),
            Pelicula( R.drawable.shrek, "Shrek", "Pelicula de un ogro verde"),            Pelicula( R.drawable.it, "it", "Pelicula de un payaso asesino"),
            Pelicula( R.drawable.jak, "El extraño mundo de jack", "Pelicula de terror navideña"),
            Pelicula( R.drawable.ironman, "IronMan", "Pelicula de un super heroe"),
            Pelicula( R.drawable.shrek, "Shrek", "Pelicula de un ogro verde"),            Pelicula( R.drawable.it, "it", "Pelicula de un payaso asesino"),
            Pelicula( R.drawable.jak, "El extraño mundo de jack", "Pelicula de terror navideña"),
            Pelicula( R.drawable.ironman, "IronMan", "Pelicula de un super heroe"),
            Pelicula( R.drawable.shrek, "Shrek", "Pelicula de un ogro verde"),
            )
        var recyclerView: RecyclerView = findViewById( R.id.lista_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AdaptadorPeliculas(peliculas)
    }
}