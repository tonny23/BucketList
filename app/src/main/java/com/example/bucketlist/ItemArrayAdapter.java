package com.example.bucketlist;

//TODO step 4: create a custom RecyclerView adapter with a custom ViewHolder
public class ItemArrayAdapter {


    //TODO step 11: add the interface from the tutorial
/*    public interface ItemClickListener{
        void itemOnLongClick (int position);
    }*/

    //TODO step 12: add the following attribute:
//    final private ItemClickListener mItemClickListener;

    //TODO step 13: add the following code to the onBindViewHolder, this will be used to delete items from the bucketlist:
/*holder.mView.setOnLongClickListener(new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View view) {
            mItemClickListener.itemOnLongClick(position);
            return true;
        }
    });*/

    //TODO step 15: add the following code to the onBindViewHolder, this will check off the items in the bucketlist
/*    holder.mView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!checkBox.isChecked()) {
                checkBox.setChecked(true);
                textView.setPaintFlags((textView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG));
            } else {
                checkBox.setChecked(false);
                textView.setPaintFlags(0);
            }
        }*/

    }
