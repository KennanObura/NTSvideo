package video.nts.nl.ntsvideo.helpers

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
        val product = products[position]
    }

    class ViewHolder(itemView: View) {
        var name : TextView = itemView.findViewById(R.id.idProject_name_text)
        var date : TextView = itemView.findViewById(R.id.idContents_text)



    }

}