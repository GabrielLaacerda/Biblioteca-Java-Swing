package biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Usuario implements Relatorio {

    private String nome;
    private String cpf;
    private String end;

    @Override
    public String toString() {

        return "Usuario{" + "nome=" + getNome() + ", cpf=" + getCpf() + ", end=" + getEnd() + '}';
    }

    public void cadastrar(String nome, String end, String cpf) {
        this.nome = nome;
        this.setCpf(cpf);
        this.end = end;
    }

    public boolean excluir(ArrayList<Usuario> us, String cpf) {

        boolean aceitar = true;

        for (int i = 0; i < us.size(); i++) {
            if (us.get(i).getCpf().equals(cpf)) {
                us.remove(i);
                i = us.size() + 2;
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                return aceitar;
            }
        }
        if (aceitar == true) {
            aceitar = false;
        }
        return aceitar;

    }

    public ArrayList<String> consultar(ArrayList<Usuario> us, String cpf2) throws UsuarioInexistente{

        ArrayList<String> valores = new ArrayList<>();

        int flag = 0;

            for (int i = 0; i < us.size(); i++) {
                if (us.get(i).getCpf().equals(cpf2)) {

                    valores.add(us.get(i).getNome());
                    valores.add(us.get(i).getCpf());
                    valores.add(us.get(i).getEnd());
                    flag = 1;
                    return valores;
                }
            }

            if (flag == 0) {
                throw new UsuarioInexistente();
             
            }
          return null;

    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEnd() {
        return end;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String Imprimir() {
        return "Nome: " + nome + "\n" + "Cpf: " + cpf + "\n" + "Endereço: " + end + "\n";
    }

}
