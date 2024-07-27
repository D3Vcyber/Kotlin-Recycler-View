package com.example.myapplication
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.NumbersClass
import com.example.myapplication.R

class Adapter(private val numberList: ArrayList<NumbersClass>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val septemberImage: ImageView = this.itemView.findViewById(R.id.imageV2)
        val myNovember: TextView = this.itemView.findViewById(R.id.mymonth)
        val harmony :TextView=this.itemView.findViewById(R.id.message)
        val herSeptember: TextView=this.itemView.findViewById(R.id.hermonth)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lititem, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return numberList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = numberList[position]
        holder.septemberImage.setImageResource(currentItem.septemberImage)
        holder.myNovember.text = currentItem.myNovember
        holder.harmony.text = currentItem.harmony
        holder.herSeptember.text = currentItem.herSeptember
    }
}