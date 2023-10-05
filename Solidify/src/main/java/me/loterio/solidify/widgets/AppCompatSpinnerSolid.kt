package me.loterio.solidify.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.widget.AppCompatSpinner

class AppCompatSpinnerSolid @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null
): AppCompatSpinner(context, attributeSet) {

    init {
        super.setOnItemSelectedListener(androidOnItemSelectedListener())
    }

    var onItemSelected: ((AdapterView<*>?, View?, Int, Long) -> Unit)? = null

    var onNothingSelected: ((AdapterView<*>?) -> Unit)? = null

    private fun androidOnItemSelectedListener(): OnItemSelectedListener {
        return object : OnItemSelectedListener {

            override fun onItemSelected(parent: AdapterView<*>?, view: android.view.View?, position: Int, id: Long) {
                onItemSelected?.invoke(parent, view, position, id)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                onNothingSelected?.invoke(parent)
            }

        }
    }

    override fun setOnItemSelectedListener(listener: OnItemSelectedListener?) {
        throw UnsupportedOperationException("Use onItemSelectedListener instead")
    }

}