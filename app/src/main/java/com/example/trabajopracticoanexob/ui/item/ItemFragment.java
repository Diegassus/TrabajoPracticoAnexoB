package com.example.trabajopracticoanexob.ui.item;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.trabajopracticoanexob.R;
import com.example.trabajopracticoanexob.databinding.FragmentItemBinding;

public class ItemFragment extends Fragment {

    private ItemViewModel vm;
    private FragmentItemBinding binding;

    public static ItemFragment newInstance() {
        return new ItemFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        vm = new ViewModelProvider(this).get(ItemViewModel.class);
        binding = FragmentItemBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Bundle recuperado = getArguments();
        //Toast.makeText(getContext(), recuperado.get("actividad")+"", Toast.LENGTH_SHORT).show();
        binding.tvNombre.setText(recuperado.get("nombre")+"");
        binding.tvFecha.setText(recuperado.get("fecha")+"");
        binding.tvDescripcion.setText(recuperado.get("descripcion")+"");
        binding.tvHora.setText(recuperado.get("hora")+"");
        binding.tvLugar.setText(recuperado.get("Lugar")+"");
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // TODO: Use the ViewModel
    }

}