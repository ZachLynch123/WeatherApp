package nteractivetory.com.example.android.weatherapp.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import nteractivetory.com.example.android.weatherapp.R;

/**
 * Created by Allison on 3/30/2018.
 */

public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(R.string.error_title)
                .setMessage(R.string.error_message)
                .setPositiveButton(R.string.error_button_text, null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
