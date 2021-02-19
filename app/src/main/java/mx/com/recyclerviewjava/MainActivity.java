package mx.com.recyclerviewjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Task> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = new ArrayList<>();
        RecyclerView rv = findViewById(R.id.recycler_view_container);
        getList();
        TaskAdapter taskAdapter = new TaskAdapter(lista);
        rv.setAdapter(taskAdapter);
    }

    private void getList() {
        lista.add(new Task("ver cómo funciona un RecyclerView en Android", true));
        lista.add(new Task("Dormir un poco", false));
        lista.add(new Task("Coger con Ara, para su casa", false));
        lista.add(new Task("Hacerme wey", true));
    }
}