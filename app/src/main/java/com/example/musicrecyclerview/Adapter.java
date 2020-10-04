package com.example.musicrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<MusicViewHolder>{


    private Context mContext;
    private List<MusicData> MusicList;

    public Adapter(Context mContext, List<MusicData> musicList) {
        this.mContext = mContext;
        MusicList = musicList;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item,viewGroup,false);
        return new MusicViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MusicViewHolder musicViewHolder, int i) {

        musicViewHolder.imageView.setImageResource(MusicList.get(i).getItemImage());
        musicViewHolder.mTitle.setText(MusicList.get(i).getItemName());
        musicViewHolder.mDescription.setText(MusicList.get(i).getItemDesc());

        musicViewHolder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,AboutDetailActivity.class);
                intent.putExtra("Image",MusicList.get(musicViewHolder.getAdapterPosition()).getItemImage());
                intent.putExtra("Description",MusicList.get(musicViewHolder.getAdapterPosition()).getItemDesc());
                mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return MusicList.size();
    }
}

class MusicViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView mTitle,mDescription ;
    CardView mCardView;

    public MusicViewHolder( View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.ivImage);
        mTitle= itemView.findViewById(R.id.textViewTitle);
        mDescription= itemView.findViewById(R.id.textViewDescription);
        mCardView= itemView.findViewById(R.id.CardView);

    }
}
