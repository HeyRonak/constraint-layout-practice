package com.example.navdrawerapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navdrawerapp.databinding.ItemProjectsBinding

class GridProjectAdapter(var list: ArrayList<Projects>) :
    RecyclerView.Adapter<GridProjectAdapter.ViewHolder>() {

    inner class ViewHolder(var binding: ItemProjectsBinding) :
        RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding =
            ItemProjectsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var model = list[position]

        holder.binding.tvTitle.text = model.title
        holder.binding.tvProgress.text = model.progress
        holder.binding.tvPercent.text = model.percentage

        when (position % 3) {

            0 -> {
                holder.binding.mainBg.setBackgroundResource(R.drawable.rounded_blue)
                holder.binding.ivPercentCount.setImageResource(R.drawable.circle_yellow)
            }

            1 -> {
                holder.binding.mainBg.setBackgroundResource(R.drawable.rounded_yellow)
                holder.binding.ivPercentCount.setImageResource(R.drawable.circle_red)
            }

            2 -> {
                holder.binding.mainBg.setBackgroundResource(R.drawable.rounded_red)
                holder.binding.ivPercentCount.setImageResource(R.drawable.circle_green)
            }

        }

    }

    override fun getItemCount(): Int {
        return list.size
    }


}