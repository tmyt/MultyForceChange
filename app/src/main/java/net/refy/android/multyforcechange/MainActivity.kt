package net.refy.android.multyforcechange

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.RadioButton
import com.zte.dualLcdManager.DisplayModeManager

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //
        val zdmm = DisplayModeManager.getInstance(this.applicationContext)
        // check current state
        when (zdmm.currentMode) {
            DisplayModeManager.DISPLAY_MODE_SINGLE -> radioSingle.isChecked = true
            DisplayModeManager.DISPLAY_MODE_DOCKED -> radioDocked.isChecked = true
            DisplayModeManager.DISPLAY_MODE_MIRROR -> radioMirror.isChecked = true
            DisplayModeManager.DISPLAY_MODE_ZOOM -> radioZoom.isChecked = true
        }
        // handle checked
        radioSingle.setOnClickListener {
            zdmm.switchModeNotCheckSwitchModeBlackList(DisplayModeManager.DISPLAY_MODE_SINGLE)
        }
        radioDocked.setOnClickListener {
            zdmm.switchModeNotCheckSwitchModeBlackList(DisplayModeManager.DISPLAY_MODE_DOCKED)
        }
        radioMirror.setOnClickListener {
            zdmm.switchModeNotCheckSwitchModeBlackList(DisplayModeManager.DISPLAY_MODE_MIRROR)
        }
        radioZoom.setOnClickListener {
            zdmm.switchModeNotCheckSwitchModeBlackList(DisplayModeManager.DISPLAY_MODE_ZOOM)
        }
    }
}
