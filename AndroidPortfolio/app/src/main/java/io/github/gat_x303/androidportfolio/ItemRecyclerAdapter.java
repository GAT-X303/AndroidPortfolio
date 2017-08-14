package io.github.gat_x303.androidportfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates an adapter similar for ArrayAdapter but in this case for CardViews
 * https://www.binpress.com/tutorial/android-l-recyclerview-and-cardview-tutorial/156
 */

public class ItemRecyclerAdapter extends RecyclerView.Adapter<ItemRecyclerAdapter.ItemViewHolder> {

    private List<Item> items;

    public ItemRecyclerAdapter(List<Item> item) {
        this.items = item;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.activity_projects, parent, false);

        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        final Item currentItem = items.get(position);
        holder.title.setText(currentItem.name);
        holder.description.setText(currentItem.sub);
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //https://stackoverflow.com/questions/4197135/how-to-start-activity-in-adapter
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(currentItem.address));
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        protected TextView title;
        protected TextView description;
        protected Button button;

        public ItemViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tittle);
            description = (TextView) itemView.findViewById(R.id.info);
            button = (Button) itemView.findViewById(R.id.button);
        }
    }

}
