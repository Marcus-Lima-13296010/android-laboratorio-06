package com.example.laboratorio06;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class AdaptorImagens<TypeArray> extends BaseAdapter {
	int itensMinhaGaleria;
	Context contexto;
	
	private Integer[] minhasIdsImagens = {
			R.drawable.Moto_01,
			R.drawable.Moto_02,
			R.drawable.Moto_03
	};
	
	public AdaptorImagens(Context contextoParam){
		contexto = contextoParam;
		TypeArray atributos = contexto.obtainStyledAttributes(R.styleable.minhaGaleria);
		itensMinhaGaleria = atributos.getResourceId(
				R.styleable.MinhaGaleria_android_galleryItemBackground,0);
	}
	
	@Override
	public int getCount() {
			return minhasIdsImagens.length;
	}

	@Override
	public Object getItem(int position) {
				return position;
	}

	@Override
	public long getItemId(int position) {
			return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView = new ImageView(contexto);
		
		imageView.setImageResource(minhasIdsImagens(position));
		imageView.setLayoutParams(new Gallery.LayoutParams(150,100));
		imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		imageView.setBackgroundResource(itensMinhaGaleria);
		
		return imageView;
	}

	private int minhasIdsImagens(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

}
