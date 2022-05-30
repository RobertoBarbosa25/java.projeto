package PROJETO1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;




public class HeaderGeral {
    File arq = new File("C:/Users/barbo/Desktop/ProjetoJava");

    File[] listOfFiles = arq.listFiles();
    VerificadorCharact verif = new VerificadorCharact();

    public void Header() {
        try {
            for(File abc : listOfFiles) {
                if(abc.exists()){
                    String array[] = abc.getName().split("\\.");
                    if(array[1].equals("txt")) {

                        Stream<String> str = Files.lines(abc.toPath());
                        Object[] list1 = str.toArray();
                        if(abc.length() > 0) {

                            tipHeg2(list1, abc);
                            codBANCO(list1, abc);
                            nsP(list1, abc);
                            //sistOR();
                            testData(list1, abc);
                            restLinha1(list1, abc);

                        }else{
                            System.out.println("O ARQUIVO '"+abc.getName()+ "' ESTÁ VÁZIO");

                        }
                    }else{
                        System.out.println("O ARQUIVO '"+abc.getName()+ "' NÃO PODE SER LIDO.");
                    }
                }else{
                    System.out.println("PASTA VAZIA");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void tipHeg2(Object[] list1, File abc) throws IOException {

            String xx = list1[0].toString().substring(0, 1);
                if (xx.equals("0")) {
                   // System.out.println("Tipo do registro do arquivo " + abc.getName() + " Válido");

                } else {
                    System.out.println("ERRO NO TIPO DO REGISTRO DO HEADER GERAL NO ARQUIVO '" + abc.getName()+ "' INVÁLIDO. TIPO DO REGISTRO DIFERENTE DE '0'");

                }
            }
    public void codBANCO(Object[] list1, File abc) throws IOException {
            String a = list1[0].toString().substring(1, 5);
            if (verif.isInteger(a)) {
               // System.out.println("Código do banco do arquivo " + abc.getName() + " Válido");
            } else {
                System.out.println("CODIGO DO BANCO/CLIENTE DO ARQUIVO '" + abc.getName() + "' INVÁLIDO");
            }
        }
    public void restLinha1(Object[] list1, File abc) throws IOException {

            String a = list1[0].toString().substring(40, 1200);
            if (a.trim().isEmpty()) {
              //  System.out.println("PRIMEIRA LINHA DO ARQUIVO "+abc.getName()+" VÁLIDO");
            } else {
                System.out.println("ERRO NO FILLER DA PRIMEIRA LINHA DO ARQUIVO '"+abc.getName()+ "'");
            }
        }
    public void testData(Object[] list1, File abc) throws  IOException{

            String a = list1[0].toString().substring(32, 40);
            if(verif.isValidDate(a)){
              ///  System.out.println("Data do arquivo "+abc.getName() +" Válida");
            }else{
                System.out.println("DATA DO MOVIMENTO "+abc.getName()+ " INVÁLIDO, TIPO DIFERENTE DE'(AAAA/MM/DD)'");
            }
        }
    public void nsP(Object[] list1, File abc) throws IOException {

            String a = list1[0].toString().substring(5, 12);
            if (verif.isInteger(a)) {
              //  System.out.println("NUMERO SEQ DO ARQUIVO " + abc.getName() + " Válido");
            } else {
                System.out.println("NUMERO SEQ DE PROCESSAMENTO DA EMBOSSADORA DO ARQUIVO " + abc.getName() + " Inválido");
            }
        }
        public void sistOR(Object[] list1, File abc) throws IOException {

            String a = list1[0].toString().substring(12, 32);

            if (verif.isAlfa(a)) {
               // System.out.println("SE NÃO IDENTIFICAR NENHUM ERRO O ARQUIVO: '"+abc.getName()+"' ESTÁ VÁLIDO!");
            } else {
                System.out.println("SISTEMA DE ORIGEM DO ARQUIVO " + abc.getName() + " INVÁLIDO");
            }
        }
    }



