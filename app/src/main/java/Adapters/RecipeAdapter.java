package Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.recyclerview.widget.RecyclerView;

import com.muhammadibrar.recycler.MainActivity;
import com.muhammadibrar.recycler.R;

import java.util.ArrayList;

import Classes.RecyclerItemClickListener;
import Models.RecipeModel;


public class RecipeAdapter extends RecyclerView.Adapter<Adapters.RecipeAdapter.viewHolder> {

        ArrayList<RecipeModel> list;
        Context context;
    private RecyclerView.ViewHolder holder;
    private SafeIterableMap model;


    RecipeAdapter recipe;




    public RecipeAdapter(ArrayList<RecipeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
        @Override
        public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.sample_recyclerview,parent,false);

        return new viewHolder(view);



        }

        @Override
        public void onBindViewHolder(@NonNull final viewHolder holder, final int position) {

        final RecipeModel model=list.get(position);

        holder.imageView.setImageResource(model.getPic());

    holder.textView.setText(model.getText());



//    holder.imageView.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(context, "item is clicked", Toast.LENGTH_SHORT).show();
//
//        }
//
//    });






            switch (position){

                case 0:
                    holder.imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(context,"img one is clicked",Toast.LENGTH_SHORT).show();

                        }
                    });



                    holder.textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(context,"add your own feature",Toast.LENGTH_SHORT).show();
                        }
                    });




                   // check delete
                    holder.mDeleteImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            int newPosition=holder.getAbsoluteAdapterPosition();

                            model.remove(newPosition);
                            notifyItemRemoved(newPosition);
                            notifyItemRangeChanged(newPosition, model.size());

                        }
                    });





                break;

                case 1:
                    holder.imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(context,"img two is clicked",Toast.LENGTH_SHORT).show();

                        }
                    });



                    holder.textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(context,"add your desire feature",Toast.LENGTH_SHORT).show();
                        }
                    });




//                    holder.mDeleteImage.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//
//
//
//                                Toast.makeText(context,"deleted",Toast.LENGTH_SHORT).show();
//                            }
//
//                    });


                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + position);
            }




        }

        @Override
        public int getItemCount() {
            return list.size();
        }



    @SuppressLint("RestrictedApi")
    private void removeItem(int position){
        int newPosition = holder.getAbsoluteAdapterPosition();
        model.remove(newPosition);
        notifyItemRemoved(newPosition);
        notifyItemRangeChanged(newPosition, model.size());
    }



    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
     ImageView mDeleteImage;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

          imageView=itemView.findViewById(R.id.imageView);
          textView=itemView.findViewById(R.id.textView);
        mDeleteImage=itemView.findViewById(R.id.image_delete);






        }
    }


}
