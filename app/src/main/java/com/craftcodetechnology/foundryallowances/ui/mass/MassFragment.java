package com.craftcodetechnology.foundryallowances.ui.mass;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.craftcodetechnology.foundryallowances.R;

public class MassFragment extends Fragment {

    private MassViewModel massViewModel;

    private Spinner MCTG;
    private EditText mass;
    private TextView massTolerance;

    private final String[] MCTG_GOST26645 = Tables.MCTG_GOST_26645;
    private final Float[][] massTableGOST26645 = Tables.MASS_TABLE_GOST_26645;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        massViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(MassViewModel.class);
        View root = inflater.inflate(R.layout.fragment_mass, container, false);
        final TextView textView = root.findViewById(R.id.text_mass);

        massViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        super.onCreate(savedInstanceState);

        massTolerance = root.findViewById(R.id.massToleranceTextView);
        mass = root.findViewById(R.id.massTextView);


        mass.addTextChangedListener(new TextWatcher() {
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


        mass.setOnLongClickListener(v -> {
            mass.setText("");
            massTolerance.setText("-");
            return true;
        });

        MCTG = root.findViewById(R.id.GOSTspinner);
        setUpSpinner(MCTG);

        return root;
    }


    private void setUpSpinner(Spinner spinner) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                R.layout.spinner_prop,
                MCTG_GOST26645);
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
        float inputNum;
        Float tolerance = null;
        this.massTolerance.setText("-");

        try {
            inputNum = Float.parseFloat(mass.getText().toString());
            tolerance = massTableGOST26645[defineRow(inputNum)][defineColumn()];
            if (tolerance != null) {
                tolerance = tolerance / 2.0f;
                tolerance = inputNum * tolerance / 100;
                tolerance = (float) Math.round(tolerance);
            }
            this.massTolerance.setText("-");
        } catch (Exception ignored) {
        } finally {
            if (tolerance != null) {
                this.massTolerance.setText(String.format("±%s", tolerance));
            }
        }

    }

    private int defineRow(float amount) {
        if (amount <= 0.1) return 0;
        else if (amount <= 0.4) return 1;
        else if (amount <= 1) return 2;
        else if (amount <= 4) return 3;
        else if (amount <= 10) return 4;
        else if (amount <= 40) return 5;
        else if (amount <= 100) return 6;
        else if (amount <= 400) return 7;
        else if (amount <= 1_000) return 8;
        else if (amount <= 4_000) return 9;
        else if (amount <= 10_000) return 10;
        else if (amount <= 40_000) return 11;
        else if (amount <= 100_000) return 12;
        else return 13;
    }

    private int defineColumn() {
        return MCTG.getSelectedItemPosition();
    }

}