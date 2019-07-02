package com.cz.navigationproject.display

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cz.navigationproject.R
import kotlinx.android.synthetic.main.item_view.view.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class ShowAdapter(val mylist:List<Item>): RecyclerView.Adapter<ShowAdapter.ShowViewHolder>(), AnkoLogger {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowViewHolder {
        info("create")
        return ShowViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false))

    }

    override fun getItemCount(): Int {
        return mylist.size
    }

    override fun onBindViewHolder(holder: ShowViewHolder, position: Int) {
        val list = mylist[position]
        holder.bindTo(list)
    }


    inner class ShowViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
        val title = itemView.title_text
        val content = itemView.content_text

        fun bindTo(item: Item){
            title.text = item.title
            content.text = item.content

        }
    }
}
