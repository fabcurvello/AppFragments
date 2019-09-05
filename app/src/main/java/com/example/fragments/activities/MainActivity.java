package com.example.fragments.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.R;
import com.example.fragments.fragments.ContatosFragment;
import com.example.fragments.fragments.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button btConversa;
    private Button btContato;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Remover sombra da ActionBar
        getSupportActionBar().setElevation(0);

        btContato = findViewById(R.id.btContatos);
        btConversa = findViewById(R.id.btConversas);

        //12-FRAGMENT
        conversasFragment = new ConversasFragment();


        //12-Configurar objeto para o Fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        //12-(onde será exibido, quem será exibido)
        transaction.replace(R.id.frameConteudo, conversasFragment);

        //12-Encerrar a transação
        transaction.commit();

        btContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contatosFragment = new ContatosFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, contatosFragment);
                transaction.commit();

            }
        });

        btConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                conversasFragment = new ConversasFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, conversasFragment);
                transaction.commit();
            }
        });


    }
}

/*
Sequência na elaboração deste app:

1 - Inserção da Guideline vertical e clique nela pra exibir como %. posicioná-la em 50%
2 - Inserção dos botões. Constraints alinhadas pela guideline. Background é o ColorPrimary e textColor é white
3 - Inserção de um FrameLayout ocupando toda a área abaixo dos botões. Constraint superior ligada ao topo da tela (por cima dos botões)
4 - Executar e ver que fica uma sombra entre os botões e a barra do app. Remover sombra com codigo dentro do onCreate
5 - Criar os pacotes activities e fragments. Arrastar a MainActivity pra dentro do pacote activities
6 - Botão direito no pacote fragments / new / Fragment / (Blank) Fragment. Nome ConversasFragment. DESMARCAR os 2 includes.
7 - No FragmentConversas.XML veio um TextView. Mudar o texto para Conversas e colocar MatchParent nos 2. TextSize 24 e gravity center e center horizontal.
8 - Criar o ContatosFragment com todos os mesmos detalhes do ConversasFragment.
9 - Colocar id tvContatos no TextView Contatos
10 - Em ContatosFragment.JAVA foi explicado como manipular um view que está no XML (pela classe View)
11 - no XML activity_main, colocar ids nos botões e no FrameLayout
12 - Na ActivityMain.JAVA Instanciar e manipular os objetos conforme códigos acima (globais e no onCreate)
13 - Instanciar os botões (findViewByid...)
14 - Criar os listeners dos botões

 */


