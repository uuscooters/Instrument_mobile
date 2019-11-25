package com.example.alatmusiktradisional

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

class ListInstrumentAdapter(private val listInstrument: ArrayList<Instrument>) :
    RecyclerView.Adapter<ListInstrumentAdapter.ListViewHolder>() {

    private lateinit var onItemClickListener: OnItemClickListener

    fun setOnItemClickCallback(onItemClickListener: OnItemClickListener) {
        this.onItemClickListener = onItemClickListener
    }

    interface OnItemClickListener {
        fun onItemClicked(data: Instrument)
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_Instrument)

    }

    //    start function member Adapter
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_row_instrument, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listInstrument.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val instrument: Instrument = listInstrument[position]

        Glide.with(holder.itemView.context)
            .load(instrument.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = instrument.name
        holder.tvDetail.text = instrument.detail

        holder.itemView.setOnClickListener {
            onItemClickListener.onItemClicked(listInstrument[holder.adapterPosition])
        }
    }
//    End function member Adapter
}




