package com.example.urnaeletronica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdicionarCandidatoActivity extends AppCompatActivity {



    private EditText nomecandidato, enderecoCandidato;
    private RadioButton radioBtnBrasileiro, radioBtnOutraNacionalidade;
    private EditText dataNascimento;
    private Button btnSalvarCandidato;
    private Date dataNascimentoTratada;
    private TextView mostraPutExtra;


    public void setDataNascimentoTratada(Date dataNascimentoTratada) {
        this.dataNascimentoTratada = dataNascimentoTratada;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_candidato);
        nomecandidato = findViewById(R.id.editTextNomeCandidato);
        enderecoCandidato = findViewById(R.id.editTextEndercoCandidato);
        radioBtnBrasileiro = findViewById(R.id.radioButtonBrasileiro);
        radioBtnOutraNacionalidade = findViewById(R.id.radioButtonOutros);
        dataNascimento = findViewById(R.id.editTextDataNascimento);
        btnSalvarCandidato=findViewById(R.id.button_salvarCadastro);
        mostraPutExtra=findViewById(R.id.textViewPutExtra);

        Bundle bundleExtra=getIntent().getExtras();

        if(bundleExtra!=null){
            String textoRecebidoLogin=bundleExtra.getString("n");


            mostraPutExtra.setText(textoRecebidoLogin);

            Toast toast=Toast.makeText(getApplicationContext(),textoRecebidoLogin,Toast.LENGTH_LONG);
            toast.show();

        }








        btnSalvarCandidato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Candidato.criarCandidato(nomecandidato.getText().toString(),enderecoCandidato.getText().toString(),
                       "brasileiro",dataNascimentoTratada);
                Toast toast=Toast.makeText(getApplicationContext(),"Salvo com sucesso",Toast.LENGTH_LONG);
                toast.show();



            }
        });





    }




}
