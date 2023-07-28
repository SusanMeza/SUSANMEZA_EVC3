package pe.idat.ec3.susan.susanmeza_evc3.UI.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.idat.ec3.susan.susanmeza_evc3.R
import pe.idat.ec3.susan.susanmeza_evc3.databinding.FragmentListElementBinding
import pe.idat.ec3.susan.susanmeza_evc3.model.Product
import pe.idat.ec3.susan.susanmeza_evc3.model.getData


class ListElementFragment : Fragment() {

    private lateinit var binding: FragmentListElementBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(HomeViewModel:: class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentListElementBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RVProductAdapter(listOf())
        binding.rvProducts.adapter = adapter
        binding.rvProducts.layoutManager = GridLayoutManager(requireContext(), 2, RecyclerView.VERTICAL, false)
        viewModel.products.observe(requireActivity()) {products ->
            adapter.products = products
            adapter.notifyDataSetChanged()
        }
        viewModel.getProductFromService()
    }
}