package biblioteca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Emprestimo implements Relatorio {

    private int dias;
    private int cod;
    private Livro livros;
    private Usuario usuario;

    public void cadastrar(int codlivro, String cpf, int dias, int codemprestimo) {

        livros = new Livro();
        //Uso de associaçao
        getLivros().setCod(codlivro);
        usuario = new Usuario();
        getUsuario().setCpf(cpf);
        this.dias = dias;
        this.cod = codemprestimo;

    }

    public void excluir(ArrayList<Emprestimo> emp, int cod) {


        for (int i = 0; i < emp.size(); i++) {
            if (emp.get(i).getCod() == cod) {
                emp.remove(i);
                i = emp.size() + 2;
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                i = emp.size() + 2;

            }
        }

    }

    public ArrayList<String> consultar(ArrayList<Emprestimo> e, Usuario objusuario, Livro objlivro) {

        ArrayList<String> valores = new ArrayList<>();

        int flag = 0;

        if (e.size() <= 0) {
            return null;
        } else {

            for (int i = 0; i < e.size(); i++) {
                //Se o objeto livros  e o objeto usuario constar no Array de emprestimos
                if (e.get(i).getLivros().getCod() == objlivro.getCod() && e.get(i).getUsuario().getCpf().equals(objusuario.getCpf())) {

                    valores.add(objusuario.getNome());
                    valores.add(objusuario.getCpf());
                    valores.add(objusuario.getEnd());
                    valores.add(objlivro.getAutor());
                    valores.add(objlivro.getTitulo());
                    valores.add(Integer.toString(objlivro.getCod()));
                    valores.add(Integer.toString(e.get(i).getCod()));
                    valores.add(Integer.toString(e.get(i).dias));
                    flag = 1;
                }
            }
            if (flag == 0) {
                return null;
            }
        }

        return valores;
    }

    @Override
    public String Imprimir() {

        return "Codigo livro: " + getLivros().getCod() + "\n" + "Cpf usuario: " + getUsuario().getCpf() + "\n" + "Limite dias: " + dias + "\n" + "Codigo emprestimo: " + getCod() + "\n";
    }

    public int getCod() {
        return cod;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivros() {
        return livros;
    }

}
