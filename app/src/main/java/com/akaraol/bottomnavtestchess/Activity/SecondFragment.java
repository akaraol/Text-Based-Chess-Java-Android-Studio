package com.akaraol.bottomnavtestchess.Activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.akaraol.bottomnavtestchess.Adapter.ChessLogAdapter;
import com.akaraol.bottomnavtestchess.Models.ChessCommandLogModel;
import com.akaraol.bottomnavtestchess.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {
    private RecyclerView rv_chess_log;
//Satranç ekranındaki butonları tanımladık.
    Button A, B, C, D, E, F, G, H, one, two, three, four, five, six, seven, eighth, piyon, kale, at, fil, vezir, sah, sendToBttn;
    ImageView deleteImgTxt;
    TextView moveText;
//Adapterime gönderecek olduğum listemi ayarladım
    List<ChessCommandLogModel> chessCommands = new ArrayList<>();
    //İlk kimin başlayacağını belirleyen tanımlama
    ChessCommandLogModel chessCommandLog = new ChessCommandLogModel(1 ,"");
//Adapter oluşturuldu
    ChessLogAdapter adapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SecondFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SecondFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SecondFragment newInstance(String param1, String param2) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//View ekranındaki her birime değer verdim (Programatik olarak tanımladım)
        rv_chess_log = view.findViewById(R.id.rv_chess_log);

        A = view.findViewById(R.id.aButton);
        B = view.findViewById(R.id.bButton);
        C = view.findViewById(R.id.cButton);
        D = view.findViewById(R.id.dButton);
        E = view.findViewById(R.id.eButton);
        F = view.findViewById(R.id.fButton);
        G = view.findViewById(R.id.gButton);
        H = view.findViewById(R.id.hButton);
        one = view.findViewById(R.id.oneButton);
        two = view.findViewById(R.id.twoButton);
        three = view.findViewById(R.id.threeButton);
        four = view.findViewById(R.id.fourButton);
        five = view.findViewById(R.id.fiveButton);
        six = view.findViewById(R.id.sixButton);
        seven = view.findViewById(R.id.sevenButton);
        eighth = view.findViewById(R.id.eigthButton);
        piyon = view.findViewById(R.id.piyonButton);
        kale = view.findViewById(R.id.kaleButton);
        at = view.findViewById(R.id.atButton);
        fil = view.findViewById(R.id.filButton);
        vezir = view.findViewById(R.id.vezirButton);
        sah = view.findViewById(R.id.sahButton);
        sendToBttn = view.findViewById(R.id.sendToButton);
        deleteImgTxt = view.findViewById(R.id.deleteImageView);
        moveText = view.findViewById(R.id.moveText);

        //Başlangıçta delete butonu yok
        deleteImgTxt.setVisibility(View.GONE);


// Bütün butonların onClick eventinde yaşanacak işlemleri tanımladım.
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    moveText.setText(moveText.getText().toString() + 'A');

            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() + 'B');
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +'C');
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +'D');
            }
        });
        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +'E');
            }
        });
        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +'F');
            }
        });
        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +'G');
            }
        });
        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +'H');
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +"1 ");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +"2 ");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +"3 ");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +"4 ");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +"5 ");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +"6 ");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +"7 ");
            }
        });
        eighth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +"8 ");
            }
        });
        piyon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +"Piyon -> ");
            }
        });
        kale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +"Kale -> ");
            }
        });
        fil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +"Fil -> ");
            }
        });
        at.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +"At -> ");
            }
        });
        vezir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +"Vezir -> ");
            }
        });
        sah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveText.setText(moveText.getText().toString() +"Şah -> ");
            }
        });
        // delete butonunun silme işlemi gerçekleştirildi
        deleteImgTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = moveText.getText().toString();
                if (value.equals("") ){
                 return;
                }
                if (value.charAt(value.length() - 1) != ' ' ){
                    moveText.setText(
                            value.substring(0 , (value.length() - 1))
                    );
                }else if (value.charAt(value.length() - 1) == ' '){
                    moveText.setText(
                            value.substring(0 , (value.length() - 2))
                    );
                }
            }
        });
// TV nin onTextChanged eventine silme butonunu gösterip kaldıran fonksiyonu yazdım.
        moveText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0){
                    deleteImgTxt.setVisibility(View.GONE);
                }else{
                    deleteImgTxt.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        sendToBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chessCommandLog.setMove(moveText.getText().toString());
                chessCommands.add(chessCommandLog);
                chessCommandLog = new ChessCommandLogModel(chessCommandLog.getTurn() == 1 ? 2 : 1 , "" );
                adapter = new ChessLogAdapter(chessCommands , SecondFragment.this);
                rv_chess_log.setAdapter(adapter);
                moveText.setText("");
            }
        });



        // RV nin scroll etmesini ve sınırlarının taşmamasını sağlayan bir metot
        rv_chess_log.setHasFixedSize(true);
        //RV nasıl dizileceğini belirtiyor yukarıdan aşağı doğru dizil
        rv_chess_log.setLayoutManager(new LinearLayoutManager(getContext()));


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
}