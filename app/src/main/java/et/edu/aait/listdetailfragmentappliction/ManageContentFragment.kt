package et.edu.aait.listdetailfragmentappliction

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import et.edu.aait.listdetailfragmentappliction.data.Content

class ManageContentFragment : Fragment() {

    private lateinit var contentOneText: EditText
    private lateinit var contentTwoText: EditText
    private lateinit var contentThreeText: EditText
    private lateinit var searchContentText: EditText

    private lateinit var listener: OnManageButtonsClicked

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is OnManageButtonsClicked){
            listener = context
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_manage_content, container, false)

        return view
    }

    private fun updateFields(content: Content){
        content?.run{
            // update UI
        }
    }

    private fun readFields() = Content(
        contentOneText.text.toString()
    )

    private fun clearFields() {
        searchContentText.setText("")
        contentOneText.setText("")
        contentTwoText.setText("")
        contentThreeText.setText("")
    }

    interface OnManageButtonsClicked{
        fun onAddButtonClicked(content: Content)
        fun onUpdateButtonClicked(message: Content)
    }
}
