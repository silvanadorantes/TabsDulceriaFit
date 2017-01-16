package com.example.silvanadorantes.tabsdulceriafit;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;


/**
 * A simple {@link Fragment} subclass.
 */
public class DulcesFitFragment extends Fragment implements DulcesFitAdapter.OnItemClickListener {

    private static final String INDICE_SECCION
            = "com.example.silvanadorantes.tabsdulceriafit.MainActivity.extra.INDICE_SECCION";

    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private DulcesFitAdapter dulcesFitAdapter;



    public DulcesFitFragment() {
        // Required empty public constructor
    }

    public static DulcesFitFragment newInstance(int indiceSecccion) {
        DulcesFitFragment fragment = new DulcesFitFragment();
        Bundle args = new Bundle();
        args.putInt(INDICE_SECCION, indiceSecccion);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dulces_fit, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerDulcesFit);
        gridLayoutManager = new  GridLayoutManager (getActivity(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        int indiceSeccion = getArguments().getInt(INDICE_SECCION);
        switch (indiceSeccion){
            case 0 :
                dulcesFitAdapter = new DulcesFitAdapter(DulcesFit.getGalleta(), this);
                break;

            case 1:
                dulcesFitAdapter = new DulcesFitAdapter(DulcesFit.getPanquecas(), this);
                break;

            case 2:
                dulcesFitAdapter = new DulcesFitAdapter(DulcesFit.getTortas(), this);
        }

        recyclerView.setAdapter(dulcesFitAdapter);
        return view;
    }

    @Override
    public void onClick(DulcesFitAdapter.ViewHolder viewHolder, int idDulce, int idTipo) {
        Intent intent = new Intent(getActivity(), DetailActivity.class);
        intent.putExtra(DetailActivity.ID_DULCESFIT, idDulce);
        intent.putExtra(DetailActivity.TIPO_DULCESFIT, idTipo);
        startActivity(intent);

    }
}
