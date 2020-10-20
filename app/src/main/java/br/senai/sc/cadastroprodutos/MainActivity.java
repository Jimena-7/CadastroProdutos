package br.senai.sc.cadastroprodutos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.senai.sc.modelo.Produto;

public class MainActivity extends AppCompatActivity {

    private ListView listViewProdutos;
    private ArrayAdapter<Produto>  adapterProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Produtos");
        listViewProdutos = findViewById(R.id.listView_produtos);
        ArrayList<Produto> produtos = this.criarListaProdutos();
        adapterProdutos = new ArrayAdapter<Produto>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, produtos);
        listViewProdutos.setAdapter(adapterProdutos);
    }

    private ArrayList<Produto> criarListaProdutos() {
        ArrayList<Produto> produtos = new ArrayList <Produto>();
        produtos.add(new Produto("Notebook", 3500f));
        produtos.add(new Produto("Mouse", 40f));
        produtos.add(new Produto("Roteador", 199.9f));
        return produtos;
    }
}