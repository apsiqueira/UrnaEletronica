package com.example.urnaeletronica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    private ArrayList<Candidato> candidatos=new ArrayList<>();
    private Button btnAdicionar,btnExcluir,btnIniciarVotacao;
    private EditText dataNasciomento;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdicionar=findViewById(R.id.btnAdicionarCandidato);
        btnExcluir=findViewById(R.id.btnExcluirCandidato);
        btnIniciarVotacao=findViewById(R.id.btnIniciarVotacao);
        dataNasciomento=findViewById(R.id.editTextDataNascimento);


        //mascara para data
       // SimpleMaskFormatter smf=new SimpleMaskFormatter("NN/NN/NNNN");
       // MaskTextWatcher mtw=new MaskTextWatcher(dataNasciomento,smf);
       // dataNasciomento.addTextChangedListener(mtw);
        //fim marcara






        btnIniciarVotacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





            }
        });

        btnExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Exclusão",Toast.LENGTH_LONG);

                Intent intent=new Intent(getApplicationContext(), ExclusaoCandidatoActivity.class);
                startActivity(intent);



            }
        });

        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AdicionarCandidatoActivity.class);

                intent.putExtra("n","login");


                startActivity(intent);

            }
        });




    }
}
