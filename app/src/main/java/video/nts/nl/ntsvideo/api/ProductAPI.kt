package video.nts.nl.ntsvideo.api

import retrofit2.Call
import retrofit2.http.GET

interface ProductAPI {

    @GET()
    fun getProducts() : Call<ProductList>


}