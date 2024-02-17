package com.mozhimen.imagek.correction.test

import com.mozhimen.basick.elemk.android.app.bases.BaseApplication
import com.mozhimen.basick.lintk.optins.OApiMultiDex_InApplication
import com.mozhimen.imagek.correction.ImageKCorrection

/**
 * @ClassName MainApplication
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2024/2/12 18:11
 * @Version 1.0
 */
@OptIn(OApiMultiDex_InApplication::class)
class MainApplication:BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        ImageKCorrection.initTfLiteEdgeDetector(this)
    }
}