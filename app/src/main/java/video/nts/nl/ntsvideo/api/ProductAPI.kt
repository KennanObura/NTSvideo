package video.nts.nl.ntsvideo.api

import retrofit2.Call
import retrofit2.http.GET
import video.nts.nl.ntsvideo.models.ProductList

interface ProductAPI {

    @GET("page/")
    fun getProducts() : Call<ProductList>


}