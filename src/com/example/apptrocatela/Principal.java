package com.example.apptrocatela;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class Principal extends Activity{

	private Button btTrocaTela;
	private EditText edtMensagem;
	private Button btFechar;
	private Spinner spTipo;
	
	private static final String [] Tipo ={"Numero","Texto"} ;
	private ArrayAdapter<String> stTipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        
        inicializarComponentes();
        implementarEvento();
     
    }
	

	private void inicializarComponentes() {
    	btTrocaTela = (Button)findViewById(R.id.btTrocaTela);
        edtMensagem = (EditText)findViewById(R.id.edtMensagem);
        btFechar = (Button)findViewById(R.id.btFechar);
        spTipo = (Spinner)findViewById(R.id.spTipo);
        
        stTipo = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Tipo);
        spTipo.setAdapter(stTipo);
	}
	
	

    private void implementarEvento() {
    	
    	
    	btTrocaTela.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

	        	String mensagem = edtMensagem.getText().toString();
	        	Bundle dados = new Bundle();
	        	dados.putString("texto", mensagem);
	        	Intent trocatela = new Intent(Principal.this,Tela2.class);
	        	trocatela.putExtras(dados);
	    		startActivity(trocatela);
				
			}
		});
    	
    	btFechar.setOnClickListener(new View.OnClickListener(){
    		public void onClick(View v){
    			finish();
    		}
    	});
    
	}

	

}
