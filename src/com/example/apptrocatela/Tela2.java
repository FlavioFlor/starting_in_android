package com.example.apptrocatela;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela2 extends Activity
{

	private  EditText edtMensagem2;
	private String valor;
	private Button btVoltar;
	private Button btFechartl2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela2);
		
		declararvariaveis();
		implementarEventos();
				
		Intent chegada = getIntent();
		Bundle dadoschegado = chegada.getExtras();
		valor = dadoschegado.getString("texto");
		edtMensagem2.setText(valor);
		
		
	}
	
	private void declararvariaveis() {

		edtMensagem2 = (EditText)findViewById(R.id.edtMensagem2);
		btVoltar = (Button)findViewById(R.id.btVoltar);
		btFechartl2 = (Button)findViewById(R.id.btFechartl2);
	}
	
	private void implementarEventos() {
		btVoltar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent voltartela = new Intent(Tela2.this,Principal.class);
				startActivity(voltartela);
				
			}
		});
		
		btFechartl2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				finish();
			}
		});
		
	}

}
