package edu.andrews.cptr252.kevindaniel.cuadernillosdigitalesnuevaversion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class AmigoFragment extends Fragment {

    private EditText mEditText;


    public AmigoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_amigo,container,false);

        mEditText = (EditText)v.findViewById(R.id.editText);

        return  v;
    }

}
