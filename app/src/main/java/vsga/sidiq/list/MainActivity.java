package vsga.sidiq.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView lvItem;

    private String[] nama_negara = new String[]{
            "indonesia", "turki", "malaysia", "singapura",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("listView Sederhana");

        lvItem = findViewById(R.id.listView);

        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, nama_negara);

        lvItem.setAdapter(Adapter);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "memilih :" + nama_negara[i], Toast.LENGTH_SHORT).show();
            }
        });

    }

}