package br.edu.ifsp.dmo1.listaestados

import android.os.Bundle
import android.os.Parcel
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.edu.ifsp.dmo1.listaestados.databinding.ActivityMainBinding

class MainActivity() : AppCompatActivity(), AdapterView.OnItemClickListener {

    private lateinit var binding: ActivityMainBinding
    private val states = arrayOf("AC","AL","AP","AM","BA","CE",
        "DF","ES","GO","MA","MT","MS",
        "MG","PA","PB","PR","PE","PI",
        "RJ","RN","RS","RO","RR","SC",
        "SP","SE","TO");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(R.layout.activity_main)

        val adapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,states);

        binding.listview.adapter = adapter;
        binding.listview.onItemClickListener = this;
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this, "Voce clivou em ${states.get(position)}", Toast.LENGTH_LONG).show()
    }

}