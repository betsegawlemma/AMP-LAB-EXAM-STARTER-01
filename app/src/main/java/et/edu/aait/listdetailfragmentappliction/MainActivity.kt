package et.edu.aait.listdetailfragmentappliction

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import et.edu.aait.listdetailfragmentappliction.ManageContentFragment.OnManageButtonsClicked
import et.edu.aait.listdetailfragmentappliction.data.Content

class MainActivity : AppCompatActivity(), OnManageButtonsClicked{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_layout)

        val manageContentFragment = ManageContentFragment()

        if(resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.portrait_frame, manageContentFragment)
                .addToBackStack(null)
                .commit()
        }

        if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.land_manage_frame, manageContentFragment)
                .addToBackStack(null)
                .commit()
        }

    }

    override fun onAddButtonClicked(content: Content) {
        // insert the content passed to database using viewModel
        // create DisplayContentFragment fragment using its factory method
        // display the fragment on the portrait_frame container in portrait mode
        // display the fragment on the land_display_frame container in landscape mode
    }

    override fun onUpdateButtonClicked(content: Content) {
        // update the content passed to database using viewModel
        // create DisplayContentFragment fragment using its factory method
        // display the fragment on the portrait_frame container in portrait mode
        // display the fragment on the land_display_frame container in landscape mode
    }
}
