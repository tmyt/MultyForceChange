package net.refy.android.multyforcechange

import android.content.Intent
import android.service.quicksettings.TileService

/**
 * Created by yutaka on 2018/02/13.
 */

class QsTileService : TileService(){
    override fun onClick() {
        super.onClick()

        val intent = Intent(applicationContext, MainActivity::class.java)
        this.startActivityAndCollapse(intent)
    }
}