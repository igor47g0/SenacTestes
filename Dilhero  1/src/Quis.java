import javax.swing.*;

public class Quis {

    public static void mais(String[]args){
        Integer pontos =0;
        JOptionPane.showMessageDialog(null,"Seja bem-vindo ou quis do Senac");
       String nomeJogador =  JOptionPane.showInputDialog("digite seu nome");
       String quiz1 = JOptionPane.showInputDialog(
               "1- Digimon Frontier foi qual temporada do anime digimon" +
                       "\nA-quarta temporada" +
                       "\nB-terceira temporada" +
                       "\nC-quinta temporada");
       if (quiz1.equals("E")||quiz1.equals("e")) {
           JOptionPane.showMessageDialog(null,
                   "correto vc assitio uma boa temporada " + nomeJogador);
           pontos=1;
       }else if   (quiz1 != null){
            JOptionPane.showMessageDialog(null,
                    "erro vc nao assitio uma boa temporada " + nomeJogador);
        }else
           JOptionPane.showMessageDialog(null,
                   "ivalido "+ nomeJogador);

        String quiz2 = JOptionPane.showInputDialog(
                "2-qual foi primeiro anime shoune exibido no japao" +
                        "\nA-a Princeca e o Cavaleiro" +
                        "\nB-Shurato" +
                        "\nC-Astro boy" +
                        "\nD-Drogon Ball");
        if (quiz1.equals("C")||quiz1.equals("c")) {
            JOptionPane.showMessageDialog(null,
                    "correto vc sabia dessa " + nomeJogador);
            pontos=1;
        }else if   (quiz1 != null){
            JOptionPane.showMessageDialog(null,
                    "erro  " + nomeJogador);
        }else
            JOptionPane.showMessageDialog(null,
                    "ivalido "+ nomeJogador);
        String quiz3 = JOptionPane.showInputDialog(
                "3-O primeiro Shoujo" +
                        "\nA-a Princeca e o Cavaleiro" +
                        "\nB-Sailor moon" +
                        "\nC-Sakura card captors" +
                        "\nD-Utena");
        if (quiz1.equals("A")||quiz1.equals("a")) {
            JOptionPane.showMessageDialog(null,
                "correto vc sabe bem  " + nomeJogador);
            pontos=1;
        }else if   (quiz1 != null){
            JOptionPane.showMessageDialog(null,
                    "erro  " + nomeJogador);
        }else
            JOptionPane.showMessageDialog(null,
                    "ivalido "+ nomeJogador);

        }


    }


