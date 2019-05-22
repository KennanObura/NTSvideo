package video.nts.nl.ntsvideo


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import video.nts.nl.ntsvideo.api.ProductRetriever
import video.nts.nl.ntsvideo.helpers.ProjectListAdapter
import video.nts.nl.ntsvideo.models.Product
import video.nts.nl.ntsvideo.models.ProductList
import java.net.CacheResponse



class HomeFragment : Fragment() {

    var products: List<Product>? = null
    var projectListAdapter: ProjectListAdapter? = null

    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val recyclerView_projectlist = view.findViewById<View>(R.id.rv_projectlist) as RecyclerView
        recyclerView_projectlist.layoutManager = LinearLayoutManager(activity)


        var productRetriever = ProductRetriever()

        var callback = object : Callback<ProductList> {
            override fun onFailure(call: Call<ProductList>, t: Throwable) {
                Log.e("Home", "Problem calling API", t)
            }

            override fun onResponse(call: Call<ProductList>, response: Response<ProductList>) {
                response.isSuccessful.let {
                    this@HomeFragment.products = response.body()?.hits
                    projectListAdapter = ProjectListAdapter(products!!)
                }
            }

        }

        productRetriever.getProducts(callback)


        return view
    }


}
