package com.example.administrator.nativereact

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import com.facebook.react.ReactInstanceManager
import com.facebook.react.ReactRootView
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
import com.facebook.react.shell.MainReactPackage
import android.view.KeyEvent.KEYCODE_MENU
import com.facebook.react.common.LifecycleState


class MainActivity : AppCompatActivity(), DefaultHardwareBackBtnHandler {

    private var reactRootView: ReactRootView? = null
    private var reactInstanceManager: ReactInstanceManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        reactRootView = ReactRootView(this)
        reactInstanceManager =
                ReactInstanceManager.builder()
                    .setApplication(application)
                    .setBundleAssetName("index.android.bundle")
                    .setJSMainModulePath("index")
                    .addPackage(MainReactPackage())
                    .setUseDeveloperSupport(BuildConfig.DEBUG)
                    .setInitialLifecycleState(LifecycleState.RESUMED)
                    .build()
        reactRootView!!.startReactApplication(reactInstanceManager, "nativereact", null)
        setContentView(reactRootView)
    }

    override fun invokeDefaultOnBackPressed() {
        reactInstanceManager?.onBackPressed() ?: onBackPressed()
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_MENU) {
            reactInstanceManager!!.showDevOptionsDialog()
            return true
        }
        return super.onKeyUp(keyCode, event)
    }
}
