package pe.idat.ec3.susan.susanmeza_evc3.data.repository

import pe.idat.ec3.susan.susanmeza_evc3.data.retrofit.RetrofitHelper
import pe.idat.ec3.susan.susanmeza_evc3.model.Product

class ProductRepository {

    suspend fun getProducts(): List<Product>{
        val response = RetrofitHelper.storeInstance.getAllProducts()
        return response.products
    }
}