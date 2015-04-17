package com.cengiz.esecim;
        import android.app.Activity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;


public class sandikBaskaniGiris extends Activity {

    EditText editTextKullaniciAdi, editTextParola;
    Button buttonGiris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextKullaniciAdi = (EditText)findViewById(R.id.editTextKullaniciAdi);
        editTextParola = (EditText)findViewById(R.id.editTextParola);
        buttonGiris = (Button)findViewById(R.id.buttonGiris);


        buttonGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if( editTextKullaniciAdi.equals("cengiz") && editTextParola.equals("123456")) {

                }
            }
        });

    }
}