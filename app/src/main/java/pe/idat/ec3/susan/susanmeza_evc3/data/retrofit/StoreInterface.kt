package pe.idat.ec3.susan.susanmeza_evc3.data.retrofit

import pe.idat.ec3.susan.susanmeza_evc3.data.response.ProductListResponse
import retrofit2.http.GET

interface StoreInterface {
    @GET("")
    suspend fun getAllProducts(): ProductListResponse
}