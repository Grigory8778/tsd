package com.example.tsd

import android.content.Intent
import ru.tander.tanderstoresdk.TSApplication

class App : TSApplication() {
    override fun onCreate() {
        super.onCreate()
    }

    override fun onSdkInit() {

    }

    override fun getMainActivityLaunchIntent(): Intent {
        TODO("Not yet implemented")
    }

    override fun handleAgentEvent(intent: Intent) {}
    override fun handleCleanAppDataEvent() {}
}