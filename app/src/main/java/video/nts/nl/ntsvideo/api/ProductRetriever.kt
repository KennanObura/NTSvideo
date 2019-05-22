package video.nts.nl.ntsvideo.api

import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import video.nts.nl.ntsvideo.models.ProductList


class ProductRetriever {

    private val service: ProductAPI

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://127.0.0.1:3333/api/v2/suppliers/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(ProductAPI::class.java)
    }

    fun getProducts(callback: Callback<ProductList>){
        val call = service.getProducts()
        call.enqueue(callback)
    }
}