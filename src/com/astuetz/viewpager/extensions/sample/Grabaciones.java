/*
 * Copyright (C) 2013 Andreas Stuetz <andreas.stuetz@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.astuetz.viewpager.extensions.sample;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Grabaciones extends Fragment implements
		OnClickListener {
	
	int victor1_guapamente,
	vicase2_enviaryocosas,
	vicase3_madre_mia_casi_la_cago,
	vicase4_que_chaval,
	vicase5_graba_graba,
	vicase6_topota_madre,
	vicase7_la_tactica_espaniola,
	vicase8_ay_quijodeputa,
	vicase9_cocidito_madrilenio,
	vicase10_di_pepino,
	vicase11_eres_un_gracioso,
	vicase12_hijodeputa,
	vicase13_hortense_delahuerta,
	vicase14_linea,
	vicase15_quieresunaplaga,
	eduleven1_las_5_30_completo,
	eduleven2_himnos_variados2,
	eduleven3_viva_espinia,
	eduleven4_himno_madrid,
	eduleven5_himno_gisbertiano,
	eduleven6_creo_que_estoy_ido;
	
	public MediaPlayer mpv11,
	mpv12,
	mpv13,
	mpv14,
	mpv15,
	mpv16,
	mpv17,
	mpv18,
	mpv19,
	mpv110,
	mpv111,
	mpv112,
	mpv113,
	mpv114,
	mpv115,
	mpv21,
	mpv22,
	mpv23,
	mpv24,
	mpv25,
	mpv26;

	
	private Button bt11,
	bt12,
	bt13,
	bt14,
	bt15,
	bt16,
	bt17,
	bt18,
	bt19,
	bt110,
	bt111,
	bt112,
	bt113,
	bt114,
	bt115,
	bt21,
	bt22,
	bt23,
	bt24,
	bt25,
	bt26,
	bt27,
	bt28;
	
	private static final String ARG_POSITION = "position";

	private int position;

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public static Grabaciones newInstance(int position) {
		Grabaciones gr = new Grabaciones();
		Bundle b = new Bundle();
		b.putInt(ARG_POSITION, position);
		gr.setArguments(b);
		gr.setPosition(position);
		return gr;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}



	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		LinearLayout fl = new LinearLayout(getActivity());
		fl.setLayoutParams(params);
	    
		if (position == 0) {
			View view = inflater.inflate(R.layout.vicase, container, false );
		
			bt11 = (Button) view.findViewById(R.id.button11);
			bt11.setOnClickListener(this);
			
			bt12 = (Button) view.findViewById(R.id.button12);
			bt12.setOnClickListener(this);
			
			bt13 = (Button) view.findViewById(R.id.button13);
			bt13.setOnClickListener(this);
			
			bt14 = (Button) view.findViewById(R.id.button14);
			bt14.setOnClickListener(this);
			
			bt15 = (Button) view.findViewById(R.id.button15);
			bt15.setOnClickListener(this);
			
			bt16 = (Button) view.findViewById(R.id.button16);
			bt16.setOnClickListener(this);
			
			bt17 = (Button) view.findViewById(R.id.button17);
			bt17.setOnClickListener(this);
			
			bt18 = (Button) view.findViewById(R.id.button18);
			bt18.setOnClickListener(this);
			
			bt19 = (Button) view.findViewById(R.id.button19);
			bt19.setOnClickListener(this);
			
			bt110 = (Button) view.findViewById(R.id.button110);
			bt110.setOnClickListener(this);

			bt111 = (Button) view.findViewById(R.id.button111);
			bt111.setOnClickListener(this);
			
			bt112 = (Button) view.findViewById(R.id.button112);
			bt112.setOnClickListener(this);
			
			bt113 = (Button) view.findViewById(R.id.button113);
			bt113.setOnClickListener(this);
			
			bt114 = (Button) view.findViewById(R.id.button114);
			bt114.setOnClickListener(this);
			
			bt115 = (Button) view.findViewById(R.id.button115);
			bt115.setOnClickListener(this);
			
		    fl.addView(view);
		    
		}else if (position == 1) {
			View view2 = inflater.inflate(R.layout.eduleven, container, false );
			
			bt21 = (Button) view2.findViewById(R.id.button21);
			bt21.setOnClickListener(this);
			
			bt22 = (Button) view2.findViewById(R.id.button22);
			bt22.setOnClickListener(this);
			
			bt23 = (Button) view2.findViewById(R.id.button23);
			bt23.setOnClickListener(this);
			
			bt23 = (Button) view2.findViewById(R.id.button24);
			bt23.setOnClickListener(this);
			
			bt24 = (Button) view2.findViewById(R.id.button25);
			bt24.setOnClickListener(this);
			
			bt25 = (Button) view2.findViewById(R.id.button26);
			bt25.setOnClickListener(this);
			
			fl.addView(view2);
		}
		return fl;
	}

	@Override
	public void onClick(View v)  {
		int id = v.getId(); // Use the button id to determine which sample
		// should be played
		
		
		switch (id) {
		
		// Botones pestaña 1
		case R.id.button11:
			mpv11 = MediaPlayer.create(v.getContext(), R.raw.vicase1_guapamente);
			if (mpv11.isPlaying()) {
				mpv11.stop();
				mpv11.start();
			} else {
				mpv11.start();
			}
			Log.i("---", "Button11");
			break;

		case R.id.button12:

			mpv12 = MediaPlayer.create(v.getContext(), R.raw.vicase2_enviar_yo_cosas);
			if (mpv12.isPlaying()) {
				mpv12.stop();
				mpv12.start();
			} else {
				mpv12.start();
			}
			Log.i("---", "Button12");
			break;

		case R.id.button13:
			mpv13 = MediaPlayer.create(getActivity(), R.raw.vicase3_madre_mia_casi_la_cago);
			if (mpv13.isPlaying()) {
				mpv13.stop();
				mpv13.start();
			} else {
				mpv13.start();
			}
			Log.i("---", "Button13");
			break;

		case R.id.button14:
			mpv14 = MediaPlayer.create(getActivity(), R.raw.vicase4_que_chaval);
			if (mpv14.isPlaying()) {
				mpv14.stop();
				mpv14.start();
			} else {
				mpv14.start();
			}
			Log.i("---", "Button4");
			break;

		case R.id.button15:
			mpv15 = MediaPlayer.create(getActivity(), R.raw.vicase5_graba_graba);
			if (mpv15.isPlaying()) {
				mpv15.stop();
				mpv15.start();
			} else {
				mpv15.start();
			}
			Log.i("---", "Button5");
			break;

		case R.id.button16:
			mpv16 = MediaPlayer.create(getActivity(), R.raw.vicase6_topota_madre);
			if (mpv16.isPlaying()) {
				mpv16.stop();
				mpv16.start();
			} else {
				mpv16.start();
			}
			Log.i("---", "Button6");
			break;
		case R.id.button17:
			mpv17 = MediaPlayer.create(getActivity(), R.raw.vicase7_la_tactica_espaniola);
			if (mpv17.isPlaying()) {
				mpv17.stop();
				mpv17.start();
			} else {
				mpv17.start();
			}
			break;
		case R.id.button18:
			mpv18 = MediaPlayer.create(getActivity(), R.raw.vicase8_ay_quijodeputa);
			if (mpv18.isPlaying()) {
				mpv18.stop();
				mpv18.start();
			} else {
				mpv18.start();
			}
			break;
		case R.id.button19:
			mpv19 = MediaPlayer.create(getActivity(), R.raw.vicase9_cocidito_madrilenio);
			if (mpv19.isPlaying()) {
				mpv19.stop();
				mpv19.start();
			} else {
				mpv19.start();
			}
			break;
		case R.id.button110:
			mpv110 = MediaPlayer.create(getActivity(), R.raw.vicase10_di_pepino);
			if (mpv110.isPlaying()) {
				mpv110.stop();
				mpv110.start();
			} else {
				mpv110.start();
			}
			break;
		case R.id.button111:
			mpv111 = MediaPlayer.create(getActivity(), R.raw.vicase11_eres_un_gracioso);
			if (mpv111.isPlaying()) {
				mpv111.stop();
				mpv111.start();
			} else {
				mpv111.start();
			}
			break;
		case R.id.button112:
			mpv112 = MediaPlayer.create(v.getContext(), R.raw.vicase12hijodeputa);
			mpv112.start();
//			if (mpv112.isPlaying()) {
//				mpv112.stop();
//				mpv112.start();
//			} else {
//				mpv12.start();
//			}
			break;
		case R.id.button113:
			mpv113 = MediaPlayer.create(getActivity(), R.raw.vicase13hortense);
			mpv113.start();
//			if (mpv113.isPlaying()) {
//				mpv113.stop();
//				mpv113.start();
//			} else {
//				mpv13.start();
//			}
			break;
		case R.id.button114:
			mpv114 = MediaPlayer.create(getActivity(), R.raw.vicase14_linea);
			if (mpv114.isPlaying()) {
				mpv114.stop();
				mpv114.start();
			} else {
				mpv114.start();
			}
			break;
		case R.id.button115:
			mpv115 = MediaPlayer.create(getActivity(), R.raw.vicase15_quieresunaplaga);
			if (mpv115.isPlaying()) {
				mpv115.stop();
				mpv115.start();
			} else {
				mpv115.start();
			}
			break;

		// Botones pestaña 2
		case R.id.button21:
			mpv21 = MediaPlayer.create(v.getContext(), R.raw.eduleven1_las_5_30_completo);
			if (mpv21.isPlaying()) {
				mpv21.stop();
				mpv21.start();
			} else {
				mpv21.start();
			}
			Log.i("---", "Button21");
			break;

		case R.id.button22:
			mpv22 = MediaPlayer.create(v.getContext(),	R.raw.eduleven2_himnos_variados2);
			if (mpv22.isPlaying()) {
				mpv22.stop();
				mpv22.start();
			} else {
				mpv22.start();
			}
			break;

		case R.id.button23:
			mpv23 = MediaPlayer.create(getActivity(), R.raw.eduleven3_viva_espinia);
			if (mpv23.isPlaying()) {
				mpv23.stop();
				mpv23.start();
			} else {
				mpv23.start();
			}
			break;
		case R.id.button24:
			mpv24 = MediaPlayer.create(getActivity(), R.raw.eduleven4_himno_madrid);
			if (mpv24.isPlaying()) {
				mpv24.stop();
				mpv24.start();
			} else {
				mpv24.start();
			}
			break;

		case R.id.button25:
			mpv25 = MediaPlayer.create(getActivity(), R.raw.eduleven5_himno_gisbertiano);
			if (mpv25.isPlaying()) {
				mpv25.stop();
				mpv25.start();
			} else {
				mpv25.start();
			}
			break;

		case R.id.button26:
			mpv26 = MediaPlayer.create(getActivity(), R.raw.eduleven6_creo_que_estoy_ido);
			if (mpv26.isPlaying()) {
				mpv26.stop();
				mpv26.start();
			} else {
				mpv26.start();
			}

			break;

		}
	}
}