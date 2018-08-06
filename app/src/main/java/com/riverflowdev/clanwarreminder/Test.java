package com.riverflowdev.clanwarreminder;

import com.riverflowdev.clanwarreminder.interfaces.ViewMainActivity;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class Test extends ArrayList implements ViewMainActivity {
    @Override
    public void onLoginSuccess() {

    }

    @Override
    public void onLoginFailed(@Nullable String message) {

    }
}
