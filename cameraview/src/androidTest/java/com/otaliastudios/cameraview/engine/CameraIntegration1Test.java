package com.otaliastudios.cameraview.engine;

import com.otaliastudios.cameraview.controls.Engine;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.annotation.NonNull;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

/**
 * These tests work great on real devices, and are the only way to test actual CameraEngine
 * implementation - we really need to open the camera device.
 * Unfortunately they fail unreliably on emulated devices, due to some bug with the
 * emulated camera controller. Waiting for it to be fixed.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
// @Ignore
public class CameraIntegration1Test extends CameraIntegrationTest {

    @NonNull
    @Override
    protected Engine getEngine() {
        return Engine.CAMERA1;
    }
}