package pe.idat.ec3.susan.susanmeza_evc3.UI.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import pe.idat.ec3.susan.susanmeza_evc3.data.repository.ProductRepository
import pe.idat.ec3.susan.susanmeza_evc3.model.Product
import pe.idat.ec3.susan.susanmeza_evc3.model.getData

class HomeViewModel: ViewModel() {
    val products:  MutableLiveData<List<Product>> = MutableLiveData<List<Product>>()
    private val repository = ProductRepository()

    fun getProducts (){
        val allProducts = getData()
        products.value = allProducts

    }

    fun getProductFromService (){
        viewModelScope.launch(Dispatchers.IO){
            val response = repository.getProducts()
            products.value = response

        }
    }

}