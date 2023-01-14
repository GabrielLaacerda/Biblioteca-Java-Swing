package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Livro implements Relatorio {

    private int cod;
    private String autor;
    private String titulo;

    public void cadastrar(String titulo, String autor, int codigo) {
        this.setCod(codigo);
        this.autor = autor;
        this.titulo = titulo;
    }

    public int excluir(ArrayList<Livro> livro, int cod) {

        int flag = 0;

        for (int i = 0; i < livro.size(); i++) {
            if (livro.get(i).getCod() == cod) {

                livro.remove(i);
                i = livro.size() + 2;
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                flag = 1;
                return flag;
            }
        }
        return flag;
    }

    public ArrayList<String> consultar(ArrayList<Livro> livros, int cod2) {

        ArrayList<String> valores = new ArrayList<>();
        int flag = 0;

        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getCod() == cod2) {
                valores.add(livros.get(i).getTitulo());
                String s = Integer.toString(livros.get(i).getCod());
                valores.add(s);
                valores.add(livros.get(i).getAutor());
                flag = 1;
                i = livros.size() + 1;
                return valores;

            }
        }

        if (flag == 0) {
            JOptionPane.showMessageDialog(null, "Livro nao encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        return null;
    }

    @Override
    public String toString() {
        return "Livro{" + "cod=" + getCod() + ", autor=" + getAutor() + ", titulo=" + getTitulo() + '}';
    }

    public int getCod() {
        return cod;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String Imprimir() {

        return "Autor: " + autor + "\n" + "Código: " + cod + "\n" + "Título: " + titulo + "\n";
    }

}
