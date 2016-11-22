package layout;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.jan.myfirstapplication.DisplayMessageActivity;
import com.example.jan.myfirstapplication.R;

public class MyFirstFragment extends Fragment
{
    OnFragmentInteractionListener mListener;
    // Container Activity must implement this interface
    public interface OnFragmentInteractionListener
    {
        public void somethingHappened(String text);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_first, container, false);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener)
        {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    public void onFancyShit(String text) {
        if (mListener != null) {
            mListener.somethingHappened(text);
        }
    }
}
