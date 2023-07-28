package pe.idat.ec3.susan.susanmeza_evc3.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private val retrofitInstance: Retrofit = Retrofit.Builder()
        .baseUrl("").addConverterFactory(GsonConverterFactory.create()).build()

    val storeInstance = retrofitInstance.create(StoreInterface::class.java)
}