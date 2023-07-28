package pe.idat.ec3.susan.susanmeza_evc3.UI.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pe.idat.ec3.susan.susanmeza_evc3.R
import pe.idat.ec3.susan.susanmeza_evc3.databinding.FragmentFavoritoBinding
import pe.idat.ec3.susan.susanmeza_evc3.databinding.FragmentInfoBinding

class FavoritoFragment : Fragment() {


    private lateinit var  binding: FragmentFavoritoBinding
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFavoritoBinding.inflate(inflater, container, false)
        return binding.root


    }


}