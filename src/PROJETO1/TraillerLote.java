package PROJETO1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class TraillerLote{
    File arq = new File("C:/Users/barbo/Desktop/ProjetoJava");
    File[] listOfFiles = arq.listFiles();
    VerificadorCharact verif = new VerificadorCharact();


    public void TraillerLote2(){
        try{
            for(File abc : listOfFiles) {
                if(abc.exists()) {
                    String array[] = abc.getName().split("\\.");
                    if(array[1].equals("txt")) {
                        Stream<String> str = Files.lines(abc.toPath());
                        Object[] list1 = str.toArray();
                        if(abc.length() > 0) {

                            tipREG3(list1, abc);
                            modPlast(list1, abc);
                            kit(list1, abc);
                            qtdCart(list1, abc);
                            restLinha3(list1, abc);
                        }else{
                           // System.out.println("O ARQUIVO "+abc.getName()+ " ESTÁ VÁZIO");

                        }
                    }else{
                       // System.out.println("O ARQUIVO "+abc.getName()+ " NÃO PODE SER LIDO.");
                    }
                }else{
                    System.out.println("PASTA VAZIA");
                }
            }
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
    public void tipREG3(Object[] list1, File abc) throws IOException {

            String xx = list1[list1.length-2].toString().substring(0, 1);

                if (xx.equals("3")) {
                   /// System.out.println("Tipo do registro do arquivo " + abc.getName() + " Válido");
                } else {
                    System.out.println("ERRO NO TIPO DO REGISTRO DO TRAILLER LOTE NO ARQUIVO '" + abc.getName()+ "' INVÁLIDO. TIPO DO REGISTRO DIFERENTE DE '3'");

             }
    }

    public void modPlast(Object[] list1, File abc) throws IOException {

            String a = list1[list1.length-2].toString().substring(1, 4);
            if (verif.isAlfa(a)) {
              //  System.out.println("MODELO DO PLASTICO DO ARQUIVO " + abc.getName() + " Válido");
            } else {
                System.out.println("MODELO DO PLASTICO DO ARQUIVO " + abc.getName() + " INVÁLIDO");
            }
        }
    public void kit(Object[] list1, File abc) throws IOException {

            String a = list1[list1.length-2].toString().substring(4, 10);
            if (verif.isAlfa(a)) {
               // System.out.println("MODELO DO KIT DO ARQUIVO " + abc.getName() + " Válido");
            } else {
                System.out.println("MODELO DO KIT DO ARQUIVO " + abc.getName() + " INVÁLIDO");
            }
        }
    public void qtdCart(Object[] list1, File abc) throws IOException {

            String a = list1[list1.length-2].toString().substring(10, 17);
            if (verif.isInteger(a)) {
               // System.out.println("QNTD DE CARTÕES NO LOTE DO ARQUIVO " + abc.getName() + " Válido");
            } else {
                System.out.println("QNTD DE CARTÕES NO LOTE DO ARQUIVO " + abc.getName() + " Inválido");
            }
        }
    public void restLinha3(Object[] list1, File abc) throws IOException {

            String a = list1[list1.length-2].toString().substring(17, 1200);
            if (a.trim().isEmpty()) {
              //  System.out.println("SE NÃO IDENTIFICAR NENHUM ERRO O ARQUIVO: '"+abc.getName()+"' ESTÁ VÁLIDO!");
            } else {
                System.out.println("ERRO NO FILLER DA QUARTA LINHA DO ARQUIVO "+abc.getName());
            }
        }
    }


