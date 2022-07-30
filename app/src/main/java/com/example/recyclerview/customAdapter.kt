package com.example.recyclerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class customAdapter(private val mlist:List<itemViewModel>):RecyclerView.Adapter<customAdapter.ViewHolder>() {
   override fun onCreateViewHolder(parent:ViewGroup, viewType:Int): customAdapter
   override fun getItemCount(): Int {
      TODO("Not yet implemented")
   }


}