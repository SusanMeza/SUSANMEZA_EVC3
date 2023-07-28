package pe.idat.ec3.susan.susanmeza_evc3.UI.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.idat.ec3.susan.susanmeza_evc3.R
import pe.idat.ec3.susan.susanmeza_evc3.databinding.FragmentInfoBinding
import pe.idat.ec3.susan.susanmeza_evc3.databinding.FragmentListElementBinding

class InfoFragment : Fragment() {

    private lateinit var  binding: FragmentInfoBinding
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root
    }




}