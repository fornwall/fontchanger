package net.fornwall.fontchanger

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Paint.ANTI_ALIAS_FLAG
import android.graphics.Typeface
import android.view.View

class CustomView(context: Context) : View(context) {

    private var useCustomFont: Boolean = false

    private val customTypeface = Typeface.createFromAsset(context.assets, "OpenDyslexic.ttf")

    private val textPaint = Paint(ANTI_ALIAS_FLAG).apply {
        color = 0xFF_00_00_00.toInt()
        textSize = 80.0f
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawText("Hello", 100.0f, 100.0f, textPaint)
        switchFont()
        canvas?.drawText("Hello", 100.0f, 500.0f, textPaint)
        invalidate()
    }

    fun switchFont() {
        useCustomFont = !useCustomFont
        if (useCustomFont) {
            textPaint.setTypeface(customTypeface)
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE)
        }
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(80.0f);
    }
}