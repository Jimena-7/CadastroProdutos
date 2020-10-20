package br.senai.sc.database;

import br.senai.sc.modelo.Produto;

public final class ProdutoContract {
    private ProdutoContract(){}

    public static String criarTabela() {
        return "CREATE TABLE" + ProdutoEntity.TABLE_NAME + "(" +
                ProdutoEntity._ID + "INTEGER PRIMARY KEY" +
                ProdutoEntity.COLUMN_NAME_NOME + "TEXT," +
                ProdutoEntity.COLUMN_NAME_VALOR + "REAL)";
    }

    public static final String removerTabela() {
        return  "DROP TABLE IF EXIST" + ProdutoEntity.TABLE_NAME;
    }


}
