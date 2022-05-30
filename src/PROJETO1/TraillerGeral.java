package PROJETO1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class TraillerGeral {
    File arq = new File("C:/Users/barbo/Desktop/ProjetoJava");
    File[] listOfFiles = arq.listFiles();
    VerificadorCharact verif = new VerificadorCharact();
    public void traillerG(){
        try{
            for(File abc : listOfFiles) {
                if(abc.exists()) {
                    String array[] = abc.getName().split("\\.");
                    if(array[1].equals("txt")) {
                        Stream<String> str = Files.lines(abc.toPath());
                        Object[] list1 = str.toArray();
                        if(abc.length() > 0) {
                            tipREG4(list1, abc);
                            qtdCART(list1, abc);
                            restLinha4(list1, abc);

                        }else{
                            //System.out.println("O ARQUIVO "+abc.getName()+ " ESTÁ VÁZIO");
                        }
                    }else{
                        //System.out.println("O ARQUIVO "+abc.getName()+ " NÃO PODE SER LIDO.");
                    }
                }else{
                    System.out.println("PASTA VAZIA");
                }
            }

        }catch (IOException e){
            System.out.println("Erro: "+ e.getMessage());
        }
    }
    public void tipREG4(Object[] list1, File abc) throws IOException {

            String xx = list1[list1.length-1].toString().substring(0, 1);
                if (xx.equals("9")) {
                   // System.out.println("FIXO DO TIPO DE REGISTRO D NO ARQUIVO: '" + abc.getName()+ "' VÁLIDO" );
                } else {
                    System.out.println("ERRO NO TIPO DO REGISTRO DO TRAILLER GERAL, RECEBEU UM VALOR DIFERENTE DE SEU FIXO '9'. ARQUIVO: '" + abc.getName()+"'");
                }
            }

    public void qtdCART(Object[] list1, File abc) throws IOException {

            String a = list1[list1.length-1].toString().substring(1, 8);
            if (verif.isInteger(a)) {
               // System.out.println("QUANTIDADE DE CARTÕES DO ARQUIVO " + abc.getName() + " Válido");
            } else {
                System.out.println("ERRO NA QUANTIDADE DE CARTOES, RECEBEU UM VALOR DIFERENTE DE NUMERICO. ARQUIVO: '" + abc.getName()+"'");
            }
        }

    public void restLinha4(Object[] list1, File abc) throws IOException {

            String a = list1[list1.length-1].toString().substring(8,1200);
            if (a.trim().isEmpty()) {
                System.out.println("SE NÃO HOUVE NENHUM ERRO IDENTIFICADO O ARQUIVO: '"+abc.getName()+"' ESTÁ VÁLIDO!");
            } else {
                System.out.println("ERRO NO FILLER DA ULTIMA LINHA DO ARQUIVO '"+abc.getName()+"'");
            }
        }
    }

