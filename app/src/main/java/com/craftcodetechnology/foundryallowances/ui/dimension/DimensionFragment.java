package com.craftcodetechnology.foundryallowances.ui.dimension;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.craftcodetechnology.foundryallowances.R;

public class DimensionFragment extends Fragment {

    private DimensionViewModel dimensionViewModel;

    private Spinner DCTG;
    private EditText dimension;
    private TextView dimensionTolerance;

    private final String[] DCTG_GOST26645 = Tables.DCTG_GOST_26645;
    private final Float[][] dimensionTableGOST26645 = Tables.DIMENSION_TABLE_GOST_26645;

//    private final String[] DCTG_ISO8062 = Tables.DCTG_ISO_8062;
//    private final Float[][] tableISO8062 = Tables.TABLE_ISO_8062;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        dimensionViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(DimensionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dimension, container, false);
        final TextView textView = root.findViewById(R.id.text_dimension);

        dimensionViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        super.onCreate(savedInstanceState);

        dimensionTolerance = root.findViewById(R.id.dimensionToleranceTextView);
        dimension = root.findViewById(R.id.dimensionTextView);

        dimension.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                defineTolerance();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                defineTolerance();
            }

            @Override
            public void afterTextChanged(Editable s) {
                defineTolerance();
            }
        });

        dimension.setOnLongClickListener(v -> {
            dimension.setText("");
            dimensionTolerance.setText("-");
            return true;
        });


        DCTG = root.findViewById(R.id.GOSTspinner);
        setUpSpinner(DCTG);


        return root;
    }

    private void setUpSpinner(Spinner spinner) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                R.layout.spinner_prop,
                DCTG_GOST26645);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        int spinnerStartPosition = 18;
        spinner.setSelection(spinnerStartPosition);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                defineTolerance();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                defineTolerance();
            }
        });
    }

    public void defineTolerance() {
        int inputNum;
        Float tolerance = null;
        this.dimensionTolerance.setText("-");

        try {
            inputNum = Integer.parseInt(dimension.getText().toString());
            tolerance = dimensionTableGOST26645[defineRow(inputNum)][defineColumn()];
            if (tolerance != null) {
                tolerance = tolerance / 2.0f;
            }
            this.dimensionTolerance.setText("-");
        } catch (Exception ignored) {
        } finally {
            if (tolerance != null) {
                this.dimensionTolerance.setText(String.format("±%s", tolerance));
            }
        }

    }

    private int defineRow(int amount) {
        if (amount <= 4) return 0;
        else if (amount <= 6) return 1;
        else if (amount <= 10) return 2;
        else if (amount <= 16) return 3;
        else if (amount <= 25) return 4;
        else if (amount <= 40) return 5;
        else if (amount <= 63) return 6;
        else if (amount <= 100) return 7;
        else if (amount <= 160) return 8;
        else if (amount <= 250) return 9;
        else if (amount <= 400) return 10;
        else if (amount <= 630) return 11;
        else if (amount <= 1000) return 12;
        else if (amount <= 1600) return 13;
        else if (amount <= 2500) return 14;
        else if (amount <= 4000) return 15;
        else if (amount <= 6300) return 16;
        else if (amount <= 10000) return 17;
        else return 18;
    }

    private int defineColumn() {
        return DCTG.getSelectedItemPosition();
    }

}