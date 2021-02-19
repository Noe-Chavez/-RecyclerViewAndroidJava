package mx.com.recyclerviewjava;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {

    private ArrayList<Task> dataSet;

    public  TaskAdapter(ArrayList<Task> dataSet) {
        this.dataSet = dataSet;
    }

    // Enlaza el adaptador (TaskAdapter) con el xml que tiene el diseño de cada item del Recycler View (task.xml).
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task, parent, false);
        return new ViewHolder(view);
    }

    // Encargado de establecer la comuniación del adaptador (TaskAdapter) con el ViewHolder (clase interna).
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(this.dataSet.get(position));
    }

    // tamaño de la lista.
    @Override
    public int getItemCount() {
        return this.dataSet.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView taskName;
        private final CheckBox checkboxTask;

        // aquí se hace referencia a los elementos que necesitamos pintar en cada elemento que tendrá el Recycler View.
        public ViewHolder(View view) {
            super(view);
            taskName = view.findViewById(R.id.text_view_name_task);
            checkboxTask = view.findViewById(R.id.checkbox_task);
        }

        public void setData(Task task) {
            taskName.setText(task.getNameTask());
            checkboxTask.setChecked(task.getCompleted());
        }

    }
}

