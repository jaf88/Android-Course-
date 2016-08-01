package donaxica.joaquimalves.com.br.xicavendas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DescontoEspecialActivity extends AppCompatActivity {

    TextView msg;
    EditText preco;
    EditText idade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desconto_especial);

        msg = (TextView) findViewById(R.id.text_valor_roupa_especial);
        String texto = msg.getText().toString();
    }

    public void calcularDescontoEspecial(View view) {

        preco = (EditText) findViewById(R.id.valor_preco_especial);
        String numero = preco.getText().toString();

        idade = (EditText) findViewById(R.id.editText_idade);
        String numeroIdade = idade.getText().toString();

        double valor = Double.parseDouble(numero);
        double descontoIdade = Double.parseDouble(numeroIdade);

        if (valor >= 50) {
            descontoIdade = descontoIdade/100;
            double desconto = valor * descontoIdade;
            valor -= desconto;
            msg.setText(" "+valor);
        } else {
            msg.setText("Essa peça não Recebe Desconto!");
        }
    }
}
