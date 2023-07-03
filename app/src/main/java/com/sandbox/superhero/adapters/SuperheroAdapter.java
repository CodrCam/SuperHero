package com.sandbox.superhero.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sandbox.superhero.MainActivity;
import com.sandbox.superhero.R;

import java.util.List;

public class SuperheroAdapter extends RecyclerView.Adapter<SuperheroAdapter.SuperheroViewHolder> {

    private Context mContext;
    private List<String> mSuperheroes;
    private MainActivity mActivity;

    public SuperheroAdapter(Context context, List<String> superheroes, MainActivity activity) {
        this.mContext = context;
        this.mSuperheroes = superheroes;
        this.mActivity = activity;
    }

    @NonNull
    @Override
    public SuperheroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_superhero, parent, false);
        return new SuperheroViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SuperheroViewHolder holder, int position) {
        String superhero = mSuperheroes.get(position);
        holder.superheroButton.setText(superhero);
        holder.superheroButton.setOnClickListener(v -> {
            // Display interstitial ad
            mActivity.showInterstitialAd();

            // Display rewarded ad
            mActivity.showRewardedAd();
        });
    }

    @Override
    public int getItemCount() {
        return mSuperheroes.size();
    }

    static class SuperheroViewHolder extends RecyclerView.ViewHolder {

        Button superheroButton;

        SuperheroViewHolder(View itemView) {
            super(itemView);
            superheroButton = itemView.findViewById(R.id.superhero_button);
        }
    }
}
