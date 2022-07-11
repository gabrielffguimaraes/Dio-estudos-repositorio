package com.workspace.br.exceptions;



import javax.swing.*;
import java.io.*;

public class ConteudoExceptions {
    public static void main(String[] args) {
        String nomeDoArquivo = "txt.txt";
        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("Continue");
    }
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {
        try {

            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch(NaoPossivelAbertura e) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possivel a leiturado arquivo !" + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro !" + e.getMessage());
            e.printStackTrace();
        }
    }
    public static BufferedReader lerArquivo(String nomeDoArquivo) throws NaoPossivelAbertura {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(file.getName()));
        } catch (FileNotFoundException e) {
            throw new NaoPossivelAbertura(file.getName(),file.getPath());
        }
    }
}

class NaoPossivelAbertura extends  Exception {
    private String nomeDoArquivo;
    private String diretorio;

    public NaoPossivelAbertura(String nomeDoArquivo, String diretorio) {
        super("O arquivo "+ nomeDoArquivo + "não foi encontrado no diretorio " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "NaoPossivelAbertura{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}

