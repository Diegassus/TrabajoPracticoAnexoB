package com.example.trabajopracticoanexob.ui.listado;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.trabajopracticoanexob.ActivityAdapter;
import com.example.trabajopracticoanexob.R;
import com.example.trabajopracticoanexob.databinding.FragmentListadoBinding;
import com.example.trabajopracticoanexob.models.Actividad;

import java.util.ArrayList;


public class ListadoFragment extends Fragment {

    private FragmentListadoBinding binding;
    private ListadoViewModel vm;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vm = new ViewModelProvider(this).get(ListadoViewModel.class);

        binding = FragmentListadoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        vm.getActividades().observe(getViewLifecycleOwner(),new Observer<ArrayList<Actividad>>() {
            @Override
            public void onChanged(ArrayList<Actividad> actividades) {
                ActivityAdapter aa = new ActivityAdapter(getContext(), R.id.lvActividades ,actividades,getLayoutInflater());
                binding.lvActividades.setAdapter(aa);
            }
        });

        vm.crearActividades();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}