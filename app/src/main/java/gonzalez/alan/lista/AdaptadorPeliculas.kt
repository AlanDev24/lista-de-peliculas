package gonzalez.alan.lista

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorPeliculas(val peliculas_list: List<Pelicula> ): RecyclerView.Adapter<AdaptadorPeliculas.PeliculaViewHolder>() {

    class PeliculaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var imagen_pelicula: ImageView = itemView.findViewById( R.id.imagenPelicula )
        var titulo__pelicula: TextView = itemView.findViewById( R.id.tituloPelicula )
        var descripcion_pelicula: TextView = itemView.findViewById( R.id.descripcionPelicula )


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaViewHolder {
        var itemView = LayoutInflater.from( parent.context ).inflate( R.layout.lista_item, parent, false)
        return PeliculaViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return peliculas_list.size
    }

    override fun onBindViewHolder(holder: PeliculaViewHolder, position: Int) {
        var pelicula:Pelicula = peliculas_list[position]
        holder.imagen_pelicula.setImageResource(pelicula.image)
        holder.titulo__pelicula.text = pelicula.title
        holder.descripcion_pelicula.text = pelicula.desc
    }

}