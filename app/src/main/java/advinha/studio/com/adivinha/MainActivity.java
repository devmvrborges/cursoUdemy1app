package advinha.studio.com.adivinha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/*
Aplicativo desenvolvido por Maurício Valentim Rodrigues Borges dia 18/01/2017
estudante de Ciência da computação na Faculdade de Jaguariúna.

DESCRIÇÃO: O intuito deste aplicativo é exemplo de um jogo
de advinhação de quem se aproximar mais do resultado é o vencedor,
desenvolvio durante o Curso Completo do Desenvolvedor Android - Crie 15 Apps (UDEMY)
*/

public class MainActivity extends AppCompatActivity {

    //Criando propriedades para os componentes

    private Button botaoJogar;
    private TextView textoResultado;

    //Metodo principal onCreate para a aplicação

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Utilizando metodo findViewById que tem a função de recuperar um elemento na tela

        botaoJogar = (Button) findViewById(R.id.botaoJogarId);
        textoResultado = (TextView) findViewById(R.id.resultadoId);

        //Evento do click do botaoJogar

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Utilizando o uma classe para gerar números randomicos
                Random randomico = new Random();

                int numeroAleatorio = randomico.nextInt(11);

                textoResultado.setText(" " + numeroAleatorio);
            }
        });

    }

}
