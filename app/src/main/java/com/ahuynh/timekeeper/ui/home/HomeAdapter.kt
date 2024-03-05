package com.ahuynh.timekeeper.ui.home

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahuynh.timekeeper.CalendarDate
import com.ahuynh.timekeeper.databinding.FragmentHomeBinding

class HomeAdapter(private val listener: (calendarDateModel: CalendarDate, position: Int) -> Unit) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {
    private val list = ArrayList<CalendarDate>()

    inner class ViewHolder(private val binding: FragmentHomeBinding) {
        fun bind(item: CalendarDate) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}