package www.smktelkommlg.myfragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.textfield.TextInputEditText

class FirstFragment : Fragment() {
    private var communicationViewModel : CommunicationViewModel?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProviders.of(requireActivity()).get(CommunicationViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first,container,false)
    }

    override fun onViewCreated(view: View,savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        val nameEditText = view.findViewById<TextInputEditText>(R.id.textInputTextName)
        val nameEditEmail = view.findViewById<TextInputEditText>(R.id.textInputTextEmail)
        val nameEditKelas = view.findViewById<TextInputEditText>(R.id.textInputKelas)
        val nameEditHobi = view.findViewById<TextInputEditText>(R.id.textInputHobi)
        nameEditText.addTextChangedListener(
            object : TextWatcher{
                override fun beforeTextChanged(
                    charSequence: CharSequence, i:Int,i1:Int,i2:Int){

                }

                override fun onTextChanged(
                    charSequence: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    communicationViewModel!!.setName(charSequence.toString())
                }

                override fun afterTextChanged(editTable:Editable?) {

                }
            }
        )
        nameEditEmail.addTextChangedListener(
            object : TextWatcher{
                override fun beforeTextChanged(
                    charSequence: CharSequence, i:Int,i1:Int,i2:Int){

                }

                override fun onTextChanged(
                    charSequence: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    communicationViewModel!!.setEmail(charSequence.toString())
                }

                override fun afterTextChanged(editTable:Editable?) {

                }
            }
        )
        nameEditKelas.addTextChangedListener(
            object : TextWatcher{
                override fun beforeTextChanged(
                    charSequence: CharSequence, i:Int,i1:Int,i2:Int){

                }

                override fun onTextChanged(
                    charSequence: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    communicationViewModel!!.setKelas(charSequence.toString())
                }

                override fun afterTextChanged(editTable:Editable?) {

                }
            }
        )
        nameEditHobi.addTextChangedListener(
            object : TextWatcher{
                override fun beforeTextChanged(
                    charSequence: CharSequence, i:Int,i1:Int,i2:Int){

                }

                override fun onTextChanged(
                    charSequence: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    communicationViewModel!!.setHobi(charSequence.toString())
                }

                override fun afterTextChanged(editTable:Editable?) {

                }
            }
        )

    }
    companion object{
        fun newInstance(): FirstFragment{
            return FirstFragment()
        }
    }
}