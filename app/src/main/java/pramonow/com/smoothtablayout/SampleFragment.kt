package pramonow.com.smoothtablayout

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.text.format.Time
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SampleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_sample, container, false)

        var text = rootView.findViewById<TextView>(R.id.any_text)
        text.setText("Curr Time : " + System.currentTimeMillis())

        return rootView
    }

}