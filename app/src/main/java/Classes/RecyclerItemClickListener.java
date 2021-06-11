package Classes;

import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerItemClickListener<onItemClickListener> implements RecyclerView.OnItemTouchListener {


    private onItemClickListener mlistener;

    public RecyclerItemClickListener(onItemClickListener mainActivity, onItemClickListener recyclerView, onItemClickListener onItemClickListener) {
    }

    public interface OnItemClickListener{
        public void onItemClick(View view,int position);
        public void onLongItemClick(View view, int position);

    }




    @Override
    public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
        return false;
    }

    @Override
    public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }


}
