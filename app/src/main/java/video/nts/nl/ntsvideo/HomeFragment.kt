package video.nts.nl.ntsvideo


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*
import video.nts.nl.ntsvideo.helpers.ProjectListAdapter
import video.nts.nl.ntsvideo.models.Product


class HomeFragment : Fragment() {

    var products: List<Product>? = null
    var projectListAdapter: ProjectListAdapter? = null

    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        // Inflate the layout for this fragment
        rv_projectlist = view.findViewById<View>(R.id.rv_projectlist) as RecyclerView
        return view
    }


}
