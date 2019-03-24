package com.example.nfcreader;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

public class ChangeLocalDialog extends DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] localsArray = {"Школа, вахта", "Школа, cтоловая","Интернат, вахта"};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Выберите место скана")
                .setItems(localsArray, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.location = MainActivity.translate.get(which);
                        MainActivity.LocalButton.setText(localsArray[which]);
                    }
                });

        return builder.create();
    }
}
