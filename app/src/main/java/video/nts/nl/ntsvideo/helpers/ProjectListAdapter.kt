package video.nts.nl.ntsvideo.helpers

import android.annotation.TargetApi
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import video.nts.nl.ntsvideo.R
import video.nts.nl.ntsvideo.models.Product

class ProjectListAdapter(private val products: List<Product>) : RecyclerView.Adapter<ProjectListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectListAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.project_list_items, parent, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ProjectListAdapter.ViewHolder, position: Int) {
        holder.product = products[position]
        holder.p_date.text  = products[position].p_timestamp.toString()
        holder.p_name.text  = products[position].p_name.toString()


    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        var p_id : TextView
        var p_name : TextView = itemView.findViewById(R.id.idProject_name_text)
        var p_date : TextView = itemView.findViewById(R.id.idContents_text)
        var product : Product? = null



    }

}