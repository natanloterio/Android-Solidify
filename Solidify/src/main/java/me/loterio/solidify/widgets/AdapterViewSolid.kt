package me.loterio.solidify.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView

/**
 * An AdapterView is a view whose children are determined by an {@link Adapter}.
 *
 * <p>
 * See {@link ListView}, {@link GridView}, {@link Spinner} and
 *      {@link Gallery} for commonly used subclasses of AdapterView.
 *
 * <div class="special reference">
 * <h3>Developer Guides</h3>
 * <p>For more information about using AdapterView, read the
 * <a href="{@docRoot}guide/topics/ui/binding.html">Binding to Data with AdapterView</a>
 * developer guide.</p></div>
 */
abstract class AdapterViewSolid<T: Adapter> @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
): AdapterView<T>(context, attributeSet) {

    interface OnItemSelectedListener: AdapterView.OnItemSelectedListener {
        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) { }
        override fun onNothingSelected(parent: AdapterView<*>?) { }
    }

}