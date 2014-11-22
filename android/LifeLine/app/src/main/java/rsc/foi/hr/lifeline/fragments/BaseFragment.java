package rsc.foi.hr.lifeline.fragments;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.ProgressDialog;

import rsc.foi.hr.lifeline.R;

/**
 * Created by dino on 22/11/14.
 */
public class BaseFragment extends Fragment {

    private ProgressDialog progressDialog;

    public void showProgressBar() {
        if (progressDialog == null || !progressDialog.isShowing() && !getActivity().isFinishing()) {
            progressDialog = new ProgressDialog(getActivity());
            progressDialog.show();
        }
    }

    public void hideProgressBar() {
        if (progressDialog != null && !progressDialog.isShowing() && !getActivity().isFinishing()) {
            progressDialog.show();
        }
    }

    public void showDialog(String message) {
        if (!getActivity().isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.app_name);
            builder.setMessage(message);
            builder.setNeutralButton(android.R.string.ok, null);
        }
    }

}
