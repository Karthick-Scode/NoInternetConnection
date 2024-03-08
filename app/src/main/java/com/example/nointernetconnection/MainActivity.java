package com.example.nointernetconnection;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

import org.imaginativeworld.oopsnointernet.callbacks.ConnectionCallback;
import org.imaginativeworld.oopsnointernet.dialogs.pendulum.DialogPropertiesPendulum;
import org.imaginativeworld.oopsnointernet.dialogs.pendulum.NoInternetDialogPendulum;
import org.imaginativeworld.oopsnointernet.dialogs.signal.DialogPropertiesSignal;
import org.imaginativeworld.oopsnointernet.dialogs.signal.NoInternetDialogSignal;
import org.imaginativeworld.oopsnointernet.snackbars.fire.NoInternetSnackbarFire;
import org.imaginativeworld.oopsnointernet.snackbars.fire.SnackbarPropertiesFire;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NoInternetDialog();
    }

    private void NoInternetDialog() {
        // No Internet Dialog: Pendulum
//        NoInternetDialogPendulum.Builder builder = new NoInternetDialogPendulum.Builder(
//                this,
//                getLifecycle()
//        );
//
//        DialogPropertiesPendulum properties = builder.getDialogProperties();
//
//        properties.setConnectionCallback(new ConnectionCallback() { // Optional
//            @Override
//            public void hasActiveConnection(boolean hasActiveConnection) {
//                // ...
//            }
//        });
//
//        properties.setCancelable(false); // Optional
//        properties.setNoInternetConnectionTitle("No Internet"); // Optional
//        properties.setNoInternetConnectionMessage("Check your Internet connection and try again"); // Optional
//        properties.setShowInternetOnButtons(true); // Optional
//        properties.setPleaseTurnOnText("Please turn on"); // Optional
//        properties.setWifiOnButtonText("Wifi"); // Optional
//        properties.setMobileDataOnButtonText("Mobile data"); // Optional
//
//        properties.setOnAirplaneModeTitle("No Internet"); // Optional
//        properties.setOnAirplaneModeMessage("You have turned on the airplane mode."); // Optional
//        properties.setPleaseTurnOffText("Please turn off"); // Optional
//        properties.setAirplaneModeOffButtonText("Airplane mode"); // Optional
//        properties.setShowAirplaneModeOffButtons(true); // Optional
//        builder.build();






        // No Internet Dialog: Signal
        NoInternetDialogSignal.Builder builder = new NoInternetDialogSignal.Builder(
                this,
                getLifecycle()
        );

        DialogPropertiesSignal properties = builder.getDialogProperties();

        properties.setConnectionCallback(new ConnectionCallback() { // Optional
            @Override
            public void hasActiveConnection(boolean hasActiveConnection) {
                // ...
            }
        });

        properties.setCancelable(false); // Optional
        properties.setNoInternetConnectionTitle("No Internet"); // Optional
        properties.setNoInternetConnectionMessage("Check your Internet connection and try again"); // Optional
        properties.setShowInternetOnButtons(true); // Optional
        properties.setPleaseTurnOnText("Please turn on"); // Optional
        properties.setWifiOnButtonText("Wifi"); // Optional
        properties.setMobileDataOnButtonText("Mobile data"); // Optional

        properties.setOnAirplaneModeTitle("No Internet"); // Optional
        properties.setOnAirplaneModeMessage("You have turned on the airplane mode."); // Optional
        properties.setPleaseTurnOffText("Please turn off"); // Optional
        properties.setAirplaneModeOffButtonText("Airplane mode"); // Optional
        properties.setShowAirplaneModeOffButtons(true); // Optional
        builder.build();




        // No Internet Snackbar: Fire
//        NoInternetSnackbarFire.Builder builder = new NoInternetSnackbarFire.Builder(
//                binding.mainContainer,
//                getLifecycle()
//        );
//
//        SnackbarPropertiesFire properties = builder.getSnackbarProperties();
//
//        properties.setConnectionCallback(new ConnectionCallback() { // Optional
//            @Override
//            public void hasActiveConnection(boolean hasActiveConnection) {
//                // ...
//            }
//        });
//
//        properties.setDuration(Snackbar.LENGTH_INDEFINITE); // Optional
//        properties.setNoInternetConnectionMessage("No active Internet connection!"); // Optional
//        properties.setOnAirplaneModeMessage("You have turned on the airplane mode!"); // Optional
//        properties.setSnackbarActionText("Settings"); // Optional
//        properties.setShowActionToDismiss(false); // Optional
//        properties.setSnackbarDismissActionText("OK"); // Optional
//
//        builder.build();
    }
}